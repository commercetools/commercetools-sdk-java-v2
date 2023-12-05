
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ParcelDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelDraftImpl implements ParcelDraft, ModelBase {

    private String key;

    private com.commercetools.api.models.order.ParcelMeasurements measurements;

    private com.commercetools.api.models.order.TrackingData trackingData;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ParcelDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("measurements") final com.commercetools.api.models.order.ParcelMeasurements measurements,
            @JsonProperty("trackingData") final com.commercetools.api.models.order.TrackingData trackingData,
            @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.DeliveryItem> items,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.key = key;
        this.measurements = measurements;
        this.trackingData = trackingData;
        this.items = items;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public ParcelDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier of the Parcel.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Information about the dimensions for the Parcel.</p>
     */

    public com.commercetools.api.models.order.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    /**
     *  <p>Shipment tracking information for the Parcel.</p>
     */

    public com.commercetools.api.models.order.TrackingData getTrackingData() {
        return this.trackingData;
    }

    /**
     *  <p>Line Items or Custom Line Items delivered in this Parcel.</p>
     */

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     *  <p>Custom Fields for the Parcel.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setKey(final String key) {
        this.key = key;
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

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ParcelDraftImpl that = (ParcelDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(measurements, that.measurements)
                .append(trackingData, that.trackingData)
                .append(items, that.items)
                .append(custom, that.custom)
                .append(key, that.key)
                .append(measurements, that.measurements)
                .append(trackingData, that.trackingData)
                .append(items, that.items)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(measurements)
                .append(trackingData)
                .append(items)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("measurements", measurements)
                .append("trackingData", trackingData)
                .append("items", items)
                .append("custom", custom)
                .build();
    }

}
