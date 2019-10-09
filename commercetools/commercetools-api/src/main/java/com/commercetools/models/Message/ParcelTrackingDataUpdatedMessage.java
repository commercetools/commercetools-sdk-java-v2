package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import com.commercetools.models.order.TrackingData;
import com.commercetools.models.message.ParcelTrackingDataUpdatedMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

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
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setDeliveryId(template.getDeliveryId());
      instance.setTrackingData(template.getTrackingData());
      instance.setParcelId(template.getParcelId());
      return instance;
   }

}