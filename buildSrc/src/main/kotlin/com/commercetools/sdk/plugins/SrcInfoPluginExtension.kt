package com.commercetools.sdk.plugins

import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property

interface SrcInfoPluginExtension {
    val outputFolder: Property<String>
    val includePackages: ListProperty<String>
    val baseFolder: Property<String>
}
