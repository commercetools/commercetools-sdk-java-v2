
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
 *  <p>A Delivery can only be added to an Order if its <code>shippingInfo</code> (for <code>shippingMode</code> = <code>Single</code>), or its <code>shipping</code> (for <code>shippingMode</code> = <code>Multiple</code>) exists.</p>
 *  <p>Produces the Delivery Added Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderAddDeliveryActionImpl implements OrderAddDeliveryAction, ModelBase {

    private String action;

    private String deliveryKey;

    private String shippingKey;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    private com.commercetools.api.models.common.BaseAddress address;

    private java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderAddDeliveryActionImpl(@JsonProperty("deliveryKey") final String deliveryKey,
            @JsonProperty("shippingKey") final String shippingKey,
            @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.DeliveryItem> items,
            @JsonProperty("address") final com.commercetools.api.models.common.BaseAddress address,
            @JsonProperty("parcels") final java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.deliveryKey = deliveryKey;
        this.shippingKey = shippingKey;
        this.items = items;
        this.address = address;
        this.parcels = parcels;
        this.custom = custom;
        this.action = ADD_DELIVERY;
    }

    /**
     * create empty instance
     */
    public OrderAddDeliveryActionImpl() {
        this.action = ADD_DELIVERY;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>key</code> of an existing Delivery.</p>
     */

    public String getDeliveryKey() {
        return this.deliveryKey;
    }

    /**
     *  <p><code>key</code> of the ShippingMethod, required for <code>Multiple</code> ShippingMode.</p>
     */

    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     *  <p>Line Items or Custom Line Items to be included in the Delivery.</p>
     */

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     *  <p>Address the <code>parcels</code> should be delivered to.</p>
     */

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     *  <p>Parcels of the Delivery.</p>
     *  <p>If provided, this update action produces the Parcel Added To Delivery Message.</p>
     */

    public java.util.List<com.commercetools.api.models.order.ParcelDraft> getParcels() {
        return this.parcels;
    }

    /**
     *  <p>Custom Fields for the Delivery.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setDeliveryKey(final String deliveryKey) {
        this.deliveryKey = deliveryKey;
    }

    public void setShippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
    }

    public void setItems(final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void setItems(final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
    }

    public void setAddress(final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
    }

    public void setParcels(final com.commercetools.api.models.order.ParcelDraft... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
    }

    public void setParcels(final java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels) {
        this.parcels = parcels;
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

        OrderAddDeliveryActionImpl that = (OrderAddDeliveryActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(deliveryKey, that.deliveryKey)
                .append(shippingKey, that.shippingKey)
                .append(items, that.items)
                .append(address, that.address)
                .append(parcels, that.parcels)
                .append(custom, that.custom)
                .append(action, that.action)
                .append(deliveryKey, that.deliveryKey)
                .append(shippingKey, that.shippingKey)
                .append(items, that.items)
                .append(address, that.address)
                .append(parcels, that.parcels)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(deliveryKey)
                .append(shippingKey)
                .append(items)
                .append(address)
                .append(parcels)
                .append(custom)
                .toHashCode();
    }

}
