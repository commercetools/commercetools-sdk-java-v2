package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.order.ReturnShipmentState;
import java.lang.String;
import com.commercetools.models.order.OrderSetReturnShipmentStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetReturnShipmentStateActionBuilder {
   
   
   private com.commercetools.models.order.ReturnShipmentState shipmentState;
   
   
   private java.lang.String returnItemId;
   
   public OrderSetReturnShipmentStateActionBuilder shipmentState( final com.commercetools.models.order.ReturnShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   public OrderSetReturnShipmentStateActionBuilder returnItemId( final java.lang.String returnItemId) {
      this.returnItemId = returnItemId;
      return this;
   }
   
   
   public com.commercetools.models.order.ReturnShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   
   public java.lang.String getReturnItemId(){
      return this.returnItemId;
   }

   public OrderSetReturnShipmentStateAction build() {
       return new OrderSetReturnShipmentStateActionImpl(shipmentState, returnItemId);
   }
   
   public static OrderSetReturnShipmentStateActionBuilder of() {
      return new OrderSetReturnShipmentStateActionBuilder();
   }
   
   public static OrderSetReturnShipmentStateActionBuilder of(final OrderSetReturnShipmentStateAction template) {
      OrderSetReturnShipmentStateActionBuilder builder = new OrderSetReturnShipmentStateActionBuilder();
      builder.shipmentState = template.getShipmentState();
      builder.returnItemId = template.getReturnItemId();
      return builder;
   }
   
}