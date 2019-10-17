package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.order.OrderSetOrderNumberAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetOrderNumberActionBuilder {
   
   @Nullable
   private String orderNumber;
   
   public OrderSetOrderNumberActionBuilder orderNumber(@Nullable final String orderNumber) {
      this.orderNumber = orderNumber;
      return this;
   }
   
   @Nullable
   public String getOrderNumber(){
      return this.orderNumber;
   }

   public OrderSetOrderNumberAction build() {
       return new OrderSetOrderNumberActionImpl(orderNumber);
   }
   
   public static OrderSetOrderNumberActionBuilder of() {
      return new OrderSetOrderNumberActionBuilder();
   }
   
   public static OrderSetOrderNumberActionBuilder of(final OrderSetOrderNumberAction template) {
      OrderSetOrderNumberActionBuilder builder = new OrderSetOrderNumberActionBuilder();
      builder.orderNumber = template.getOrderNumber();
      return builder;
   }
   
}