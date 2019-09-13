package com.commercetools.models.order_edit;

import com.commercetools.models.order.ShipmentState;
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
public final class StagedOrderChangeShipmentStateActionImpl implements StagedOrderChangeShipmentStateAction {

   private java.lang.String action;
   
   private com.commercetools.models.order.ShipmentState shipmentState;

   @JsonCreator
   StagedOrderChangeShipmentStateActionImpl(@JsonProperty("shipmentState") final com.commercetools.models.order.ShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      this.action = "changeShipmentState";
   }
   public StagedOrderChangeShipmentStateActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.order.ShipmentState getShipmentState(){
      return this.shipmentState;
   }

   public void setShipmentState(final com.commercetools.models.order.ShipmentState shipmentState){
      this.shipmentState = shipmentState;
   }

}