
package com.commercetools.importapi.models.producttypes;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductTypeImportBuilder implements Builder<ProductTypeImport> {

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

    public ProductTypeImportBuilder plusAttributes(
            @Nullable final com.commercetools.importapi.models.producttypes.AttributeDefinition... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    public ProductTypeImportBuilder plusAttributes(
            Function<com.commercetools.importapi.models.producttypes.AttributeDefinitionBuilder, com.commercetools.importapi.models.producttypes.AttributeDefinitionBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(
            builder.apply(com.commercetools.importapi.models.producttypes.AttributeDefinitionBuilder.of()).build());
        return this;
    }

    public ProductTypeImportBuilder withAttributes(
            Function<com.commercetools.importapi.models.producttypes.AttributeDefinitionBuilder, com.commercetools.importapi.models.producttypes.AttributeDefinitionBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(
            builder.apply(com.commercetools.importapi.models.producttypes.AttributeDefinitionBuilder.of()).build());
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
        Objects.requireNonNull(key, ProductTypeImport.class + ": key is missing");
        Objects.requireNonNull(name, ProductTypeImport.class + ": name is missing");
        Objects.requireNonNull(description, ProductTypeImport.class + ": description is missing");
        return new ProductTypeImportImpl(key, name, description, attributes);
    }

    /**
     * builds ProductTypeImport without checking for non null required values
     */
    public ProductTypeImport buildUnchecked() {
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
