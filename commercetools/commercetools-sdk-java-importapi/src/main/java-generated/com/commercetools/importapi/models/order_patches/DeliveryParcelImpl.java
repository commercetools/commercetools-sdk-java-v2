
package com.commercetools.importapi.models.order_patches;

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
 * DeliveryParcel
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryParcelImpl implements DeliveryParcel, ModelBase {

    private String deliveryId;

    private com.commercetools.importapi.models.orders.ParcelMeasurements measurements;

    private com.commercetools.importapi.models.orders.TrackingData trackingData;

    private java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DeliveryParcelImpl(@JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("measurements") final com.commercetools.importapi.models.orders.ParcelMeasurements measurements,
            @JsonProperty("trackingData") final com.commercetools.importapi.models.orders.TrackingData trackingData,
            @JsonProperty("items") final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items) {
        this.deliveryId = deliveryId;
        this.measurements = measurements;
        this.trackingData = trackingData;
        this.items = items;
    }

    /**
     * create empty instance
     */
    public DeliveryParcelImpl() {
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p>Information about the dimensions of the Parcel.</p>
     */

    public com.commercetools.importapi.models.orders.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    /**
     *  <p>Shipment tracking information of the Parcel.</p>
     */

    public com.commercetools.importapi.models.orders.TrackingData getTrackingData() {
        return this.trackingData;
    }

    /**
     *  <p>Line Items or Custom Line Items delivered in this Parcel.</p>
     */

    public java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> getItems() {
        return this.items;
    }

    public void setDeliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
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

        DeliveryParcelImpl that = (DeliveryParcelImpl) o;

        return new EqualsBuilder().append(deliveryId, that.deliveryId)
                .append(measurements, that.measurements)
                .append(trackingData, that.trackingData)
                .append(items, that.items)
                .append(deliveryId, that.deliveryId)
                .append(measurements, that.measurements)
                .append(trackingData, that.trackingData)
                .append(items, that.items)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(deliveryId)
                .append(measurements)
                .append(trackingData)
                .append(items)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("deliveryId", deliveryId)
                .append("measurements", measurements)
                .append("trackingData", trackingData)
                .append("items", items)
                .build();
    }

    @Override
    public DeliveryParcel copyDeep() {
        return DeliveryParcel.deepCopy(this);
    }
}
