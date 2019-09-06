package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.Order.OrderSetCustomerEmailAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetCustomerEmailActionBuilder {
   
   @Nullable
   private java.lang.String email;
   
   public OrderSetCustomerEmailActionBuilder email(@Nullable final java.lang.String email) {
      this.email = email;
      return this;
   }
   
   @Nullable
   public java.lang.String getEmail(){
      return this.email;
   }

   public OrderSetCustomerEmailAction build() {
       return new OrderSetCustomerEmailActionImpl(email);
   }
   
   public static OrderSetCustomerEmailActionBuilder of() {
      return new OrderSetCustomerEmailActionBuilder();
   }
   
   public static OrderSetCustomerEmailActionBuilder of(final OrderSetCustomerEmailAction template) {
      OrderSetCustomerEmailActionBuilder builder = new OrderSetCustomerEmailActionBuilder();
      builder.email = template.getEmail();
      return builder;
   }
   
}