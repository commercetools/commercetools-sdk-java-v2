package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.order.Order;
import java.lang.String;
import com.commercetools.models.message.OrderImportedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderImportedMessagePayloadBuilder {
   
   
   private com.commercetools.models.order.Order order;
   
   public OrderImportedMessagePayloadBuilder order( final com.commercetools.models.order.Order order) {
      this.order = order;
      return this;
   }
   
   
   public com.commercetools.models.order.Order getOrder(){
      return this.order;
   }

   public OrderImportedMessagePayload build() {
       return new OrderImportedMessagePayloadImpl(order);
   }
   
   public static OrderImportedMessagePayloadBuilder of() {
      return new OrderImportedMessagePayloadBuilder();
   }
   
   public static OrderImportedMessagePayloadBuilder of(final OrderImportedMessagePayload template) {
      OrderImportedMessagePayloadBuilder builder = new OrderImportedMessagePayloadBuilder();
      builder.order = template.getOrder();
      return builder;
   }
   
}