package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
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
public final class OrderRemoveParcelFromDeliveryActionImpl implements OrderRemoveParcelFromDeliveryAction {

   private String action;
   
   private String parcelId;

   @JsonCreator
   OrderRemoveParcelFromDeliveryActionImpl(@JsonProperty("parcelId") final String parcelId) {
      this.parcelId = parcelId;
      this.action = "removeParcelFromDelivery";
   }
   public OrderRemoveParcelFromDeliveryActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getParcelId(){
      return this.parcelId;
   }

   public void setParcelId(final String parcelId){
      this.parcelId = parcelId;
   }

}