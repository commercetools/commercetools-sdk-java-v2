package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.Order;
import com.commercetools.api.generated.models.message.OrderDeletedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderDeletedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.order.Order order;
   
   public OrderDeletedMessagePayloadBuilder order( final com.commercetools.api.generated.models.order.Order order) {
      this.order = order;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.order.Order getOrder(){
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