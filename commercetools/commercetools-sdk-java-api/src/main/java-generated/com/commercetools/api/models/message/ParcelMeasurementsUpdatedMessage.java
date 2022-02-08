
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
@JsonDeserialize(as = ParcelMeasurementsUpdatedMessageImpl.class)
public interface ParcelMeasurementsUpdatedMessage extends OrderMessage {

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

    public static ParcelMeasurementsUpdatedMessage of() {
        return new ParcelMeasurementsUpdatedMessageImpl();
    }

    public static ParcelMeasurementsUpdatedMessage of(final ParcelMeasurementsUpdatedMessage template) {
        ParcelMeasurementsUpdatedMessageImpl instance = new ParcelMeasurementsUpdatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setParcelId(template.getParcelId());
        instance.setMeasurements(template.getMeasurements());
        return instance;
    }

    public static ParcelMeasurementsUpdatedMessageBuilder builder() {
        return ParcelMeasurementsUpdatedMessageBuilder.of();
    }

    public static ParcelMeasurementsUpdatedMessageBuilder builder(final ParcelMeasurementsUpdatedMessage template) {
        return ParcelMeasurementsUpdatedMessageBuilder.of(template);
    }

    default <T> T withParcelMeasurementsUpdatedMessage(Function<ParcelMeasurementsUpdatedMessage, T> helper) {
        return helper.apply(this);
    }
}
