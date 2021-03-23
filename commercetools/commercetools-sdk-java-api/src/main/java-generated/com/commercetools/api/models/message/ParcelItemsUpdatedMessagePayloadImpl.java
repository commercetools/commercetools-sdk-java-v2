
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ParcelItemsUpdatedMessagePayloadImpl implements ParcelItemsUpdatedMessagePayload {

    private String type;

    private String parcelId;

    private String deliveryId;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems;

    @JsonCreator
    ParcelItemsUpdatedMessagePayloadImpl(@JsonProperty("parcelId") final String parcelId,
            @JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.DeliveryItem> items,
            @JsonProperty("oldItems") final java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems) {
        this.parcelId = parcelId;
        this.deliveryId = deliveryId;
        this.items = items;
        this.oldItems = oldItems;
        this.type = PARCEL_ITEMS_UPDATED;
    }

    public ParcelItemsUpdatedMessagePayloadImpl() {
        this.type = PARCEL_ITEMS_UPDATED;
    }

    public String getType() {
        return this.type;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getOldItems() {
        return this.oldItems;
    }

    public void setParcelId(final String parcelId) {
        this.parcelId = parcelId;
    }

    public void setDeliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public void setItems(final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void setItems(final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
    }

    public void setOldItems(final com.commercetools.api.models.order.DeliveryItem... oldItems) {
        this.oldItems = new ArrayList<>(Arrays.asList(oldItems));
    }

    public void setOldItems(final java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems) {
        this.oldItems = oldItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ParcelItemsUpdatedMessagePayloadImpl that = (ParcelItemsUpdatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(parcelId, that.parcelId)
                .append(deliveryId, that.deliveryId)
                .append(items, that.items)
                .append(oldItems, that.oldItems)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(parcelId)
                .append(deliveryId)
                .append(items)
                .append(oldItems)
                .toHashCode();
    }

}
