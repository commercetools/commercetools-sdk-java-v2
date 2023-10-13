
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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderAddParcelToDeliveryActionBuilder implements Builder<StagedOrderAddParcelToDeliveryAction> {

    @Nullable
    private String deliveryId;

    @Nullable
    private String deliveryKey;

    @Nullable
    private String parcelKey;

    @Nullable
    private com.commercetools.api.models.order.ParcelMeasurements measurements;

    @Nullable
    private com.commercetools.api.models.order.TrackingData trackingData;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p><code>id</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder deliveryId(@Nullable final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p><code>key</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @param deliveryKey value to be set
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder deliveryKey(@Nullable final String deliveryKey) {
        this.deliveryKey = deliveryKey;
        return this;
    }

    /**
     *  <p><code>key</code> of an existing Parcel.</p>
     * @param parcelKey value to be set
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder parcelKey(@Nullable final String parcelKey) {
        this.parcelKey = parcelKey;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the measurements value
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder measurements(
            Function<com.commercetools.api.models.order.ParcelMeasurementsBuilder, com.commercetools.api.models.order.ParcelMeasurementsBuilder> builder) {
        this.measurements = builder.apply(com.commercetools.api.models.order.ParcelMeasurementsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the measurements value
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder withMeasurements(
            Function<com.commercetools.api.models.order.ParcelMeasurementsBuilder, com.commercetools.api.models.order.ParcelMeasurements> builder) {
        this.measurements = builder.apply(com.commercetools.api.models.order.ParcelMeasurementsBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param measurements value to be set
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder measurements(
            @Nullable final com.commercetools.api.models.order.ParcelMeasurements measurements) {
        this.measurements = measurements;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the trackingData value
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder trackingData(
            Function<com.commercetools.api.models.order.TrackingDataBuilder, com.commercetools.api.models.order.TrackingDataBuilder> builder) {
        this.trackingData = builder.apply(com.commercetools.api.models.order.TrackingDataBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the trackingData value
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder withTrackingData(
            Function<com.commercetools.api.models.order.TrackingDataBuilder, com.commercetools.api.models.order.TrackingData> builder) {
        this.trackingData = builder.apply(com.commercetools.api.models.order.TrackingDataBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param trackingData value to be set
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder trackingData(
            @Nullable final com.commercetools.api.models.order.TrackingData trackingData) {
        this.trackingData = trackingData;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param items value to be set
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder items(
            @Nullable final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param items value to be set
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder items(
            @Nullable final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     *  <p>Value to set.</p>
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
     *  <p>Value to set.</p>
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
     *  <p>Value to set.</p>
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
     *  <p>Value to set.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder addItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItem> builder) {
        return plusItems(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()));
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder setItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItem> builder) {
        return items(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()));
    }

    /**
     *  <p>Custom Fields for the Parcel.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Parcel.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Parcel.</p>
     * @param custom value to be set
     * @return Builder
     */

    public StagedOrderAddParcelToDeliveryActionBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p><code>id</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @return deliveryId
     */

    @Nullable
    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p><code>key</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @return deliveryKey
     */

    @Nullable
    public String getDeliveryKey() {
        return this.deliveryKey;
    }

    /**
     *  <p><code>key</code> of an existing Parcel.</p>
     * @return parcelKey
     */

    @Nullable
    public String getParcelKey() {
        return this.parcelKey;
    }

    /**
     *  <p>Value to set.</p>
     * @return measurements
     */

    @Nullable
    public com.commercetools.api.models.order.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    /**
     *  <p>Value to set.</p>
     * @return trackingData
     */

    @Nullable
    public com.commercetools.api.models.order.TrackingData getTrackingData() {
        return this.trackingData;
    }

    /**
     *  <p>Value to set.</p>
     * @return items
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     *  <p>Custom Fields for the Parcel.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds StagedOrderAddParcelToDeliveryAction with checking for non-null required values
     * @return StagedOrderAddParcelToDeliveryAction
     */
    public StagedOrderAddParcelToDeliveryAction build() {
        return new StagedOrderAddParcelToDeliveryActionImpl(deliveryId, deliveryKey, parcelKey, measurements,
            trackingData, items, custom);
    }

    /**
     * builds StagedOrderAddParcelToDeliveryAction without checking for non-null required values
     * @return StagedOrderAddParcelToDeliveryAction
     */
    public StagedOrderAddParcelToDeliveryAction buildUnchecked() {
        return new StagedOrderAddParcelToDeliveryActionImpl(deliveryId, deliveryKey, parcelKey, measurements,
            trackingData, items, custom);
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
        builder.deliveryKey = template.getDeliveryKey();
        builder.parcelKey = template.getParcelKey();
        builder.measurements = template.getMeasurements();
        builder.trackingData = template.getTrackingData();
        builder.items = template.getItems();
        builder.custom = template.getCustom();
        return builder;
    }

}
