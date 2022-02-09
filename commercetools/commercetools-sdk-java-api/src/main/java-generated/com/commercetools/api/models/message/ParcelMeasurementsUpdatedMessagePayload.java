
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.ParcelMeasurements;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ParcelMeasurementsUpdatedMessagePayloadImpl.class)
public interface ParcelMeasurementsUpdatedMessagePayload extends OrderMessagePayload {

    String PARCEL_MEASUREMENTS_UPDATED = "ParcelMeasurementsUpdated";

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    public void setDeliveryId(final String deliveryId);

    public void setParcelId(final String parcelId);

    public void setMeasurements(final ParcelMeasurements measurements);

    public static ParcelMeasurementsUpdatedMessagePayload of() {
        return new ParcelMeasurementsUpdatedMessagePayloadImpl();
    }

    public static ParcelMeasurementsUpdatedMessagePayload of(final ParcelMeasurementsUpdatedMessagePayload template) {
        ParcelMeasurementsUpdatedMessagePayloadImpl instance = new ParcelMeasurementsUpdatedMessagePayloadImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setParcelId(template.getParcelId());
        instance.setMeasurements(template.getMeasurements());
        return instance;
    }

    public static ParcelMeasurementsUpdatedMessagePayloadBuilder builder() {
        return ParcelMeasurementsUpdatedMessagePayloadBuilder.of();
    }

    public static ParcelMeasurementsUpdatedMessagePayloadBuilder builder(
            final ParcelMeasurementsUpdatedMessagePayload template) {
        return ParcelMeasurementsUpdatedMessagePayloadBuilder.of(template);
    }

    default <T> T withParcelMeasurementsUpdatedMessagePayload(
            Function<ParcelMeasurementsUpdatedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
