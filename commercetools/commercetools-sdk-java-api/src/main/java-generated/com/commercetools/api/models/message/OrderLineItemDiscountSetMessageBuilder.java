
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

    @Nullable
    private String lineItemKey;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

    private com.commercetools.api.models.common.Money totalPrice;

    @Nullable
    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    private java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> taxedPricePortions;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
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
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder withResourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiers> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of());
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param resourceUserProvidedIdentifiers value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Unique identifier for the Line Item.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the LineItem.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
        return this;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @param discountedPricePerQuantity value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder discountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @param discountedPricePerQuantity value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder discountedPricePerQuantity(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        return this;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @param discountedPricePerQuantity value to be set
     * @return Builder
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
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
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
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder withDiscountedPricePerQuantity(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder> builder) {
        this.discountedPricePerQuantity = new ArrayList<>();
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder addDiscountedPricePerQuantity(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> builder) {
        return plusDiscountedPricePerQuantity(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()));
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder setDiscountedPricePerQuantity(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> builder) {
        return discountedPricePerQuantity(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()));
    }

    /**
     *  <p>Total Price of the Line Item after the Discount recalculation.</p>
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder totalPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Total Price of the Line Item after the Discount recalculation.</p>
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder withTotalPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Total Price of the Line Item after the Discount recalculation.</p>
     * @param totalPrice value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder totalPrice(
            final com.commercetools.api.models.common.Money totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     *  <p>TaxedItemPrice of the Line Item after the Discount recalculation.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>TaxedItemPrice of the Line Item after the Discount recalculation.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder withTaxedPrice(
            Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPrice> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of());
        return this;
    }

    /**
     *  <p>TaxedItemPrice of the Line Item after the Discount recalculation.</p>
     * @param taxedPrice value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder taxedPrice(
            @Nullable final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>Taxed price of the Shipping Methods in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param taxedPricePortions value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder taxedPricePortions(
            final com.commercetools.api.models.cart.MethodTaxedPrice... taxedPricePortions) {
        this.taxedPricePortions = new ArrayList<>(Arrays.asList(taxedPricePortions));
        return this;
    }

    /**
     *  <p>Taxed price of the Shipping Methods in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param taxedPricePortions value to be set
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder taxedPricePortions(
            final java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> taxedPricePortions) {
        this.taxedPricePortions = taxedPricePortions;
        return this;
    }

    /**
     *  <p>Taxed price of the Shipping Methods in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param taxedPricePortions value to be set
     * @return Builder
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
     *  <p>Taxed price of the Shipping Methods in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param builder function to build the taxedPricePortions value
     * @return Builder
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
     *  <p>Taxed price of the Shipping Methods in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param builder function to build the taxedPricePortions value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder withTaxedPricePortions(
            Function<com.commercetools.api.models.cart.MethodTaxedPriceBuilder, com.commercetools.api.models.cart.MethodTaxedPriceBuilder> builder) {
        this.taxedPricePortions = new ArrayList<>();
        this.taxedPricePortions
                .add(builder.apply(com.commercetools.api.models.cart.MethodTaxedPriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Taxed price of the Shipping Methods in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param builder function to build the taxedPricePortions value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder addTaxedPricePortions(
            Function<com.commercetools.api.models.cart.MethodTaxedPriceBuilder, com.commercetools.api.models.cart.MethodTaxedPrice> builder) {
        return plusTaxedPricePortions(builder.apply(com.commercetools.api.models.cart.MethodTaxedPriceBuilder.of()));
    }

    /**
     *  <p>Taxed price of the Shipping Methods in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param builder function to build the taxedPricePortions value
     * @return Builder
     */

    public OrderLineItemDiscountSetMessageBuilder setTaxedPricePortions(
            Function<com.commercetools.api.models.cart.MethodTaxedPriceBuilder, com.commercetools.api.models.cart.MethodTaxedPrice> builder) {
        return taxedPricePortions(builder.apply(com.commercetools.api.models.cart.MethodTaxedPriceBuilder.of()));
    }

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @return sequenceNumber
     */

    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @return resource
     */

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @return resourceVersion
     */

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @return resourceUserProvidedIdentifiers
     */

    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    /**
     *  <p>Unique identifier for the Line Item.</p>
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>User-defined unique identifier of the LineItem.</p>
     * @return lineItemKey
     */

    @Nullable
    public String getLineItemKey() {
        return this.lineItemKey;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @return discountedPricePerQuantity
     */

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    /**
     *  <p>Total Price of the Line Item after the Discount recalculation.</p>
     * @return totalPrice
     */

    public com.commercetools.api.models.common.Money getTotalPrice() {
        return this.totalPrice;
    }

    /**
     *  <p>TaxedItemPrice of the Line Item after the Discount recalculation.</p>
     * @return taxedPrice
     */

    @Nullable
    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Taxed price of the Shipping Methods in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @return taxedPricePortions
     */

    public java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> getTaxedPricePortions() {
        return this.taxedPricePortions;
    }

    /**
     * builds OrderLineItemDiscountSetMessage with checking for non-null required values
     * @return OrderLineItemDiscountSetMessage
     */
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
            lineItemKey, discountedPricePerQuantity, totalPrice, taxedPrice, taxedPricePortions);
    }

    /**
     * builds OrderLineItemDiscountSetMessage without checking for non-null required values
     * @return OrderLineItemDiscountSetMessage
     */
    public OrderLineItemDiscountSetMessage buildUnchecked() {
        return new OrderLineItemDiscountSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, lineItemId,
            lineItemKey, discountedPricePerQuantity, totalPrice, taxedPrice, taxedPricePortions);
    }

    /**
     * factory method for an instance of OrderLineItemDiscountSetMessageBuilder
     * @return builder
     */
    public static OrderLineItemDiscountSetMessageBuilder of() {
        return new OrderLineItemDiscountSetMessageBuilder();
    }

    /**
     * create builder for OrderLineItemDiscountSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
        builder.lineItemKey = template.getLineItemKey();
        builder.discountedPricePerQuantity = template.getDiscountedPricePerQuantity();
        builder.totalPrice = template.getTotalPrice();
        builder.taxedPrice = template.getTaxedPrice();
        builder.taxedPricePortions = template.getTaxedPricePortions();
        return builder;
    }

}
