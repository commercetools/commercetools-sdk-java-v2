
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ParcelBuilder {

    private String id;

    private java.time.ZonedDateTime createdAt;

    @Nullable
    private com.commercetools.api.models.order.ParcelMeasurements measurements;

    @Nullable
    private com.commercetools.api.models.order.TrackingData trackingData;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    public ParcelBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ParcelBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ParcelBuilder measurements(
            @Nullable final com.commercetools.api.models.order.ParcelMeasurements measurements) {
        this.measurements = measurements;
        return this;
    }

    public ParcelBuilder trackingData(@Nullable final com.commercetools.api.models.order.TrackingData trackingData) {
        this.trackingData = trackingData;
        return this;
    }

    public ParcelBuilder items(@Nullable final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public ParcelBuilder items(@Nullable final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public com.commercetools.api.models.order.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    @Nullable
    public com.commercetools.api.models.order.TrackingData getTrackingData() {
        return this.trackingData;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
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
