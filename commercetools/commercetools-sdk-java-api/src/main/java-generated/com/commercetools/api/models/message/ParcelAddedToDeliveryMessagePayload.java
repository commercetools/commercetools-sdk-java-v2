
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.Delivery;
import com.commercetools.api.models.order.Parcel;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Add Parcel To Delivery update action.</p>
 *
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
@JsonDeserialize(as = ParcelAddedToDeliveryMessagePayloadImpl.class)
public interface ParcelAddedToDeliveryMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for ParcelAddedToDeliveryMessagePayload
     */
    String PARCEL_ADDED_TO_DELIVERY = "ParcelAddedToDelivery";

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return delivery
     */
    @NotNull
    @Valid
    @JsonProperty("delivery")
    public Delivery getDelivery();

    /**
     *  <p>Parcel that was added to the Delivery.</p>
     * @return parcel
     */
    @NotNull
    @Valid
    @JsonProperty("parcel")
    public Parcel getParcel();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param delivery value to be set
     */

    public void setDelivery(final Delivery delivery);

    /**
     *  <p>Parcel that was added to the Delivery.</p>
     * @param parcel value to be set
     */

    public void setParcel(final Parcel parcel);

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of ParcelAddedToDeliveryMessagePayload
     */
    public static ParcelAddedToDeliveryMessagePayload of() {
        return new ParcelAddedToDeliveryMessagePayloadImpl();
    }

    /**
     * factory method to copy an instance of ParcelAddedToDeliveryMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ParcelAddedToDeliveryMessagePayload of(final ParcelAddedToDeliveryMessagePayload template) {
        ParcelAddedToDeliveryMessagePayloadImpl instance = new ParcelAddedToDeliveryMessagePayloadImpl();
        instance.setDelivery(template.getDelivery());
        instance.setParcel(template.getParcel());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for ParcelAddedToDeliveryMessagePayload
     * @return builder
     */
    public static ParcelAddedToDeliveryMessagePayloadBuilder builder() {
        return ParcelAddedToDeliveryMessagePayloadBuilder.of();
    }

    /**
     * create builder for ParcelAddedToDeliveryMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelAddedToDeliveryMessagePayloadBuilder builder(
            final ParcelAddedToDeliveryMessagePayload template) {
        return ParcelAddedToDeliveryMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withParcelAddedToDeliveryMessagePayload(Function<ParcelAddedToDeliveryMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ParcelAddedToDeliveryMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelAddedToDeliveryMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelAddedToDeliveryMessagePayload>";
            }
        };
    }
}
