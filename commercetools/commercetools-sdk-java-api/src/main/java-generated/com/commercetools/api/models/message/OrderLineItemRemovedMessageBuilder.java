
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderLineItemRemovedMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderLineItemRemovedMessage orderLineItemRemovedMessage = OrderLineItemRemovedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .lineItemId("{lineItemId}")
 *             .removedQuantity(0.3)
 *             .newQuantity(0.3)
 *             .plusNewState(newStateBuilder -> newStateBuilder)
 *             .newTotalPrice(newTotalPriceBuilder -> newTotalPriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderLineItemRemovedMessageBuilder implements Builder<OrderLineItemRemovedMessage> {

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

    private Long removedQuantity;

    private Long newQuantity;

    private java.util.List<com.commercetools.api.models.order.ItemState> newState;

    private com.commercetools.api.models.common.CentPrecisionMoney newTotalPrice;

    @Nullable
    private com.commercetools.api.models.cart.TaxedItemPrice newTaxedPrice;

    @Nullable
    private com.commercetools.api.models.common.Price newPrice;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetails newShippingDetail;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder resourceUserProvidedIdentifiers(
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

    public OrderLineItemRemovedMessageBuilder withResourceUserProvidedIdentifiers(
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

    public OrderLineItemRemovedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Unique identifier of the Line Item.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the LineItem.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
        return this;
    }

    /**
     *  <p>Quantity of Line Items that were removed during the Remove Line Item update action.</p>
     * @param removedQuantity value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder removedQuantity(final Long removedQuantity) {
        this.removedQuantity = removedQuantity;
        return this;
    }

    /**
     *  <p>Line Item quantity after the Remove Line Item update action.</p>
     * @param newQuantity value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder newQuantity(final Long newQuantity) {
        this.newQuantity = newQuantity;
        return this;
    }

    /**
     *  <p>ItemStates after the Remove Line Item update action.</p>
     * @param newState value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder newState(final com.commercetools.api.models.order.ItemState... newState) {
        this.newState = new ArrayList<>(Arrays.asList(newState));
        return this;
    }

    /**
     *  <p>ItemStates after the Remove Line Item update action.</p>
     * @param newState value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder newState(
            final java.util.List<com.commercetools.api.models.order.ItemState> newState) {
        this.newState = newState;
        return this;
    }

    /**
     *  <p>ItemStates after the Remove Line Item update action.</p>
     * @param newState value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder plusNewState(
            final com.commercetools.api.models.order.ItemState... newState) {
        if (this.newState == null) {
            this.newState = new ArrayList<>();
        }
        this.newState.addAll(Arrays.asList(newState));
        return this;
    }

    /**
     *  <p>ItemStates after the Remove Line Item update action.</p>
     * @param builder function to build the newState value
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder plusNewState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        if (this.newState == null) {
            this.newState = new ArrayList<>();
        }
        this.newState.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ItemStates after the Remove Line Item update action.</p>
     * @param builder function to build the newState value
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder withNewState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        this.newState = new ArrayList<>();
        this.newState.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ItemStates after the Remove Line Item update action.</p>
     * @param builder function to build the newState value
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder addNewState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemState> builder) {
        return plusNewState(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()));
    }

    /**
     *  <p>ItemStates after the Remove Line Item update action.</p>
     * @param builder function to build the newState value
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder setNewState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemState> builder) {
        return newState(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()));
    }

    /**
     *  <p><code>totalPrice</code> of the Order after the Remove Line Item update action.</p>
     * @param builder function to build the newTotalPrice value
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder newTotalPrice(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.newTotalPrice = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p><code>totalPrice</code> of the Order after the Remove Line Item update action.</p>
     * @param builder function to build the newTotalPrice value
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder withNewTotalPrice(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoney> builder) {
        this.newTotalPrice = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of());
        return this;
    }

    /**
     *  <p><code>totalPrice</code> of the Order after the Remove Line Item update action.</p>
     * @param newTotalPrice value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder newTotalPrice(
            final com.commercetools.api.models.common.CentPrecisionMoney newTotalPrice) {
        this.newTotalPrice = newTotalPrice;
        return this;
    }

    /**
     *  <p>TaxedItemPrice of the Order after the Remove Line Item update action.</p>
     * @param builder function to build the newTaxedPrice value
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder newTaxedPrice(
            Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPriceBuilder> builder) {
        this.newTaxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>TaxedItemPrice of the Order after the Remove Line Item update action.</p>
     * @param builder function to build the newTaxedPrice value
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder withNewTaxedPrice(
            Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPrice> builder) {
        this.newTaxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of());
        return this;
    }

    /**
     *  <p>TaxedItemPrice of the Order after the Remove Line Item update action.</p>
     * @param newTaxedPrice value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder newTaxedPrice(
            @Nullable final com.commercetools.api.models.cart.TaxedItemPrice newTaxedPrice) {
        this.newTaxedPrice = newTaxedPrice;
        return this;
    }

    /**
     *  <p>Price of the Order after the Remove Line Item update action.</p>
     * @param builder function to build the newPrice value
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder newPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.newPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Price of the Order after the Remove Line Item update action.</p>
     * @param builder function to build the newPrice value
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder withNewPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.Price> builder) {
        this.newPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of());
        return this;
    }

    /**
     *  <p>Price of the Order after the Remove Line Item update action.</p>
     * @param newPrice value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder newPrice(
            @Nullable final com.commercetools.api.models.common.Price newPrice) {
        this.newPrice = newPrice;
        return this;
    }

    /**
     *  <p>Shipping Details of the Order after the Remove Line Item update action.</p>
     * @param builder function to build the newShippingDetail value
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder newShippingDetail(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsBuilder, com.commercetools.api.models.cart.ItemShippingDetailsBuilder> builder) {
        this.newShippingDetail = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Shipping Details of the Order after the Remove Line Item update action.</p>
     * @param builder function to build the newShippingDetail value
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder withNewShippingDetail(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsBuilder, com.commercetools.api.models.cart.ItemShippingDetails> builder) {
        this.newShippingDetail = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsBuilder.of());
        return this;
    }

    /**
     *  <p>Shipping Details of the Order after the Remove Line Item update action.</p>
     * @param newShippingDetail value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessageBuilder newShippingDetail(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetails newShippingDetail) {
        this.newShippingDetail = newShippingDetail;
        return this;
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
     *  <p>IDs and references that last modified the Message.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
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
     *  <p>Unique identifier of the Line Item.</p>
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
     *  <p>Quantity of Line Items that were removed during the Remove Line Item update action.</p>
     * @return removedQuantity
     */

    public Long getRemovedQuantity() {
        return this.removedQuantity;
    }

    /**
     *  <p>Line Item quantity after the Remove Line Item update action.</p>
     * @return newQuantity
     */

    public Long getNewQuantity() {
        return this.newQuantity;
    }

    /**
     *  <p>ItemStates after the Remove Line Item update action.</p>
     * @return newState
     */

    public java.util.List<com.commercetools.api.models.order.ItemState> getNewState() {
        return this.newState;
    }

    /**
     *  <p><code>totalPrice</code> of the Order after the Remove Line Item update action.</p>
     * @return newTotalPrice
     */

    public com.commercetools.api.models.common.CentPrecisionMoney getNewTotalPrice() {
        return this.newTotalPrice;
    }

    /**
     *  <p>TaxedItemPrice of the Order after the Remove Line Item update action.</p>
     * @return newTaxedPrice
     */

    @Nullable
    public com.commercetools.api.models.cart.TaxedItemPrice getNewTaxedPrice() {
        return this.newTaxedPrice;
    }

    /**
     *  <p>Price of the Order after the Remove Line Item update action.</p>
     * @return newPrice
     */

    @Nullable
    public com.commercetools.api.models.common.Price getNewPrice() {
        return this.newPrice;
    }

    /**
     *  <p>Shipping Details of the Order after the Remove Line Item update action.</p>
     * @return newShippingDetail
     */

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetails getNewShippingDetail() {
        return this.newShippingDetail;
    }

    /**
     * builds OrderLineItemRemovedMessage with checking for non-null required values
     * @return OrderLineItemRemovedMessage
     */
    public OrderLineItemRemovedMessage build() {
        Objects.requireNonNull(id, OrderLineItemRemovedMessage.class + ": id is missing");
        Objects.requireNonNull(version, OrderLineItemRemovedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, OrderLineItemRemovedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, OrderLineItemRemovedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, OrderLineItemRemovedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, OrderLineItemRemovedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, OrderLineItemRemovedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(lineItemId, OrderLineItemRemovedMessage.class + ": lineItemId is missing");
        Objects.requireNonNull(removedQuantity, OrderLineItemRemovedMessage.class + ": removedQuantity is missing");
        Objects.requireNonNull(newQuantity, OrderLineItemRemovedMessage.class + ": newQuantity is missing");
        Objects.requireNonNull(newState, OrderLineItemRemovedMessage.class + ": newState is missing");
        Objects.requireNonNull(newTotalPrice, OrderLineItemRemovedMessage.class + ": newTotalPrice is missing");
        return new OrderLineItemRemovedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, lineItemId, lineItemKey,
            removedQuantity, newQuantity, newState, newTotalPrice, newTaxedPrice, newPrice, newShippingDetail);
    }

    /**
     * builds OrderLineItemRemovedMessage without checking for non-null required values
     * @return OrderLineItemRemovedMessage
     */
    public OrderLineItemRemovedMessage buildUnchecked() {
        return new OrderLineItemRemovedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, lineItemId, lineItemKey,
            removedQuantity, newQuantity, newState, newTotalPrice, newTaxedPrice, newPrice, newShippingDetail);
    }

    /**
     * factory method for an instance of OrderLineItemRemovedMessageBuilder
     * @return builder
     */
    public static OrderLineItemRemovedMessageBuilder of() {
        return new OrderLineItemRemovedMessageBuilder();
    }

    /**
     * create builder for OrderLineItemRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderLineItemRemovedMessageBuilder of(final OrderLineItemRemovedMessage template) {
        OrderLineItemRemovedMessageBuilder builder = new OrderLineItemRemovedMessageBuilder();
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
        builder.removedQuantity = template.getRemovedQuantity();
        builder.newQuantity = template.getNewQuantity();
        builder.newState = template.getNewState();
        builder.newTotalPrice = template.getNewTotalPrice();
        builder.newTaxedPrice = template.getNewTaxedPrice();
        builder.newPrice = template.getNewPrice();
        builder.newShippingDetail = template.getNewShippingDetail();
        return builder;
    }

}
