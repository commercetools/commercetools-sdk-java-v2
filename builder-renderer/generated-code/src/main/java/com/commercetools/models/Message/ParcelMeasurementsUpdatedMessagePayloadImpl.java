package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.ParcelMeasurements;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ParcelMeasurementsUpdatedMessagePayloadImpl implements ParcelMeasurementsUpdatedMessagePayload {

   private java.lang.String type;
   
   private java.lang.String deliveryId;
   
   private com.commercetools.models.Order.ParcelMeasurements measurements;
   
   private java.lang.String parcelId;

   @JsonCreator
   ParcelMeasurementsUpdatedMessagePayloadImpl(@JsonProperty("deliveryId") final java.lang.String deliveryId, @JsonProperty("measurements") final com.commercetools.models.Order.ParcelMeasurements measurements, @JsonProperty("parcelId") final java.lang.String parcelId) {
      this.deliveryId = deliveryId;
      this.measurements = measurements;
      this.parcelId = parcelId;
      this.type = "ParcelMeasurementsUpdated";
   }
   public ParcelMeasurementsUpdatedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.String getDeliveryId(){
      return this.deliveryId;
   }
   
   
   public com.commercetools.models.Order.ParcelMeasurements getMeasurements(){
      return this.measurements;
   }
   
   
   public java.lang.String getParcelId(){
      return this.parcelId;
   }

   public void setDeliveryId(final java.lang.String deliveryId){
      this.deliveryId = deliveryId;
   }
   
   public void setMeasurements(final com.commercetools.models.Order.ParcelMeasurements measurements){
      this.measurements = measurements;
   }
   
   public void setParcelId(final java.lang.String parcelId){
      this.parcelId = parcelId;
   }

}