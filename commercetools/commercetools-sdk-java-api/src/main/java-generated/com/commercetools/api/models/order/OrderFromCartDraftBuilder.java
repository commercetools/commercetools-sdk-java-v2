
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderFromCartDraftBuilder {

    private String id;

    private com.commercetools.api.models.cart.CartResourceIdentifier cart;

    private Long version;

    @Nullable
    private String orderNumber;

    @Nullable
    private com.commercetools.api.models.order.PaymentState paymentState;

    @Nullable
    private com.commercetools.api.models.order.ShipmentState shipmentState;

    @Nullable
    private com.commercetools.api.models.order.OrderState orderState;

    @Nullable
    private com.commercetools.api.models.state.StateResourceIdentifier state;

    public OrderFromCartDraftBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public OrderFromCartDraftBuilder cart(final com.commercetools.api.models.cart.CartResourceIdentifier cart) {
        this.cart = cart;
        return this;
    }

    public OrderFromCartDraftBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public OrderFromCartDraftBuilder orderNumber(@Nullable final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public OrderFromCartDraftBuilder paymentState(
            @Nullable final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    public OrderFromCartDraftBuilder shipmentState(
            @Nullable final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    public OrderFromCartDraftBuilder orderState(
            @Nullable final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }

    public OrderFromCartDraftBuilder state(
            @Nullable final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.api.models.cart.CartResourceIdentifier getCart() {
        return this.cart;
    }

    public Long getVersion() {
        return this.version;
    }

    @Nullable
    public String getOrderNumber() {
        return this.orderNumber;
    }

    @Nullable
    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    @Nullable
    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    @Nullable
    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    @Nullable
    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    public OrderFromCartDraft build() {
        return new OrderFromCartDraftImpl(id, cart, version, orderNumber, paymentState, shipmentState, orderState,
            state);
    }

    public static OrderFromCartDraftBuilder of() {
        return new OrderFromCartDraftBuilder();
    }

    public static OrderFromCartDraftBuilder of(final OrderFromCartDraft template) {
        OrderFromCartDraftBuilder builder = new OrderFromCartDraftBuilder();
        builder.id = template.getId();
        builder.cart = template.getCart();
        builder.version = template.getVersion();
        builder.orderNumber = template.getOrderNumber();
        builder.paymentState = template.getPaymentState();
        builder.shipmentState = template.getShipmentState();
        builder.orderState = template.getOrderState();
        builder.state = template.getState();
        return builder;
    }

}
