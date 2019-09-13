package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.order.ShipmentState;
import java.lang.String;
import com.commercetools.models.order.OrderChangeShipmentStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderChangeShipmentStateActionBuilder {
   
   @Nullable
   private com.commercetools.models.order.ShipmentState shipmentState;
   
   public OrderChangeShipmentStateActionBuilder shipmentState(@Nullable final com.commercetools.models.order.ShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.order.ShipmentState getShipmentState(){
      return this.shipmentState;
   }

   public OrderChangeShipmentStateAction build() {
       return new OrderChangeShipmentStateActionImpl(shipmentState);
   }
   
   public static OrderChangeShipmentStateActionBuilder of() {
      return new OrderChangeShipmentStateActionBuilder();
   }
   
   public static OrderChangeShipmentStateActionBuilder of(final OrderChangeShipmentStateAction template) {
      OrderChangeShipmentStateActionBuilder builder = new OrderChangeShipmentStateActionBuilder();
      builder.shipmentState = template.getShipmentState();
      return builder;
   }
   
}