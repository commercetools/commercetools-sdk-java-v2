package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.ShipmentState;
import java.lang.String;
import com.commercetools.models.Message.OrderShipmentStateChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderShipmentStateChangedMessagePayloadBuilder {
   
   
   private com.commercetools.models.Order.ShipmentState shipmentState;
   
   
   private com.commercetools.models.Order.ShipmentState oldShipmentState;
   
   public OrderShipmentStateChangedMessagePayloadBuilder shipmentState( final com.commercetools.models.Order.ShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   public OrderShipmentStateChangedMessagePayloadBuilder oldShipmentState( final com.commercetools.models.Order.ShipmentState oldShipmentState) {
      this.oldShipmentState = oldShipmentState;
      return this;
   }
   
   
   public com.commercetools.models.Order.ShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   
   public com.commercetools.models.Order.ShipmentState getOldShipmentState(){
      return this.oldShipmentState;
   }

   public OrderShipmentStateChangedMessagePayload build() {
       return new OrderShipmentStateChangedMessagePayloadImpl(shipmentState, oldShipmentState);
   }
   
   public static OrderShipmentStateChangedMessagePayloadBuilder of() {
      return new OrderShipmentStateChangedMessagePayloadBuilder();
   }
   
   public static OrderShipmentStateChangedMessagePayloadBuilder of(final OrderShipmentStateChangedMessagePayload template) {
      OrderShipmentStateChangedMessagePayloadBuilder builder = new OrderShipmentStateChangedMessagePayloadBuilder();
      builder.shipmentState = template.getShipmentState();
      builder.oldShipmentState = template.getOldShipmentState();
      return builder;
   }
   
}