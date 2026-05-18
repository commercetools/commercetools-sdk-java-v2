
package com.commercetools.history.models.common;

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
 *  <p>Information regarding the appearance, content, and shipment of a Parcel.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelImpl implements Parcel, ModelBase {

    private String id;

    private String key;

    private java.time.ZonedDateTime createdAt;

    private com.commercetools.history.models.common.ParcelMeasurements measurements;

    private com.commercetools.history.models.common.TrackingData trackingData;

    private java.util.List<com.commercetools.history.models.common.DeliveryItem> items;

    private com.commercetools.history.models.common.CustomFields custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ParcelImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("measurements") final com.commercetools.history.models.common.ParcelMeasurements measurements,
            @JsonProperty("trackingData") final com.commercetools.history.models.common.TrackingData trackingData,
            @JsonProperty("items") final java.util.List<com.commercetools.history.models.common.DeliveryItem> items,
            @JsonProperty("custom") final com.commercetools.history.models.common.CustomFields custom) {
        this.id = id;
        this.key = key;
        this.createdAt = createdAt;
        this.measurements = measurements;
        this.trackingData = trackingData;
        this.items = items;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public ParcelImpl() {
    }

    /**
     *  <p>Unique identifier of the Parcel.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the Parcel.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Date and time (UTC) the Parcel was created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Information about the dimensions of the Parcel.</p>
     */

    public com.commercetools.history.models.common.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    /**
     *  <p>Shipment tracking information of the Parcel.</p>
     */

    public com.commercetools.history.models.common.TrackingData getTrackingData() {
        return this.trackingData;
    }

    /**
     *  <p>Line Items or Custom Line Items delivered in this Parcel.</p>
     */

    public java.util.List<com.commercetools.history.models.common.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     *  <p>Custom Fields of the Parcel.</p>
     */

    public com.commercetools.history.models.common.CustomFields getCustom() {
        return this.custom;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setMeasurements(final com.commercetools.history.models.common.ParcelMeasurements measurements) {
        this.measurements = measurements;
    }

    public void setTrackingData(final com.commercetools.history.models.common.TrackingData trackingData) {
        this.trackingData = trackingData;
    }

    public void setItems(final com.commercetools.history.models.common.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void setItems(final java.util.List<com.commercetools.history.models.common.DeliveryItem> items) {
        this.items = items;
    }

    public void setCustom(final com.commercetools.history.models.common.CustomFields custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ParcelImpl that = (ParcelImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(key, that.key)
                .append(createdAt, that.createdAt)
                .append(measurements, that.measurements)
                .append(trackingData, that.trackingData)
                .append(items, that.items)
                .append(custom, that.custom)
                .append(id, that.id)
                .append(key, that.key)
                .append(createdAt, that.createdAt)
                .append(measurements, that.measurements)
                .append(trackingData, that.trackingData)
                .append(items, that.items)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(key)
                .append(createdAt)
                .append(measurements)
                .append(trackingData)
                .append(items)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("key", key)
                .append("createdAt", createdAt)
                .append("measurements", measurements)
                .append("trackingData", trackingData)
                .append("items", items)
                .append("custom", custom)
                .build();
    }

    @Override
    public Parcel copyDeep() {
        return Parcel.deepCopy(this);
    }
}
