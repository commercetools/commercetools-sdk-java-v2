package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order.OrderSetCustomerIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetCustomerIdActionBuilder {
   
   @Nullable
   private java.lang.String customerId;
   
   public OrderSetCustomerIdActionBuilder customerId(@Nullable final java.lang.String customerId) {
      this.customerId = customerId;
      return this;
   }
   
   @Nullable
   public java.lang.String getCustomerId(){
      return this.customerId;
   }

   public OrderSetCustomerIdAction build() {
       return new OrderSetCustomerIdActionImpl(customerId);
   }
   
   public static OrderSetCustomerIdActionBuilder of() {
      return new OrderSetCustomerIdActionBuilder();
   }
   
   public static OrderSetCustomerIdActionBuilder of(final OrderSetCustomerIdAction template) {
      OrderSetCustomerIdActionBuilder builder = new OrderSetCustomerIdActionBuilder();
      builder.customerId = template.getCustomerId();
      return builder;
   }
   
}