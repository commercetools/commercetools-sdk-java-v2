package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.order.TrackingData;
import com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ParcelTrackingDataUpdatedMessageImpl.class)
public interface ParcelTrackingDataUpdatedMessage extends Message {

    
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

    public static ParcelTrackingDataUpdatedMessageImpl of(){
        return new ParcelTrackingDataUpdatedMessageImpl();
    }
    

    public static ParcelTrackingDataUpdatedMessageImpl of(final ParcelTrackingDataUpdatedMessage template) {
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

    default <T extends Accessor<ParcelTrackingDataUpdatedMessage>> T withParcelTrackingDataUpdatedMessage(Function<ParcelTrackingDataUpdatedMessage, T> helper) {
        return helper.apply(this);
    }
}
