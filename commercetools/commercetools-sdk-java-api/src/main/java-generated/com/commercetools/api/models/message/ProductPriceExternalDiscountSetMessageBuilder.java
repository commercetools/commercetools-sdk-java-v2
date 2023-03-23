
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPriceExternalDiscountSetMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceExternalDiscountSetMessage productPriceExternalDiscountSetMessage = ProductPriceExternalDiscountSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .variantId(1)
 *             .priceId("{priceId}")
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceExternalDiscountSetMessageBuilder implements Builder<ProductPriceExternalDiscountSetMessage> {

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

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id
     * @return Builder
     */

    public ProductPriceExternalDiscountSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version
     * @return Builder
     */

    public ProductPriceExternalDiscountSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt
     * @return Builder
     */

    public ProductPriceExternalDiscountSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt
     * @return Builder
     */

    public ProductPriceExternalDiscountSetMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @return Builder
     */

    public ProductPriceExternalDiscountSetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param lastModifiedBy
     * @return Builder
     */

    public ProductPriceExternalDiscountSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return Builder
     */

    public ProductPriceExternalDiscountSetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy
     * @return Builder
     */

    public ProductPriceExternalDiscountSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber
     * @return Builder
     */

    public ProductPriceExternalDiscountSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource
     * @return Builder
     */

    public ProductPriceExternalDiscountSetMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @return Builder
     */

    public ProductPriceExternalDiscountSetMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion
     * @return Builder
     */

    public ProductPriceExternalDiscountSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @return Builder
     */

    public ProductPriceExternalDiscountSetMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param resourceUserProvidedIdentifiers
     * @return Builder
     */

    public ProductPriceExternalDiscountSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Unique identifier of the Product Variant for which the Discount was set.</p>
     * @param variantId
     * @return Builder
     */

    public ProductPriceExternalDiscountSetMessageBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Key of the Product Variant for which the Discount was set.</p>
     * @param variantKey
     * @return Builder
     */

    public ProductPriceExternalDiscountSetMessageBuilder variantKey(@Nullable final String variantKey) {
        this.variantKey = variantKey;
        return this;
    }

    /**
     *  <p>SKU of the Product Variant for which Discount was set.</p>
     * @param sku
     * @return Builder
     */

    public ProductPriceExternalDiscountSetMessageBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Unique identifier of the Price.</p>
     * @param priceId
     * @return Builder
     */

    public ProductPriceExternalDiscountSetMessageBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     *  <p>Discounted Price for the Product Variant for which Discount was set.</p>
     * @return Builder
     */

    public ProductPriceExternalDiscountSetMessageBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Discounted Price for the Product Variant for which Discount was set.</p>
     * @param discounted
     * @return Builder
     */

    public ProductPriceExternalDiscountSetMessageBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged
     * @return Builder
     */

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
