package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.order.ReturnShipmentState;
import java.lang.String;
import com.commercetools.models.message.OrderReturnShipmentStateChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderReturnShipmentStateChangedMessagePayloadBuilder {
   
   
   private java.lang.String returnItemId;
   
   
   private com.commercetools.models.order.ReturnShipmentState returnShipmentState;
   
   public OrderReturnShipmentStateChangedMessagePayloadBuilder returnItemId( final java.lang.String returnItemId) {
      this.returnItemId = returnItemId;
      return this;
   }
   
   public OrderReturnShipmentStateChangedMessagePayloadBuilder returnShipmentState( final com.commercetools.models.order.ReturnShipmentState returnShipmentState) {
      this.returnShipmentState = returnShipmentState;
      return this;
   }
   
   
   public java.lang.String getReturnItemId(){
      return this.returnItemId;
   }
   
   
   public com.commercetools.models.order.ReturnShipmentState getReturnShipmentState(){
      return this.returnShipmentState;
   }

   public OrderReturnShipmentStateChangedMessagePayload build() {
       return new OrderReturnShipmentStateChangedMessagePayloadImpl(returnItemId, returnShipmentState);
   }
   
   public static OrderReturnShipmentStateChangedMessagePayloadBuilder of() {
      return new OrderReturnShipmentStateChangedMessagePayloadBuilder();
   }
   
   public static OrderReturnShipmentStateChangedMessagePayloadBuilder of(final OrderReturnShipmentStateChangedMessagePayload template) {
      OrderReturnShipmentStateChangedMessagePayloadBuilder builder = new OrderReturnShipmentStateChangedMessagePayloadBuilder();
      builder.returnItemId = template.getReturnItemId();
      builder.returnShipmentState = template.getReturnShipmentState();
      return builder;
   }
   
}