
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductVariantDeletedMessageBuilder implements Builder<ProductVariantDeletedMessage> {

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

    private com.commercetools.api.models.product.ProductVariant variant;

    private java.util.List<String> removedImageUrls;

    public ProductVariantDeletedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ProductVariantDeletedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ProductVariantDeletedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ProductVariantDeletedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public ProductVariantDeletedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public ProductVariantDeletedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public ProductVariantDeletedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public ProductVariantDeletedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public ProductVariantDeletedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public ProductVariantDeletedMessageBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public ProductVariantDeletedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public ProductVariantDeletedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public ProductVariantDeletedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public ProductVariantDeletedMessageBuilder variant(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariantBuilder> builder) {
        this.variant = builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()).build();
        return this;
    }

    public ProductVariantDeletedMessageBuilder variant(
            final com.commercetools.api.models.product.ProductVariant variant) {
        this.variant = variant;
        return this;
    }

    public ProductVariantDeletedMessageBuilder removedImageUrls(final String... removedImageUrls) {
        this.removedImageUrls = new ArrayList<>(Arrays.asList(removedImageUrls));
        return this;
    }

    public ProductVariantDeletedMessageBuilder removedImageUrls(final java.util.List<String> removedImageUrls) {
        this.removedImageUrls = removedImageUrls;
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

    public com.commercetools.api.models.product.ProductVariant getVariant() {
        return this.variant;
    }

    public java.util.List<String> getRemovedImageUrls() {
        return this.removedImageUrls;
    }

    public ProductVariantDeletedMessage build() {
        Objects.requireNonNull(id, ProductVariantDeletedMessage.class + ": id is missing");
        Objects.requireNonNull(version, ProductVariantDeletedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, ProductVariantDeletedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ProductVariantDeletedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, ProductVariantDeletedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, ProductVariantDeletedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, ProductVariantDeletedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(variant, ProductVariantDeletedMessage.class + ": variant is missing");
        Objects.requireNonNull(removedImageUrls, ProductVariantDeletedMessage.class + ": removedImageUrls is missing");
        return new ProductVariantDeletedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, variant, removedImageUrls);
    }

    /**
     * builds ProductVariantDeletedMessage without checking for non null required values
     */
    public ProductVariantDeletedMessage buildUnchecked() {
        return new ProductVariantDeletedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, variant, removedImageUrls);
    }

    public static ProductVariantDeletedMessageBuilder of() {
        return new ProductVariantDeletedMessageBuilder();
    }

    public static ProductVariantDeletedMessageBuilder of(final ProductVariantDeletedMessage template) {
        ProductVariantDeletedMessageBuilder builder = new ProductVariantDeletedMessageBuilder();
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
        builder.variant = template.getVariant();
        builder.removedImageUrls = template.getRemovedImageUrls();
        return builder;
    }

}
