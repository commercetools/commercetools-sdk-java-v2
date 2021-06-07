
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.orders.TrackingData;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ParcelTrackingDataImpl.class)
public interface ParcelTrackingData {

    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    public void setParcelId(final String parcelId);

    public void setTrackingData(final TrackingData trackingData);

    public static ParcelTrackingData of() {
        return new ParcelTrackingDataImpl();
    }

    public static ParcelTrackingData of(final ParcelTrackingData template) {
        ParcelTrackingDataImpl instance = new ParcelTrackingDataImpl();
        instance.setParcelId(template.getParcelId());
        instance.setTrackingData(template.getTrackingData());
        return instance;
    }

    public static ParcelTrackingDataBuilder builder() {
        return ParcelTrackingDataBuilder.of();
    }

    public static ParcelTrackingDataBuilder builder(final ParcelTrackingData template) {
        return ParcelTrackingDataBuilder.of(template);
    }

    default <T> T withParcelTrackingData(Function<ParcelTrackingData, T> helper) {
        return helper.apply(this);
    }
}
