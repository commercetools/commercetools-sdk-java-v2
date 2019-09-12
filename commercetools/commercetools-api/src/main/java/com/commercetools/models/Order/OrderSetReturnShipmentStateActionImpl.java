package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.Order.ReturnShipmentState;
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
public final class OrderSetReturnShipmentStateActionImpl implements OrderSetReturnShipmentStateAction {

   private java.lang.String action;
   
   private com.commercetools.models.Order.ReturnShipmentState shipmentState;
   
   private java.lang.String returnItemId;

   @JsonCreator
   OrderSetReturnShipmentStateActionImpl(@JsonProperty("shipmentState") final com.commercetools.models.Order.ReturnShipmentState shipmentState, @JsonProperty("returnItemId") final java.lang.String returnItemId) {
      this.shipmentState = shipmentState;
      this.returnItemId = returnItemId;
      this.action = "setReturnShipmentState";
   }
   public OrderSetReturnShipmentStateActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Order.ReturnShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   
   public java.lang.String getReturnItemId(){
      return this.returnItemId;
   }

   public void setShipmentState(final com.commercetools.models.Order.ReturnShipmentState shipmentState){
      this.shipmentState = shipmentState;
   }
   
   public void setReturnItemId(final java.lang.String returnItemId){
      this.returnItemId = returnItemId;
   }

}