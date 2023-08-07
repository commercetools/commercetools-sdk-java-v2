
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * OrderFromCartDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderFromCartDraftImpl implements OrderFromCartDraft, ModelBase {

    @Deprecated
    private String id;

    private com.commercetools.api.models.cart.CartResourceIdentifier cart;

    private Long version;

    private String orderNumber;

    private String purchaseOrderNumber;

    private com.commercetools.api.models.order.PaymentState paymentState;

    private com.commercetools.api.models.order.ShipmentState shipmentState;

    private com.commercetools.api.models.order.OrderState orderState;

    private com.commercetools.api.models.state.StateResourceIdentifier state;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderFromCartDraftImpl(@JsonProperty("id") final String id,
            @JsonProperty("cart") final com.commercetools.api.models.cart.CartResourceIdentifier cart,
            @JsonProperty("version") final Long version, @JsonProperty("orderNumber") final String orderNumber,
            @JsonProperty("purchaseOrderNumber") final String purchaseOrderNumber,
            @JsonProperty("paymentState") final com.commercetools.api.models.order.PaymentState paymentState,
            @JsonProperty("shipmentState") final com.commercetools.api.models.order.ShipmentState shipmentState,
            @JsonProperty("orderState") final com.commercetools.api.models.order.OrderState orderState,
            @JsonProperty("state") final com.commercetools.api.models.state.StateResourceIdentifier state,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.id = id;
        this.cart = cart;
        this.version = version;
        this.orderNumber = orderNumber;
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.paymentState = paymentState;
        this.shipmentState = shipmentState;
        this.orderState = orderState;
        this.state = state;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public OrderFromCartDraftImpl() {
    }

    /**
     *  <p><code>id</code> of the Cart used to create the Order.</p>
     */
    @Deprecated
    public String getId() {
        return this.id;
    }

    /**
     *  <p>ResourceIdentifier to the Cart from which the Order is created.</p>
     *  <p>This field is required, but is marked as optional for backwards compatibility reasons.</p>
     */

    public com.commercetools.api.models.cart.CartResourceIdentifier getCart() {
        return this.cart;
    }

    /**
     *  <p><code>version</code> of the Cart from which the Order is created.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>User-defined identifier for the Order that is unique across a Project. Once set, the value cannot be changed.</p>
     */

    public String getOrderNumber() {
        return this.orderNumber;
    }

    /**
     *  <p>User-defined identifier for a purchase Order.</p>
     *  <p>It is typically set by the Buyer and can be used with Quotes to track the purchase Order during the quote and order flow.</p>
     */

    public String getPurchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    /**
     *  <p>Payment status for the Order.</p>
     */

    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     *  <p>Shipment status for the Order.</p>
     */

    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     *  <p>Current status for the Order.</p>
     */

    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    /**
     *  <p>State for the Order in a custom workflow.</p>
     */

    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    /**
     *  <p>Custom Fields for the Order. The Custom Fields' type must match the Custom Fields' type in the referenced Cart.</p>
     *  <ul>
     *   <li>If empty, the Custom Fields on the referenced Cart are added to the Order automatically.</li>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced Cart and added to the Order.</li>
     *  </ul>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Deprecated
    public void setId(final String id) {
        this.id = id;
    }

    public void setCart(final com.commercetools.api.models.cart.CartResourceIdentifier cart) {
        this.cart = cart;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setOrderNumber(final String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setPurchaseOrderNumber(final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public void setPaymentState(final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
    }

    public void setShipmentState(final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
    }

    public void setOrderState(final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
    }

    public void setState(final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderFromCartDraftImpl that = (OrderFromCartDraftImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(cart, that.cart)
                .append(version, that.version)
                .append(orderNumber, that.orderNumber)
                .append(purchaseOrderNumber, that.purchaseOrderNumber)
                .append(paymentState, that.paymentState)
                .append(shipmentState, that.shipmentState)
                .append(orderState, that.orderState)
                .append(state, that.state)
                .append(custom, that.custom)
                .append(id, that.id)
                .append(cart, that.cart)
                .append(version, that.version)
                .append(orderNumber, that.orderNumber)
                .append(purchaseOrderNumber, that.purchaseOrderNumber)
                .append(paymentState, that.paymentState)
                .append(shipmentState, that.shipmentState)
                .append(orderState, that.orderState)
                .append(state, that.state)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(cart)
                .append(version)
                .append(orderNumber)
                .append(purchaseOrderNumber)
                .append(paymentState)
                .append(shipmentState)
                .append(orderState)
                .append(state)
                .append(custom)
                .toHashCode();
    }

}
