package com.commercetools.models.Message;

import com.commercetools.models.Message.Message;
import com.commercetools.models.Order.ShipmentState;
import com.commercetools.models.Message.OrderShipmentStateChangedMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderShipmentStateChangedMessageImpl.class)
public interface OrderShipmentStateChangedMessage extends Message {

   
   @NotNull
   @JsonProperty("shipmentState")
   public ShipmentState getShipmentState();
   
   @NotNull
   @JsonProperty("oldShipmentState")
   public ShipmentState getOldShipmentState();

   public void setShipmentState(final ShipmentState shipmentState);
   
   public void setOldShipmentState(final ShipmentState oldShipmentState);
   
   public static OrderShipmentStateChangedMessageImpl of(){
      return new OrderShipmentStateChangedMessageImpl();
   }
   

   public static OrderShipmentStateChangedMessageImpl of(final OrderShipmentStateChangedMessage template) {
      OrderShipmentStateChangedMessageImpl instance = new OrderShipmentStateChangedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setShipmentState(template.getShipmentState());
      instance.setOldShipmentState(template.getOldShipmentState());
      return instance;
   }

}