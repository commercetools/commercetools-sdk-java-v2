package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.StagedOrderUpdateAction;
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
public final class StagedOrderRemoveParcelFromDeliveryActionImpl implements StagedOrderRemoveParcelFromDeliveryAction {

   private java.lang.String action;
   
   private java.lang.String parcelId;

   @JsonCreator
   StagedOrderRemoveParcelFromDeliveryActionImpl(@JsonProperty("parcelId") final java.lang.String parcelId) {
      this.parcelId = parcelId;
      this.action = "removeParcelFromDelivery";
   }
   public StagedOrderRemoveParcelFromDeliveryActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getParcelId(){
      return this.parcelId;
   }

   public void setParcelId(final java.lang.String parcelId){
      this.parcelId = parcelId;
   }

}