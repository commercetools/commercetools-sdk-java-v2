
package com.commercetools.importapi.models.orders;

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
public class ParcelImpl implements Parcel, ModelBase {

    private String id;

    private java.time.ZonedDateTime createdAt;

    private com.commercetools.importapi.models.orders.ParcelMeasurements measurements;

    private com.commercetools.importapi.models.orders.TrackingData trackingData;

    private java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items;

    @JsonCreator
    ParcelImpl(@JsonProperty("id") final String id, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("measurements") final com.commercetools.importapi.models.orders.ParcelMeasurements measurements,
            @JsonProperty("trackingData") final com.commercetools.importapi.models.orders.TrackingData trackingData,
            @JsonProperty("items") final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items) {
        this.id = id;
        this.createdAt = createdAt;
        this.measurements = measurements;
        this.trackingData = trackingData;
        this.items = items;
    }

    public ParcelImpl() {
    }

    public String getId() {
        return this.id;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public com.commercetools.importapi.models.orders.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    public com.commercetools.importapi.models.orders.TrackingData getTrackingData() {
        return this.trackingData;
    }

    public java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> getItems() {
        return this.items;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setMeasurements(final com.commercetools.importapi.models.orders.ParcelMeasurements measurements) {
        this.measurements = measurements;
    }

    public void setTrackingData(final com.commercetools.importapi.models.orders.TrackingData trackingData) {
        this.trackingData = trackingData;
    }

    public void setItems(final com.commercetools.importapi.models.orders.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void setItems(final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ParcelImpl that = (ParcelImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(createdAt, that.createdAt)
                .append(measurements, that.measurements)
                .append(trackingData, that.trackingData)
                .append(items, that.items)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(createdAt)
                .append(measurements)
                .append(trackingData)
                .append(items)
                .toHashCode();
    }

}
