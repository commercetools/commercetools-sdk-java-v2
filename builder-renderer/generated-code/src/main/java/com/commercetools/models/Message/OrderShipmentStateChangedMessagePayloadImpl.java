package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.ShipmentState;
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
public final class OrderShipmentStateChangedMessagePayloadImpl implements OrderShipmentStateChangedMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.Order.ShipmentState shipmentState;
   
   private com.commercetools.models.Order.ShipmentState oldShipmentState;

   @JsonCreator
   OrderShipmentStateChangedMessagePayloadImpl(@JsonProperty("shipmentState") final com.commercetools.models.Order.ShipmentState shipmentState, @JsonProperty("oldShipmentState") final com.commercetools.models.Order.ShipmentState oldShipmentState) {
      this.shipmentState = shipmentState;
      this.oldShipmentState = oldShipmentState;
      this.type = "OrderShipmentStateChanged";
   }
   public OrderShipmentStateChangedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.Order.ShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   
   public com.commercetools.models.Order.ShipmentState getOldShipmentState(){
      return this.oldShipmentState;
   }

   public void setShipmentState(final com.commercetools.models.Order.ShipmentState shipmentState){
      this.shipmentState = shipmentState;
   }
   
   public void setOldShipmentState(final com.commercetools.models.Order.ShipmentState oldShipmentState){
      this.oldShipmentState = oldShipmentState;
   }

}