package com.commercetools.api.models.order;

import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.commercetools.api.models.order.OrderState;
import com.commercetools.api.models.order.PaymentState;
import com.commercetools.api.models.order.ShipmentState;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.order.OrderFromCartDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * OrderFromCartDraft
 *
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
@JsonDeserialize(as = OrderFromCartDraftImpl.class)
public interface OrderFromCartDraft extends io.vrap.rmf.base.client.Draft<OrderFromCartDraft> {


    /**
     *  <p>Unique identifier of the Cart from which you can create an Order.</p>
     * @return id
     */
    @Deprecated
    @JsonProperty("id")
    public String getId();
    /**
     *  <p>ResourceIdentifier of the Cart from which the Order is created.</p>
     * @return cart
     */
    @Valid
    @JsonProperty("cart")
    public CartResourceIdentifier getCart();
    /**
     *  <p>Expected version of the Cart from which the Order is created. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    /**
     *  <p>String that uniquely identifies an order. It can be used to create more human-readable (in contrast to ID) identifier for the order. It should be unique across a project. Once it's set it cannot be changed. For easier use on Get, Update and Delete actions we suggest assigning order numbers that match the regular expression <code>[a-z0-9_\-]{2,36}</code>.</p>
     * @return orderNumber
     */
    
    @JsonProperty("orderNumber")
    public String getOrderNumber();
    /**
     *  <p>Identifier for a purchase order, usually in a B2B context. The Purchase Order Number is typically entered by the Buyer and can also be used with Quotes.</p>
     * @return purchaseOrderNumber
     */
    
    @JsonProperty("purchaseOrderNumber")
    public String getPurchaseOrderNumber();
    /**
     *  <p>Payment state for the Order.</p>
     * @return paymentState
     */
    
    @JsonProperty("paymentState")
    public PaymentState getPaymentState();
    /**
     *  <p>Shipment state for the Order.</p>
     * @return shipmentState
     */
    
    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();
    /**
     *  <p>Order will be created with <code>Open</code> status by default.</p>
     * @return orderState
     */
    
    @JsonProperty("orderState")
    public OrderState getOrderState();
    /**
     *  <p>Reference to a State indicating the Order's state.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();
    /**
     *  <p>Custom Fields for the Order. The Custom Field type must match the type of the Custom Fields in the referenced Cart. If specified, the Custom Fields are merged with the Custom Fields on the referenced Cart and added to the Order. If empty, the Custom Fields on the referenced Cart are added to the Order automatically.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Unique identifier of the Cart from which you can create an Order.</p>
     * @param id value to be set
     */
    @Deprecated
    public void setId(final String id);
    
    
    /**
     *  <p>ResourceIdentifier of the Cart from which the Order is created.</p>
     * @param cart value to be set
     */
    
    public void setCart(final CartResourceIdentifier cart);
    
    
    /**
     *  <p>Expected version of the Cart from which the Order is created. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @param version value to be set
     */
    
    public void setVersion(final Long version);
    
    
    /**
     *  <p>String that uniquely identifies an order. It can be used to create more human-readable (in contrast to ID) identifier for the order. It should be unique across a project. Once it's set it cannot be changed. For easier use on Get, Update and Delete actions we suggest assigning order numbers that match the regular expression <code>[a-z0-9_\-]{2,36}</code>.</p>
     * @param orderNumber value to be set
     */
    
    public void setOrderNumber(final String orderNumber);
    
    
    /**
     *  <p>Identifier for a purchase order, usually in a B2B context. The Purchase Order Number is typically entered by the Buyer and can also be used with Quotes.</p>
     * @param purchaseOrderNumber value to be set
     */
    
    public void setPurchaseOrderNumber(final String purchaseOrderNumber);
    
    
    /**
     *  <p>Payment state for the Order.</p>
     * @param paymentState value to be set
     */
    
    public void setPaymentState(final PaymentState paymentState);
    
    
    /**
     *  <p>Shipment state for the Order.</p>
     * @param shipmentState value to be set
     */
    
    public void setShipmentState(final ShipmentState shipmentState);
    
    
    /**
     *  <p>Order will be created with <code>Open</code> status by default.</p>
     * @param orderState value to be set
     */
    
    public void setOrderState(final OrderState orderState);
    
    
    /**
     *  <p>Reference to a State indicating the Order's state.</p>
     * @param state value to be set
     */
    
    public void setState(final StateResourceIdentifier state);
    
    
    /**
     *  <p>Custom Fields for the Order. The Custom Field type must match the type of the Custom Fields in the referenced Cart. If specified, the Custom Fields are merged with the Custom Fields on the referenced Cart and added to the Order. If empty, the Custom Fields on the referenced Cart are added to the Order automatically.</p>
     * @param custom value to be set
     */
    
    public void setCustom(final CustomFieldsDraft custom);
    

    /**
     * factory method
     * @return instance of OrderFromCartDraft
     */
    public static OrderFromCartDraft of(){
        return new OrderFromCartDraftImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderFromCartDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderFromCartDraft of(final OrderFromCartDraft template) {
        OrderFromCartDraftImpl instance = new OrderFromCartDraftImpl();
        instance.setId(template.getId());
        instance.setCart(template.getCart());
        instance.setVersion(template.getVersion());
        instance.setOrderNumber(template.getOrderNumber());
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setPaymentState(template.getPaymentState());
        instance.setShipmentState(template.getShipmentState());
        instance.setOrderState(template.getOrderState());
        instance.setState(template.getState());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderFromCartDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderFromCartDraft deepCopy(@Nullable final OrderFromCartDraft template) {
        if (template == null) {
            return null;
        }
        OrderFromCartDraftImpl instance = new OrderFromCartDraftImpl();
        instance.setId(template.getId());
        instance.setCart(com.commercetools.api.models.cart.CartResourceIdentifier.deepCopy(template.getCart()));
        instance.setVersion(template.getVersion());
        instance.setOrderNumber(template.getOrderNumber());
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setPaymentState(template.getPaymentState());
        instance.setShipmentState(template.getShipmentState());
        instance.setOrderState(template.getOrderState());
        instance.setState(com.commercetools.api.models.state.StateResourceIdentifier.deepCopy(template.getState()));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for OrderFromCartDraft
     * @return builder
     */
    public static OrderFromCartDraftBuilder builder() {
        return OrderFromCartDraftBuilder.of();
    }
    
    /**
     * create builder for OrderFromCartDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderFromCartDraftBuilder builder(final OrderFromCartDraft template) {
        return OrderFromCartDraftBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderFromCartDraft(Function<OrderFromCartDraft, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderFromCartDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderFromCartDraft>() {
            @Override
            public String toString() {
                return "TypeReference<OrderFromCartDraft>";
            }
        };
    }
}
