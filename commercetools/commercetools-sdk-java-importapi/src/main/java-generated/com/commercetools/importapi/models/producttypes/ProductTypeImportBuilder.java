
package com.commercetools.importapi.models.producttypes;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeImportBuilder {

    private String key;

    private String name;

    private String description;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.producttypes.AttributeDefinition> attributes;

    public ProductTypeImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public ProductTypeImportBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ProductTypeImportBuilder description(final String description) {
        this.description = description;
        return this;
    }

    public ProductTypeImportBuilder attributes(
            @Nullable final com.commercetools.importapi.models.producttypes.AttributeDefinition... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    public ProductTypeImportBuilder attributes(
            @Nullable final java.util.List<com.commercetools.importapi.models.producttypes.AttributeDefinition> attributes) {
        this.attributes = attributes;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.producttypes.AttributeDefinition> getAttributes() {
        return this.attributes;
    }

    public ProductTypeImport build() {
        return new ProductTypeImportImpl(key, name, description, attributes);
    }

    public static ProductTypeImportBuilder of() {
        return new ProductTypeImportBuilder();
    }

    public static ProductTypeImportBuilder of(final ProductTypeImport template) {
        ProductTypeImportBuilder builder = new ProductTypeImportBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
