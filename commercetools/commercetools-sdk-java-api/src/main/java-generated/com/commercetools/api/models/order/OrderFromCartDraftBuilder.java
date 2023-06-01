package com.commercetools.api.models.order;

import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.commercetools.api.models.order.OrderState;
import com.commercetools.api.models.order.PaymentState;
import com.commercetools.api.models.order.ShipmentState;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.order.OrderFromCartDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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
     *  <p>Unique identifier of the Cart from which you can create an Order.</p>
     * @param id value to be set
     * @return Builder
     */
    @Deprecated
    public OrderFromCartDraftBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>ResourceIdentifier of the Cart from which the Order is created.</p>
     * @param builder function to build the cart value
     * @return Builder
     */
    
    public OrderFromCartDraftBuilder cart(Function<com.commercetools.api.models.cart.CartResourceIdentifierBuilder, com.commercetools.api.models.cart.CartResourceIdentifierBuilder> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>ResourceIdentifier of the Cart from which the Order is created.</p>
     * @param builder function to build the cart value
     * @return Builder
     */
    
    public OrderFromCartDraftBuilder withCart(Function<com.commercetools.api.models.cart.CartResourceIdentifierBuilder, com.commercetools.api.models.cart.CartResourceIdentifier> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>ResourceIdentifier of the Cart from which the Order is created.</p>
     * @param cart value to be set
     * @return Builder
     */
    
    public OrderFromCartDraftBuilder cart(@Nullable final com.commercetools.api.models.cart.CartResourceIdentifier cart) {
        this.cart = cart;
        return this;
    }
    
    
    
    
    /**
     *  <p>Expected version of the Cart from which the Order is created. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */
    
    public OrderFromCartDraftBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    
    
    /**
     *  <p>String that uniquely identifies an order. It can be used to create more human-readable (in contrast to ID) identifier for the order. It should be unique across a project. Once it's set it cannot be changed. For easier use on Get, Update and Delete actions we suggest assigning order numbers that match the regular expression <code>[a-z0-9_\-]{2,36}</code>.</p>
     * @param orderNumber value to be set
     * @return Builder
     */
    
    public OrderFromCartDraftBuilder orderNumber(@Nullable final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
    
    
    
    
    /**
     *  <p>Identifier for a purchase order, usually in a B2B context. The Purchase Order Number is typically entered by the Buyer and can also be used with Quotes.</p>
     * @param purchaseOrderNumber value to be set
     * @return Builder
     */
    
    public OrderFromCartDraftBuilder purchaseOrderNumber(@Nullable final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
        return this;
    }
    
    
    
    
    /**
     *  <p>Payment state for the Order.</p>
     * @param paymentState value to be set
     * @return Builder
     */
    
    public OrderFromCartDraftBuilder paymentState(@Nullable final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }
    
    
    
    
    /**
     *  <p>Shipment state for the Order.</p>
     * @param shipmentState value to be set
     * @return Builder
     */
    
    public OrderFromCartDraftBuilder shipmentState(@Nullable final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }
    
    
    
    
    /**
     *  <p>Order will be created with <code>Open</code> status by default.</p>
     * @param orderState value to be set
     * @return Builder
     */
    
    public OrderFromCartDraftBuilder orderState(@Nullable final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }
    
    
    
    
    /**
     *  <p>Reference to a State indicating the Order's state.</p>
     * @param builder function to build the state value
     * @return Builder
     */
    
    public OrderFromCartDraftBuilder state(Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Reference to a State indicating the Order's state.</p>
     * @param builder function to build the state value
     * @return Builder
     */
    
    public OrderFromCartDraftBuilder withState(Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Reference to a State indicating the Order's state.</p>
     * @param state value to be set
     * @return Builder
     */
    
    public OrderFromCartDraftBuilder state(@Nullable final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }
    
    
    
    
    /**
     *  <p>Custom Fields for the Order. The Custom Field type must match the type of the Custom Fields in the referenced Cart. If specified, the Custom Fields are merged with the Custom Fields on the referenced Cart and added to the Order. If empty, the Custom Fields on the referenced Cart are added to the Order automatically.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public OrderFromCartDraftBuilder custom(Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Custom Fields for the Order. The Custom Field type must match the type of the Custom Fields in the referenced Cart. If specified, the Custom Fields are merged with the Custom Fields on the referenced Cart and added to the Order. If empty, the Custom Fields on the referenced Cart are added to the Order automatically.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public OrderFromCartDraftBuilder withCustom(Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Custom Fields for the Order. The Custom Field type must match the type of the Custom Fields in the referenced Cart. If specified, the Custom Fields are merged with the Custom Fields on the referenced Cart and added to the Order. If empty, the Custom Fields on the referenced Cart are added to the Order automatically.</p>
     * @param custom value to be set
     * @return Builder
     */
    
    public OrderFromCartDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the Cart from which you can create an Order.</p>
     * @return id
     */
    @Deprecated
    @Nullable
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>ResourceIdentifier of the Cart from which the Order is created.</p>
     * @return cart
     */
    
    @Nullable
    public com.commercetools.api.models.cart.CartResourceIdentifier getCart(){
        return this.cart;
    }
    
    /**
     *  <p>Expected version of the Cart from which the Order is created. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @return version
     */
    
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>String that uniquely identifies an order. It can be used to create more human-readable (in contrast to ID) identifier for the order. It should be unique across a project. Once it's set it cannot be changed. For easier use on Get, Update and Delete actions we suggest assigning order numbers that match the regular expression <code>[a-z0-9_\-]{2,36}</code>.</p>
     * @return orderNumber
     */
    
    @Nullable
    public String getOrderNumber(){
        return this.orderNumber;
    }
    
    /**
     *  <p>Identifier for a purchase order, usually in a B2B context. The Purchase Order Number is typically entered by the Buyer and can also be used with Quotes.</p>
     * @return purchaseOrderNumber
     */
    
    @Nullable
    public String getPurchaseOrderNumber(){
        return this.purchaseOrderNumber;
    }
    
    /**
     *  <p>Payment state for the Order.</p>
     * @return paymentState
     */
    
    @Nullable
    public com.commercetools.api.models.order.PaymentState getPaymentState(){
        return this.paymentState;
    }
    
    /**
     *  <p>Shipment state for the Order.</p>
     * @return shipmentState
     */
    
    @Nullable
    public com.commercetools.api.models.order.ShipmentState getShipmentState(){
        return this.shipmentState;
    }
    
    /**
     *  <p>Order will be created with <code>Open</code> status by default.</p>
     * @return orderState
     */
    
    @Nullable
    public com.commercetools.api.models.order.OrderState getOrderState(){
        return this.orderState;
    }
    
    /**
     *  <p>Reference to a State indicating the Order's state.</p>
     * @return state
     */
    
    @Nullable
    public com.commercetools.api.models.state.StateResourceIdentifier getState(){
        return this.state;
    }
    
    /**
     *  <p>Custom Fields for the Order. The Custom Field type must match the type of the Custom Fields in the referenced Cart. If specified, the Custom Fields are merged with the Custom Fields on the referenced Cart and added to the Order. If empty, the Custom Fields on the referenced Cart are added to the Order automatically.</p>
     * @return custom
     */
    
    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }

    /**
     * builds OrderFromCartDraft with checking for non-null required values
     * @return OrderFromCartDraft
     */
    public OrderFromCartDraft build() {
        Objects.requireNonNull(version, OrderFromCartDraft.class + ": version is missing");
        return new OrderFromCartDraftImpl(id, cart, version, orderNumber, purchaseOrderNumber, paymentState, shipmentState, orderState, state, custom);
    }
    
    /**
     * builds OrderFromCartDraft without checking for non-null required values
     * @return OrderFromCartDraft
     */
    public OrderFromCartDraft buildUnchecked() {
        return new OrderFromCartDraftImpl(id, cart, version, orderNumber, purchaseOrderNumber, paymentState, shipmentState, orderState, state, custom);
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
