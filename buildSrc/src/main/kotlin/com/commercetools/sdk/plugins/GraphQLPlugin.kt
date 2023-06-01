package com.commercetools.sdk.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPlugin
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.api.tasks.SourceSet

class GraphQLPlugin : Plugin<Project> {
    companion object {
        const val GRADLE_GROUP = "DGS GraphQL Codegen"
    }

    override fun apply(project: Project) {

        project.plugins.apply(JavaPlugin::class.java)

        val generateJavaTaskProvider = project.tasks.register("generateGraphQLRoots", GraphQLTask::class.java)
        generateJavaTaskProvider.configure { it.group = GRADLE_GROUP }

        val javaExtension = project.extensions.getByType(JavaPluginExtension::class.java)

        val sourceSets = javaExtension.sourceSets
        val mainSourceSet = sourceSets.getByName(SourceSet.MAIN_SOURCE_SET_NAME)
        val outputDir = generateJavaTaskProvider.map(GraphQLTask::getOutputDir)
        mainSourceSet.java.srcDirs(project.files(outputDir).builtBy(generateJavaTaskProvider))

    }
}
