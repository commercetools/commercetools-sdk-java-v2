package com.commercetools.sdk.plugins;

import com.github.javaparser.StaticJavaParser
import com.github.javaparser.ast.CompilationUnit
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration
import com.github.javaparser.ast.body.MethodDeclaration
import com.github.javaparser.ast.body.TypeDeclaration
import com.google.gson.stream.JsonWriter
import org.gradle.api.Plugin
import org.gradle.api.Project
import java.io.File
import java.io.IOException
import java.io.Writer
import java.nio.file.Files
import java.nio.file.Paths

class SrcInfoPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        createExportTask(project)
    }

    fun gitHash(project: Project): String {
        return try {
            Runtime.getRuntime().exec("git -C ${project.projectDir} rev-parse HEAD").inputStream.bufferedReader().readLine().orEmpty()
        } catch (e: IOException) {
            "main"
        }
    }

    private fun createExportTask(project: Project) {
        val extension = project.extensions.create("srcInfo", SrcInfoPluginExtension::class.java)
        val exportTask = project.task("exportSignatures")
        exportTask.group = "documentation"
        exportTask.doLast {
            val outputFolder = extension.outputFolder.map { o -> Paths.get(o) }.getOrElse(project.buildDir.resolve("src-info").toPath())
            outputFolder.toFile().mkdir()
            val javaFiles = project.fileTree(mapOf("dir" to extension.baseFolder.getOrElse("src"), "include" to "**/*.java")).files
            val fileWriter: Writer = Files.newBufferedWriter(outputFolder.resolve(project.name + ".json"))
            val writer = JsonWriter(fileWriter)
            val hash = gitHash(project)
            writer.setIndent("  ")

            writer.beginObject()
            javaFiles.forEach { file ->
                run {
                    javaFileInfo(file, project, hash, extension.includePackages.orNull).forEach { entry ->
                        run {
                            writer.name(entry.key)
                            writer.beginObject()
                            entry.value.forEach {e ->
                                run {
                                    writer.name(e.key).value(e.value)
                                }
                            }
                            writer.endObject()
                        }
                    }
                }
            }
            writer.endObject()
            fileWriter.close()
        }
    }

    private fun javaFileInfo(file: File, project: Project, hash: String, includePackages: List<String>?):  Map<String, Map<String, String>> {
        val parse: CompilationUnit = StaticJavaParser.parse(file)
        val relativeFile = file.relativeTo(project.rootDir)
        if (includePackages != null && includePackages.firstOrNull { s: String -> parse.packageDeclaration.get().nameAsString.startsWith(s) } == null) {
            return emptyMap()
        }
        val declarations = parse
                .types
                .filterIsInstance<ClassOrInterfaceDeclaration>()
                .map { typeDeclaration: TypeDeclaration<*> -> typeDeclaration as ClassOrInterfaceDeclaration }

        return declarations.flatMap { declaration ->
            listOf(declaration.fullyQualifiedName.get() to mapOf(
                    "type" to "class",
                    "gitHash" to hash,
                    "simpleName" to declaration.name.toString(),
                    "name" to declaration.fullyQualifiedName.get(),
                    "file" to relativeFile.toString(),
                    "start" to declaration.begin.get().line.toString(),
                    "end" to declaration.end.get().line.toString(),
                    "srcUrl" to "https://github.com/commercetools/commercetools-sdk-java-v2/blob/${hash}/${relativeFile}#L${declaration.begin.get().line}-L${declaration.end.get().line}",
                    "content" to declaration.classBody()
            )).plus( classInfo(relativeFile, declaration, hash) )
        }.toMap()
    }

    fun classInfo(file: File, info: ClassOrInterfaceDeclaration, hash: String): List<Pair<String, Map<String, String>>> {
        return info.methods.map { methodInfo ->
            "${info.fullyQualifiedName.get()}#${methodInfo.signature}" to mapOf(
                    "type" to "method",
                    "gitHash" to hash,
                    "methodName" to methodInfo.name.toString(),
                    "simpleName" to "${info.name}#${methodInfo.name}",
                    "name" to "${info.fullyQualifiedName.get()}#${methodInfo.name}",
                    "file" to file.toString(),
                    "start" to methodInfo.begin.get().line.toString(),
                    "end" to methodInfo.end.get().line.toString(),
                    "srcUrl" to "https://github.com/commercetools/commercetools-sdk-java-v2/blob/${hash}/${file}#L${methodInfo.begin.get().line}-L${methodInfo.end.get().line}",
                    "content" to methodInfo.methodBody()
            )
        }
    }

    fun ClassOrInterfaceDeclaration.classBody(): String {
        return this.tokenRange.get().toString().trimIndent()
    }

    fun MethodDeclaration.methodBody(): String {
        val methodBody = this.body
        if (!methodBody.isPresent) {
            return ""
        }
        val bodyRange = methodBody.get().tokenRange.get().toString()
        return bodyRange.substring(1, bodyRange.length - 1).trimIndent()
    }
}
