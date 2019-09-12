package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.OrderState;
import java.lang.String;
import com.commercetools.models.Message.OrderStateChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderStateChangedMessagePayloadBuilder {
   
   
   private com.commercetools.models.Order.OrderState oldOrderState;
   
   
   private com.commercetools.models.Order.OrderState orderState;
   
   public OrderStateChangedMessagePayloadBuilder oldOrderState( final com.commercetools.models.Order.OrderState oldOrderState) {
      this.oldOrderState = oldOrderState;
      return this;
   }
   
   public OrderStateChangedMessagePayloadBuilder orderState( final com.commercetools.models.Order.OrderState orderState) {
      this.orderState = orderState;
      return this;
   }
   
   
   public com.commercetools.models.Order.OrderState getOldOrderState(){
      return this.oldOrderState;
   }
   
   
   public com.commercetools.models.Order.OrderState getOrderState(){
      return this.orderState;
   }

   public OrderStateChangedMessagePayload build() {
       return new OrderStateChangedMessagePayloadImpl(oldOrderState, orderState);
   }
   
   public static OrderStateChangedMessagePayloadBuilder of() {
      return new OrderStateChangedMessagePayloadBuilder();
   }
   
   public static OrderStateChangedMessagePayloadBuilder of(final OrderStateChangedMessagePayload template) {
      OrderStateChangedMessagePayloadBuilder builder = new OrderStateChangedMessagePayloadBuilder();
      builder.oldOrderState = template.getOldOrderState();
      builder.orderState = template.getOrderState();
      return builder;
   }
   
}