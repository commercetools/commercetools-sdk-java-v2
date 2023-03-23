
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCustomLineItemDiscountSetMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomLineItemDiscountSetMessage orderCustomLineItemDiscountSetMessage = OrderCustomLineItemDiscountSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .customLineItemId("{customLineItemId}")
 *             .plusDiscountedPricePerQuantity(discountedPricePerQuantityBuilder -> discountedPricePerQuantityBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCustomLineItemDiscountSetMessageBuilder implements Builder<OrderCustomLineItemDiscountSetMessage> {

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

    private String customLineItemId;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

    @Nullable
    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param lastModifiedBy
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessageBuilder resourceUserProvidedIdentifiers(
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

    public OrderCustomLineItemDiscountSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Unique identifier for the Custom Line Item.</p>
     * @param customLineItemId
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessageBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @param discountedPricePerQuantity
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessageBuilder discountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @param discountedPricePerQuantity
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessageBuilder discountedPricePerQuantity(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        return this;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @param discountedPricePerQuantity
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessageBuilder plusDiscountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        if (this.discountedPricePerQuantity == null) {
            this.discountedPricePerQuantity = new ArrayList<>();
        }
        this.discountedPricePerQuantity.addAll(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessageBuilder plusDiscountedPricePerQuantity(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder> builder) {
        if (this.discountedPricePerQuantity == null) {
            this.discountedPricePerQuantity = new ArrayList<>();
        }
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessageBuilder withDiscountedPricePerQuantity(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder> builder) {
        this.discountedPricePerQuantity = new ArrayList<>();
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()).build());
        return this;
    }

    /**
     *  <p>TaxedItemPrice of the Custom Line Item after the Discount recalculation.</p>
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessageBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>TaxedItemPrice of the Custom Line Item after the Discount recalculation.</p>
     * @param taxedPrice
     * @return Builder
     */

    public OrderCustomLineItemDiscountSetMessageBuilder taxedPrice(
            @Nullable final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
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

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    @Nullable
    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    public OrderCustomLineItemDiscountSetMessage build() {
        Objects.requireNonNull(id, OrderCustomLineItemDiscountSetMessage.class + ": id is missing");
        Objects.requireNonNull(version, OrderCustomLineItemDiscountSetMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, OrderCustomLineItemDiscountSetMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt,
            OrderCustomLineItemDiscountSetMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber,
            OrderCustomLineItemDiscountSetMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, OrderCustomLineItemDiscountSetMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            OrderCustomLineItemDiscountSetMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(customLineItemId,
            OrderCustomLineItemDiscountSetMessage.class + ": customLineItemId is missing");
        Objects.requireNonNull(discountedPricePerQuantity,
            OrderCustomLineItemDiscountSetMessage.class + ": discountedPricePerQuantity is missing");
        return new OrderCustomLineItemDiscountSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, customLineItemId,
            discountedPricePerQuantity, taxedPrice);
    }

    /**
     * builds OrderCustomLineItemDiscountSetMessage without checking for non null required values
     */
    public OrderCustomLineItemDiscountSetMessage buildUnchecked() {
        return new OrderCustomLineItemDiscountSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, customLineItemId,
            discountedPricePerQuantity, taxedPrice);
    }

    public static OrderCustomLineItemDiscountSetMessageBuilder of() {
        return new OrderCustomLineItemDiscountSetMessageBuilder();
    }

    public static OrderCustomLineItemDiscountSetMessageBuilder of(
            final OrderCustomLineItemDiscountSetMessage template) {
        OrderCustomLineItemDiscountSetMessageBuilder builder = new OrderCustomLineItemDiscountSetMessageBuilder();
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
        builder.customLineItemId = template.getCustomLineItemId();
        builder.discountedPricePerQuantity = template.getDiscountedPricePerQuantity();
        builder.taxedPrice = template.getTaxedPrice();
        return builder;
    }

}
