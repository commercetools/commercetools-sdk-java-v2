package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.Order.ShipmentState;
import java.lang.String;
import com.commercetools.models.Order.OrderChangeShipmentStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderChangeShipmentStateActionBuilder {
   
   @Nullable
   private com.commercetools.models.Order.ShipmentState shipmentState;
   
   public OrderChangeShipmentStateActionBuilder shipmentState(@Nullable final com.commercetools.models.Order.ShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Order.ShipmentState getShipmentState(){
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