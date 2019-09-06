package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.Order;
import java.lang.String;
import com.commercetools.models.Message.OrderImportedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderImportedMessagePayloadBuilder {
   
   
   private com.commercetools.models.Order.Order order;
   
   public OrderImportedMessagePayloadBuilder order( final com.commercetools.models.Order.Order order) {
      this.order = order;
      return this;
   }
   
   
   public com.commercetools.models.Order.Order getOrder(){
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