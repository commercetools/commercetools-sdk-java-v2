
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.Delivery;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderAddDeliveryAction" rel="nofollow">Add Delivery</a> update action.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("DeliveryAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryAddedMessagePayloadImpl.class)
public interface DeliveryAddedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for DeliveryAddedMessagePayload
     */
    String DELIVERY_ADDED = "DeliveryAdded";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>. The <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a> in the Message body does not contain <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcels</a> if those were part of the initial <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderAddDeliveryAction" rel="nofollow">Add Delivery</a> update action. In that case, the update action produces an additional <a href="https://docs.commercetools.com/apis/ctp:api:type:ParcelAddedToDeliveryMessage" rel="nofollow">Parcel Added To Delivery</a> Message containing information about the <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcels</a>.</p>
     * @return delivery
     */
    @NotNull
    @Valid
    @JsonProperty("delivery")
    public Delivery getDelivery();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>. The <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a> in the Message body does not contain <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcels</a> if those were part of the initial <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderAddDeliveryAction" rel="nofollow">Add Delivery</a> update action. In that case, the update action produces an additional <a href="https://docs.commercetools.com/apis/ctp:api:type:ParcelAddedToDeliveryMessage" rel="nofollow">Parcel Added To Delivery</a> Message containing information about the <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcels</a>.</p>
     * @param delivery value to be set
     */

    public void setDelivery(final Delivery delivery);

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of DeliveryAddedMessagePayload
     */
    public static DeliveryAddedMessagePayload of() {
        return new DeliveryAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy DeliveryAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static DeliveryAddedMessagePayload of(final DeliveryAddedMessagePayload template) {
        DeliveryAddedMessagePayloadImpl instance = new DeliveryAddedMessagePayloadImpl();
        instance.setDelivery(template.getDelivery());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    public DeliveryAddedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of DeliveryAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryAddedMessagePayload deepCopy(@Nullable final DeliveryAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        DeliveryAddedMessagePayloadImpl instance = new DeliveryAddedMessagePayloadImpl();
        instance.setDelivery(com.commercetools.api.models.order.Delivery.deepCopy(template.getDelivery()));
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for DeliveryAddedMessagePayload
     * @return builder
     */
    public static DeliveryAddedMessagePayloadBuilder builder() {
        return DeliveryAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for DeliveryAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryAddedMessagePayloadBuilder builder(final DeliveryAddedMessagePayload template) {
        return DeliveryAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryAddedMessagePayload(Function<DeliveryAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryAddedMessagePayload>";
            }
        };
    }
}
