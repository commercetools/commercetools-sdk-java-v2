package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order.OrderSetOrderNumberAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetOrderNumberActionBuilder {
   
   @Nullable
   private java.lang.String orderNumber;
   
   public OrderSetOrderNumberActionBuilder orderNumber(@Nullable final java.lang.String orderNumber) {
      this.orderNumber = orderNumber;
      return this;
   }
   
   @Nullable
   public java.lang.String getOrderNumber(){
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