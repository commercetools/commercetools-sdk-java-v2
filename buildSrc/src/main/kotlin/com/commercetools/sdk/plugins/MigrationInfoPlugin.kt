package com.commercetools.sdk.plugins

import com.github.javaparser.StaticJavaParser
import com.github.javaparser.ast.CompilationUnit
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration
import com.github.javaparser.ast.body.TypeDeclaration
import com.google.common.base.CaseFormat
import org.gradle.api.Plugin
import org.gradle.api.Project
import java.io.File
import java.io.IOException
import java.io.Writer
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*
import java.util.AbstractMap.SimpleEntry
import kotlin.io.path.exists
import kotlin.io.path.name

class MigrationInfoPlugin : Plugin<Project> {

    fun gitHash(project: Project): String {
        return try {
            Runtime.getRuntime().exec("git -C ${project.projectDir} rev-parse HEAD").inputStream.bufferedReader().readLine().orEmpty()
        } catch (e: IOException) {
            "main"
        }
    }

    override fun apply(project: Project) {
        createInfoTask(project)
    }

    lateinit var v1Files : Map<File, CompilationUnit>;

    private fun createInfoTask(project: Project) {
        val extension = project.extensions.create("migration", MigrationInfoPluginExtension::class.java)
        val exportTask = project.task("migrateClassInfo")
        val clazz = extension.className.getOrElse("com.commercetools.docs.meta.MigrationModelClassMapping")
        exportTask.group = "documentation"

        exportTask.doLast {
            val outputFolder = extension.outputFolder.map { o -> Paths.get(o) }.getOrElse(project.buildDir.resolve("migrate-info").toPath())
            outputFolder.toFile().mkdir()
            var javaFiles: Set<File> = emptySet();
            extension.v1BaseFolder.getOrElse(emptyList())
                    .forEach { folder -> javaFiles = javaFiles.plus(project.fileTree(mapOf("dir" to folder, "include" to "**/*.java")).files) }
            val writer: Writer = Files.newBufferedWriter(outputFolder.resolve(clazz.simpleName() + ".java"))

            v1Files = javaFiles.associateWith { file -> StaticJavaParser.parse(file) }
            val hash = gitHash(project)
            val result = javaFiles.flatMap { file ->
                javaFileInfo(file, project, hash, extension.includePackages.orNull, extension.v2BaseFolder.getOrElse(listOf("src/main")))
            }.associate { entry -> entry.key to entry.value }.filterNot { ignoreClasses.contains(it.key) }.toSortedMap()

            val createCommands = javaFiles.flatMap { file ->
                createCommandFileInfo(file, project, hash, extension.includePackages.orNull, extension.v2BaseFolder.getOrElse(listOf("src/main")))
            }.associate { entry -> entry.key to entry.value }.toSortedMap()
            val updateCommands = javaFiles.flatMap { file ->
                updateCommandFileInfo(file, project, hash, extension.includePackages.orNull, extension.v2BaseFolder.getOrElse(listOf("src/main")))
            }.associate { entry -> entry.key to entry.value }.toSortedMap()
            val deleteCommands = javaFiles.flatMap { file ->
                deleteCommandFileInfo(file, project, hash, extension.includePackages.orNull, extension.v2BaseFolder.getOrElse(listOf("src/main")))
            }.associate { entry -> entry.key to entry.value }.toSortedMap()

            writer.appendLine("")
            writer.appendLine("package ${clazz.packageName()};")
            writer.appendLine("")
            writer.appendLine("/**")
            writer.appendLine(" * {@include.toc}")
            writer.appendLine(" * <h2 id=\"model-mapping\">Mapping of model classes from SDK v1 to v2</h2>")
            writer.appendLine(" *")
            writer.appendLine(" * <table>")
            writer.appendLine(" * <caption></caption>")
            writer.appendLine(" * <tr><th>v1</th><th>v2</th></tr>")

            result.filter { (_, value) -> value.sdkV2Classes.isNotEmpty()  }
                    .forEach { (key, value) ->
                        run {
                            writer.appendLine(" * <tr>")
                            writer.appendLine(" *   <td>{@link $key}</td>")
                            writer.appendLine(" *   <td>${if (value.sdkV2Classes != "removed") "{@link ${value.sdkV2Classes}}" else value.sdkV2Classes}</td>")
                            writer.appendLine(" * </tr>")
                        }
                    }
            writer.appendLine(" * </table>")
            writer.appendLine(" *")
            writer.appendLine(" * <h2 id=\"class-no-representation\">Classes with no representation in the v2 SDK</h2>")
            writer.appendLine(" *")
            writer.appendLine(" * <table>")
            writer.appendLine(" * <caption></caption>")
            writer.appendLine(" * <tr><th>v1</th></tr>")
            result.filter { (_, value) -> value.sdkV2Classes.isEmpty()  }.forEach { (key, value) ->
                run {
                    writer.appendLine(" * <tr>")
                    writer.appendLine(" *   <td>{@link $key}</td>")
                    writer.appendLine(" * </tr>")
                }
            }
            writer.appendLine(" * </table>")
            writer.appendLine(" *")
            writer.appendLine(" * <h2 id=\"command-mapping\">Mapping of commands from SDK v1 to v2</h2>")
            writer.appendLine(" *")
            writer.appendLine(" * <table>")
            writer.appendLine(" * <caption></caption>")
            writer.appendLine(" * <tr><th>v1</th><th>v2</th></tr>")

            createCommands.plus(updateCommands).plus(deleteCommands)
                    .forEach { (key, value) ->
                        run {
                            writer.appendLine(" * <tr>")
                            writer.appendLine(" *   <td style=\"vertical-align: top;\">{@link ${value.name} }</td>")
                            writer.appendLine(" *   <td>${value.usageV2}</td>")
                            writer.appendLine(" * </tr>")
                        }
                    }

            writer.appendLine(" * </table>")
            writer.appendLine(" *")
            writer.appendLine(" * <h2 id=\"package-mapping\">Package name changes</h2>")
            writer.appendLine(" *")
            writer.appendLine(" * Please be aware this list shows to which package a class may have been moved based on the source package")
            writer.appendLine(" * <table>")
            writer.appendLine(" * <caption></caption>")
            writer.appendLine(" * <tr><th>v1</th><th>v2</th></tr>")

            result.filter { (_, value) -> value.sdkV2Classes.isNotEmpty()  }
                    .map { (_, value) -> value.v1Package to value.v2Package }
                    .distinct()
                    .groupBy { t -> t.first }
                    .forEach { (key, value) ->
                        run {
                            writer.appendLine(" * <tr>")
                            writer.appendLine(" *   <td>{@link $key}</td>")
                            writer.appendLine(" *   <td>${value.filterNot { it.second.isEmpty() }.joinToString { "{@link ${it.second}}" }}</td>")
                            writer.appendLine(" * </tr>")
                        }
                    }
            writer.appendLine(" * </table>")
            writer.appendLine(" */")
            writer.appendLine("public class ${clazz.simpleName()} {")
            writer.appendLine("}")
            writer.close()
        }
    }

    private fun createCommandFileInfo(file: File, project: Project, hash: String, includePackages: List<String>?, v2BaseFolder: List<String>):  List<Map.Entry<String, Info>> {
        val parse: CompilationUnit = v1Files[file]!!
        val relativeFile = file.relativeTo(project.rootDir)
        if (includePackages != null && includePackages.isNotEmpty() && includePackages.firstOrNull { s: String -> parse.packageDeclaration.get().nameAsString.startsWith(s) } == null) {
            return listOf()
        }
        val declarations = parse
                .types
                .filterIsInstance<ClassOrInterfaceDeclaration>()
                .map { typeDeclaration: TypeDeclaration<*> -> typeDeclaration as ClassOrInterfaceDeclaration }
                .filter { declaration -> declaration.extendedTypes.any { it.nameAsString.contains("DraftBasedCreateCommandDsl") } }
                .filter { declaration -> declaration.isInterface }
                .filter { declaration -> declaration.isPublic }

        return declarations.flatMap { declaration ->
            listOf(SimpleEntry(declaration.fullyQualifiedName.get(), Info(
                    "class",
                    declaration.fullyQualifiedName.get(),
                    declaration.nameAsString,
                    relativeFile.toString(),
                    "",
                    declaration.v2CommandClassUsage()
            )))
        }
    }

    private fun updateCommandFileInfo(file: File, project: Project, hash: String, includePackages: List<String>?, v2BaseFolder: List<String>):  List<Map.Entry<String, Info>> {
        val parse: CompilationUnit = v1Files[file]!!
        val relativeFile = file.relativeTo(project.rootDir)
        if (includePackages != null && includePackages.isNotEmpty() && includePackages.firstOrNull { s: String -> parse.packageDeclaration.get().nameAsString.startsWith(s) } == null) {
            return listOf()
        }
        val declarations = parse
                .types
                .filterIsInstance<ClassOrInterfaceDeclaration>()
                .map { typeDeclaration: TypeDeclaration<*> -> typeDeclaration as ClassOrInterfaceDeclaration }
                .filter { declaration -> declaration.extendedTypes.any { it.nameAsString.contains("UpdateCommandDsl") } }
                .filter { declaration -> declaration.isInterface }
                .filter { declaration -> declaration.isPublic }

        return declarations.flatMap { declaration ->
            listOf(SimpleEntry(declaration.fullyQualifiedName.get(), Info(
                    "class",
                    declaration.fullyQualifiedName.get(),
                    declaration.nameAsString,
                    relativeFile.toString(),
                    "",
                    declaration.v2CommandClassUsage()
            )))
        }
    }

    private fun deleteCommandFileInfo(file: File, project: Project, hash: String, includePackages: List<String>?, v2BaseFolder: List<String>):  List<Map.Entry<String, Info>> {
        val parse: CompilationUnit = v1Files[file]!!
        val relativeFile = file.relativeTo(project.rootDir)
        if (includePackages != null && includePackages.isNotEmpty() && includePackages.firstOrNull { s: String -> parse.packageDeclaration.get().nameAsString.startsWith(s) } == null) {
            return listOf()
        }
        val declarations = parse
                .types
                .filterIsInstance<ClassOrInterfaceDeclaration>()
                .map { typeDeclaration: TypeDeclaration<*> -> typeDeclaration as ClassOrInterfaceDeclaration }
                .filter { declaration -> declaration.extendedTypes.any { it.nameAsString.startsWith("DeleteCommand") } }
                .filter { declaration -> declaration.isInterface }
                .filter { declaration -> declaration.isPublic }

        return declarations.flatMap { declaration ->
            listOf(SimpleEntry(declaration.fullyQualifiedName.get(), Info(
                    "class",
                    declaration.fullyQualifiedName.get(),
                    declaration.nameAsString,
                    relativeFile.toString(),
                    "",
                    declaration.v2CommandClassUsage()
            )))
        }
    }

    private fun javaFileInfo(file: File, project: Project, hash: String, includePackages: List<String>?, v2BaseFolder: List<String>):  List<Map.Entry<String, Info>> {
        val parse: CompilationUnit = v1Files[file]!!
        val relativeFile = file.relativeTo(project.rootDir)
        if (includePackages != null && includePackages.isNotEmpty() && includePackages.firstOrNull { s: String -> parse.packageDeclaration.get().nameAsString.startsWith(s) } == null) {
            return listOf()
        }
        val declarations = parse
                .types
                .filterIsInstance<ClassOrInterfaceDeclaration>()
                .map { typeDeclaration: TypeDeclaration<*> -> typeDeclaration as ClassOrInterfaceDeclaration }
                .filter { declaration -> declaration.isInterface.or(declaration.fullyQualifiedName.get().contains(".commands.updateactions")) }
                .filter { declaration -> declaration.isPublic }
                .filterNot { declaration -> declaration.isAbstract }
                .filterNot { declaration -> declaration.fullyQualifiedName.get().contains(".queries") }
                .filterNot { declaration -> declaration.fullyQualifiedName.get().contains(".expansion") }
                .filterNot { declaration -> declaration.fullyQualifiedName.get().contains(".products.search") }
                .filter { declaration -> declaration.fullyQualifiedName.get().contains(".commands").not().or(declaration.fullyQualifiedName.get().contains(".updateactions")) }

        return declarations.flatMap { declaration ->
            listOf(SimpleEntry(declaration.fullyQualifiedName.get(), Info(
                    "class",
                    declaration.fullyQualifiedName.get(),
                    declaration.nameAsString,
                    relativeFile.toString(),
                    declaration.v2Class(v2BaseFolder)
//                    "gitHash" to hash,
//                    "simpleName" to declaration.name.toString(),
//                    "start" to declaration.begin.get().line.toString(),
//                    "end" to declaration.end.get().line.toString(),
//                    "srcUrl" to "https://github.com/commercetools/commercetools-sdk-java-v2/blob/${hash}/${relativeFile}#L${declaration.begin.get().line}-L${declaration.end.get().line}",
            )))
        }
    }

    data class Info(val type: String, val name: String, val simpleName: String, val file: String, val sdkV2Classes: String, val usageV2: String = "") {
        var v1Package: String = name.packageName();
        var v2Package: String = sdkV2Classes.packageName();
    }



//    fun classInfo(file: File, info: ClassOrInterfaceDeclaration, hash: String): List<Pair<String, Map<String, String>>> {
//        return info.methods.map { methodInfo ->
//            "${info.fullyQualifiedName.get()}#${methodInfo.signature}" to mapOf(
//                    "type" to "method",
//                    "gitHash" to hash,
//                    "methodName" to methodInfo.name.toString(),
//                    "simpleName" to "${info.name}#${methodInfo.name}",
//                    "name" to "${info.fullyQualifiedName.get()}#${methodInfo.name}",
//                    "file" to file.toString(),
//                    "start" to methodInfo.begin.get().line.toString(),
//                    "end" to methodInfo.end.get().line.toString(),
//                    "srcUrl" to "https://github.com/commercetools/commercetools-sdk-java-v2/blob/${hash}/${file}#L${methodInfo.begin.get().line}-L${methodInfo.end.get().line}",
//                    "sdkV1Method" to methodInfo.methodBody()
//            )
//        }
//    }

    fun ClassOrInterfaceDeclaration.v2Class(v2BaseFolder: List<String>): String {

        if (classMapping.containsKey(this.fullyQualifiedName.get())) {
            return classMapping.get(this.fullyQualifiedName.get()).orEmpty()
        }
        val v1PackageName = this.fullyQualifiedName.map { it.replace("." + this.name.toString(), "") }.get()
        var packageName = v1PackageName

        packageMapping.forEach { (v2package, v1package) -> packageName = packageName.replace(v2package, v1package) }

        packageName = packageName.replace("io.sphere.sdk", "com.commercetools.api")

        var v2Classes: List<String> = emptyList()

        v2BaseFolder
                .forEach { folder: String ->
                    run {
                        val packageFolder = Paths.get(folder).resolve(packageName.replace(".", "/"))
                        val t = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, packageFolder.name)
                        val domainName = if (t == "Inventory") "InventoryEntry" else t
                        val v2ClassName = packageFolder.resolve(this.name.toString() + ".java")

                        if (v2ClassName.exists()) {
                            val parse: CompilationUnit = StaticJavaParser.parse(v2ClassName)
                            val declarations = parse
                                    .types
                                    .filterIsInstance<ClassOrInterfaceDeclaration>()
                                    .map { typeDeclaration: TypeDeclaration<*> -> typeDeclaration as ClassOrInterfaceDeclaration }
                            v2Classes = v2Classes.plus(declarations.map { declaration -> declaration.fullyQualifiedName.get() })
                        }

                        val updateClassName = domainName + this.name.toString() + "Action.java";
                        val v2UpdateClassName = packageFolder.resolve(updateClassName)
                        if (v2UpdateClassName.exists()) {
                            val parse: CompilationUnit = StaticJavaParser.parse(v2UpdateClassName)
                            val declarations = parse
                                    .types
                                    .filterIsInstance<ClassOrInterfaceDeclaration>()
                                    .map { typeDeclaration: TypeDeclaration<*> -> typeDeclaration as ClassOrInterfaceDeclaration }
                            v2Classes = v2Classes.plus(declarations.map { declaration -> declaration.fullyQualifiedName.get() })
                        }
                    }
                }
        return v2Classes.joinToString(", ");
    }

//    fun ClassOrInterfaceDeclaration.v1CreateCommandClassUsage(): Pair<String, String> {
//
//        if (commandClassUsageV1Mapping.containsKey(this.fullyQualifiedName.get())) {
//            return commandClassUsageV1Mapping.get(this.fullyQualifiedName.get()) ?: Pair("", "")
//        }
//        val v1PackageName = this.fullyQualifiedName.map { it.replace("." + this.name.toString(), "") }.get()
//        val v1ModelPackageName = v1PackageName.replace(".commands", "");
//
//        return this.getMethodsByName("of").map { "$v1ModelPackageName.${it.parameters.filter { it.nameAsString.contains("draft", true) }.map { it.typeAsString }.firstOrNull() ?: "" }" to "of(${it.parameters.joinToString(",") { it.typeAsString }})" }.first()
//    }
//
//    fun ClassOrInterfaceDeclaration.v1UpdateCommandClassUsage(): Pair<String, String> {
//
//        if (commandClassUsageV1Mapping.containsKey(this.fullyQualifiedName.get())) {
//            return commandClassUsageV1Mapping.get(this.fullyQualifiedName.get()) ?: Pair("", "")
//        }
//
//        return this.getMethodsByName("of").filter { it.parameters.any { it.typeAsString.startsWith("UpdateAction") } }.map { "" to "of(${it.parameters.joinToString(",") { it.typeAsString.split("<").first() + if (it.isVarArgs) "..." else "" }})" }.first()
//    }
//
//    fun ClassOrInterfaceDeclaration.v1DeleteCommandClassUsage(): Pair<String, String> {
//
//        if (commandClassUsageV1Mapping.containsKey(this.fullyQualifiedName.get())) {
//            return commandClassUsageV1Mapping.get(this.fullyQualifiedName.get()) ?: Pair("", "")
//        }
//        return this.getMethodsByName("of").filter { it.parameters.any { it.typeAsString.startsWith("Versioned") } }.map { "" to "of(${it.parameters.joinToString(",") { it.typeAsString.split("<").first() }})" }.firstOrNull() ?: Pair("", "")
//    }

    fun ClassOrInterfaceDeclaration.v2CommandClassUsage(): String {

        if (commandClassMapping.containsKey(this.fullyQualifiedName.get())) {
            return commandClassMapping.get(this.fullyQualifiedName.get()).orEmpty()
        }

        return "{@include.example example.CommandMigrationTest#${this.nameAsString.firstLowerCase()}()}"
    }

    private fun String.firstLowerCase(): String {
        return this.replaceFirstChar {
            it.lowercase(
                    Locale.getDefault()
            )
        }
    }

    val ignoreClasses = listOf(
            "io.sphere.sdk.subscriptions.commands.updateactions.ChangeStatus"
    )

    val packageMapping = mapOf(
            "io.sphere.sdk.apiclient" to "com.commercetools.api.models.api_client",
            "io.sphere.sdk.carts" to "com.commercetools.api.models.cart",
            "io.sphere.sdk.cartdiscounts" to "com.commercetools.api.models.cart_discount",
            "io.sphere.sdk.categories" to "com.commercetools.api.models.category",
            "io.sphere.sdk.channels" to "com.commercetools.api.models.channel",
            "io.sphere.sdk.customers.messages" to "com.commercetools.api.models.message",
            "io.sphere.sdk.customers" to "com.commercetools.api.models.customer",
            "io.sphere.sdk.customobjects" to "com.commercetools.api.models.custom_object",
            "io.sphere.sdk.customergroups" to "com.commercetools.api.models.customer_group",
            "io.sphere.sdk.discountcodes" to "com.commercetools.api.models.discount_code",
            "io.sphere.sdk.extensions" to "com.commercetools.api.models.extension",
            "io.sphere.sdk.inventory" to "com.commercetools.api.models.inventory",
            "io.sphere.sdk.messages" to "com.commercetools.api.models.message",
            "io.sphere.sdk.orders.messages" to "com.commercetools.api.models.message",
            "io.sphere.sdk.orders" to "com.commercetools.api.models.order",
            "io.sphere.sdk.orderedits" to "com.commercetools.api.models.order_edit",
            "io.sphere.sdk.payments" to "com.commercetools.api.models.payment",
            "io.sphere.sdk.productselections" to "com.commercetools.api.models.product_selection",
            "io.sphere.sdk.products.messages" to "com.commercetools.api.models.message",
            "io.sphere.sdk.products.attributes" to "com.commercetools.api.models.product_type",
            "io.sphere.sdk.products" to "com.commercetools.api.models.product",
            "io.sphere.sdk.producttypes" to "com.commercetools.api.models.product_type",
            "io.sphere.sdk.productdiscounts" to "com.commercetools.api.models.product_discount",
            "io.sphere.sdk.projects" to "com.commercetools.api.models.project",
            "io.sphere.sdk.reviews" to "com.commercetools.api.models.review",
            "io.sphere.sdk.shippingmethods" to "com.commercetools.api.models.shipping_method",
            "io.sphere.sdk.shoppinglists" to "com.commercetools.api.models.shopping_list",
            "io.sphere.sdk.states" to "com.commercetools.api.models.state",
            "io.sphere.sdk.stores" to "com.commercetools.api.models.store",
            "io.sphere.sdk.subscriptions" to "com.commercetools.api.models.subscription",
            "io.sphere.sdk.taxcategories" to "com.commercetools.api.models.tax_category",
            "io.sphere.sdk.types" to "com.commercetools.api.models.type",
            "io.sphere.sdk.zones" to "com.commercetools.api.models.zone",
            "io.sphere.sdk.models" to "com.commercetools.api.models.common",
            ".commands.stagedactions" to "",
            ".commands.updateactions" to ""
    )

    val commandClassUsageV1Mapping = mapOf(
            "" to Pair("", "")
    )

    val commandClassMapping = mapOf(
            "" to ""
    )

    val classMapping = mapOf(
            "io.sphere.sdk.producttypes.commands.updateactions.ChangeEnumValueOrder" to "com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueOrderAction",
            "io.sphere.sdk.customers.commands.updateactions.ChangeName" to "removed",
            "io.sphere.sdk.producttypes.commands.updateactions.ChangeAttributeOrder" to "removed",
            "io.sphere.sdk.producttypes.commands.updateactions.ChangeAttributeDefinitionLabel" to "com.commercetools.api.models.product_type.ProductTypeChangeLabelAction",
            "io.sphere.sdk.producttypes.commands.updateactions.AddEnumValue" to "com.commercetools.api.models.product_type.ProductTypeAddPlainEnumValueAction",
            "io.sphere.sdk.taxcategories.ExternalTaxRateDraft" to "com.commercetools.api.models.cart.ExternalTaxRateDraft",
            "io.sphere.sdk.discountcodes.DiscountCodeInfo" to "com.commercetools.api.models.cart.DiscountCodeInfo",
            "io.sphere.sdk.payments.commands.updateactions.SetAmountPaid" to "removed",
            "io.sphere.sdk.payments.commands.updateactions.SetAmountRefunded" to "removed",
            "io.sphere.sdk.payments.commands.updateactions.SetAuthorization" to "removed",
            "io.sphere.sdk.types.Custom" to "com.commercetools.api.models.Customizable",
            "io.sphere.sdk.types.commands.updateactions.ChangeFieldDefinitionLabel" to "com.commercetools.api.models.type.TypeChangeLabelAction",
            "io.sphere.sdk.types.CustomDraft" to "com.commercetools.api.models.CustomizableDraft",
            "io.sphere.sdk.products.Image" to "com.commercetools.api.models.common.Image",
            "io.sphere.sdk.products.PriceTier" to "com.commercetools.api.models.common.PriceTier",
            "io.sphere.sdk.products.ScopedPrice" to "com.commercetools.api.models.common.ScopedPrice",
            "io.sphere.sdk.products.Price" to "com.commercetools.api.models.common.Price",
            "io.sphere.sdk.products.attributes.Attribute" to "com.commercetools.api.models.product.Attribute",
            "io.sphere.sdk.products.attributes.AttributeDraft" to "com.commercetools.api.models.product.Attribute",
            "io.sphere.sdk.products.PriceDraft" to "com.commercetools.api.models.common.PriceDraft",
            "io.sphere.sdk.shippingmethods.CartValue" to "com.commercetools.api.models.shipping_method.CartValueTier",
            "io.sphere.sdk.shippingmethods.CartScore" to "com.commercetools.api.models.shipping_method.CartScoreTier",
            "io.sphere.sdk.shippingmethods.CartClassification" to "com.commercetools.api.models.shipping_method.CartClassificationTier",
            "io.sphere.sdk.projects.CartValue" to "com.commercetools.api.models.project.CartValueType",
            "io.sphere.sdk.projects.CartClassificationDraft" to "com.commercetools.api.models.project.CartClassificationType",
            "io.sphere.sdk.projects.CartScore" to "com.commercetools.api.models.project.CartScoreType",
            "io.sphere.sdk.projects.CartClassification" to "com.commercetools.api.models.project.CartClassificationType",
            "io.sphere.sdk.projects.ShippingRateInputTypeDraft" to "com.commercetools.api.models.project.ShippingRateInputType",
            "io.sphere.sdk.projects.MessagesConfigurationDraft" to "com.commercetools.api.models.message.MessagesConfigurationDraft",
            "io.sphere.sdk.projects.CartScoreDraft" to "com.commercetools.api.models.project.CartScoreType",
            "io.sphere.sdk.projects.CartValueDraft" to "com.commercetools.api.models.project.CartValueType",
            "io.sphere.sdk.projects.MessagesConfiguration" to "com.commercetools.api.models.message.MessagesConfiguration",
            "io.sphere.sdk.productselections.commands.updateactions.ChangeName" to "com.commercetools.api.models.product_selection.ProductSelectionChangeNameAction",
            "io.sphere.sdk.models.ContainerAndKey" to "com.commercetools.api.models.message.ContainerAndKey",
            "io.sphere.sdk.models.WithClientLogging" to "com.commercetools.api.models.common.ClientLogging",
            "io.sphere.sdk.shoppinglists.LineItem" to "com.commercetools.api.models.shopping_list.ShoppingListLineItem",
            "io.sphere.sdk.shoppinglists.LineItemDraft" to "com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft",
            "io.sphere.sdk.extensions.Destination" to "com.commercetools.api.models.extension.ExtensionDestination",
            "io.sphere.sdk.extensions.Trigger" to "com.commercetools.api.models.extension.ExtensionTrigger",
            "io.sphere.sdk.subscriptions.Payload" to "com.commercetools.api.models.subscription.DeliveryPayload",
            "io.sphere.sdk.subscriptions.ResourceDeletedPayload" to "com.commercetools.api.models.subscription.ResourceDeletedDeliveryPayload",
            "io.sphere.sdk.subscriptions.MessageSubscriptionPayload" to "com.commercetools.api.models.subscription.MessageDeliveryPayload",
            "io.sphere.sdk.subscriptions.ResourceUpdatedPayload" to "com.commercetools.api.models.subscription.ResourceUpdatedDeliveryPayload",
            "io.sphere.sdk.subscriptions.PubSubDestination" to "com.commercetools.api.models.subscription.GoogleCloudPubSubDestination",
            "io.sphere.sdk.subscriptions.ResourceCreatedPayload" to "com.commercetools.api.models.subscription.ResourceCreatedDeliveryPayload",
            "io.sphere.sdk.carts.CartLike" to "com.commercetools.api.models.order.OrderLike",
            "io.sphere.sdk.carts.ShoppingListsConfiguration" to "com.commercetools.api.models.project.ShoppingListsConfiguration",
            "io.sphere.sdk.carts.PaymentInfo" to "com.commercetools.api.models.order.PaymentInfo",
            "io.sphere.sdk.carts.CartShippingInfo" to "com.commercetools.api.models.cart.ShippingInfo",
            "io.sphere.sdk.carts.ItemState" to "com.commercetools.api.models.order.ItemState",
            "io.sphere.sdk.carts.CartsConfiguration" to "com.commercetools.api.models.project.CartsConfiguration",
            "io.sphere.sdk.orders.CustomLineItemReturnItemDraft" to "com.commercetools.api.models.order.CustomLineItemReturnItem",
            "io.sphere.sdk.orders.LineItemReturnItemDraft" to "com.commercetools.api.models.order.LineItemReturnItem",
            "io.sphere.sdk.orders.OrderShippingInfo" to "com.commercetools.api.models.cart.ShippingInfo",
            "io.sphere.sdk.productdiscounts.DiscountedPrice" to "com.commercetools.api.models.common.DiscountedPrice",
            "io.sphere.sdk.cartdiscounts.DiscountedLineItemPriceForQuantity" to "com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity",
            "io.sphere.sdk.cartdiscounts.DiscountedLineItemPortion" to "com.commercetools.api.models.cart.DiscountedLineItemPortion",
            "io.sphere.sdk.cartdiscounts.DiscountedLineItemPrice" to "removed",
            "io.sphere.sdk.payments.commands.updateactions.SetExternalId" to "removed",
            "io.sphere.sdk.projects.commands.updateactions.ChangeMessagesEnabled" to "removed",
            "io.sphere.sdk.projects.commands.updateactions.ChangeMessages" to "removed",
    )

//    fun MethodDeclaration.methodBody(): String {
//        val methodBody = this.body
//        if (!methodBody.isPresent) {
//            return ""
//        }
//        val bodyRange = methodBody.get().tokenRange.get().toString()
//        return bodyRange.substring(1, bodyRange.length - 1).trimIndent()
//    }
}

fun String.packageName(): String {
    if (this.isEmpty() or this.contains(".").not()) return ""
    val packageFolder = Paths.get(this.replace(".", "/"))
    return packageFolder.parent.toString().replace("/", ".");
}

fun String.simpleName(): String {
    if (this.isEmpty() or this.contains(".").not()) return this
    return this.split(".").last()
}
