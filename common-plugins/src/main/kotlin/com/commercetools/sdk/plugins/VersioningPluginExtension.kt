package com.commercetools.sdk.plugins

import org.gradle.api.provider.Property

interface VersioningPluginExtension {
    val propertiesFile: Property<String>
    val versionProperty: Property<String>
}
