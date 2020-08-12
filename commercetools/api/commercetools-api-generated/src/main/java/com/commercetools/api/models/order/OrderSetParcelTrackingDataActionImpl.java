package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.TrackingData;
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
public final class OrderSetParcelTrackingDataActionImpl implements OrderSetParcelTrackingDataAction {

   private String action;
   
   private String parcelId;
   
   private com.commercetools.api.models.order.TrackingData trackingData;

   @JsonCreator
   OrderSetParcelTrackingDataActionImpl(@JsonProperty("parcelId") final String parcelId, @JsonProperty("trackingData") final com.commercetools.api.models.order.TrackingData trackingData) {
      this.parcelId = parcelId;
      this.trackingData = trackingData;
      this.action = "setParcelTrackingData";
   }
   public OrderSetParcelTrackingDataActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getParcelId(){
      return this.parcelId;
   }
   
   
   public com.commercetools.api.models.order.TrackingData getTrackingData(){
      return this.trackingData;
   }

   public void setParcelId(final String parcelId){
      this.parcelId = parcelId;
   }
   
   public void setTrackingData(final com.commercetools.api.models.order.TrackingData trackingData){
      this.trackingData = trackingData;
   }

}
