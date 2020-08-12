package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.ShipmentState;
import com.commercetools.api.models.message.OrderShipmentStateChangedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = OrderShipmentStateChangedMessagePayloadImpl.class)
public interface OrderShipmentStateChangedMessagePayload extends MessagePayload {

   
   @NotNull
   @JsonProperty("shipmentState")
   public ShipmentState getShipmentState();
   
   
   @JsonProperty("oldShipmentState")
   public ShipmentState getOldShipmentState();

   public void setShipmentState(final ShipmentState shipmentState);
   
   public void setOldShipmentState(final ShipmentState oldShipmentState);
   
   public static OrderShipmentStateChangedMessagePayloadImpl of(){
      return new OrderShipmentStateChangedMessagePayloadImpl();
   }
   

   public static OrderShipmentStateChangedMessagePayloadImpl of(final OrderShipmentStateChangedMessagePayload template) {
      OrderShipmentStateChangedMessagePayloadImpl instance = new OrderShipmentStateChangedMessagePayloadImpl();
      instance.setShipmentState(template.getShipmentState());
      instance.setOldShipmentState(template.getOldShipmentState());
      return instance;
   }

}
