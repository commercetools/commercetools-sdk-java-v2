package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.ParcelMeasurements;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ParcelMeasurementsUpdatedMessagePayloadImpl implements ParcelMeasurementsUpdatedMessagePayload {

   private String type;
   
   private String deliveryId;
   
   private com.commercetools.api.generated.models.order.ParcelMeasurements measurements;
   
   private String parcelId;

   @JsonCreator
   ParcelMeasurementsUpdatedMessagePayloadImpl(@JsonProperty("deliveryId") final String deliveryId, @JsonProperty("measurements") final com.commercetools.api.generated.models.order.ParcelMeasurements measurements, @JsonProperty("parcelId") final String parcelId) {
      this.deliveryId = deliveryId;
      this.measurements = measurements;
      this.parcelId = parcelId;
      this.type = "ParcelMeasurementsUpdated";
   }
   public ParcelMeasurementsUpdatedMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public String getDeliveryId(){
      return this.deliveryId;
   }
   
   
   public com.commercetools.api.generated.models.order.ParcelMeasurements getMeasurements(){
      return this.measurements;
   }
   
   
   public String getParcelId(){
      return this.parcelId;
   }

   public void setDeliveryId(final String deliveryId){
      this.deliveryId = deliveryId;
   }
   
   public void setMeasurements(final com.commercetools.api.generated.models.order.ParcelMeasurements measurements){
      this.measurements = measurements;
   }
   
   public void setParcelId(final String parcelId){
      this.parcelId = parcelId;
   }

}