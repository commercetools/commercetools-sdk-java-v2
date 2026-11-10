package com.commercetools.sdk.plugins

import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property

interface MigrationInfoPluginExtension {
    val outputFolder: Property<String>
    val includePackages: ListProperty<String>
    val v1BaseFolder: ListProperty<String>
    val v2BaseFolder: ListProperty<String>
    val className: Property<String>
}
