
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductRemovedFromCategoryMessageBuilder implements Builder<ProductRemovedFromCategoryMessage> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private Long sequenceNumber;

    private com.commercetools.api.models.common.Reference resource;

    private Long resourceVersion;

    @Nullable
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    private com.commercetools.api.models.category.CategoryReference category;

    private Boolean staged;

    public ProductRemovedFromCategoryMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ProductRemovedFromCategoryMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ProductRemovedFromCategoryMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ProductRemovedFromCategoryMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public ProductRemovedFromCategoryMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public ProductRemovedFromCategoryMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public ProductRemovedFromCategoryMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public ProductRemovedFromCategoryMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public ProductRemovedFromCategoryMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public ProductRemovedFromCategoryMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public ProductRemovedFromCategoryMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public ProductRemovedFromCategoryMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public ProductRemovedFromCategoryMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public ProductRemovedFromCategoryMessageBuilder category(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReferenceBuilder> builder) {
        this.category = builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()).build();
        return this;
    }

    public ProductRemovedFromCategoryMessageBuilder category(
            final com.commercetools.api.models.category.CategoryReference category) {
        this.category = category;
        return this;
    }

    public ProductRemovedFromCategoryMessageBuilder staged(final Boolean staged) {
        this.staged = staged;
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

    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    public com.commercetools.api.models.category.CategoryReference getCategory() {
        return this.category;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public ProductRemovedFromCategoryMessage build() {
        Objects.requireNonNull(id, ProductRemovedFromCategoryMessage.class + ": id is missing");
        Objects.requireNonNull(version, ProductRemovedFromCategoryMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, ProductRemovedFromCategoryMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ProductRemovedFromCategoryMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, ProductRemovedFromCategoryMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, ProductRemovedFromCategoryMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            ProductRemovedFromCategoryMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(category, ProductRemovedFromCategoryMessage.class + ": category is missing");
        Objects.requireNonNull(staged, ProductRemovedFromCategoryMessage.class + ": staged is missing");
        return new ProductRemovedFromCategoryMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, category, staged);
    }

    /**
     * builds ProductRemovedFromCategoryMessage without checking for non null required values
     */
    public ProductRemovedFromCategoryMessage buildUnchecked() {
        return new ProductRemovedFromCategoryMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, category, staged);
    }

    public static ProductRemovedFromCategoryMessageBuilder of() {
        return new ProductRemovedFromCategoryMessageBuilder();
    }

    public static ProductRemovedFromCategoryMessageBuilder of(final ProductRemovedFromCategoryMessage template) {
        ProductRemovedFromCategoryMessageBuilder builder = new ProductRemovedFromCategoryMessageBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.sequenceNumber = template.getSequenceNumber();
        builder.resource = template.getResource();
        builder.resourceVersion = template.getResourceVersion();
        builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
        builder.category = template.getCategory();
        builder.staged = template.getStaged();
        return builder;
    }

}
