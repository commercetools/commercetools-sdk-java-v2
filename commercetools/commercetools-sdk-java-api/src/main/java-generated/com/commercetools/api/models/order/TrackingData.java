
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Information that helps track a Parcel.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TrackingData trackingData = TrackingData.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TrackingDataImpl.class)
public interface TrackingData {

    /**
     *  <p>Identifier to track the Parcel.</p>
     * @return trackingId
     */

    @JsonProperty("trackingId")
    public String getTrackingId();

    /**
     *  <p>Name of the carrier that delivers the Parcel.</p>
     * @return carrier
     */

    @JsonProperty("carrier")
    public String getCarrier();

    /**
     *  <p>Name of the provider that serves as facade to several carriers.</p>
     * @return provider
     */

    @JsonProperty("provider")
    public String getProvider();

    /**
     *  <p>Transaction identifier with the <code>provider</code>.</p>
     * @return providerTransaction
     */

    @JsonProperty("providerTransaction")
    public String getProviderTransaction();

    /**
     *  <ul>
     *   <li>If <code>true</code>, the Parcel is being returned.</li>
     *   <li>If <code>false</code>, the Parcel is being delivered to the customer.</li>
     *  </ul>
     * @return isReturn
     */

    @JsonProperty("isReturn")
    public Boolean getIsReturn();

    /**
     *  <p>Identifier to track the Parcel.</p>
     * @param trackingId value to be set
     */

    public void setTrackingId(final String trackingId);

    /**
     *  <p>Name of the carrier that delivers the Parcel.</p>
     * @param carrier value to be set
     */

    public void setCarrier(final String carrier);

    /**
     *  <p>Name of the provider that serves as facade to several carriers.</p>
     * @param provider value to be set
     */

    public void setProvider(final String provider);

    /**
     *  <p>Transaction identifier with the <code>provider</code>.</p>
     * @param providerTransaction value to be set
     */

    public void setProviderTransaction(final String providerTransaction);

    /**
     *  <ul>
     *   <li>If <code>true</code>, the Parcel is being returned.</li>
     *   <li>If <code>false</code>, the Parcel is being delivered to the customer.</li>
     *  </ul>
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
