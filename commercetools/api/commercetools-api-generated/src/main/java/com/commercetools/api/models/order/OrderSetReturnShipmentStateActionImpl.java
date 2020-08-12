package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.ReturnShipmentState;
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
public final class OrderSetReturnShipmentStateActionImpl implements OrderSetReturnShipmentStateAction {

   private String action;
   
   private String returnItemId;
   
   private com.commercetools.api.models.order.ReturnShipmentState shipmentState;

   @JsonCreator
   OrderSetReturnShipmentStateActionImpl(@JsonProperty("returnItemId") final String returnItemId, @JsonProperty("shipmentState") final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
      this.returnItemId = returnItemId;
      this.shipmentState = shipmentState;
      this.action = "setReturnShipmentState";
   }
   public OrderSetReturnShipmentStateActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getReturnItemId(){
      return this.returnItemId;
   }
   
   
   public com.commercetools.api.models.order.ReturnShipmentState getShipmentState(){
      return this.shipmentState;
   }

   public void setReturnItemId(final String returnItemId){
      this.returnItemId = returnItemId;
   }
   
   public void setShipmentState(final com.commercetools.api.models.order.ReturnShipmentState shipmentState){
      this.shipmentState = shipmentState;
   }

}
