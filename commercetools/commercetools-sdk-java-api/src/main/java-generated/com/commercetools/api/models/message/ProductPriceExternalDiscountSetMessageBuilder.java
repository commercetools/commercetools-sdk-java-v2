
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductPriceExternalDiscountSetMessageBuilder
        implements Builder<ProductPriceExternalDiscountSetMessage> {

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

    private Integer variantId;

    @Nullable
    private String variantKey;

    @Nullable
    private String sku;

    private String priceId;

    @Nullable
    private com.commercetools.api.models.common.DiscountedPrice discounted;

    private Boolean staged;

    public ProductPriceExternalDiscountSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ProductPriceExternalDiscountSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ProductPriceExternalDiscountSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ProductPriceExternalDiscountSetMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public ProductPriceExternalDiscountSetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public ProductPriceExternalDiscountSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public ProductPriceExternalDiscountSetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public ProductPriceExternalDiscountSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public ProductPriceExternalDiscountSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public ProductPriceExternalDiscountSetMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public ProductPriceExternalDiscountSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public ProductPriceExternalDiscountSetMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public ProductPriceExternalDiscountSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public ProductPriceExternalDiscountSetMessageBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    public ProductPriceExternalDiscountSetMessageBuilder variantKey(@Nullable final String variantKey) {
        this.variantKey = variantKey;
        return this;
    }

    public ProductPriceExternalDiscountSetMessageBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public ProductPriceExternalDiscountSetMessageBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    public ProductPriceExternalDiscountSetMessageBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    public ProductPriceExternalDiscountSetMessageBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    public ProductPriceExternalDiscountSetMessageBuilder staged(final Boolean staged) {
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

    public Integer getVariantId() {
        return this.variantId;
    }

    @Nullable
    public String getVariantKey() {
        return this.variantKey;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    public String getPriceId() {
        return this.priceId;
    }

    @Nullable
    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public ProductPriceExternalDiscountSetMessage build() {
        Objects.requireNonNull(id, ProductPriceExternalDiscountSetMessage.class + ": id is missing");
        Objects.requireNonNull(version, ProductPriceExternalDiscountSetMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, ProductPriceExternalDiscountSetMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt,
            ProductPriceExternalDiscountSetMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber,
            ProductPriceExternalDiscountSetMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, ProductPriceExternalDiscountSetMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            ProductPriceExternalDiscountSetMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(variantId, ProductPriceExternalDiscountSetMessage.class + ": variantId is missing");
        Objects.requireNonNull(priceId, ProductPriceExternalDiscountSetMessage.class + ": priceId is missing");
        Objects.requireNonNull(staged, ProductPriceExternalDiscountSetMessage.class + ": staged is missing");
        return new ProductPriceExternalDiscountSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, variantId,
            variantKey, sku, priceId, discounted, staged);
    }

    /**
     * builds ProductPriceExternalDiscountSetMessage without checking for non null required values
     */
    public ProductPriceExternalDiscountSetMessage buildUnchecked() {
        return new ProductPriceExternalDiscountSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, variantId,
            variantKey, sku, priceId, discounted, staged);
    }

    public static ProductPriceExternalDiscountSetMessageBuilder of() {
        return new ProductPriceExternalDiscountSetMessageBuilder();
    }

    public static ProductPriceExternalDiscountSetMessageBuilder of(
            final ProductPriceExternalDiscountSetMessage template) {
        ProductPriceExternalDiscountSetMessageBuilder builder = new ProductPriceExternalDiscountSetMessageBuilder();
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
        builder.variantId = template.getVariantId();
        builder.variantKey = template.getVariantKey();
        builder.sku = template.getSku();
        builder.priceId = template.getPriceId();
        builder.discounted = template.getDiscounted();
        builder.staged = template.getStaged();
        return builder;
    }

}
