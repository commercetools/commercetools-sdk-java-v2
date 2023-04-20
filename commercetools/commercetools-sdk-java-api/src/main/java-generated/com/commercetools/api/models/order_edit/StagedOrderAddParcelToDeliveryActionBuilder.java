
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderAddParcelToDeliveryActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderAddParcelToDeliveryAction stagedOrderAddParcelToDeliveryAction = StagedOrderAddParcelToDeliveryAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderAddParcelToDeliveryActionBuilder implements Builder<StagedOrderAddParcelToDeliveryAction> {

    private String deliveryId;

    @Nullable
    private com.commercetools.api.models.order.ParcelMeasurements measurements;

    @Nullable
    private com.commercetools.api.models.order.TrackingData trackingData;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    /**
     * set the value to the deliveryId
     * @param deliveryId value to be set
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     * set the value to the measurements using the builder function
     * @param builder function to build the measurements value
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder measurements(
            Function<com.commercetools.api.models.order.ParcelMeasurementsBuilder, com.commercetools.api.models.order.ParcelMeasurementsBuilder> builder) {
        this.measurements = builder.apply(com.commercetools.api.models.order.ParcelMeasurementsBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the measurements using the builder function
     * @param builder function to build the measurements value
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder withMeasurements(
            Function<com.commercetools.api.models.order.ParcelMeasurementsBuilder, com.commercetools.api.models.order.ParcelMeasurements> builder) {
        this.measurements = builder.apply(com.commercetools.api.models.order.ParcelMeasurementsBuilder.of());
        return this;
    }

    /**
     * set the value to the measurements
     * @param measurements value to be set
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder measurements(
            @Nullable final com.commercetools.api.models.order.ParcelMeasurements measurements) {
        this.measurements = measurements;
        return this;
    }

    /**
     * set the value to the trackingData using the builder function
     * @param builder function to build the trackingData value
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder trackingData(
            Function<com.commercetools.api.models.order.TrackingDataBuilder, com.commercetools.api.models.order.TrackingDataBuilder> builder) {
        this.trackingData = builder.apply(com.commercetools.api.models.order.TrackingDataBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the trackingData using the builder function
     * @param builder function to build the trackingData value
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder withTrackingData(
            Function<com.commercetools.api.models.order.TrackingDataBuilder, com.commercetools.api.models.order.TrackingData> builder) {
        this.trackingData = builder.apply(com.commercetools.api.models.order.TrackingDataBuilder.of());
        return this;
    }

    /**
     * set the value to the trackingData
     * @param trackingData value to be set
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder trackingData(
            @Nullable final com.commercetools.api.models.order.TrackingData trackingData) {
        this.trackingData = trackingData;
        return this;
    }

    /**
     * set values to the items
     * @param items value to be set
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder items(
            @Nullable final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     * set value to the items
     * @param items value to be set
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder items(
            @Nullable final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     * add values to the items
     * @param items value to be set
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder plusItems(
            @Nullable final com.commercetools.api.models.order.DeliveryItem... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    /**
     * add the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder plusItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder withItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder addItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItem> builder) {
        return plusItems(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()));
    }

    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder setItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItem> builder) {
        return items(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()));
    }

    /**
     * value of deliveryId}
     * @return deliveryId
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     * value of measurements}
     * @return measurements
     */

    @Nullable
    public com.commercetools.api.models.order.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    /**
     * value of trackingData}
     * @return trackingData
     */

    @Nullable
    public com.commercetools.api.models.order.TrackingData getTrackingData() {
        return this.trackingData;
    }

    /**
     * value of items}
     * @return items
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     * builds StagedOrderAddParcelToDeliveryAction with checking for non-null required values
     * @return StagedOrderAddParcelToDeliveryAction
     */
    public StagedOrderAddParcelToDeliveryAction build() {
        Objects.requireNonNull(deliveryId, StagedOrderAddParcelToDeliveryAction.class + ": deliveryId is missing");
        return new StagedOrderAddParcelToDeliveryActionImpl(deliveryId, measurements, trackingData, items);
    }

    /**
     * builds StagedOrderAddParcelToDeliveryAction without checking for non-null required values
     * @return StagedOrderAddParcelToDeliveryAction
     */
    public StagedOrderAddParcelToDeliveryAction buildUnchecked() {
        return new StagedOrderAddParcelToDeliveryActionImpl(deliveryId, measurements, trackingData, items);
    }

    /**
     * factory method for an instance of StagedOrderAddParcelToDeliveryActionBuilder
     * @return builder
     */
    public static StagedOrderAddParcelToDeliveryActionBuilder of() {
        return new StagedOrderAddParcelToDeliveryActionBuilder();
    }

    /**
     * create builder for StagedOrderAddParcelToDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderAddParcelToDeliveryActionBuilder of(final StagedOrderAddParcelToDeliveryAction template) {
        StagedOrderAddParcelToDeliveryActionBuilder builder = new StagedOrderAddParcelToDeliveryActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.measurements = template.getMeasurements();
        builder.trackingData = template.getTrackingData();
        builder.items = template.getItems();
        return builder;
    }

}
