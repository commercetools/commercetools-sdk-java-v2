
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ParcelAddedToDeliveryMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelAddedToDeliveryMessagePayload parcelAddedToDeliveryMessagePayload = ParcelAddedToDeliveryMessagePayload.builder()
 *             .delivery(deliveryBuilder -> deliveryBuilder)
 *             .parcel(parcelBuilder -> parcelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelAddedToDeliveryMessagePayloadBuilder implements Builder<ParcelAddedToDeliveryMessagePayload> {

    private com.commercetools.api.models.order.Delivery delivery;

    private com.commercetools.api.models.order.Parcel parcel;

    @Nullable
    private String shippingKey;

    /**
     *  <p>Unique identifier of the Delivery.</p>
     */

    public ParcelAddedToDeliveryMessagePayloadBuilder delivery(
            Function<com.commercetools.api.models.order.DeliveryBuilder, com.commercetools.api.models.order.DeliveryBuilder> builder) {
        this.delivery = builder.apply(com.commercetools.api.models.order.DeliveryBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     */

    public ParcelAddedToDeliveryMessagePayloadBuilder delivery(
            final com.commercetools.api.models.order.Delivery delivery) {
        this.delivery = delivery;
        return this;
    }

    /**
     *  <p>Parcel that was added to the Delivery.</p>
     */

    public ParcelAddedToDeliveryMessagePayloadBuilder parcel(
            Function<com.commercetools.api.models.order.ParcelBuilder, com.commercetools.api.models.order.ParcelBuilder> builder) {
        this.parcel = builder.apply(com.commercetools.api.models.order.ParcelBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Parcel that was added to the Delivery.</p>
     */

    public ParcelAddedToDeliveryMessagePayloadBuilder parcel(final com.commercetools.api.models.order.Parcel parcel) {
        this.parcel = parcel;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     */

    public ParcelAddedToDeliveryMessagePayloadBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    public com.commercetools.api.models.order.Delivery getDelivery() {
        return this.delivery;
    }

    public com.commercetools.api.models.order.Parcel getParcel() {
        return this.parcel;
    }

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    public ParcelAddedToDeliveryMessagePayload build() {
        Objects.requireNonNull(delivery, ParcelAddedToDeliveryMessagePayload.class + ": delivery is missing");
        Objects.requireNonNull(parcel, ParcelAddedToDeliveryMessagePayload.class + ": parcel is missing");
        return new ParcelAddedToDeliveryMessagePayloadImpl(delivery, parcel, shippingKey);
    }

    /**
     * builds ParcelAddedToDeliveryMessagePayload without checking for non null required values
     */
    public ParcelAddedToDeliveryMessagePayload buildUnchecked() {
        return new ParcelAddedToDeliveryMessagePayloadImpl(delivery, parcel, shippingKey);
    }

    public static ParcelAddedToDeliveryMessagePayloadBuilder of() {
        return new ParcelAddedToDeliveryMessagePayloadBuilder();
    }

    public static ParcelAddedToDeliveryMessagePayloadBuilder of(final ParcelAddedToDeliveryMessagePayload template) {
        ParcelAddedToDeliveryMessagePayloadBuilder builder = new ParcelAddedToDeliveryMessagePayloadBuilder();
        builder.delivery = template.getDelivery();
        builder.parcel = template.getParcel();
        builder.shippingKey = template.getShippingKey();
        return builder;
    }

}
