
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.TrackingData;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ParcelTrackingDataUpdatedMessagePayloadImpl.class)
public interface ParcelTrackingDataUpdatedMessagePayload extends MessagePayload {

    String PARCEL_TRACKING_DATA_UPDATED = "ParcelTrackingDataUpdated";

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    public void setDeliveryId(final String deliveryId);

    public void setParcelId(final String parcelId);

    public void setTrackingData(final TrackingData trackingData);

    public static ParcelTrackingDataUpdatedMessagePayload of() {
        return new ParcelTrackingDataUpdatedMessagePayloadImpl();
    }

    public static ParcelTrackingDataUpdatedMessagePayload of(final ParcelTrackingDataUpdatedMessagePayload template) {
        ParcelTrackingDataUpdatedMessagePayloadImpl instance = new ParcelTrackingDataUpdatedMessagePayloadImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setParcelId(template.getParcelId());
        instance.setTrackingData(template.getTrackingData());
        return instance;
    }

    public static ParcelTrackingDataUpdatedMessagePayloadBuilder builder() {
        return ParcelTrackingDataUpdatedMessagePayloadBuilder.of();
    }

    public static ParcelTrackingDataUpdatedMessagePayloadBuilder builder(
            final ParcelTrackingDataUpdatedMessagePayload template) {
        return ParcelTrackingDataUpdatedMessagePayloadBuilder.of(template);
    }

    default <T> T withParcelTrackingDataUpdatedMessagePayload(
            Function<ParcelTrackingDataUpdatedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
