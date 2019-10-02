package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.order.OrderSetCustomerIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetCustomerIdActionBuilder {
   
   @Nullable
   private String customerId;
   
   public OrderSetCustomerIdActionBuilder customerId(@Nullable final String customerId) {
      this.customerId = customerId;
      return this;
   }
   
   @Nullable
   public String getCustomerId(){
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