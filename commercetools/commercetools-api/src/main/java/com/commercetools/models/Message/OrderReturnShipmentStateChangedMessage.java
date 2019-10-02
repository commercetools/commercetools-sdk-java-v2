package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import com.commercetools.models.order.ReturnShipmentState;
import com.commercetools.models.message.OrderReturnShipmentStateChangedMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderReturnShipmentStateChangedMessageImpl.class)
public interface OrderReturnShipmentStateChangedMessage extends Message {

   
   @NotNull
   @JsonProperty("returnItemId")
   public String getReturnItemId();
   
   @NotNull
   @JsonProperty("returnShipmentState")
   public ReturnShipmentState getReturnShipmentState();

   public void setReturnItemId(final String returnItemId);
   
   public void setReturnShipmentState(final ReturnShipmentState returnShipmentState);
   
   public static OrderReturnShipmentStateChangedMessageImpl of(){
      return new OrderReturnShipmentStateChangedMessageImpl();
   }
   

   public static OrderReturnShipmentStateChangedMessageImpl of(final OrderReturnShipmentStateChangedMessage template) {
      OrderReturnShipmentStateChangedMessageImpl instance = new OrderReturnShipmentStateChangedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setReturnItemId(template.getReturnItemId());
      instance.setReturnShipmentState(template.getReturnShipmentState());
      return instance;
   }

}