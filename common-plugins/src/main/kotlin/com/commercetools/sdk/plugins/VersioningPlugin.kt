package com.commercetools.sdk.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import java.util.*
import java.util.function.UnaryOperator

class VersioningPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        val extension = project.extensions.create("versioning", VersioningPluginExtension::class.java)
        val file = extension.propertiesFile.getOrElse("gradle.properties")
        val propertyName = extension.versionProperty.getOrElse("version")
        createTaskSetVersion(file, propertyName, project)
        createTask(file, propertyName, "nextMinorVersion", project) { it.nextMinor() }
        createTask(file, propertyName,"nextMajorVersion", project) { it.nextMajor() }
        createTask(file, propertyName,"nextPatchVersion", project) { it.nextPatch() }
        createTask(file, propertyName,"snapshotVersion", project) { it.snapshot() }
    }

    private fun createTaskSetVersion(file: String, propertyName: String, project: Project) {
        val task = project.task("setVersion")
        task.group = "versioning"
        task.doLast {
            val propertiesFile = project.file(file)
            val properties = Properties()
            properties.load(propertiesFile.inputStream())

            val versionInfo = VersionInfo.parse(project.version.toString())
            properties.setProperty(propertyName, versionInfo.versionString())
            properties.store(propertiesFile.outputStream(), null)
        }
    }

    private fun createTask(file: String, propertyName: String, taskName: String, project: Project, op: UnaryOperator<VersionInfo>) {
        val task = project.task(taskName)
        task.group = "versioning"
        task.doLast {
            val propertiesFile = project.file(file)
            val properties = Properties()
            properties.load(propertiesFile.inputStream())

            val oldVersionInfo = VersionInfo.parse(properties.getProperty(propertyName))
            val versionInfo = op.apply(oldVersionInfo)
            properties.setProperty(propertyName, versionInfo.versionString())
            properties.store(propertiesFile.outputStream(), null)
        }
    }

    class VersionInfo(val major: Int, val minor: Int, val patch: Int, val suffix: String) {

        fun nextMajor(): VersionInfo {
            return VersionInfo(major + 1, 0, 0, "")
        }

        fun nextMinor(): VersionInfo {
            return VersionInfo(major, minor + 1, 0, "")
        }

        fun nextPatch(): VersionInfo {
            return VersionInfo(major, minor, patch + 1, "")
        }

        fun snapshot(): VersionInfo {
            return VersionInfo(major, minor, patch, "SNAPSHOT")
        }

        fun versionString(): String {
            return "$major.$minor.$patch${if (suffix.isEmpty().not()) "-$suffix" else "" }"
        }


        companion object {
            fun parse(version: String): VersionInfo {
                val parsed = version.split('.', '-', limit = 4)
                return VersionInfo(parsed.component1().toInt(), parsed.component2().toInt(), parsed.component3().toInt(), if (parsed.count() > 3) parsed.component4() else "")
            }
        }
    }
}
