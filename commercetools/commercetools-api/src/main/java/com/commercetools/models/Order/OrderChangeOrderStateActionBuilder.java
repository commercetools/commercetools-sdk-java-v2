package com.commercetools.models.order;

import com.commercetools.models.order.OrderState;
import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.order.OrderChangeOrderStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderChangeOrderStateActionBuilder {
   
   
   private com.commercetools.models.order.OrderState orderState;
   
   public OrderChangeOrderStateActionBuilder orderState( final com.commercetools.models.order.OrderState orderState) {
      this.orderState = orderState;
      return this;
   }
   
   
   public com.commercetools.models.order.OrderState getOrderState(){
      return this.orderState;
   }

   public OrderChangeOrderStateAction build() {
       return new OrderChangeOrderStateActionImpl(orderState);
   }
   
   public static OrderChangeOrderStateActionBuilder of() {
      return new OrderChangeOrderStateActionBuilder();
   }
   
   public static OrderChangeOrderStateActionBuilder of(final OrderChangeOrderStateAction template) {
      OrderChangeOrderStateActionBuilder builder = new OrderChangeOrderStateActionBuilder();
      builder.orderState = template.getOrderState();
      return builder;
   }
   
}