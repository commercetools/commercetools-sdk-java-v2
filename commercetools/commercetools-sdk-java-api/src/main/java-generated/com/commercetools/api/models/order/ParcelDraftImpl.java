
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
public class ParcelDraftImpl implements ParcelDraft, ModelBase {

    private com.commercetools.api.models.order.ParcelMeasurements measurements;

    private com.commercetools.api.models.order.TrackingData trackingData;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @JsonCreator
    ParcelDraftImpl(
            @JsonProperty("measurements") final com.commercetools.api.models.order.ParcelMeasurements measurements,
            @JsonProperty("trackingData") final com.commercetools.api.models.order.TrackingData trackingData,
            @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.DeliveryItem> items,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.measurements = measurements;
        this.trackingData = trackingData;
        this.items = items;
        this.custom = custom;
    }

    public ParcelDraftImpl() {
    }

    public com.commercetools.api.models.order.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    public com.commercetools.api.models.order.TrackingData getTrackingData() {
        return this.trackingData;
    }

    /**
    *  <p>The delivery items contained in this parcel.</p>
    */
    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    /**
    *  <p>Custom Fields of this parcel.</p>
    */
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
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

        return new EqualsBuilder().append(measurements, that.measurements)
                .append(trackingData, that.trackingData)
                .append(items, that.items)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(measurements)
                .append(trackingData)
                .append(items)
                .append(custom)
                .toHashCode();
    }

}
