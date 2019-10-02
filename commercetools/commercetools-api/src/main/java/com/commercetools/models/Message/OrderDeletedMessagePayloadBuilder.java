package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.order.Order;
import com.commercetools.models.message.OrderDeletedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderDeletedMessagePayloadBuilder {
   
   
   private com.commercetools.models.order.Order order;
   
   public OrderDeletedMessagePayloadBuilder order( final com.commercetools.models.order.Order order) {
      this.order = order;
      return this;
   }
   
   
   public com.commercetools.models.order.Order getOrder(){
      return this.order;
   }

   public OrderDeletedMessagePayload build() {
       return new OrderDeletedMessagePayloadImpl(order);
   }
   
   public static OrderDeletedMessagePayloadBuilder of() {
      return new OrderDeletedMessagePayloadBuilder();
   }
   
   public static OrderDeletedMessagePayloadBuilder of(final OrderDeletedMessagePayload template) {
      OrderDeletedMessagePayloadBuilder builder = new OrderDeletedMessagePayloadBuilder();
      builder.order = template.getOrder();
      return builder;
   }
   
}