
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderFromCartDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderFromCartDraft orderFromCartDraft = OrderFromCartDraft.builder()
 *             .version(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderFromCartDraftBuilder implements Builder<OrderFromCartDraft> {

    @Deprecated
    @Nullable
    private String id;

    @Nullable
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

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>Unique identifier of the Cart from which you can create an Order.</p>
     */
    @Deprecated
    public OrderFromCartDraftBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Cart from which this order is created.</p>
     */

    public OrderFromCartDraftBuilder cart(
            Function<com.commercetools.api.models.cart.CartResourceIdentifierBuilder, com.commercetools.api.models.cart.CartResourceIdentifierBuilder> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Cart from which this order is created.</p>
     */

    public OrderFromCartDraftBuilder cart(
            @Nullable final com.commercetools.api.models.cart.CartResourceIdentifier cart) {
        this.cart = cart;
        return this;
    }

    /**
     *
     */

    public OrderFromCartDraftBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>String that uniquely identifies an order. It can be used to create more human-readable (in contrast to ID) identifier for the order. It should be unique across a project. Once it's set it cannot be changed. For easier use on Get, Update and Delete actions we suggest assigning order numbers that match the regular expression <code>[a-z0-9_\-]{2,36}</code>.</p>
     */

    public OrderFromCartDraftBuilder orderNumber(@Nullable final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     *
     */

    public OrderFromCartDraftBuilder paymentState(
            @Nullable final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    /**
     *
     */

    public OrderFromCartDraftBuilder shipmentState(
            @Nullable final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     *  <p>Order will be created with <code>Open</code> status by default.</p>
     */

    public OrderFromCartDraftBuilder orderState(
            @Nullable final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }

    /**
     *
     */

    public OrderFromCartDraftBuilder state(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public OrderFromCartDraftBuilder state(
            @Nullable final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Custom Fields for the Order. The Custom Field type must match the type of the Custom Fields in the referenced Cart. If specified, the Custom Fields are merged with the Custom Fields on the referenced Cart and added to the Order. If empty, the Custom Fields on the referenced Cart are added to the Order automatically.</p>
     */

    public OrderFromCartDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Order. The Custom Field type must match the type of the Custom Fields in the referenced Cart. If specified, the Custom Fields are merged with the Custom Fields on the referenced Cart and added to the Order. If empty, the Custom Fields on the referenced Cart are added to the Order automatically.</p>
     */

    public OrderFromCartDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    @Deprecated
    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
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

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public OrderFromCartDraft build() {
        Objects.requireNonNull(version, OrderFromCartDraft.class + ": version is missing");
        return new OrderFromCartDraftImpl(id, cart, version, orderNumber, paymentState, shipmentState, orderState,
            state, custom);
    }

    /**
     * builds OrderFromCartDraft without checking for non null required values
     */
    public OrderFromCartDraft buildUnchecked() {
        return new OrderFromCartDraftImpl(id, cart, version, orderNumber, paymentState, shipmentState, orderState,
            state, custom);
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
        builder.custom = template.getCustom();
        return builder;
    }

}
