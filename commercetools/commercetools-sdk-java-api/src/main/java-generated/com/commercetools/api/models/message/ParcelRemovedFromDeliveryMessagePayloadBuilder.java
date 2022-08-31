
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
     */

    public ParcelRemovedFromDeliveryMessagePayloadBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Parcel that was removed from the Delivery.</p>
     */

    public ParcelRemovedFromDeliveryMessagePayloadBuilder parcel(
            Function<com.commercetools.api.models.order.ParcelBuilder, com.commercetools.api.models.order.ParcelBuilder> builder) {
        this.parcel = builder.apply(com.commercetools.api.models.order.ParcelBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Parcel that was removed from the Delivery.</p>
     */

    public ParcelRemovedFromDeliveryMessagePayloadBuilder parcel(
            final com.commercetools.api.models.order.Parcel parcel) {
        this.parcel = parcel;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     */

    public ParcelRemovedFromDeliveryMessagePayloadBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public com.commercetools.api.models.order.Parcel getParcel() {
        return this.parcel;
    }

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    public ParcelRemovedFromDeliveryMessagePayload build() {
        Objects.requireNonNull(deliveryId, ParcelRemovedFromDeliveryMessagePayload.class + ": deliveryId is missing");
        Objects.requireNonNull(parcel, ParcelRemovedFromDeliveryMessagePayload.class + ": parcel is missing");
        return new ParcelRemovedFromDeliveryMessagePayloadImpl(deliveryId, parcel, shippingKey);
    }

    /**
     * builds ParcelRemovedFromDeliveryMessagePayload without checking for non null required values
     */
    public ParcelRemovedFromDeliveryMessagePayload buildUnchecked() {
        return new ParcelRemovedFromDeliveryMessagePayloadImpl(deliveryId, parcel, shippingKey);
    }

    public static ParcelRemovedFromDeliveryMessagePayloadBuilder of() {
        return new ParcelRemovedFromDeliveryMessagePayloadBuilder();
    }

    public static ParcelRemovedFromDeliveryMessagePayloadBuilder of(
            final ParcelRemovedFromDeliveryMessagePayload template) {
        ParcelRemovedFromDeliveryMessagePayloadBuilder builder = new ParcelRemovedFromDeliveryMessagePayloadBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.parcel = template.getParcel();
        builder.shippingKey = template.getShippingKey();
        return builder;
    }

}
