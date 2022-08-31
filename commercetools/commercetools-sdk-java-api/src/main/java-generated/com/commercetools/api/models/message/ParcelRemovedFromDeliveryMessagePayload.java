
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.Parcel;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Remove Parcel From Delivery update action.</p>
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

    String PARCEL_REMOVED_FROM_DELIVERY = "ParcelRemovedFromDelivery";

    /**
     *  <p>Unique identifier of the Delivery.</p>
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Parcel that was removed from the Delivery.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("parcel")
    public Parcel getParcel();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    public void setDeliveryId(final String deliveryId);

    public void setParcel(final Parcel parcel);

    public void setShippingKey(final String shippingKey);

    public static ParcelRemovedFromDeliveryMessagePayload of() {
        return new ParcelRemovedFromDeliveryMessagePayloadImpl();
    }

    public static ParcelRemovedFromDeliveryMessagePayload of(final ParcelRemovedFromDeliveryMessagePayload template) {
        ParcelRemovedFromDeliveryMessagePayloadImpl instance = new ParcelRemovedFromDeliveryMessagePayloadImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setParcel(template.getParcel());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    public static ParcelRemovedFromDeliveryMessagePayloadBuilder builder() {
        return ParcelRemovedFromDeliveryMessagePayloadBuilder.of();
    }

    public static ParcelRemovedFromDeliveryMessagePayloadBuilder builder(
            final ParcelRemovedFromDeliveryMessagePayload template) {
        return ParcelRemovedFromDeliveryMessagePayloadBuilder.of(template);
    }

    default <T> T withParcelRemovedFromDeliveryMessagePayload(
            Function<ParcelRemovedFromDeliveryMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ParcelRemovedFromDeliveryMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelRemovedFromDeliveryMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelRemovedFromDeliveryMessagePayload>";
            }
        };
    }
}
