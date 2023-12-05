
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ParcelRemovedFromDeliveryMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelRemovedFromDeliveryMessagePayload parcelRemovedFromDeliveryMessagePayload = ParcelRemovedFromDeliveryMessagePayload.builder()
 *             .deliveryId("{deliveryId}")
 *             .parcel(parcelBuilder -> parcelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelRemovedFromDeliveryMessagePayloadBuilder
        implements Builder<ParcelRemovedFromDeliveryMessagePayload> {

    private String deliveryId;

    private com.commercetools.api.models.order.Parcel parcel;

    @Nullable
    private String shippingKey;

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public ParcelRemovedFromDeliveryMessagePayloadBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Parcel that was removed from the Delivery.</p>
     * @param builder function to build the parcel value
     * @return Builder
     */

    public ParcelRemovedFromDeliveryMessagePayloadBuilder parcel(
            Function<com.commercetools.api.models.order.ParcelBuilder, com.commercetools.api.models.order.ParcelBuilder> builder) {
        this.parcel = builder.apply(com.commercetools.api.models.order.ParcelBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Parcel that was removed from the Delivery.</p>
     * @param builder function to build the parcel value
     * @return Builder
     */

    public ParcelRemovedFromDeliveryMessagePayloadBuilder withParcel(
            Function<com.commercetools.api.models.order.ParcelBuilder, com.commercetools.api.models.order.Parcel> builder) {
        this.parcel = builder.apply(com.commercetools.api.models.order.ParcelBuilder.of());
        return this;
    }

    /**
     *  <p>Parcel that was removed from the Delivery.</p>
     * @param parcel value to be set
     * @return Builder
     */

    public ParcelRemovedFromDeliveryMessagePayloadBuilder parcel(
            final com.commercetools.api.models.order.Parcel parcel) {
        this.parcel = parcel;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public ParcelRemovedFromDeliveryMessagePayloadBuilder shippingKey(@Nullable final String shippingKey) {
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
     *  <p>Parcel that was removed from the Delivery.</p>
     * @return parcel
     */

    public com.commercetools.api.models.order.Parcel getParcel() {
        return this.parcel;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     * builds ParcelRemovedFromDeliveryMessagePayload with checking for non-null required values
     * @return ParcelRemovedFromDeliveryMessagePayload
     */
    public ParcelRemovedFromDeliveryMessagePayload build() {
        Objects.requireNonNull(deliveryId, ParcelRemovedFromDeliveryMessagePayload.class + ": deliveryId is missing");
        Objects.requireNonNull(parcel, ParcelRemovedFromDeliveryMessagePayload.class + ": parcel is missing");
        return new ParcelRemovedFromDeliveryMessagePayloadImpl(deliveryId, parcel, shippingKey);
    }

    /**
     * builds ParcelRemovedFromDeliveryMessagePayload without checking for non-null required values
     * @return ParcelRemovedFromDeliveryMessagePayload
     */
    public ParcelRemovedFromDeliveryMessagePayload buildUnchecked() {
        return new ParcelRemovedFromDeliveryMessagePayloadImpl(deliveryId, parcel, shippingKey);
    }

    /**
     * factory method for an instance of ParcelRemovedFromDeliveryMessagePayloadBuilder
     * @return builder
     */
    public static ParcelRemovedFromDeliveryMessagePayloadBuilder of() {
        return new ParcelRemovedFromDeliveryMessagePayloadBuilder();
    }

    /**
     * create builder for ParcelRemovedFromDeliveryMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelRemovedFromDeliveryMessagePayloadBuilder of(
            final ParcelRemovedFromDeliveryMessagePayload template) {
        ParcelRemovedFromDeliveryMessagePayloadBuilder builder = new ParcelRemovedFromDeliveryMessagePayloadBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.parcel = template.getParcel();
        builder.shippingKey = template.getShippingKey();
        return builder;
    }

}
