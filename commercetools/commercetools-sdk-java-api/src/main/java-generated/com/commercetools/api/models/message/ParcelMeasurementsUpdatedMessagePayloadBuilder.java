
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ParcelMeasurementsUpdatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelMeasurementsUpdatedMessagePayload parcelMeasurementsUpdatedMessagePayload = ParcelMeasurementsUpdatedMessagePayload.builder()
 *             .deliveryId("{deliveryId}")
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelMeasurementsUpdatedMessagePayloadBuilder
        implements Builder<ParcelMeasurementsUpdatedMessagePayload> {

    private String deliveryId;

    private String parcelId;

    @Nullable
    private com.commercetools.api.models.order.ParcelMeasurements measurements;

    @Nullable
    private String shippingKey;

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public ParcelMeasurementsUpdatedMessagePayloadBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Unique identifier of the Parcel.</p>
     * @param parcelId value to be set
     * @return Builder
     */

    public ParcelMeasurementsUpdatedMessagePayloadBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    /**
     *  <p>The Parcel Measurements that were set on the Parcel.</p>
     * @param builder function to build the measurements value
     * @return Builder
     */

    public ParcelMeasurementsUpdatedMessagePayloadBuilder measurements(
            Function<com.commercetools.api.models.order.ParcelMeasurementsBuilder, com.commercetools.api.models.order.ParcelMeasurementsBuilder> builder) {
        this.measurements = builder.apply(com.commercetools.api.models.order.ParcelMeasurementsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Parcel Measurements that were set on the Parcel.</p>
     * @param measurements value to be set
     * @return Builder
     */

    public ParcelMeasurementsUpdatedMessagePayloadBuilder measurements(
            @Nullable final com.commercetools.api.models.order.ParcelMeasurements measurements) {
        this.measurements = measurements;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public ParcelMeasurementsUpdatedMessagePayloadBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    @Nullable
    public com.commercetools.api.models.order.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     * builds ParcelMeasurementsUpdatedMessagePayload with checking for non-null required values
     * @return ParcelMeasurementsUpdatedMessagePayload
     */
    public ParcelMeasurementsUpdatedMessagePayload build() {
        Objects.requireNonNull(deliveryId, ParcelMeasurementsUpdatedMessagePayload.class + ": deliveryId is missing");
        Objects.requireNonNull(parcelId, ParcelMeasurementsUpdatedMessagePayload.class + ": parcelId is missing");
        return new ParcelMeasurementsUpdatedMessagePayloadImpl(deliveryId, parcelId, measurements, shippingKey);
    }

    /**
     * builds ParcelMeasurementsUpdatedMessagePayload without checking for non-null required values
     * @return ParcelMeasurementsUpdatedMessagePayload
     */
    public ParcelMeasurementsUpdatedMessagePayload buildUnchecked() {
        return new ParcelMeasurementsUpdatedMessagePayloadImpl(deliveryId, parcelId, measurements, shippingKey);
    }

    public static ParcelMeasurementsUpdatedMessagePayloadBuilder of() {
        return new ParcelMeasurementsUpdatedMessagePayloadBuilder();
    }

    public static ParcelMeasurementsUpdatedMessagePayloadBuilder of(
            final ParcelMeasurementsUpdatedMessagePayload template) {
        ParcelMeasurementsUpdatedMessagePayloadBuilder builder = new ParcelMeasurementsUpdatedMessagePayloadBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.parcelId = template.getParcelId();
        builder.measurements = template.getMeasurements();
        builder.shippingKey = template.getShippingKey();
        return builder;
    }

}
