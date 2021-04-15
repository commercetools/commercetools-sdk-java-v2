
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TrackingDataImpl.class)
public interface TrackingData {

    /**
    *  <p>The ID to track one parcel.</p>
    */

    @JsonProperty("trackingId")
    public String getTrackingId();

    /**
    *  <p>The carrier that delivers the parcel.</p>
    */

    @JsonProperty("carrier")
    public String getCarrier();

    @JsonProperty("provider")
    public String getProvider();

    @JsonProperty("providerTransaction")
    public String getProviderTransaction();

    /**
    *  <p>Flag to distinguish if the parcel is on the way to the customer (false) or on the way back (true).</p>
    */

    @JsonProperty("isReturn")
    public Boolean getIsReturn();

    public void setTrackingId(final String trackingId);

    public void setCarrier(final String carrier);

    public void setProvider(final String provider);

    public void setProviderTransaction(final String providerTransaction);

    public void setIsReturn(final Boolean isReturn);

    public static TrackingData of() {
        return new TrackingDataImpl();
    }

    public static TrackingData of(final TrackingData template) {
        TrackingDataImpl instance = new TrackingDataImpl();
        instance.setTrackingId(template.getTrackingId());
        instance.setCarrier(template.getCarrier());
        instance.setProvider(template.getProvider());
        instance.setProviderTransaction(template.getProviderTransaction());
        instance.setIsReturn(template.getIsReturn());
        return instance;
    }

    public static TrackingDataBuilder builder() {
        return TrackingDataBuilder.of();
    }

    public static TrackingDataBuilder builder(final TrackingData template) {
        return TrackingDataBuilder.of(template);
    }

    default <T> T withTrackingData(Function<TrackingData, T> helper) {
        return helper.apply(this);
    }
}
