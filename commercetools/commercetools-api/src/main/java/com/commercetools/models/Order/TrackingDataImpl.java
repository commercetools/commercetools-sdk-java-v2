package com.commercetools.models.order;

import java.lang.Boolean;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TrackingDataImpl implements TrackingData {

   private java.lang.Boolean isReturn;
   
   private java.lang.String carrier;
   
   private java.lang.String providerTransaction;
   
   private java.lang.String provider;
   
   private java.lang.String trackingId;

   @JsonCreator
   TrackingDataImpl(@JsonProperty("isReturn") final java.lang.Boolean isReturn, @JsonProperty("carrier") final java.lang.String carrier, @JsonProperty("providerTransaction") final java.lang.String providerTransaction, @JsonProperty("provider") final java.lang.String provider, @JsonProperty("trackingId") final java.lang.String trackingId) {
      this.isReturn = isReturn;
      this.carrier = carrier;
      this.providerTransaction = providerTransaction;
      this.provider = provider;
      this.trackingId = trackingId;
   }
   public TrackingDataImpl() {
      
   }
   
   
   public java.lang.Boolean getIsReturn(){
      return this.isReturn;
   }
   
   
   public java.lang.String getCarrier(){
      return this.carrier;
   }
   
   
   public java.lang.String getProviderTransaction(){
      return this.providerTransaction;
   }
   
   
   public java.lang.String getProvider(){
      return this.provider;
   }
   
   
   public java.lang.String getTrackingId(){
      return this.trackingId;
   }

   public void setIsReturn(final java.lang.Boolean isReturn){
      this.isReturn = isReturn;
   }
   
   public void setCarrier(final java.lang.String carrier){
      this.carrier = carrier;
   }
   
   public void setProviderTransaction(final java.lang.String providerTransaction){
      this.providerTransaction = providerTransaction;
   }
   
   public void setProvider(final java.lang.String provider){
      this.provider = provider;
   }
   
   public void setTrackingId(final java.lang.String trackingId){
      this.trackingId = trackingId;
   }

}