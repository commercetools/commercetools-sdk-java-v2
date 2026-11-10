
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryAddedMessagePayload deliveryAddedMessagePayload = DeliveryAddedMessagePayload.builder()
 *             .delivery(deliveryBuilder -> deliveryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryAddedMessagePayloadBuilder implements Builder<DeliveryAddedMessagePayload> {

    private com.commercetools.api.models.order.Delivery delivery;

    @Nullable
    private String shippingKey;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>. The <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a> in the Message body does not contain <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcels</a> if those were part of the initial <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderAddDeliveryAction" rel="nofollow">Add Delivery</a> update action. In that case, the update action produces an additional <a href="https://docs.commercetools.com/apis/ctp:api:type:ParcelAddedToDeliveryMessage" rel="nofollow">Parcel Added To Delivery</a> Message containing information about the <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcels</a>.</p>
     * @param builder function to build the delivery value
     * @return Builder
     */

    public DeliveryAddedMessagePayloadBuilder delivery(
            Function<com.commercetools.api.models.order.DeliveryBuilder, com.commercetools.api.models.order.DeliveryBuilder> builder) {
        this.delivery = builder.apply(com.commercetools.api.models.order.DeliveryBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>. The <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a> in the Message body does not contain <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcels</a> if those were part of the initial <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderAddDeliveryAction" rel="nofollow">Add Delivery</a> update action. In that case, the update action produces an additional <a href="https://docs.commercetools.com/apis/ctp:api:type:ParcelAddedToDeliveryMessage" rel="nofollow">Parcel Added To Delivery</a> Message containing information about the <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcels</a>.</p>
     * @param builder function to build the delivery value
     * @return Builder
     */

    public DeliveryAddedMessagePayloadBuilder withDelivery(
            Function<com.commercetools.api.models.order.DeliveryBuilder, com.commercetools.api.models.order.Delivery> builder) {
        this.delivery = builder.apply(com.commercetools.api.models.order.DeliveryBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>. The <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a> in the Message body does not contain <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcels</a> if those were part of the initial <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderAddDeliveryAction" rel="nofollow">Add Delivery</a> update action. In that case, the update action produces an additional <a href="https://docs.commercetools.com/apis/ctp:api:type:ParcelAddedToDeliveryMessage" rel="nofollow">Parcel Added To Delivery</a> Message containing information about the <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcels</a>.</p>
     * @param delivery value to be set
     * @return Builder
     */

    public DeliveryAddedMessagePayloadBuilder delivery(final com.commercetools.api.models.order.Delivery delivery) {
        this.delivery = delivery;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public DeliveryAddedMessagePayloadBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>. The <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a> in the Message body does not contain <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcels</a> if those were part of the initial <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderAddDeliveryAction" rel="nofollow">Add Delivery</a> update action. In that case, the update action produces an additional <a href="https://docs.commercetools.com/apis/ctp:api:type:ParcelAddedToDeliveryMessage" rel="nofollow">Parcel Added To Delivery</a> Message containing information about the <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcels</a>.</p>
     * @return delivery
     */

    public com.commercetools.api.models.order.Delivery getDelivery() {
        return this.delivery;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @return shippingKey
     */

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     * builds DeliveryAddedMessagePayload with checking for non-null required values
     * @return DeliveryAddedMessagePayload
     */
    public DeliveryAddedMessagePayload build() {
        Objects.requireNonNull(delivery, DeliveryAddedMessagePayload.class + ": delivery is missing");
        return new DeliveryAddedMessagePayloadImpl(delivery, shippingKey);
    }

    /**
     * builds DeliveryAddedMessagePayload without checking for non-null required values
     * @return DeliveryAddedMessagePayload
     */
    public DeliveryAddedMessagePayload buildUnchecked() {
        return new DeliveryAddedMessagePayloadImpl(delivery, shippingKey);
    }

    /**
     * factory method for an instance of DeliveryAddedMessagePayloadBuilder
     * @return builder
     */
    public static DeliveryAddedMessagePayloadBuilder of() {
        return new DeliveryAddedMessagePayloadBuilder();
    }

    /**
     * create builder for DeliveryAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryAddedMessagePayloadBuilder of(final DeliveryAddedMessagePayload template) {
        DeliveryAddedMessagePayloadBuilder builder = new DeliveryAddedMessagePayloadBuilder();
        builder.delivery = template.getDelivery();
        builder.shippingKey = template.getShippingKey();
        return builder;
    }

}
