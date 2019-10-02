package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.order.ShipmentState;
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
public final class OrderChangeShipmentStateActionImpl implements OrderChangeShipmentStateAction {

   private String action;
   
   private com.commercetools.models.order.ShipmentState shipmentState;

   @JsonCreator
   OrderChangeShipmentStateActionImpl(@JsonProperty("shipmentState") final com.commercetools.models.order.ShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      this.action = "changeShipmentState";
   }
   public OrderChangeShipmentStateActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.order.ShipmentState getShipmentState(){
      return this.shipmentState;
   }

   public void setShipmentState(final com.commercetools.models.order.ShipmentState shipmentState){
      this.shipmentState = shipmentState;
   }

}