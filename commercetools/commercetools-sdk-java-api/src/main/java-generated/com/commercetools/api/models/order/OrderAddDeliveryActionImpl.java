
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderAddDeliveryActionImpl implements OrderAddDeliveryAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    private com.commercetools.api.models.common.BaseAddress address;

    private java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @JsonCreator
    OrderAddDeliveryActionImpl(
            @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.DeliveryItem> items,
            @JsonProperty("address") final com.commercetools.api.models.common.BaseAddress address,
            @JsonProperty("parcels") final java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.items = items;
        this.address = address;
        this.parcels = parcels;
        this.custom = custom;
        this.action = ADD_DELIVERY;
    }

    public OrderAddDeliveryActionImpl() {
        this.action = ADD_DELIVERY;
    }

    public String getAction() {
        return this.action;
    }

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public java.util.List<com.commercetools.api.models.order.ParcelDraft> getParcels() {
        return this.parcels;
    }

    /**
    *  <p>Custom Fields for the Transaction.</p>
    */
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
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
                .append(items, that.items)
                .append(address, that.address)
                .append(parcels, that.parcels)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(items)
                .append(address)
                .append(parcels)
                .append(custom)
                .toHashCode();
    }

}
