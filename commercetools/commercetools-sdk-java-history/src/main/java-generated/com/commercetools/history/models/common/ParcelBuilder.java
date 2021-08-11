
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ParcelBuilder implements Builder<Parcel> {

    private String id;

    private String createdAt;

    private com.commercetools.history.models.common.ParcelMeasurements measurements;

    private com.commercetools.history.models.common.TrackingData trackingData;

    private java.util.List<com.commercetools.history.models.common.DeliveryItem> items;

    public ParcelBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ParcelBuilder createdAt(final String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ParcelBuilder measurements(
            Function<com.commercetools.history.models.common.ParcelMeasurementsBuilder, com.commercetools.history.models.common.ParcelMeasurementsBuilder> builder) {
        this.measurements = builder.apply(com.commercetools.history.models.common.ParcelMeasurementsBuilder.of())
                .build();
        return this;
    }

    public ParcelBuilder measurements(final com.commercetools.history.models.common.ParcelMeasurements measurements) {
        this.measurements = measurements;
        return this;
    }

    public ParcelBuilder trackingData(
            Function<com.commercetools.history.models.common.TrackingDataBuilder, com.commercetools.history.models.common.TrackingDataBuilder> builder) {
        this.trackingData = builder.apply(com.commercetools.history.models.common.TrackingDataBuilder.of()).build();
        return this;
    }

    public ParcelBuilder trackingData(final com.commercetools.history.models.common.TrackingData trackingData) {
        this.trackingData = trackingData;
        return this;
    }

    public ParcelBuilder items(final com.commercetools.history.models.common.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public ParcelBuilder withItems(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }

    public ParcelBuilder plusItems(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }

    public ParcelBuilder items(final java.util.List<com.commercetools.history.models.common.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public com.commercetools.history.models.common.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    public com.commercetools.history.models.common.TrackingData getTrackingData() {
        return this.trackingData;
    }

    public java.util.List<com.commercetools.history.models.common.DeliveryItem> getItems() {
        return this.items;
    }

    public Parcel build() {
        Objects.requireNonNull(id, Parcel.class + ": id is missing");
        Objects.requireNonNull(createdAt, Parcel.class + ": createdAt is missing");
        Objects.requireNonNull(measurements, Parcel.class + ": measurements is missing");
        Objects.requireNonNull(trackingData, Parcel.class + ": trackingData is missing");
        Objects.requireNonNull(items, Parcel.class + ": items is missing");
        return new ParcelImpl(id, createdAt, measurements, trackingData, items);
    }

    /**
     * builds Parcel without checking for non null required values
     */
    public Parcel buildUnchecked() {
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
