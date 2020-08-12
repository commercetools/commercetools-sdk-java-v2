package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.ParcelMeasurements;
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
   
   private String parcelId;
   
   private com.commercetools.api.models.order.ParcelMeasurements measurements;

   @JsonCreator
   ParcelMeasurementsUpdatedMessagePayloadImpl(@JsonProperty("deliveryId") final String deliveryId, @JsonProperty("parcelId") final String parcelId, @JsonProperty("measurements") final com.commercetools.api.models.order.ParcelMeasurements measurements) {
      this.deliveryId = deliveryId;
      this.parcelId = parcelId;
      this.measurements = measurements;
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
   
   
   public String getParcelId(){
      return this.parcelId;
   }
   
   
   public com.commercetools.api.models.order.ParcelMeasurements getMeasurements(){
      return this.measurements;
   }

   public void setDeliveryId(final String deliveryId){
      this.deliveryId = deliveryId;
   }
   
   public void setParcelId(final String parcelId){
      this.parcelId = parcelId;
   }
   
   public void setMeasurements(final com.commercetools.api.models.order.ParcelMeasurements measurements){
      this.measurements = measurements;
   }

}
