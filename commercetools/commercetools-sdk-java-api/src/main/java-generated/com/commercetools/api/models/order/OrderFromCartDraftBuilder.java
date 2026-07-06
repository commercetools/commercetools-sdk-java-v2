
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
    private String purchaseOrderNumber;

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
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> used to create the Order.</p>
     * @param id value to be set
     * @return Builder
     */
    @Deprecated
    public OrderFromCartDraftBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the Cart from which the Order is created.</p>
     *  <p>This field is required, but is marked as optional for backwards compatibility reasons.</p>
     * @param builder function to build the cart value
     * @return Builder
     */

    public OrderFromCartDraftBuilder cart(
            Function<com.commercetools.api.models.cart.CartResourceIdentifierBuilder, com.commercetools.api.models.cart.CartResourceIdentifierBuilder> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the Cart from which the Order is created.</p>
     *  <p>This field is required, but is marked as optional for backwards compatibility reasons.</p>
     * @param builder function to build the cart value
     * @return Builder
     */

    public OrderFromCartDraftBuilder withCart(
            Function<com.commercetools.api.models.cart.CartResourceIdentifierBuilder, com.commercetools.api.models.cart.CartResourceIdentifier> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the Cart from which the Order is created.</p>
     *  <p>This field is required, but is marked as optional for backwards compatibility reasons.</p>
     * @param cart value to be set
     * @return Builder
     */

    public OrderFromCartDraftBuilder cart(
            @Nullable final com.commercetools.api.models.cart.CartResourceIdentifier cart) {
        this.cart = cart;
        return this;
    }

    /**
     *  <p><code>version</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> from which the Order is created.</p>
     * @param version value to be set
     * @return Builder
     */

    public OrderFromCartDraftBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>User-defined identifier for the Order that is unique across a Project. Once set, the value cannot be changed.</p>
     * @param orderNumber value to be set
     * @return Builder
     */

    public OrderFromCartDraftBuilder orderNumber(@Nullable final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     *  <p>User-defined identifier for a purchase order.</p>
     *  <p>It is typically set by the <a href="https://docs.commercetools.com/apis/ctp:api:type:Buyer" rel="nofollow">Buyer</a> or Merchant to track the purchase order during the <span>quote and order flow</span>.</p>
     *  <p>If not provided, the <code>purchaseOrderNumber</code> from the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> is used.</p>
     * @param purchaseOrderNumber value to be set
     * @return Builder
     */

    public OrderFromCartDraftBuilder purchaseOrderNumber(@Nullable final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
        return this;
    }

    /**
     *  <p>Payment status for the Order.</p>
     * @param paymentState value to be set
     * @return Builder
     */

    public OrderFromCartDraftBuilder paymentState(
            @Nullable final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    /**
     *  <p>Shipment status for the Order.</p>
     * @param shipmentState value to be set
     * @return Builder
     */

    public OrderFromCartDraftBuilder shipmentState(
            @Nullable final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     *  <p>Current status for the Order.</p>
     * @param orderState value to be set
     * @return Builder
     */

    public OrderFromCartDraftBuilder orderState(
            @Nullable final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }

    /**
     *  <p>State for the Order in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public OrderFromCartDraftBuilder state(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State for the Order in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public OrderFromCartDraftBuilder withState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>State for the Order in a custom workflow.</p>
     * @param state value to be set
     * @return Builder
     */

    public OrderFromCartDraftBuilder state(
            @Nullable final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Custom Fields for the Order. The Custom Fields' type must match the Custom Fields' type in the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
     *  <ul>
     *   <li>If empty, the Custom Fields on the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> are added to the Order automatically.</li>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> and added to the Order.</li>
     *  </ul>
     * @param builder function to build the custom value
     * @return Builder
     */

    public OrderFromCartDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Order. The Custom Fields' type must match the Custom Fields' type in the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
     *  <ul>
     *   <li>If empty, the Custom Fields on the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> are added to the Order automatically.</li>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> and added to the Order.</li>
     *  </ul>
     * @param builder function to build the custom value
     * @return Builder
     */

    public OrderFromCartDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Order. The Custom Fields' type must match the Custom Fields' type in the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
     *  <ul>
     *   <li>If empty, the Custom Fields on the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> are added to the Order automatically.</li>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> and added to the Order.</li>
     *  </ul>
     * @param custom value to be set
     * @return Builder
     */

    public OrderFromCartDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> used to create the Order.</p>
     * @return id
     */
    @Deprecated
    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the Cart from which the Order is created.</p>
     *  <p>This field is required, but is marked as optional for backwards compatibility reasons.</p>
     * @return cart
     */

    @Nullable
    public com.commercetools.api.models.cart.CartResourceIdentifier getCart() {
        return this.cart;
    }

    /**
     *  <p><code>version</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> from which the Order is created.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>User-defined identifier for the Order that is unique across a Project. Once set, the value cannot be changed.</p>
     * @return orderNumber
     */

    @Nullable
    public String getOrderNumber() {
        return this.orderNumber;
    }

    /**
     *  <p>User-defined identifier for a purchase order.</p>
     *  <p>It is typically set by the <a href="https://docs.commercetools.com/apis/ctp:api:type:Buyer" rel="nofollow">Buyer</a> or Merchant to track the purchase order during the <span>quote and order flow</span>.</p>
     *  <p>If not provided, the <code>purchaseOrderNumber</code> from the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> is used.</p>
     * @return purchaseOrderNumber
     */

    @Nullable
    public String getPurchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    /**
     *  <p>Payment status for the Order.</p>
     * @return paymentState
     */

    @Nullable
    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     *  <p>Shipment status for the Order.</p>
     * @return shipmentState
     */

    @Nullable
    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     *  <p>Current status for the Order.</p>
     * @return orderState
     */

    @Nullable
    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    /**
     *  <p>State for the Order in a custom workflow.</p>
     * @return state
     */

    @Nullable
    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    /**
     *  <p>Custom Fields for the Order. The Custom Fields' type must match the Custom Fields' type in the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
     *  <ul>
     *   <li>If empty, the Custom Fields on the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> are added to the Order automatically.</li>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> and added to the Order.</li>
     *  </ul>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds OrderFromCartDraft with checking for non-null required values
     * @return OrderFromCartDraft
     */
    public OrderFromCartDraft build() {
        Objects.requireNonNull(version, OrderFromCartDraft.class + ": version is missing");
        return new OrderFromCartDraftImpl(id, cart, version, orderNumber, purchaseOrderNumber, paymentState,
            shipmentState, orderState, state, custom);
    }

    /**
     * builds OrderFromCartDraft without checking for non-null required values
     * @return OrderFromCartDraft
     */
    public OrderFromCartDraft buildUnchecked() {
        return new OrderFromCartDraftImpl(id, cart, version, orderNumber, purchaseOrderNumber, paymentState,
            shipmentState, orderState, state, custom);
    }

    /**
     * factory method for an instance of OrderFromCartDraftBuilder
     * @return builder
     */
    public static OrderFromCartDraftBuilder of() {
        return new OrderFromCartDraftBuilder();
    }

    /**
     * create builder for OrderFromCartDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderFromCartDraftBuilder of(final OrderFromCartDraft template) {
        OrderFromCartDraftBuilder builder = new OrderFromCartDraftBuilder();
        builder.id = template.getId();
        builder.cart = template.getCart();
        builder.version = template.getVersion();
        builder.orderNumber = template.getOrderNumber();
        builder.purchaseOrderNumber = template.getPurchaseOrderNumber();
        builder.paymentState = template.getPaymentState();
        builder.shipmentState = template.getShipmentState();
        builder.orderState = template.getOrderState();
        builder.state = template.getState();
        builder.custom = template.getCustom();
        return builder;
    }

}
