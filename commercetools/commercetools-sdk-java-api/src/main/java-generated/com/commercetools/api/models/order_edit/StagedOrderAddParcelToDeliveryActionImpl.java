
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderAddParcelToDeliveryActionImpl implements StagedOrderAddParcelToDeliveryAction {

    private String action;

    private String deliveryId;

    private com.commercetools.api.models.order.ParcelMeasurements measurements;

    private com.commercetools.api.models.order.TrackingData trackingData;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    @JsonCreator
    StagedOrderAddParcelToDeliveryActionImpl(@JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("measurements") final com.commercetools.api.models.order.ParcelMeasurements measurements,
            @JsonProperty("trackingData") final com.commercetools.api.models.order.TrackingData trackingData,
            @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.deliveryId = deliveryId;
        this.measurements = measurements;
        this.trackingData = trackingData;
        this.items = items;
        this.action = ADD_PARCEL_TO_DELIVERY;
    }

    public StagedOrderAddParcelToDeliveryActionImpl() {
        this.action = ADD_PARCEL_TO_DELIVERY;
    }

    public String getAction() {
        return this.action;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public com.commercetools.api.models.order.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    public com.commercetools.api.models.order.TrackingData getTrackingData() {
        return this.trackingData;
    }

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    public void setDeliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public void setMeasurements(final com.commercetools.api.models.order.ParcelMeasurements measurements) {
        this.measurements = measurements;
    }

    public void setTrackingData(final com.commercetools.api.models.order.TrackingData trackingData) {
        this.trackingData = trackingData;
    }

    public void setItems(final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void setItems(final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderAddParcelToDeliveryActionImpl that = (StagedOrderAddParcelToDeliveryActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(deliveryId, that.deliveryId)
                .append(measurements, that.measurements)
                .append(trackingData, that.trackingData)
                .append(items, that.items)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(deliveryId)
                .append(measurements)
                .append(trackingData)
                .append(items)
                .toHashCode();
    }

}
