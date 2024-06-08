
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.Parcel;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Remove Parcel from Delivery update action.</p>
 *
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
@JsonDeserialize(as = ParcelRemovedFromDeliveryMessagePayloadImpl.class)
public interface ParcelRemovedFromDeliveryMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for ParcelRemovedFromDeliveryMessagePayload
     */
    String PARCEL_REMOVED_FROM_DELIVERY = "ParcelRemovedFromDelivery";

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Parcel that was removed from the Delivery.</p>
     * @return parcel
     */
    @NotNull
    @Valid
    @JsonProperty("parcel")
    public Parcel getParcel();

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
     *  <p>Parcel that was removed from the Delivery.</p>
     * @param parcel value to be set
     */

    public void setParcel(final Parcel parcel);

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of ParcelRemovedFromDeliveryMessagePayload
     */
    public static ParcelRemovedFromDeliveryMessagePayload of() {
        return new ParcelRemovedFromDeliveryMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ParcelRemovedFromDeliveryMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ParcelRemovedFromDeliveryMessagePayload of(final ParcelRemovedFromDeliveryMessagePayload template) {
        ParcelRemovedFromDeliveryMessagePayloadImpl instance = new ParcelRemovedFromDeliveryMessagePayloadImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setParcel(template.getParcel());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ParcelRemovedFromDeliveryMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ParcelRemovedFromDeliveryMessagePayload deepCopy(
            @Nullable final ParcelRemovedFromDeliveryMessagePayload template) {
        if (template == null) {
            return null;
        }
        ParcelRemovedFromDeliveryMessagePayloadImpl instance = new ParcelRemovedFromDeliveryMessagePayloadImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setParcel(com.commercetools.api.models.order.Parcel.deepCopy(template.getParcel()));
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for ParcelRemovedFromDeliveryMessagePayload
     * @return builder
     */
    public static ParcelRemovedFromDeliveryMessagePayloadBuilder builder() {
        return ParcelRemovedFromDeliveryMessagePayloadBuilder.of();
    }

    /**
     * create builder for ParcelRemovedFromDeliveryMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelRemovedFromDeliveryMessagePayloadBuilder builder(
            final ParcelRemovedFromDeliveryMessagePayload template) {
        return ParcelRemovedFromDeliveryMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withParcelRemovedFromDeliveryMessagePayload(
            Function<ParcelRemovedFromDeliveryMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ParcelRemovedFromDeliveryMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelRemovedFromDeliveryMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelRemovedFromDeliveryMessagePayload>";
            }
        };
    }
}
