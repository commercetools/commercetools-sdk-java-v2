package com.commercetools.sdk.plugins

import shadow.javaparser.StaticJavaParser
import shadow.javaparser.ast.CompilationUnit
import shadow.javaparser.ast.body.ClassOrInterfaceDeclaration
import shadow.javaparser.ast.body.ConstructorDeclaration
import shadow.javaparser.ast.body.MethodDeclaration
import shadow.javaparser.ast.body.TypeDeclaration
import shadow.javaparser.ParserConfiguration
import com.squareup.javapoet.*
import org.gradle.api.DefaultTask
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.SourceSet
import org.gradle.api.tasks.TaskAction
import java.io.File
import java.nio.file.Paths
import java.util.*
import java.util.function.Function
import java.util.function.UnaryOperator
import javax.lang.model.element.Modifier


open class GraphQLTask: DefaultTask() {
    @Input
    var generatedSourcesDir: String = project.buildDir.absolutePath

    @Input
    var packageName: String = "com.commercetools.graphql.api"

    @Input
    var clientPackageName: String = "$packageName.client"

    @Input
    var typesPackageName: String = "$packageName.types"

    @OutputDirectory
    fun getOutputDir(): File {
        return Paths.get("$generatedSourcesDir/generated/sources/coco-codegen").toFile()
    }

    @TaskAction
    fun generate() {
        StaticJavaParser.getParserConfiguration().setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_17);
        val javaExtension = project.extensions.getByType(JavaPluginExtension::class.java)

        val mainSourceSet = javaExtension.sourceSets.getByName(SourceSet.MAIN_SOURCE_SET_NAME)
        val queryClasses = mainSourceSet.java.asFileTree.matching { it.include("**/*GraphQLQuery.java") }.files

        val graphQL = TypeSpec.classBuilder("GraphQL")
                .addModifiers(Modifier.PUBLIC)

        graphQL.addMethod(MethodSpec.methodBuilder("query")
                .addModifiers(Modifier.PUBLIC)
                .addModifiers(Modifier.STATIC)
                .addTypeVariable(TypeVariableName.get("T"))
                .addParameter(ParameterSpec.builder(ClassName.get(String::class.java), "query").addModifiers(Modifier.FINAL).build())
                .returns(ParameterizedTypeName.get(
                        ClassName.get(packageName, "GraphQLRequestBuilder"),
                        TypeVariableName.get("T")
                        ))
                .addCode("return GraphQLRequest.<T>builder().query(query);")
                .build()
        )

        val graphQLData = TypeSpec.interfaceBuilder("GraphQLData")
                .addModifiers(Modifier.PUBLIC)
                .addAnnotation(AnnotationSpec.builder(ClassName.get("com.fasterxml.jackson.databind.annotation", "JsonDeserialize"))
                        .addMember("as", "GraphQLDataImpl.class")
                        .build())
                .addMethod(MethodSpec.methodBuilder("get")
                        .addModifiers(Modifier.PUBLIC, Modifier.DEFAULT)
                        .addParameter(ParameterSpec.builder(
                                ParameterizedTypeName.get(
                                        ClassName.get(packageName, "GraphQLRequest"),
                                        TypeVariableName.get("T")
                                ),
                                "request").build())
                        .returns(TypeVariableName.get("T"))
                        .addTypeVariable(TypeVariableName.get("T"))
                        .addCode("return request.getDataMapper().apply(this);")
                        .build())
        val graphQLDataImpl = TypeSpec.classBuilder("GraphQLDataImpl")
                .addSuperinterface(ClassName.get(packageName, "GraphQLData"))
                .addModifiers(Modifier.PUBLIC)


        val wildcard: TypeName = WildcardTypeName.subtypeOf(Any::class.java)

        queryClasses.forEach {
            val queryName = it.nameWithoutExtension
            val operation = queryName.replace("GraphQLQuery", "");
            val projectionName = "${operation}ProjectionRoot"
            val projectionFile = it.parentFile.resolve("$projectionName.java")
            val operationName = operationName(it);
            val returnType = returnType(projectionFile)

            graphQL.addMethod(MethodSpec.methodBuilder(operationName)
                    .addModifiers(Modifier.PUBLIC)
                    .addModifiers(Modifier.STATIC)
                    .addParameter(ParameterSpec.builder(
                            ParameterizedTypeName.get(
                                    ClassName.get(UnaryOperator::class.java),
                                    ClassName.get(clientPackageName, queryName).nestedClass("Builder")
                            ),
                            "query").build()
                    )
                    .addCode(CodeBlock.builder().addStatement("return new GraphQLQueryRequestBuilder<>(query.apply($queryName.newRequest()).build(), new $projectionName<>(), GraphQLData::get${operationName.firstUpperCase()})").build())
                    .returns(ParameterizedTypeName.get(
                            ClassName.get(packageName, "GraphQLQueryRequestBuilder"),
                            ClassName.get(typesPackageName, returnType),
                            ParameterizedTypeName.get(
                                    ClassName.get(clientPackageName, projectionName),
                                    wildcard,
                                    wildcard
                            )
                    ))
                    .build())

            graphQLData.addMethod(MethodSpec.methodBuilder("get${operationName.firstUpperCase()}")
                    .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                    .addAnnotation(AnnotationSpec.builder(ClassName.get("com.fasterxml.jackson.annotation", "JsonProperty"))
                            .addMember("value", "\"$operationName\"")
                            .build()
                    )
                    .returns(ClassName.get(typesPackageName, returnType))
                    .build())
            graphQLData.addMethod(MethodSpec.methodBuilder("set${operationName.firstUpperCase()}")
                    .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                    .addParameter(ClassName.get(typesPackageName, returnType), operationName)
                    .build())

            graphQLDataImpl.addField(
                    FieldSpec.builder(ClassName.get(typesPackageName, returnType), operationName, Modifier.PRIVATE).build()
            )
            graphQLDataImpl.addMethod(MethodSpec.methodBuilder("get${operationName.firstUpperCase()}")
                    .addModifiers(Modifier.PUBLIC)
                    .returns(ClassName.get(typesPackageName, returnType))
                    .addCode("return $operationName;")
                    .build())
            graphQLDataImpl.addMethod(MethodSpec.methodBuilder("set${operationName.firstUpperCase()}")
                    .addModifiers(Modifier.PUBLIC)
                    .addParameter(ClassName.get(typesPackageName, returnType), operationName)
                    .addCode("this.$operationName = $operationName;")
                    .build())
        }

        val graphQLFile = JavaFile.builder("com.commercetools.graphql.api", graphQL.build()).build()
        graphQLFile.writeTo(Paths.get("${getOutputDir()}"))

        val graphQLDataFile = JavaFile.builder("com.commercetools.graphql.api", graphQLData.build()).build()
        graphQLDataFile.writeTo(Paths.get("${getOutputDir()}"))
        val graphQLDataImplFile = JavaFile.builder("com.commercetools.graphql.api", graphQLDataImpl.build()).build()
        graphQLDataImplFile.writeTo(Paths.get("${getOutputDir()}"))

        logger.info("Processing schema files: $graphQLFile")
    }

    private fun returnType(file: File): String {
        val parse: CompilationUnit = StaticJavaParser.parse(file)

        val declarations = parse
                .types
                .filterIsInstance<ClassOrInterfaceDeclaration>()
                .map { typeDeclaration: TypeDeclaration<*> -> typeDeclaration as ClassOrInterfaceDeclaration }
                .filterNot { it.isInterface }
                .map { it.defaultConstructor }

        return declarations.filter { it.isPresent }
                .map { it.get() }
                .map { it.methodBody() }
                .first()
                .substringAfterLast("Optional.of(\"")
                .substringBefore("\")")
    }

    private fun operationName(file: File): String {
        val parse: CompilationUnit = StaticJavaParser.parse(file)

        val declarations = parse
                .types
                .filterIsInstance<ClassOrInterfaceDeclaration>()
                .map { typeDeclaration: TypeDeclaration<*> -> typeDeclaration as ClassOrInterfaceDeclaration }
                .filterNot { it.isInterface }
                .flatMap { it.getMethodsByName("getOperationName") }

        return declarations
                .map { it.methodBody() }
                .first()
                .substringAfterLast("return \"")
                .substringBefore("\"")
    }

    fun ConstructorDeclaration.methodBody(): String {
        val methodBody = this.body
        val bodyRange = methodBody.tokenRange.get().toString()
        return bodyRange.substring(1, bodyRange.length - 1).trimIndent()
    }

    fun MethodDeclaration.methodBody(): String {
        val methodBody = this.body
        if (!methodBody.isPresent) {
            return ""
        }
        val bodyRange = methodBody.get().tokenRange.get().toString()
        return bodyRange.substring(1, bodyRange.length - 1).trimIndent()
    }

    private fun String.firstLowerCase(): String {
        return this.replaceFirstChar {
            it.lowercase(
                    Locale.getDefault()
            )
        }
    }

    private fun String.firstUpperCase(): String {
        return this.replaceFirstChar {
            it.uppercase(
                    Locale.getDefault()
            )
        }
    }
}
