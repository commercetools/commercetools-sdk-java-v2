
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
     * @param builder function to build the delivery value
     * @return Builder
     */

    public ParcelAddedToDeliveryMessagePayloadBuilder delivery(
            Function<com.commercetools.api.models.order.DeliveryBuilder, com.commercetools.api.models.order.DeliveryBuilder> builder) {
        this.delivery = builder.apply(com.commercetools.api.models.order.DeliveryBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param builder function to build the delivery value
     * @return Builder
     */

    public ParcelAddedToDeliveryMessagePayloadBuilder withDelivery(
            Function<com.commercetools.api.models.order.DeliveryBuilder, com.commercetools.api.models.order.Delivery> builder) {
        this.delivery = builder.apply(com.commercetools.api.models.order.DeliveryBuilder.of());
        return this;
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param delivery value to be set
     * @return Builder
     */

    public ParcelAddedToDeliveryMessagePayloadBuilder delivery(
            final com.commercetools.api.models.order.Delivery delivery) {
        this.delivery = delivery;
        return this;
    }

    /**
     *  <p>Parcel that was added to the Delivery.</p>
     * @param builder function to build the parcel value
     * @return Builder
     */

    public ParcelAddedToDeliveryMessagePayloadBuilder parcel(
            Function<com.commercetools.api.models.order.ParcelBuilder, com.commercetools.api.models.order.ParcelBuilder> builder) {
        this.parcel = builder.apply(com.commercetools.api.models.order.ParcelBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Parcel that was added to the Delivery.</p>
     * @param builder function to build the parcel value
     * @return Builder
     */

    public ParcelAddedToDeliveryMessagePayloadBuilder withParcel(
            Function<com.commercetools.api.models.order.ParcelBuilder, com.commercetools.api.models.order.Parcel> builder) {
        this.parcel = builder.apply(com.commercetools.api.models.order.ParcelBuilder.of());
        return this;
    }

    /**
     *  <p>Parcel that was added to the Delivery.</p>
     * @param parcel value to be set
     * @return Builder
     */

    public ParcelAddedToDeliveryMessagePayloadBuilder parcel(final com.commercetools.api.models.order.Parcel parcel) {
        this.parcel = parcel;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public ParcelAddedToDeliveryMessagePayloadBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return delivery
     */

    public com.commercetools.api.models.order.Delivery getDelivery() {
        return this.delivery;
    }

    /**
     *  <p>Parcel that was added to the Delivery.</p>
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
     * builds ParcelAddedToDeliveryMessagePayload with checking for non-null required values
     * @return ParcelAddedToDeliveryMessagePayload
     */
    public ParcelAddedToDeliveryMessagePayload build() {
        Objects.requireNonNull(delivery, ParcelAddedToDeliveryMessagePayload.class + ": delivery is missing");
        Objects.requireNonNull(parcel, ParcelAddedToDeliveryMessagePayload.class + ": parcel is missing");
        return new ParcelAddedToDeliveryMessagePayloadImpl(delivery, parcel, shippingKey);
    }

    /**
     * builds ParcelAddedToDeliveryMessagePayload without checking for non-null required values
     * @return ParcelAddedToDeliveryMessagePayload
     */
    public ParcelAddedToDeliveryMessagePayload buildUnchecked() {
        return new ParcelAddedToDeliveryMessagePayloadImpl(delivery, parcel, shippingKey);
    }

    /**
     * factory method for an instance of ParcelAddedToDeliveryMessagePayloadBuilder
     * @return builder
     */
    public static ParcelAddedToDeliveryMessagePayloadBuilder of() {
        return new ParcelAddedToDeliveryMessagePayloadBuilder();
    }

    /**
     * create builder for ParcelAddedToDeliveryMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelAddedToDeliveryMessagePayloadBuilder of(final ParcelAddedToDeliveryMessagePayload template) {
        ParcelAddedToDeliveryMessagePayloadBuilder builder = new ParcelAddedToDeliveryMessagePayloadBuilder();
        builder.delivery = template.getDelivery();
        builder.parcel = template.getParcel();
        builder.shippingKey = template.getShippingKey();
        return builder;
    }

}
