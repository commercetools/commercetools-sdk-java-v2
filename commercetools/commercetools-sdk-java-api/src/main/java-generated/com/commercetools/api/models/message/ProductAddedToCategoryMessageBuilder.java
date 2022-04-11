
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductAddedToCategoryMessageBuilder implements Builder<ProductAddedToCategoryMessage> {

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

    public ProductAddedToCategoryMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ProductAddedToCategoryMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ProductAddedToCategoryMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ProductAddedToCategoryMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public ProductAddedToCategoryMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public ProductAddedToCategoryMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public ProductAddedToCategoryMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public ProductAddedToCategoryMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public ProductAddedToCategoryMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public ProductAddedToCategoryMessageBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public ProductAddedToCategoryMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public ProductAddedToCategoryMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public ProductAddedToCategoryMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public ProductAddedToCategoryMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public ProductAddedToCategoryMessageBuilder category(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReferenceBuilder> builder) {
        this.category = builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()).build();
        return this;
    }

    public ProductAddedToCategoryMessageBuilder category(
            final com.commercetools.api.models.category.CategoryReference category) {
        this.category = category;
        return this;
    }

    public ProductAddedToCategoryMessageBuilder staged(final Boolean staged) {
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

    public ProductAddedToCategoryMessage build() {
        Objects.requireNonNull(id, ProductAddedToCategoryMessage.class + ": id is missing");
        Objects.requireNonNull(version, ProductAddedToCategoryMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, ProductAddedToCategoryMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ProductAddedToCategoryMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, ProductAddedToCategoryMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, ProductAddedToCategoryMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, ProductAddedToCategoryMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(category, ProductAddedToCategoryMessage.class + ": category is missing");
        Objects.requireNonNull(staged, ProductAddedToCategoryMessage.class + ": staged is missing");
        return new ProductAddedToCategoryMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, category, staged);
    }

    /**
     * builds ProductAddedToCategoryMessage without checking for non null required values
     */
    public ProductAddedToCategoryMessage buildUnchecked() {
        return new ProductAddedToCategoryMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, category, staged);
    }

    public static ProductAddedToCategoryMessageBuilder of() {
        return new ProductAddedToCategoryMessageBuilder();
    }

    public static ProductAddedToCategoryMessageBuilder of(final ProductAddedToCategoryMessage template) {
        ProductAddedToCategoryMessageBuilder builder = new ProductAddedToCategoryMessageBuilder();
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
