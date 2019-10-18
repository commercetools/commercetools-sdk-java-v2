package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.Order;
import com.commercetools.api.generated.models.message.OrderImportedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderImportedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.order.Order order;
   
   public OrderImportedMessagePayloadBuilder order( final com.commercetools.api.generated.models.order.Order order) {
      this.order = order;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.order.Order getOrder(){
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