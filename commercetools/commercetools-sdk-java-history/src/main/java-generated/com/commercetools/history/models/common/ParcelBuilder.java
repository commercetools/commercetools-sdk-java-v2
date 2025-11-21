
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ParcelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Parcel parcel = Parcel.builder()
 *             .id("{id}")
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelBuilder implements Builder<Parcel> {

    private String id;

    @Nullable
    private String key;

    private java.time.ZonedDateTime createdAt;

    @Nullable
    private com.commercetools.history.models.common.ParcelMeasurements measurements;

    @Nullable
    private com.commercetools.history.models.common.TrackingData trackingData;

    @Nullable
    private java.util.List<com.commercetools.history.models.common.DeliveryItem> items;

    @Nullable
    private com.commercetools.history.models.common.CustomFields custom;

    /**
     *  <p>Unique identifier of the Parcel.</p>
     * @param id value to be set
     * @return Builder
     */

    public ParcelBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Parcel.</p>
     * @param key value to be set
     * @return Builder
     */

    public ParcelBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Parcel was created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ParcelBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Information about the dimensions of the Parcel.</p>
     * @param builder function to build the measurements value
     * @return Builder
     */

    public ParcelBuilder measurements(
            Function<com.commercetools.history.models.common.ParcelMeasurementsBuilder, com.commercetools.history.models.common.ParcelMeasurementsBuilder> builder) {
        this.measurements = builder.apply(com.commercetools.history.models.common.ParcelMeasurementsBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Information about the dimensions of the Parcel.</p>
     * @param builder function to build the measurements value
     * @return Builder
     */

    public ParcelBuilder withMeasurements(
            Function<com.commercetools.history.models.common.ParcelMeasurementsBuilder, com.commercetools.history.models.common.ParcelMeasurements> builder) {
        this.measurements = builder.apply(com.commercetools.history.models.common.ParcelMeasurementsBuilder.of());
        return this;
    }

    /**
     *  <p>Information about the dimensions of the Parcel.</p>
     * @param measurements value to be set
     * @return Builder
     */

    public ParcelBuilder measurements(
            @Nullable final com.commercetools.history.models.common.ParcelMeasurements measurements) {
        this.measurements = measurements;
        return this;
    }

    /**
     *  <p>Shipment tracking information of the Parcel.</p>
     * @param builder function to build the trackingData value
     * @return Builder
     */

    public ParcelBuilder trackingData(
            Function<com.commercetools.history.models.common.TrackingDataBuilder, com.commercetools.history.models.common.TrackingDataBuilder> builder) {
        this.trackingData = builder.apply(com.commercetools.history.models.common.TrackingDataBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shipment tracking information of the Parcel.</p>
     * @param builder function to build the trackingData value
     * @return Builder
     */

    public ParcelBuilder withTrackingData(
            Function<com.commercetools.history.models.common.TrackingDataBuilder, com.commercetools.history.models.common.TrackingData> builder) {
        this.trackingData = builder.apply(com.commercetools.history.models.common.TrackingDataBuilder.of());
        return this;
    }

    /**
     *  <p>Shipment tracking information of the Parcel.</p>
     * @param trackingData value to be set
     * @return Builder
     */

    public ParcelBuilder trackingData(
            @Nullable final com.commercetools.history.models.common.TrackingData trackingData) {
        this.trackingData = trackingData;
        return this;
    }

    /**
     *  <p>Line Items or Custom Line Items delivered in this Parcel.</p>
     * @param items value to be set
     * @return Builder
     */

    public ParcelBuilder items(@Nullable final com.commercetools.history.models.common.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     *  <p>Line Items or Custom Line Items delivered in this Parcel.</p>
     * @param items value to be set
     * @return Builder
     */

    public ParcelBuilder items(
            @Nullable final java.util.List<com.commercetools.history.models.common.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     *  <p>Line Items or Custom Line Items delivered in this Parcel.</p>
     * @param items value to be set
     * @return Builder
     */

    public ParcelBuilder plusItems(@Nullable final com.commercetools.history.models.common.DeliveryItem... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    /**
     *  <p>Line Items or Custom Line Items delivered in this Parcel.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public ParcelBuilder plusItems(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Line Items or Custom Line Items delivered in this Parcel.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public ParcelBuilder withItems(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Line Items or Custom Line Items delivered in this Parcel.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public ParcelBuilder addItems(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItem> builder) {
        return plusItems(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()));
    }

    /**
     *  <p>Line Items or Custom Line Items delivered in this Parcel.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public ParcelBuilder setItems(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItem> builder) {
        return items(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()));
    }

    /**
     *  <p>Custom Fields of the Parcel.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ParcelBuilder custom(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the Parcel.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ParcelBuilder withCustom(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the Parcel.</p>
     * @param custom value to be set
     * @return Builder
     */

    public ParcelBuilder custom(@Nullable final com.commercetools.history.models.common.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Unique identifier of the Parcel.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the Parcel.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Date and time (UTC) the Parcel was created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Information about the dimensions of the Parcel.</p>
     * @return measurements
     */

    @Nullable
    public com.commercetools.history.models.common.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    /**
     *  <p>Shipment tracking information of the Parcel.</p>
     * @return trackingData
     */

    @Nullable
    public com.commercetools.history.models.common.TrackingData getTrackingData() {
        return this.trackingData;
    }

    /**
     *  <p>Line Items or Custom Line Items delivered in this Parcel.</p>
     * @return items
     */

    @Nullable
    public java.util.List<com.commercetools.history.models.common.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     *  <p>Custom Fields of the Parcel.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.history.models.common.CustomFields getCustom() {
        return this.custom;
    }

    /**
     * builds Parcel with checking for non-null required values
     * @return Parcel
     */
    public Parcel build() {
        Objects.requireNonNull(id, Parcel.class + ": id is missing");
        Objects.requireNonNull(createdAt, Parcel.class + ": createdAt is missing");
        return new ParcelImpl(id, key, createdAt, measurements, trackingData, items, custom);
    }

    /**
     * builds Parcel without checking for non-null required values
     * @return Parcel
     */
    public Parcel buildUnchecked() {
        return new ParcelImpl(id, key, createdAt, measurements, trackingData, items, custom);
    }

    /**
     * factory method for an instance of ParcelBuilder
     * @return builder
     */
    public static ParcelBuilder of() {
        return new ParcelBuilder();
    }

    /**
     * create builder for Parcel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelBuilder of(final Parcel template) {
        ParcelBuilder builder = new ParcelBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        builder.createdAt = template.getCreatedAt();
        builder.measurements = template.getMeasurements();
        builder.trackingData = template.getTrackingData();
        builder.items = template.getItems();
        builder.custom = template.getCustom();
        return builder;
    }

}
