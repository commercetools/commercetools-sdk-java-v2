package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
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
public final class StagedOrderRemoveDeliveryActionImpl implements StagedOrderRemoveDeliveryAction {

   private java.lang.String action;
   
   private java.lang.String deliveryId;

   @JsonCreator
   StagedOrderRemoveDeliveryActionImpl(@JsonProperty("deliveryId") final java.lang.String deliveryId) {
      this.deliveryId = deliveryId;
      this.action = "removeDelivery";
   }
   public StagedOrderRemoveDeliveryActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getDeliveryId(){
      return this.deliveryId;
   }

   public void setDeliveryId(final java.lang.String deliveryId){
      this.deliveryId = deliveryId;
   }

}