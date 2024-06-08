
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderFromCartDraftImpl.class)
public interface OrderFromCartDraft extends io.vrap.rmf.base.client.Draft<OrderFromCartDraft> {

    /**
     *  <p><code>id</code> of the Cart used to create the Order.</p>
     * @return id
     */
    @Deprecated
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>ResourceIdentifier to the Cart from which the Order is created.</p>
     *  <p>This field is required, but is marked as optional for backwards compatibility reasons.</p>
     * @return cart
     */
    @Valid
    @JsonProperty("cart")
    public CartResourceIdentifier getCart();

    /**
     *  <p><code>version</code> of the Cart from which the Order is created.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>User-defined identifier for the Order that is unique across a Project. Once set, the value cannot be changed.</p>
     * @return orderNumber
     */

    @JsonProperty("orderNumber")
    public String getOrderNumber();

    /**
     *  <p>User-defined identifier for a purchase Order.</p>
     *  <p>It is typically set by the Buyer and can be used with Quotes to track the purchase Order during the quote and order flow.</p>
     * @return purchaseOrderNumber
     */

    @JsonProperty("purchaseOrderNumber")
    public String getPurchaseOrderNumber();

    /**
     *  <p>Payment status for the Order.</p>
     * @return paymentState
     */

    @JsonProperty("paymentState")
    public PaymentState getPaymentState();

    /**
     *  <p>Shipment status for the Order.</p>
     * @return shipmentState
     */

    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();

    /**
     *  <p>Current status for the Order.</p>
     * @return orderState
     */

    @JsonProperty("orderState")
    public OrderState getOrderState();

    /**
     *  <p>State for the Order in a custom workflow.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    /**
     *  <p>Custom Fields for the Order. The Custom Fields' type must match the Custom Fields' type in the referenced Cart.</p>
     *  <ul>
     *   <li>If empty, the Custom Fields on the referenced Cart are added to the Order automatically.</li>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced Cart and added to the Order.</li>
     *  </ul>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p><code>id</code> of the Cart used to create the Order.</p>
     * @param id value to be set
     */
    @Deprecated
    public void setId(final String id);

    /**
     *  <p>ResourceIdentifier to the Cart from which the Order is created.</p>
     *  <p>This field is required, but is marked as optional for backwards compatibility reasons.</p>
     * @param cart value to be set
     */

    public void setCart(final CartResourceIdentifier cart);

    /**
     *  <p><code>version</code> of the Cart from which the Order is created.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>User-defined identifier for the Order that is unique across a Project. Once set, the value cannot be changed.</p>
     * @param orderNumber value to be set
     */

    public void setOrderNumber(final String orderNumber);

    /**
     *  <p>User-defined identifier for a purchase Order.</p>
     *  <p>It is typically set by the Buyer and can be used with Quotes to track the purchase Order during the quote and order flow.</p>
     * @param purchaseOrderNumber value to be set
     */

    public void setPurchaseOrderNumber(final String purchaseOrderNumber);

    /**
     *  <p>Payment status for the Order.</p>
     * @param paymentState value to be set
     */

    public void setPaymentState(final PaymentState paymentState);

    /**
     *  <p>Shipment status for the Order.</p>
     * @param shipmentState value to be set
     */

    public void setShipmentState(final ShipmentState shipmentState);

    /**
     *  <p>Current status for the Order.</p>
     * @param orderState value to be set
     */

    public void setOrderState(final OrderState orderState);

    /**
     *  <p>State for the Order in a custom workflow.</p>
     * @param state value to be set
     */

    public void setState(final StateResourceIdentifier state);

    /**
     *  <p>Custom Fields for the Order. The Custom Fields' type must match the Custom Fields' type in the referenced Cart.</p>
     *  <ul>
     *   <li>If empty, the Custom Fields on the referenced Cart are added to the Order automatically.</li>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced Cart and added to the Order.</li>
     *  </ul>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of OrderFromCartDraft
     */
    public static OrderFromCartDraft of() {
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
