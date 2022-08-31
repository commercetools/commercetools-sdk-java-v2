
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
     */

    public OrderLineItemRemovedMessagePayloadBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Quantity of Line Items that were removed during the Remove Line Item update action.</p>
     */

    public OrderLineItemRemovedMessagePayloadBuilder removedQuantity(final Long removedQuantity) {
        this.removedQuantity = removedQuantity;
        return this;
    }

    /**
     *  <p>Line Item quantity after the Remove Line Item update action.</p>
     */

    public OrderLineItemRemovedMessagePayloadBuilder newQuantity(final Long newQuantity) {
        this.newQuantity = newQuantity;
        return this;
    }

    /**
     *  <p>ItemStates after the Remove Line Item update action.</p>
     */

    public OrderLineItemRemovedMessagePayloadBuilder newState(
            final com.commercetools.api.models.order.ItemState... newState) {
        this.newState = new ArrayList<>(Arrays.asList(newState));
        return this;
    }

    /**
     *  <p>ItemStates after the Remove Line Item update action.</p>
     */

    public OrderLineItemRemovedMessagePayloadBuilder newState(
            final java.util.List<com.commercetools.api.models.order.ItemState> newState) {
        this.newState = newState;
        return this;
    }

    /**
     *  <p>ItemStates after the Remove Line Item update action.</p>
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
     */

    public OrderLineItemRemovedMessagePayloadBuilder withNewState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        this.newState = new ArrayList<>();
        this.newState.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p><code>totalPrice</code> of the Order after the Remove Line Item update action.</p>
     */

    public OrderLineItemRemovedMessagePayloadBuilder newTotalPrice(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.newTotalPrice = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p><code>totalPrice</code> of the Order after the Remove Line Item update action.</p>
     */

    public OrderLineItemRemovedMessagePayloadBuilder newTotalPrice(
            final com.commercetools.api.models.common.CentPrecisionMoney newTotalPrice) {
        this.newTotalPrice = newTotalPrice;
        return this;
    }

    /**
     *  <p>TaxedItemPrice of the Order after the Remove Line Item update action.</p>
     */

    public OrderLineItemRemovedMessagePayloadBuilder newTaxedPrice(
            Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPriceBuilder> builder) {
        this.newTaxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>TaxedItemPrice of the Order after the Remove Line Item update action.</p>
     */

    public OrderLineItemRemovedMessagePayloadBuilder newTaxedPrice(
            @Nullable final com.commercetools.api.models.cart.TaxedItemPrice newTaxedPrice) {
        this.newTaxedPrice = newTaxedPrice;
        return this;
    }

    /**
     *  <p>Price of the Order after the Remove Line Item update action.</p>
     */

    public OrderLineItemRemovedMessagePayloadBuilder newPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.newPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Price of the Order after the Remove Line Item update action.</p>
     */

    public OrderLineItemRemovedMessagePayloadBuilder newPrice(
            @Nullable final com.commercetools.api.models.common.Price newPrice) {
        this.newPrice = newPrice;
        return this;
    }

    /**
     *  <p>Shipping Details of the Order after the Remove Line Item update action.</p>
     */

    public OrderLineItemRemovedMessagePayloadBuilder newShippingDetail(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsBuilder, com.commercetools.api.models.cart.ItemShippingDetailsBuilder> builder) {
        this.newShippingDetail = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Shipping Details of the Order after the Remove Line Item update action.</p>
     */

    public OrderLineItemRemovedMessagePayloadBuilder newShippingDetail(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetails newShippingDetail) {
        this.newShippingDetail = newShippingDetail;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public Long getRemovedQuantity() {
        return this.removedQuantity;
    }

    public Long getNewQuantity() {
        return this.newQuantity;
    }

    public java.util.List<com.commercetools.api.models.order.ItemState> getNewState() {
        return this.newState;
    }

    public com.commercetools.api.models.common.CentPrecisionMoney getNewTotalPrice() {
        return this.newTotalPrice;
    }

    @Nullable
    public com.commercetools.api.models.cart.TaxedItemPrice getNewTaxedPrice() {
        return this.newTaxedPrice;
    }

    @Nullable
    public com.commercetools.api.models.common.Price getNewPrice() {
        return this.newPrice;
    }

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetails getNewShippingDetail() {
        return this.newShippingDetail;
    }

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
     * builds OrderLineItemRemovedMessagePayload without checking for non null required values
     */
    public OrderLineItemRemovedMessagePayload buildUnchecked() {
        return new OrderLineItemRemovedMessagePayloadImpl(lineItemId, removedQuantity, newQuantity, newState,
            newTotalPrice, newTaxedPrice, newPrice, newShippingDetail);
    }

    public static OrderLineItemRemovedMessagePayloadBuilder of() {
        return new OrderLineItemRemovedMessagePayloadBuilder();
    }

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
