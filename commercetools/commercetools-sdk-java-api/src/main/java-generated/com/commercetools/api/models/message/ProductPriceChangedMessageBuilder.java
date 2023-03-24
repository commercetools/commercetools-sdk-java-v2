
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPriceChangedMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceChangedMessage productPriceChangedMessage = ProductPriceChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .variantId(0.3)
 *             .oldPrice(oldPriceBuilder -> oldPriceBuilder)
 *             .newPrice(newPriceBuilder -> newPriceBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceChangedMessageBuilder implements Builder<ProductPriceChangedMessage> {

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

    private Long variantId;

    private com.commercetools.api.models.common.Price oldPrice;

    private com.commercetools.api.models.common.Price newPrice;

    private Boolean staged;

    @Nullable
    private com.commercetools.api.models.common.Price oldStagedPrice;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductPriceChangedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     * @return Builder
     */

    public ProductPriceChangedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ProductPriceChangedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public ProductPriceChangedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ProductPriceChangedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public ProductPriceChangedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ProductPriceChangedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public ProductPriceChangedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */

    public ProductPriceChangedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     * @return Builder
     */

    public ProductPriceChangedMessageBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public ProductPriceChangedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */

    public ProductPriceChangedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public ProductPriceChangedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param resourceUserProvidedIdentifiers value to be set
     * @return Builder
     */

    public ProductPriceChangedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was changed.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductPriceChangedMessageBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The current Embedded Price before the Change Embedded Price update action.</p>
     * @param builder function to build the oldPrice value
     * @return Builder
     */

    public ProductPriceChangedMessageBuilder oldPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.oldPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The current Embedded Price before the Change Embedded Price update action.</p>
     * @param oldPrice value to be set
     * @return Builder
     */

    public ProductPriceChangedMessageBuilder oldPrice(final com.commercetools.api.models.common.Price oldPrice) {
        this.oldPrice = oldPrice;
        return this;
    }

    /**
     *  <p>The Embedded Price after the Change Embedded Price update action.</p>
     * @param builder function to build the newPrice value
     * @return Builder
     */

    public ProductPriceChangedMessageBuilder newPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.newPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Embedded Price after the Change Embedded Price update action.</p>
     * @param newPrice value to be set
     * @return Builder
     */

    public ProductPriceChangedMessageBuilder newPrice(final com.commercetools.api.models.common.Price newPrice) {
        this.newPrice = newPrice;
        return this;
    }

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductPriceChangedMessageBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The staged Embedded Price before the Change Embedded Price update action.</p>
     * @param builder function to build the oldStagedPrice value
     * @return Builder
     */

    public ProductPriceChangedMessageBuilder oldStagedPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.oldStagedPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The staged Embedded Price before the Change Embedded Price update action.</p>
     * @param oldStagedPrice value to be set
     * @return Builder
     */

    public ProductPriceChangedMessageBuilder oldStagedPrice(
            @Nullable final com.commercetools.api.models.common.Price oldStagedPrice) {
        this.oldStagedPrice = oldStagedPrice;
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

    public Long getVariantId() {
        return this.variantId;
    }

    public com.commercetools.api.models.common.Price getOldPrice() {
        return this.oldPrice;
    }

    public com.commercetools.api.models.common.Price getNewPrice() {
        return this.newPrice;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    @Nullable
    public com.commercetools.api.models.common.Price getOldStagedPrice() {
        return this.oldStagedPrice;
    }

    /**
     * builds ProductPriceChangedMessage with checking for non-null required values
     * @return ProductPriceChangedMessage
     */
    public ProductPriceChangedMessage build() {
        Objects.requireNonNull(id, ProductPriceChangedMessage.class + ": id is missing");
        Objects.requireNonNull(version, ProductPriceChangedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, ProductPriceChangedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ProductPriceChangedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, ProductPriceChangedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, ProductPriceChangedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, ProductPriceChangedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(variantId, ProductPriceChangedMessage.class + ": variantId is missing");
        Objects.requireNonNull(oldPrice, ProductPriceChangedMessage.class + ": oldPrice is missing");
        Objects.requireNonNull(newPrice, ProductPriceChangedMessage.class + ": newPrice is missing");
        Objects.requireNonNull(staged, ProductPriceChangedMessage.class + ": staged is missing");
        return new ProductPriceChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, variantId, oldPrice, newPrice,
            staged, oldStagedPrice);
    }

    /**
     * builds ProductPriceChangedMessage without checking for non-null required values
     * @return ProductPriceChangedMessage
     */
    public ProductPriceChangedMessage buildUnchecked() {
        return new ProductPriceChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, variantId, oldPrice, newPrice,
            staged, oldStagedPrice);
    }

    public static ProductPriceChangedMessageBuilder of() {
        return new ProductPriceChangedMessageBuilder();
    }

    public static ProductPriceChangedMessageBuilder of(final ProductPriceChangedMessage template) {
        ProductPriceChangedMessageBuilder builder = new ProductPriceChangedMessageBuilder();
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
        builder.oldPrice = template.getOldPrice();
        builder.newPrice = template.getNewPrice();
        builder.staged = template.getStaged();
        builder.oldStagedPrice = template.getOldStagedPrice();
        return builder;
    }

}
