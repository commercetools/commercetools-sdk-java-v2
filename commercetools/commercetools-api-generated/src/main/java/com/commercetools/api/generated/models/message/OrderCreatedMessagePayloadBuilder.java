package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.Order;
import com.commercetools.api.generated.models.message.OrderCreatedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderCreatedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.order.Order order;
   
   public OrderCreatedMessagePayloadBuilder order( final com.commercetools.api.generated.models.order.Order order) {
      this.order = order;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.order.Order getOrder(){
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