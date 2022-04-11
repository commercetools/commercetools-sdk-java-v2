
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductTypeBuilder implements Builder<ProductType> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    @Nullable
    private String key;

    private String name;

    private String description;

    @Nullable
    private java.util.List<com.commercetools.api.models.product_type.AttributeDefinition> attributes;

    public ProductTypeBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ProductTypeBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ProductTypeBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ProductTypeBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public ProductTypeBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public ProductTypeBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public ProductTypeBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public ProductTypeBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public ProductTypeBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public ProductTypeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ProductTypeBuilder description(final String description) {
        this.description = description;
        return this;
    }

    public ProductTypeBuilder attributes(
            @Nullable final com.commercetools.api.models.product_type.AttributeDefinition... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    public ProductTypeBuilder attributes(
            @Nullable final java.util.List<com.commercetools.api.models.product_type.AttributeDefinition> attributes) {
        this.attributes = attributes;
        return this;
    }

    public ProductTypeBuilder plusAttributes(
            @Nullable final com.commercetools.api.models.product_type.AttributeDefinition... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    public ProductTypeBuilder plusAttributes(
            Function<com.commercetools.api.models.product_type.AttributeDefinitionBuilder, com.commercetools.api.models.product_type.AttributeDefinitionBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes
                .add(builder.apply(com.commercetools.api.models.product_type.AttributeDefinitionBuilder.of()).build());
        return this;
    }

    public ProductTypeBuilder withAttributes(
            Function<com.commercetools.api.models.product_type.AttributeDefinitionBuilder, com.commercetools.api.models.product_type.AttributeDefinitionBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes
                .add(builder.apply(com.commercetools.api.models.product_type.AttributeDefinitionBuilder.of()).build());
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    @Nullable
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
    public java.util.List<com.commercetools.api.models.product_type.AttributeDefinition> getAttributes() {
        return this.attributes;
    }

    public ProductType build() {
        Objects.requireNonNull(id, ProductType.class + ": id is missing");
        Objects.requireNonNull(version, ProductType.class + ": version is missing");
        Objects.requireNonNull(createdAt, ProductType.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ProductType.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(name, ProductType.class + ": name is missing");
        Objects.requireNonNull(description, ProductType.class + ": description is missing");
        return new ProductTypeImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name,
            description, attributes);
    }

    /**
     * builds ProductType without checking for non null required values
     */
    public ProductType buildUnchecked() {
        return new ProductTypeImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name,
            description, attributes);
    }

    public static ProductTypeBuilder of() {
        return new ProductTypeBuilder();
    }

    public static ProductTypeBuilder of(final ProductType template) {
        ProductTypeBuilder builder = new ProductTypeBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
