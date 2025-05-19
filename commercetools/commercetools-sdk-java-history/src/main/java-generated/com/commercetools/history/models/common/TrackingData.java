
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * TrackingData
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TrackingData trackingData = TrackingData.builder()
 *             .trackingId("{trackingId}")
 *             .carrier("{carrier}")
 *             .provider("{provider}")
 *             .providerTransaction("{providerTransaction}")
 *             .isReturn(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TrackingDataImpl.class)
public interface TrackingData {

    /**
     *  <p>The ID to track one parcel.</p>
     * @return trackingId
     */
    @NotNull
    @JsonProperty("trackingId")
    public String getTrackingId();

    /**
     *  <p>The carrier that delivers the parcel.</p>
     * @return carrier
     */
    @NotNull
    @JsonProperty("carrier")
    public String getCarrier();

    /**
     *
     * @return provider
     */
    @NotNull
    @JsonProperty("provider")
    public String getProvider();

    /**
     *
     * @return providerTransaction
     */
    @NotNull
    @JsonProperty("providerTransaction")
    public String getProviderTransaction();

    /**
     *  <p>Flag to distinguish if the parcel is on the way to the customer (false) or on the way back (true).</p>
     * @return isReturn
     */
    @NotNull
    @JsonProperty("isReturn")
    public Boolean getIsReturn();

    /**
     *  <p>The ID to track one parcel.</p>
     * @param trackingId value to be set
     */

    public void setTrackingId(final String trackingId);

    /**
     *  <p>The carrier that delivers the parcel.</p>
     * @param carrier value to be set
     */

    public void setCarrier(final String carrier);

    /**
     * set provider
     * @param provider value to be set
     */

    public void setProvider(final String provider);

    /**
     * set providerTransaction
     * @param providerTransaction value to be set
     */

    public void setProviderTransaction(final String providerTransaction);

    /**
     *  <p>Flag to distinguish if the parcel is on the way to the customer (false) or on the way back (true).</p>
     * @param isReturn value to be set
     */

    public void setIsReturn(final Boolean isReturn);

    /**
     * factory method
     * @return instance of TrackingData
     */
    public static TrackingData of() {
        return new TrackingDataImpl();
    }

    /**
     * factory method to create a shallow copy TrackingData
     * @param template instance to be copied
     * @return copy instance
     */
    public static TrackingData of(final TrackingData template) {
        TrackingDataImpl instance = new TrackingDataImpl();
        instance.setTrackingId(template.getTrackingId());
        instance.setCarrier(template.getCarrier());
        instance.setProvider(template.getProvider());
        instance.setProviderTransaction(template.getProviderTransaction());
        instance.setIsReturn(template.getIsReturn());
        return instance;
    }

    public TrackingData copyDeep();

    /**
     * factory method to create a deep copy of TrackingData
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TrackingData deepCopy(@Nullable final TrackingData template) {
        if (template == null) {
            return null;
        }
        TrackingDataImpl instance = new TrackingDataImpl();
        instance.setTrackingId(template.getTrackingId());
        instance.setCarrier(template.getCarrier());
        instance.setProvider(template.getProvider());
        instance.setProviderTransaction(template.getProviderTransaction());
        instance.setIsReturn(template.getIsReturn());
        return instance;
    }

    /**
     * builder factory method for TrackingData
     * @return builder
     */
    public static TrackingDataBuilder builder() {
        return TrackingDataBuilder.of();
    }

    /**
     * create builder for TrackingData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TrackingDataBuilder builder(final TrackingData template) {
        return TrackingDataBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTrackingData(Function<TrackingData, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TrackingData> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TrackingData>() {
            @Override
            public String toString() {
                return "TypeReference<TrackingData>";
            }
        };
    }
}
