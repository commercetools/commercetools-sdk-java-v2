
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.TrackingData;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Set Parcel Tracking Data update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelTrackingDataUpdatedMessagePayload parcelTrackingDataUpdatedMessagePayload = ParcelTrackingDataUpdatedMessagePayload.builder()
 *             .deliveryId("{deliveryId}")
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ParcelTrackingDataUpdatedMessagePayloadImpl.class)
public interface ParcelTrackingDataUpdatedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for ParcelTrackingDataUpdatedMessagePayload
     */
    String PARCEL_TRACKING_DATA_UPDATED = "ParcelTrackingDataUpdated";

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Unique identifier of the Parcel.</p>
     * @return parcelId
     */
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     *  <p>The Tracking Data that was added to the Parcel.</p>
     * @return trackingData
     */
    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

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
     *  <p>Unique identifier of the Parcel.</p>
     * @param parcelId value to be set
     */

    public void setParcelId(final String parcelId);

    /**
     *  <p>The Tracking Data that was added to the Parcel.</p>
     * @param trackingData value to be set
     */

    public void setTrackingData(final TrackingData trackingData);

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of ParcelTrackingDataUpdatedMessagePayload
     */
    public static ParcelTrackingDataUpdatedMessagePayload of() {
        return new ParcelTrackingDataUpdatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ParcelTrackingDataUpdatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ParcelTrackingDataUpdatedMessagePayload of(final ParcelTrackingDataUpdatedMessagePayload template) {
        ParcelTrackingDataUpdatedMessagePayloadImpl instance = new ParcelTrackingDataUpdatedMessagePayloadImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setParcelId(template.getParcelId());
        instance.setTrackingData(template.getTrackingData());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ParcelTrackingDataUpdatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ParcelTrackingDataUpdatedMessagePayload deepCopy(
            @Nullable final ParcelTrackingDataUpdatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ParcelTrackingDataUpdatedMessagePayloadImpl instance = new ParcelTrackingDataUpdatedMessagePayloadImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setParcelId(template.getParcelId());
        instance.setTrackingData(com.commercetools.api.models.order.TrackingData.deepCopy(template.getTrackingData()));
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for ParcelTrackingDataUpdatedMessagePayload
     * @return builder
     */
    public static ParcelTrackingDataUpdatedMessagePayloadBuilder builder() {
        return ParcelTrackingDataUpdatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ParcelTrackingDataUpdatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelTrackingDataUpdatedMessagePayloadBuilder builder(
            final ParcelTrackingDataUpdatedMessagePayload template) {
        return ParcelTrackingDataUpdatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withParcelTrackingDataUpdatedMessagePayload(
            Function<ParcelTrackingDataUpdatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ParcelTrackingDataUpdatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelTrackingDataUpdatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelTrackingDataUpdatedMessagePayload>";
            }
        };
    }
}
