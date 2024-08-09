
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Set Delivery Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryAddressSetMessagePayload deliveryAddressSetMessagePayload = DeliveryAddressSetMessagePayload.builder()
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryAddressSetMessagePayloadImpl.class)
public interface DeliveryAddressSetMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for DeliveryAddressSetMessagePayload
     */
    String DELIVERY_ADDRESS_SET = "DeliveryAddressSet";

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Address after the Set Delivery Address update action.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>Address before the Set Delivery Address update action.</p>
     * @return oldAddress
     */
    @Valid
    @JsonProperty("oldAddress")
    public Address getOldAddress();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     *  <p>Address after the Set Delivery Address update action.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     *  <p>Address before the Set Delivery Address update action.</p>
     * @param oldAddress value to be set
     */

    public void setOldAddress(final Address oldAddress);

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of DeliveryAddressSetMessagePayload
     */
    public static DeliveryAddressSetMessagePayload of() {
        return new DeliveryAddressSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy DeliveryAddressSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static DeliveryAddressSetMessagePayload of(final DeliveryAddressSetMessagePayload template) {
        DeliveryAddressSetMessagePayloadImpl instance = new DeliveryAddressSetMessagePayloadImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setAddress(template.getAddress());
        instance.setOldAddress(template.getOldAddress());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of DeliveryAddressSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryAddressSetMessagePayload deepCopy(@Nullable final DeliveryAddressSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        DeliveryAddressSetMessagePayloadImpl instance = new DeliveryAddressSetMessagePayloadImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        instance.setOldAddress(com.commercetools.api.models.common.Address.deepCopy(template.getOldAddress()));
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for DeliveryAddressSetMessagePayload
     * @return builder
     */
    public static DeliveryAddressSetMessagePayloadBuilder builder() {
        return DeliveryAddressSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for DeliveryAddressSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryAddressSetMessagePayloadBuilder builder(final DeliveryAddressSetMessagePayload template) {
        return DeliveryAddressSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryAddressSetMessagePayload(Function<DeliveryAddressSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryAddressSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryAddressSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryAddressSetMessagePayload>";
            }
        };
    }
}
