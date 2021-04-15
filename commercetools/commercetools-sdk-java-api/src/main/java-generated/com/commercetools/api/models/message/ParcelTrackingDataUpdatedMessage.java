
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
@JsonDeserialize(as = ParcelTrackingDataUpdatedMessageImpl.class)
public interface ParcelTrackingDataUpdatedMessage extends Message {

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

    public static ParcelTrackingDataUpdatedMessage of() {
        return new ParcelTrackingDataUpdatedMessageImpl();
    }

    public static ParcelTrackingDataUpdatedMessage of(final ParcelTrackingDataUpdatedMessage template) {
        ParcelTrackingDataUpdatedMessageImpl instance = new ParcelTrackingDataUpdatedMessageImpl();
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
        instance.setTrackingData(template.getTrackingData());
        return instance;
    }

    public static ParcelTrackingDataUpdatedMessageBuilder builder() {
        return ParcelTrackingDataUpdatedMessageBuilder.of();
    }

    public static ParcelTrackingDataUpdatedMessageBuilder builder(final ParcelTrackingDataUpdatedMessage template) {
        return ParcelTrackingDataUpdatedMessageBuilder.of(template);
    }

    default <T> T withParcelTrackingDataUpdatedMessage(Function<ParcelTrackingDataUpdatedMessage, T> helper) {
        return helper.apply(this);
    }
}
