
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ParcelTrackingDataUpdatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelTrackingDataUpdatedMessagePayload parcelTrackingDataUpdatedMessagePayload = ParcelTrackingDataUpdatedMessagePayload.builder()
 *             .deliveryId("{deliveryId}")
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelTrackingDataUpdatedMessagePayloadBuilder
        implements Builder<ParcelTrackingDataUpdatedMessagePayload> {

    private String deliveryId;

    private String parcelId;

    @Nullable
    private com.commercetools.api.models.order.TrackingData trackingData;

    @Nullable
    private String shippingKey;

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public ParcelTrackingDataUpdatedMessagePayloadBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Unique identifier of the Parcel.</p>
     * @param parcelId value to be set
     * @return Builder
     */

    public ParcelTrackingDataUpdatedMessagePayloadBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    /**
     *  <p>The Tracking Data that was added to the Parcel.</p>
     * @param builder function to build the trackingData value
     * @return Builder
     */

    public ParcelTrackingDataUpdatedMessagePayloadBuilder trackingData(
            Function<com.commercetools.api.models.order.TrackingDataBuilder, com.commercetools.api.models.order.TrackingDataBuilder> builder) {
        this.trackingData = builder.apply(com.commercetools.api.models.order.TrackingDataBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Tracking Data that was added to the Parcel.</p>
     * @param builder function to build the trackingData value
     * @return Builder
     */

    public ParcelTrackingDataUpdatedMessagePayloadBuilder withTrackingData(
            Function<com.commercetools.api.models.order.TrackingDataBuilder, com.commercetools.api.models.order.TrackingData> builder) {
        this.trackingData = builder.apply(com.commercetools.api.models.order.TrackingDataBuilder.of());
        return this;
    }

    /**
     *  <p>The Tracking Data that was added to the Parcel.</p>
     * @param trackingData value to be set
     * @return Builder
     */

    public ParcelTrackingDataUpdatedMessagePayloadBuilder trackingData(
            @Nullable final com.commercetools.api.models.order.TrackingData trackingData) {
        this.trackingData = trackingData;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public ParcelTrackingDataUpdatedMessagePayloadBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p>Unique identifier of the Parcel.</p>
     * @return parcelId
     */

    public String getParcelId() {
        return this.parcelId;
    }

    /**
     *  <p>The Tracking Data that was added to the Parcel.</p>
     * @return trackingData
     */

    @Nullable
    public com.commercetools.api.models.order.TrackingData getTrackingData() {
        return this.trackingData;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @return shippingKey
     */

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     * builds ParcelTrackingDataUpdatedMessagePayload with checking for non-null required values
     * @return ParcelTrackingDataUpdatedMessagePayload
     */
    public ParcelTrackingDataUpdatedMessagePayload build() {
        Objects.requireNonNull(deliveryId, ParcelTrackingDataUpdatedMessagePayload.class + ": deliveryId is missing");
        Objects.requireNonNull(parcelId, ParcelTrackingDataUpdatedMessagePayload.class + ": parcelId is missing");
        return new ParcelTrackingDataUpdatedMessagePayloadImpl(deliveryId, parcelId, trackingData, shippingKey);
    }

    /**
     * builds ParcelTrackingDataUpdatedMessagePayload without checking for non-null required values
     * @return ParcelTrackingDataUpdatedMessagePayload
     */
    public ParcelTrackingDataUpdatedMessagePayload buildUnchecked() {
        return new ParcelTrackingDataUpdatedMessagePayloadImpl(deliveryId, parcelId, trackingData, shippingKey);
    }

    /**
     * factory method for an instance of ParcelTrackingDataUpdatedMessagePayloadBuilder
     * @return builder
     */
    public static ParcelTrackingDataUpdatedMessagePayloadBuilder of() {
        return new ParcelTrackingDataUpdatedMessagePayloadBuilder();
    }

    /**
     * create builder for ParcelTrackingDataUpdatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelTrackingDataUpdatedMessagePayloadBuilder of(
            final ParcelTrackingDataUpdatedMessagePayload template) {
        ParcelTrackingDataUpdatedMessagePayloadBuilder builder = new ParcelTrackingDataUpdatedMessagePayloadBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.parcelId = template.getParcelId();
        builder.trackingData = template.getTrackingData();
        builder.shippingKey = template.getShippingKey();
        return builder;
    }

}
