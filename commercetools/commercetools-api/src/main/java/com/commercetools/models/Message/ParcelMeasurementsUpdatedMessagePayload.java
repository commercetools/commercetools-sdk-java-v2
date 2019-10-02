package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.order.ParcelMeasurements;
import com.commercetools.models.message.ParcelMeasurementsUpdatedMessagePayloadImpl;

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
@JsonDeserialize(as = ParcelMeasurementsUpdatedMessagePayloadImpl.class)
public interface ParcelMeasurementsUpdatedMessagePayload extends MessagePayload {

   
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
   
   public static ParcelMeasurementsUpdatedMessagePayloadImpl of(){
      return new ParcelMeasurementsUpdatedMessagePayloadImpl();
   }
   

   public static ParcelMeasurementsUpdatedMessagePayloadImpl of(final ParcelMeasurementsUpdatedMessagePayload template) {
      ParcelMeasurementsUpdatedMessagePayloadImpl instance = new ParcelMeasurementsUpdatedMessagePayloadImpl();
      instance.setDeliveryId(template.getDeliveryId());
      instance.setMeasurements(template.getMeasurements());
      instance.setParcelId(template.getParcelId());
      return instance;
   }

}