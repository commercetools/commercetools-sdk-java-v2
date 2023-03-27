
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderLineItemRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderLineItemRemovedMessagePayload orderLineItemRemovedMessagePayload = OrderLineItemRemovedMessagePayload.builder()
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
public class OrderLineItemRemovedMessagePayloadBuilder implements Builder<OrderLineItemRemovedMessagePayload> {

    private String lineItemId;

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
     *  <p>Unique identifier of the Line Item.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessagePayloadBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Quantity of Line Items that were removed during the Remove Line Item update action.</p>
     * @param removedQuantity value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessagePayloadBuilder removedQuantity(final Long removedQuantity) {
        this.removedQuantity = removedQuantity;
        return this;
    }

    /**
     *  <p>Line Item quantity after the Remove Line Item update action.</p>
     * @param newQuantity value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessagePayloadBuilder newQuantity(final Long newQuantity) {
        this.newQuantity = newQuantity;
        return this;
    }

    /**
     *  <p>ItemStates after the Remove Line Item update action.</p>
     * @param newState value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessagePayloadBuilder newState(
            final com.commercetools.api.models.order.ItemState... newState) {
        this.newState = new ArrayList<>(Arrays.asList(newState));
        return this;
    }

    /**
     *  <p>ItemStates after the Remove Line Item update action.</p>
     * @param newState value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessagePayloadBuilder newState(
            final java.util.List<com.commercetools.api.models.order.ItemState> newState) {
        this.newState = newState;
        return this;
    }

    /**
     *  <p>ItemStates after the Remove Line Item update action.</p>
     * @param newState value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessagePayloadBuilder plusNewState(
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

    public OrderLineItemRemovedMessagePayloadBuilder plusNewState(
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

    public OrderLineItemRemovedMessagePayloadBuilder withNewState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        this.newState = new ArrayList<>();
        this.newState.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p><code>totalPrice</code> of the Order after the Remove Line Item update action.</p>
     * @param builder function to build the newTotalPrice value
     * @return Builder
     */

    public OrderLineItemRemovedMessagePayloadBuilder newTotalPrice(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.newTotalPrice = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p><code>totalPrice</code> of the Order after the Remove Line Item update action.</p>
     * @param newTotalPrice value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessagePayloadBuilder newTotalPrice(
            final com.commercetools.api.models.common.CentPrecisionMoney newTotalPrice) {
        this.newTotalPrice = newTotalPrice;
        return this;
    }

    /**
     *  <p>TaxedItemPrice of the Order after the Remove Line Item update action.</p>
     * @param builder function to build the newTaxedPrice value
     * @return Builder
     */

    public OrderLineItemRemovedMessagePayloadBuilder newTaxedPrice(
            Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPriceBuilder> builder) {
        this.newTaxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>TaxedItemPrice of the Order after the Remove Line Item update action.</p>
     * @param newTaxedPrice value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessagePayloadBuilder newTaxedPrice(
            @Nullable final com.commercetools.api.models.cart.TaxedItemPrice newTaxedPrice) {
        this.newTaxedPrice = newTaxedPrice;
        return this;
    }

    /**
     *  <p>Price of the Order after the Remove Line Item update action.</p>
     * @param builder function to build the newPrice value
     * @return Builder
     */

    public OrderLineItemRemovedMessagePayloadBuilder newPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.newPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Price of the Order after the Remove Line Item update action.</p>
     * @param newPrice value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessagePayloadBuilder newPrice(
            @Nullable final com.commercetools.api.models.common.Price newPrice) {
        this.newPrice = newPrice;
        return this;
    }

    /**
     *  <p>Shipping Details of the Order after the Remove Line Item update action.</p>
     * @param builder function to build the newShippingDetail value
     * @return Builder
     */

    public OrderLineItemRemovedMessagePayloadBuilder newShippingDetail(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsBuilder, com.commercetools.api.models.cart.ItemShippingDetailsBuilder> builder) {
        this.newShippingDetail = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Shipping Details of the Order after the Remove Line Item update action.</p>
     * @param newShippingDetail value to be set
     * @return Builder
     */

    public OrderLineItemRemovedMessagePayloadBuilder newShippingDetail(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetails newShippingDetail) {
        this.newShippingDetail = newShippingDetail;
        return this;
    }

    /**
     *  <p>Unique identifier of the Line Item.</p>
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
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
     * builds OrderLineItemRemovedMessagePayload with checking for non-null required values
     * @return OrderLineItemRemovedMessagePayload
     */
    public OrderLineItemRemovedMessagePayload build() {
        Objects.requireNonNull(lineItemId, OrderLineItemRemovedMessagePayload.class + ": lineItemId is missing");
        Objects.requireNonNull(removedQuantity,
            OrderLineItemRemovedMessagePayload.class + ": removedQuantity is missing");
        Objects.requireNonNull(newQuantity, OrderLineItemRemovedMessagePayload.class + ": newQuantity is missing");
        Objects.requireNonNull(newState, OrderLineItemRemovedMessagePayload.class + ": newState is missing");
        Objects.requireNonNull(newTotalPrice, OrderLineItemRemovedMessagePayload.class + ": newTotalPrice is missing");
        return new OrderLineItemRemovedMessagePayloadImpl(lineItemId, removedQuantity, newQuantity, newState,
            newTotalPrice, newTaxedPrice, newPrice, newShippingDetail);
    }

    /**
     * builds OrderLineItemRemovedMessagePayload without checking for non-null required values
     * @return OrderLineItemRemovedMessagePayload
     */
    public OrderLineItemRemovedMessagePayload buildUnchecked() {
        return new OrderLineItemRemovedMessagePayloadImpl(lineItemId, removedQuantity, newQuantity, newState,
            newTotalPrice, newTaxedPrice, newPrice, newShippingDetail);
    }

    /**
     * factory method for an instance of OrderLineItemRemovedMessagePayloadBuilder
     * @return builder
     */
    public static OrderLineItemRemovedMessagePayloadBuilder of() {
        return new OrderLineItemRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for OrderLineItemRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderLineItemRemovedMessagePayloadBuilder of(final OrderLineItemRemovedMessagePayload template) {
        OrderLineItemRemovedMessagePayloadBuilder builder = new OrderLineItemRemovedMessagePayloadBuilder();
        builder.lineItemId = template.getLineItemId();
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
