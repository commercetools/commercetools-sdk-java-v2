
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderLineItemRemovedMessagePayloadBuilder implements Builder<OrderLineItemRemovedMessagePayload> {

    private String lineItemId;

    private Long removedQuantity;

    private Long newQuantity;

    private java.util.List<com.commercetools.api.models.order.ItemState> newState;

    private com.commercetools.api.models.common.TypedMoney newTotalPrice;

    @Nullable
    private com.commercetools.api.models.cart.TaxedItemPrice newTaxedPrice;

    @Nullable
    private com.commercetools.api.models.common.Price newPrice;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetails newShippingDetail;

    public OrderLineItemRemovedMessagePayloadBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public OrderLineItemRemovedMessagePayloadBuilder removedQuantity(final Long removedQuantity) {
        this.removedQuantity = removedQuantity;
        return this;
    }

    public OrderLineItemRemovedMessagePayloadBuilder newQuantity(final Long newQuantity) {
        this.newQuantity = newQuantity;
        return this;
    }

    public OrderLineItemRemovedMessagePayloadBuilder newState(
            final com.commercetools.api.models.order.ItemState... newState) {
        this.newState = new ArrayList<>(Arrays.asList(newState));
        return this;
    }

    public OrderLineItemRemovedMessagePayloadBuilder newState(
            final java.util.List<com.commercetools.api.models.order.ItemState> newState) {
        this.newState = newState;
        return this;
    }

    public OrderLineItemRemovedMessagePayloadBuilder plusNewState(
            final com.commercetools.api.models.order.ItemState... newState) {
        if (this.newState == null) {
            this.newState = new ArrayList<>();
        }
        this.newState.addAll(Arrays.asList(newState));
        return this;
    }

    public OrderLineItemRemovedMessagePayloadBuilder plusNewState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        if (this.newState == null) {
            this.newState = new ArrayList<>();
        }
        this.newState.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    public OrderLineItemRemovedMessagePayloadBuilder withNewState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        this.newState = new ArrayList<>();
        this.newState.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    public OrderLineItemRemovedMessagePayloadBuilder newTotalPrice(
            final com.commercetools.api.models.common.TypedMoney newTotalPrice) {
        this.newTotalPrice = newTotalPrice;
        return this;
    }

    public OrderLineItemRemovedMessagePayloadBuilder newTotalPrice(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.newTotalPrice = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    public OrderLineItemRemovedMessagePayloadBuilder newTaxedPrice(
            Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPriceBuilder> builder) {
        this.newTaxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    public OrderLineItemRemovedMessagePayloadBuilder newTaxedPrice(
            @Nullable final com.commercetools.api.models.cart.TaxedItemPrice newTaxedPrice) {
        this.newTaxedPrice = newTaxedPrice;
        return this;
    }

    public OrderLineItemRemovedMessagePayloadBuilder newPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.newPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    public OrderLineItemRemovedMessagePayloadBuilder newPrice(
            @Nullable final com.commercetools.api.models.common.Price newPrice) {
        this.newPrice = newPrice;
        return this;
    }

    public OrderLineItemRemovedMessagePayloadBuilder newShippingDetail(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsBuilder, com.commercetools.api.models.cart.ItemShippingDetailsBuilder> builder) {
        this.newShippingDetail = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsBuilder.of())
                .build();
        return this;
    }

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

    public com.commercetools.api.models.common.TypedMoney getNewTotalPrice() {
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
