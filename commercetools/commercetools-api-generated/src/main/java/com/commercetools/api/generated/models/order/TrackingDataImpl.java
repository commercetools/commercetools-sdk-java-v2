package com.commercetools.api.generated.models.order;


import io.vrap.rmf.base.client.utils.Generated;
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

   private Boolean isReturn;
   
   private String carrier;
   
   private String providerTransaction;
   
   private String provider;
   
   private String trackingId;

   @JsonCreator
   TrackingDataImpl(@JsonProperty("isReturn") final Boolean isReturn, @JsonProperty("carrier") final String carrier, @JsonProperty("providerTransaction") final String providerTransaction, @JsonProperty("provider") final String provider, @JsonProperty("trackingId") final String trackingId) {
      this.isReturn = isReturn;
      this.carrier = carrier;
      this.providerTransaction = providerTransaction;
      this.provider = provider;
      this.trackingId = trackingId;
   }
   public TrackingDataImpl() {
      
   }
   
   /**
   *  <p>Flag to distinguish if the parcel is on the way to the customer (false) or on the way back (true).</p>
   */
   public Boolean getIsReturn(){
      return this.isReturn;
   }
   
   /**
   *  <p>The carrier that delivers the parcel.</p>
   */
   public String getCarrier(){
      return this.carrier;
   }
   
   
   public String getProviderTransaction(){
      return this.providerTransaction;
   }
   
   
   public String getProvider(){
      return this.provider;
   }
   
   /**
   *  <p>The ID to track one parcel.</p>
   */
   public String getTrackingId(){
      return this.trackingId;
   }

   public void setIsReturn(final Boolean isReturn){
      this.isReturn = isReturn;
   }
   
   public void setCarrier(final String carrier){
      this.carrier = carrier;
   }
   
   public void setProviderTransaction(final String providerTransaction){
      this.providerTransaction = providerTransaction;
   }
   
   public void setProvider(final String provider){
      this.provider = provider;
   }
   
   public void setTrackingId(final String trackingId){
      this.trackingId = trackingId;
   }

}