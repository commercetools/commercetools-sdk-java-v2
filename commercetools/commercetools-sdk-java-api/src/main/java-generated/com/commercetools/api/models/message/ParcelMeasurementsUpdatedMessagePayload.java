package com.commercetools.api.models.message;

import com.commercetools.api.models.message.OrderMessagePayload;
import com.commercetools.api.models.order.ParcelMeasurements;
import com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Generated after a successful Set Parcel Measurements update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelMeasurementsUpdatedMessagePayload parcelMeasurementsUpdatedMessagePayload = ParcelMeasurementsUpdatedMessagePayload.builder()
 *             .deliveryId("{deliveryId}")
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ParcelMeasurementsUpdatedMessagePayloadImpl.class)
public interface ParcelMeasurementsUpdatedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for ParcelMeasurementsUpdatedMessagePayload
     */
    String PARCEL_MEASUREMENTS_UPDATED = "ParcelMeasurementsUpdated";

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
     *  <p>The Parcel Measurements that were set on the Parcel.</p>
     * @return measurements
     */
    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();
    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
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
     *  <p>The Parcel Measurements that were set on the Parcel.</p>
     * @param measurements value to be set
     */
    
    public void setMeasurements(final ParcelMeasurements measurements);
    
    
    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */
    
    public void setShippingKey(final String shippingKey);
    

    /**
     * factory method
     * @return instance of ParcelMeasurementsUpdatedMessagePayload
     */
    public static ParcelMeasurementsUpdatedMessagePayload of(){
        return new ParcelMeasurementsUpdatedMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy ParcelMeasurementsUpdatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ParcelMeasurementsUpdatedMessagePayload of(final ParcelMeasurementsUpdatedMessagePayload template) {
        ParcelMeasurementsUpdatedMessagePayloadImpl instance = new ParcelMeasurementsUpdatedMessagePayloadImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setParcelId(template.getParcelId());
        instance.setMeasurements(template.getMeasurements());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ParcelMeasurementsUpdatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ParcelMeasurementsUpdatedMessagePayload deepCopy(@Nullable final ParcelMeasurementsUpdatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ParcelMeasurementsUpdatedMessagePayloadImpl instance = new ParcelMeasurementsUpdatedMessagePayloadImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setParcelId(template.getParcelId());
        instance.setMeasurements(com.commercetools.api.models.order.ParcelMeasurements.deepCopy(template.getMeasurements()));
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for ParcelMeasurementsUpdatedMessagePayload
     * @return builder
     */
    public static ParcelMeasurementsUpdatedMessagePayloadBuilder builder() {
        return ParcelMeasurementsUpdatedMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for ParcelMeasurementsUpdatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelMeasurementsUpdatedMessagePayloadBuilder builder(final ParcelMeasurementsUpdatedMessagePayload template) {
        return ParcelMeasurementsUpdatedMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withParcelMeasurementsUpdatedMessagePayload(Function<ParcelMeasurementsUpdatedMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ParcelMeasurementsUpdatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelMeasurementsUpdatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelMeasurementsUpdatedMessagePayload>";
            }
        };
    }
}
