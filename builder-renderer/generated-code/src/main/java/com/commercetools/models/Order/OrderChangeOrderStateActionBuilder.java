package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderState;
import com.commercetools.models.Order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.Order.OrderChangeOrderStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderChangeOrderStateActionBuilder {
   
   
   private com.commercetools.models.Order.OrderState orderState;
   
   public OrderChangeOrderStateActionBuilder orderState( final com.commercetools.models.Order.OrderState orderState) {
      this.orderState = orderState;
      return this;
   }
   
   
   public com.commercetools.models.Order.OrderState getOrderState(){
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