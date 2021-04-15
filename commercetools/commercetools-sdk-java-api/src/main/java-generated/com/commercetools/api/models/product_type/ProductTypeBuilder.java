
package com.commercetools.api.models.product_type;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeBuilder {

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
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
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
