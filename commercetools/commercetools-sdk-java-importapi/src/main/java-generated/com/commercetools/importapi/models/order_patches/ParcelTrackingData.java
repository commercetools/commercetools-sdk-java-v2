
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.orders.TrackingData;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ParcelTrackingData
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelTrackingData parcelTrackingData = ParcelTrackingData.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ParcelTrackingDataImpl.class)
public interface ParcelTrackingData {

    /**
     *
     * @return parcelId
     */
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     *
     * @return trackingData
     */
    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    /**
     * set parcelId
     * @param parcelId value to be set
     */

    public void setParcelId(final String parcelId);

    /**
     * set trackingData
     * @param trackingData value to be set
     */

    public void setTrackingData(final TrackingData trackingData);

    /**
     * factory method
     * @return instance of ParcelTrackingData
     */
    public static ParcelTrackingData of() {
        return new ParcelTrackingDataImpl();
    }

    /**
     * factory method to create a shallow copy ParcelTrackingData
     * @param template instance to be copied
     * @return copy instance
     */
    public static ParcelTrackingData of(final ParcelTrackingData template) {
        ParcelTrackingDataImpl instance = new ParcelTrackingDataImpl();
        instance.setParcelId(template.getParcelId());
        instance.setTrackingData(template.getTrackingData());
        return instance;
    }

    public ParcelTrackingData copyDeep();

    /**
     * factory method to create a deep copy of ParcelTrackingData
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ParcelTrackingData deepCopy(@Nullable final ParcelTrackingData template) {
        if (template == null) {
            return null;
        }
        ParcelTrackingDataImpl instance = new ParcelTrackingDataImpl();
        instance.setParcelId(template.getParcelId());
        instance.setTrackingData(
            com.commercetools.importapi.models.orders.TrackingData.deepCopy(template.getTrackingData()));
        return instance;
    }

    /**
     * builder factory method for ParcelTrackingData
     * @return builder
     */
    public static ParcelTrackingDataBuilder builder() {
        return ParcelTrackingDataBuilder.of();
    }

    /**
     * create builder for ParcelTrackingData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelTrackingDataBuilder builder(final ParcelTrackingData template) {
        return ParcelTrackingDataBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withParcelTrackingData(Function<ParcelTrackingData, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ParcelTrackingData> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelTrackingData>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelTrackingData>";
            }
        };
    }
}
