
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderLineItemDiscountSetMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderLineItemDiscountSetMessage orderLineItemDiscountSetMessage = OrderLineItemDiscountSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .lineItemId("{lineItemId}")
 *             .plusDiscountedPricePerQuantity(discountedPricePerQuantityBuilder -> discountedPricePerQuantityBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .plusTaxedPricePortions(taxedPricePortionsBuilder -> taxedPricePortionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderLineItemDiscountSetMessageBuilder implements Builder<OrderLineItemDiscountSetMessage> {

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

    private String lineItemId;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

    private com.commercetools.api.models.common.Money totalPrice;

    @Nullable
    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    private java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> taxedPricePortions;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Unique identifier for the Line Item.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder discountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder discountedPricePerQuantity(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        return this;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder plusDiscountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        if (this.discountedPricePerQuantity == null) {
            this.discountedPricePerQuantity = new ArrayList<>();
        }
        this.discountedPricePerQuantity.addAll(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder plusDiscountedPricePerQuantity(
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
     */

    public OrderLineItemDiscountSetMessageBuilder withDiscountedPricePerQuantity(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder> builder) {
        this.discountedPricePerQuantity = new ArrayList<>();
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Total Price of the Line Item after the Discount recalculation.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder totalPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Total Price of the Line Item after the Discount recalculation.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder totalPrice(
            final com.commercetools.api.models.common.Money totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     *  <p>TaxedItemPrice of the Line Item after the Discount recalculation.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>TaxedItemPrice of the Line Item after the Discount recalculation.</p>
     */

    public OrderLineItemDiscountSetMessageBuilder taxedPrice(
            @Nullable final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>Taxed price of the Shipping Methods in a Cart with <code>Multi</code> ShippingMode..</p>
     */

    public OrderLineItemDiscountSetMessageBuilder taxedPricePortions(
            final com.commercetools.api.models.cart.MethodTaxedPrice... taxedPricePortions) {
        this.taxedPricePortions = new ArrayList<>(Arrays.asList(taxedPricePortions));
        return this;
    }

    /**
     *  <p>Taxed price of the Shipping Methods in a Cart with <code>Multi</code> ShippingMode..</p>
     */

    public OrderLineItemDiscountSetMessageBuilder taxedPricePortions(
            final java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> taxedPricePortions) {
        this.taxedPricePortions = taxedPricePortions;
        return this;
    }

    /**
     *  <p>Taxed price of the Shipping Methods in a Cart with <code>Multi</code> ShippingMode..</p>
     */

    public OrderLineItemDiscountSetMessageBuilder plusTaxedPricePortions(
            final com.commercetools.api.models.cart.MethodTaxedPrice... taxedPricePortions) {
        if (this.taxedPricePortions == null) {
            this.taxedPricePortions = new ArrayList<>();
        }
        this.taxedPricePortions.addAll(Arrays.asList(taxedPricePortions));
        return this;
    }

    /**
     *  <p>Taxed price of the Shipping Methods in a Cart with <code>Multi</code> ShippingMode..</p>
     */

    public OrderLineItemDiscountSetMessageBuilder plusTaxedPricePortions(
            Function<com.commercetools.api.models.cart.MethodTaxedPriceBuilder, com.commercetools.api.models.cart.MethodTaxedPriceBuilder> builder) {
        if (this.taxedPricePortions == null) {
            this.taxedPricePortions = new ArrayList<>();
        }
        this.taxedPricePortions
                .add(builder.apply(com.commercetools.api.models.cart.MethodTaxedPriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Taxed price of the Shipping Methods in a Cart with <code>Multi</code> ShippingMode..</p>
     */

    public OrderLineItemDiscountSetMessageBuilder withTaxedPricePortions(
            Function<com.commercetools.api.models.cart.MethodTaxedPriceBuilder, com.commercetools.api.models.cart.MethodTaxedPriceBuilder> builder) {
        this.taxedPricePortions = new ArrayList<>();
        this.taxedPricePortions
                .add(builder.apply(com.commercetools.api.models.cart.MethodTaxedPriceBuilder.of()).build());
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

    public String getLineItemId() {
        return this.lineItemId;
    }

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    public com.commercetools.api.models.common.Money getTotalPrice() {
        return this.totalPrice;
    }

    @Nullable
    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    public java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> getTaxedPricePortions() {
        return this.taxedPricePortions;
    }

    public OrderLineItemDiscountSetMessage build() {
        Objects.requireNonNull(id, OrderLineItemDiscountSetMessage.class + ": id is missing");
        Objects.requireNonNull(version, OrderLineItemDiscountSetMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, OrderLineItemDiscountSetMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, OrderLineItemDiscountSetMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, OrderLineItemDiscountSetMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, OrderLineItemDiscountSetMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, OrderLineItemDiscountSetMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(lineItemId, OrderLineItemDiscountSetMessage.class + ": lineItemId is missing");
        Objects.requireNonNull(discountedPricePerQuantity,
            OrderLineItemDiscountSetMessage.class + ": discountedPricePerQuantity is missing");
        Objects.requireNonNull(totalPrice, OrderLineItemDiscountSetMessage.class + ": totalPrice is missing");
        Objects.requireNonNull(taxedPricePortions,
            OrderLineItemDiscountSetMessage.class + ": taxedPricePortions is missing");
        return new OrderLineItemDiscountSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, lineItemId,
            discountedPricePerQuantity, totalPrice, taxedPrice, taxedPricePortions);
    }

    /**
     * builds OrderLineItemDiscountSetMessage without checking for non null required values
     */
    public OrderLineItemDiscountSetMessage buildUnchecked() {
        return new OrderLineItemDiscountSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, lineItemId,
            discountedPricePerQuantity, totalPrice, taxedPrice, taxedPricePortions);
    }

    public static OrderLineItemDiscountSetMessageBuilder of() {
        return new OrderLineItemDiscountSetMessageBuilder();
    }

    public static OrderLineItemDiscountSetMessageBuilder of(final OrderLineItemDiscountSetMessage template) {
        OrderLineItemDiscountSetMessageBuilder builder = new OrderLineItemDiscountSetMessageBuilder();
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
        builder.lineItemId = template.getLineItemId();
        builder.discountedPricePerQuantity = template.getDiscountedPricePerQuantity();
        builder.totalPrice = template.getTotalPrice();
        builder.taxedPrice = template.getTaxedPrice();
        builder.taxedPricePortions = template.getTaxedPricePortions();
        return builder;
    }

}
