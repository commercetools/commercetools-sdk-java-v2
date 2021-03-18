
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ParcelBuilder {

    private String id;

    private String createdAt;

    private com.commercetools.history.models.ParcelMeasurements measurements;

    private com.commercetools.history.models.TrackingData trackingData;

    private java.util.List<com.commercetools.history.models.DeliveryItem> items;

    public ParcelBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ParcelBuilder createdAt(final String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ParcelBuilder measurements(final com.commercetools.history.models.ParcelMeasurements measurements) {
        this.measurements = measurements;
        return this;
    }

    public ParcelBuilder trackingData(final com.commercetools.history.models.TrackingData trackingData) {
        this.trackingData = trackingData;
        return this;
    }

    public ParcelBuilder items(final com.commercetools.history.models.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public ParcelBuilder items(final java.util.List<com.commercetools.history.models.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public com.commercetools.history.models.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    public com.commercetools.history.models.TrackingData getTrackingData() {
        return this.trackingData;
    }

    public java.util.List<com.commercetools.history.models.DeliveryItem> getItems() {
        return this.items;
    }

    public Parcel build() {
        return new ParcelImpl(id, createdAt, measurements, trackingData, items);
    }

    public static ParcelBuilder of() {
        return new ParcelBuilder();
    }

    public static ParcelBuilder of(final Parcel template) {
        ParcelBuilder builder = new ParcelBuilder();
        builder.id = template.getId();
        builder.createdAt = template.getCreatedAt();
        builder.measurements = template.getMeasurements();
        builder.trackingData = template.getTrackingData();
        builder.items = template.getItems();
        return builder;
    }

}
