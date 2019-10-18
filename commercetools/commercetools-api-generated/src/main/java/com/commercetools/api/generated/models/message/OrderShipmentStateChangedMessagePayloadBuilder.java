package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.ShipmentState;
import com.commercetools.api.generated.models.message.OrderShipmentStateChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderShipmentStateChangedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.order.ShipmentState shipmentState;
   
   
   private com.commercetools.api.generated.models.order.ShipmentState oldShipmentState;
   
   public OrderShipmentStateChangedMessagePayloadBuilder shipmentState( final com.commercetools.api.generated.models.order.ShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   public OrderShipmentStateChangedMessagePayloadBuilder oldShipmentState( final com.commercetools.api.generated.models.order.ShipmentState oldShipmentState) {
      this.oldShipmentState = oldShipmentState;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.order.ShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   
   public com.commercetools.api.generated.models.order.ShipmentState getOldShipmentState(){
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