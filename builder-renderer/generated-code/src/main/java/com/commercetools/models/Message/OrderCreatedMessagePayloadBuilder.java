package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.Order;
import java.lang.String;
import com.commercetools.models.Message.OrderCreatedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderCreatedMessagePayloadBuilder {
   
   
   private com.commercetools.models.Order.Order order;
   
   public OrderCreatedMessagePayloadBuilder order( final com.commercetools.models.Order.Order order) {
      this.order = order;
      return this;
   }
   
   
   public com.commercetools.models.Order.Order getOrder(){
      return this.order;
   }

   public OrderCreatedMessagePayload build() {
       return new OrderCreatedMessagePayloadImpl(order);
   }
   
   public static OrderCreatedMessagePayloadBuilder of() {
      return new OrderCreatedMessagePayloadBuilder();
   }
   
   public static OrderCreatedMessagePayloadBuilder of(final OrderCreatedMessagePayload template) {
      OrderCreatedMessagePayloadBuilder builder = new OrderCreatedMessagePayloadBuilder();
      builder.order = template.getOrder();
      return builder;
   }
   
}