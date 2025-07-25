
package com.commercetools.importapi.models.order_patches;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryParcelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryParcel deliveryParcel = DeliveryParcel.builder()
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryParcelBuilder implements Builder<DeliveryParcel> {

    private String deliveryId;

    @Nullable
    private com.commercetools.importapi.models.orders.ParcelMeasurements measurements;

    @Nullable
    private com.commercetools.importapi.models.orders.TrackingData trackingData;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items;

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public DeliveryParcelBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Information about the dimensions of the Parcel.</p>
     * @param builder function to build the measurements value
     * @return Builder
     */

    public DeliveryParcelBuilder measurements(
            Function<com.commercetools.importapi.models.orders.ParcelMeasurementsBuilder, com.commercetools.importapi.models.orders.ParcelMeasurementsBuilder> builder) {
        this.measurements = builder.apply(com.commercetools.importapi.models.orders.ParcelMeasurementsBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Information about the dimensions of the Parcel.</p>
     * @param builder function to build the measurements value
     * @return Builder
     */

    public DeliveryParcelBuilder withMeasurements(
            Function<com.commercetools.importapi.models.orders.ParcelMeasurementsBuilder, com.commercetools.importapi.models.orders.ParcelMeasurements> builder) {
        this.measurements = builder.apply(com.commercetools.importapi.models.orders.ParcelMeasurementsBuilder.of());
        return this;
    }

    /**
     *  <p>Information about the dimensions of the Parcel.</p>
     * @param measurements value to be set
     * @return Builder
     */

    public DeliveryParcelBuilder measurements(
            @Nullable final com.commercetools.importapi.models.orders.ParcelMeasurements measurements) {
        this.measurements = measurements;
        return this;
    }

    /**
     *  <p>Shipment tracking information of the Parcel.</p>
     * @param builder function to build the trackingData value
     * @return Builder
     */

    public DeliveryParcelBuilder trackingData(
            Function<com.commercetools.importapi.models.orders.TrackingDataBuilder, com.commercetools.importapi.models.orders.TrackingDataBuilder> builder) {
        this.trackingData = builder.apply(com.commercetools.importapi.models.orders.TrackingDataBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shipment tracking information of the Parcel.</p>
     * @param builder function to build the trackingData value
     * @return Builder
     */

    public DeliveryParcelBuilder withTrackingData(
            Function<com.commercetools.importapi.models.orders.TrackingDataBuilder, com.commercetools.importapi.models.orders.TrackingData> builder) {
        this.trackingData = builder.apply(com.commercetools.importapi.models.orders.TrackingDataBuilder.of());
        return this;
    }

    /**
     *  <p>Shipment tracking information of the Parcel.</p>
     * @param trackingData value to be set
     * @return Builder
     */

    public DeliveryParcelBuilder trackingData(
            @Nullable final com.commercetools.importapi.models.orders.TrackingData trackingData) {
        this.trackingData = trackingData;
        return this;
    }

    /**
     *  <p>Line Items or Custom Line Items delivered in this Parcel.</p>
     * @param items value to be set
     * @return Builder
     */

    public DeliveryParcelBuilder items(
            @Nullable final com.commercetools.importapi.models.orders.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     *  <p>Line Items or Custom Line Items delivered in this Parcel.</p>
     * @param items value to be set
     * @return Builder
     */

    public DeliveryParcelBuilder items(
            @Nullable final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     *  <p>Line Items or Custom Line Items delivered in this Parcel.</p>
     * @param items value to be set
     * @return Builder
     */

    public DeliveryParcelBuilder plusItems(
            @Nullable final com.commercetools.importapi.models.orders.DeliveryItem... items) {
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

    public DeliveryParcelBuilder plusItems(
            Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Line Items or Custom Line Items delivered in this Parcel.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public DeliveryParcelBuilder withItems(
            Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Line Items or Custom Line Items delivered in this Parcel.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public DeliveryParcelBuilder addItems(
            Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItem> builder) {
        return plusItems(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()));
    }

    /**
     *  <p>Line Items or Custom Line Items delivered in this Parcel.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public DeliveryParcelBuilder setItems(
            Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItem> builder) {
        return items(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()));
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p>Information about the dimensions of the Parcel.</p>
     * @return measurements
     */

    @Nullable
    public com.commercetools.importapi.models.orders.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    /**
     *  <p>Shipment tracking information of the Parcel.</p>
     * @return trackingData
     */

    @Nullable
    public com.commercetools.importapi.models.orders.TrackingData getTrackingData() {
        return this.trackingData;
    }

    /**
     *  <p>Line Items or Custom Line Items delivered in this Parcel.</p>
     * @return items
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     * builds DeliveryParcel with checking for non-null required values
     * @return DeliveryParcel
     */
    public DeliveryParcel build() {
        Objects.requireNonNull(deliveryId, DeliveryParcel.class + ": deliveryId is missing");
        return new DeliveryParcelImpl(deliveryId, measurements, trackingData, items);
    }

    /**
     * builds DeliveryParcel without checking for non-null required values
     * @return DeliveryParcel
     */
    public DeliveryParcel buildUnchecked() {
        return new DeliveryParcelImpl(deliveryId, measurements, trackingData, items);
    }

    /**
     * factory method for an instance of DeliveryParcelBuilder
     * @return builder
     */
    public static DeliveryParcelBuilder of() {
        return new DeliveryParcelBuilder();
    }

    /**
     * create builder for DeliveryParcel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryParcelBuilder of(final DeliveryParcel template) {
        DeliveryParcelBuilder builder = new DeliveryParcelBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.measurements = template.getMeasurements();
        builder.trackingData = template.getTrackingData();
        builder.items = template.getItems();
        return builder;
    }

}
