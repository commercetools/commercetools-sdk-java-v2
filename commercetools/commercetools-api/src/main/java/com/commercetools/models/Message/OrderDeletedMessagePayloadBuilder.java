package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.Order;
import java.lang.String;
import com.commercetools.models.Message.OrderDeletedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderDeletedMessagePayloadBuilder {
   
   
   private com.commercetools.models.Order.Order order;
   
   public OrderDeletedMessagePayloadBuilder order( final com.commercetools.models.Order.Order order) {
      this.order = order;
      return this;
   }
   
   
   public com.commercetools.models.Order.Order getOrder(){
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