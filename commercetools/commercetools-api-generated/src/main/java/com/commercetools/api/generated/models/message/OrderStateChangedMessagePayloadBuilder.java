package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.OrderState;
import com.commercetools.api.generated.models.message.OrderStateChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderStateChangedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.order.OrderState oldOrderState;
   
   
   private com.commercetools.api.generated.models.order.OrderState orderState;
   
   public OrderStateChangedMessagePayloadBuilder oldOrderState( final com.commercetools.api.generated.models.order.OrderState oldOrderState) {
      this.oldOrderState = oldOrderState;
      return this;
   }
   
   public OrderStateChangedMessagePayloadBuilder orderState( final com.commercetools.api.generated.models.order.OrderState orderState) {
      this.orderState = orderState;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.order.OrderState getOldOrderState(){
      return this.oldOrderState;
   }
   
   
   public com.commercetools.api.generated.models.order.OrderState getOrderState(){
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