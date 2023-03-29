
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.Delivery;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Remove Delivery update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryRemovedMessagePayload deliveryRemovedMessagePayload = DeliveryRemovedMessagePayload.builder()
 *             .delivery(deliveryBuilder -> deliveryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryRemovedMessagePayloadImpl.class)
public interface DeliveryRemovedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for DeliveryRemovedMessagePayload
     */
    String DELIVERY_REMOVED = "DeliveryRemoved";

    /**
     *  <p>The Delivery that was removed from the Order.</p>
     * @return delivery
     */
    @NotNull
    @Valid
    @JsonProperty("delivery")
    public Delivery getDelivery();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>The Delivery that was removed from the Order.</p>
     * @param delivery value to be set
     */

    public void setDelivery(final Delivery delivery);

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of DeliveryRemovedMessagePayload
     */
    public static DeliveryRemovedMessagePayload of() {
        return new DeliveryRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy DeliveryRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static DeliveryRemovedMessagePayload of(final DeliveryRemovedMessagePayload template) {
        DeliveryRemovedMessagePayloadImpl instance = new DeliveryRemovedMessagePayloadImpl();
        instance.setDelivery(template.getDelivery());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of DeliveryRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryRemovedMessagePayload deepCopy(@Nullable final DeliveryRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        DeliveryRemovedMessagePayloadImpl instance = new DeliveryRemovedMessagePayloadImpl();
        instance.setDelivery(com.commercetools.api.models.order.Delivery.deepCopy(template.getDelivery()));
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for DeliveryRemovedMessagePayload
     * @return builder
     */
    public static DeliveryRemovedMessagePayloadBuilder builder() {
        return DeliveryRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for DeliveryRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryRemovedMessagePayloadBuilder builder(final DeliveryRemovedMessagePayload template) {
        return DeliveryRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryRemovedMessagePayload(Function<DeliveryRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryRemovedMessagePayload>";
            }
        };
    }
}
