
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>A <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a> can only be added to an <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> if its <code>shippingInfo</code> (for <code>shippingMode</code> = <code>Single</code>), or its <code>shipping</code> (for <code>shippingMode</code> = <code>Multiple</code>) exists.</p>
 *  <p>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:DeliveryAddedMessage" rel="nofollow">Delivery Added</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderAddDeliveryActionImpl implements StagedOrderAddDeliveryAction, ModelBase {

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
    StagedOrderAddDeliveryActionImpl(@JsonProperty("deliveryKey") final String deliveryKey,
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
    public StagedOrderAddDeliveryActionImpl() {
        this.action = ADD_DELIVERY;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>key</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     */

    public String getDeliveryKey() {
        return this.deliveryKey;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a>, required for <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     */

    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     *  <p>Items to be included in the Delivery.</p>
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
     *  <p>If provided, this update action also produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:ParcelAddedToDeliveryMessage" rel="nofollow">Parcel Added To Delivery</a> Message.</p>
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

        StagedOrderAddDeliveryActionImpl that = (StagedOrderAddDeliveryActionImpl) o;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("deliveryKey", deliveryKey)
                .append("shippingKey", shippingKey)
                .append("items", items)
                .append("address", address)
                .append("parcels", parcels)
                .append("custom", custom)
                .build();
    }

    @Override
    public StagedOrderAddDeliveryAction copyDeep() {
        return StagedOrderAddDeliveryAction.deepCopy(this);
    }
}
