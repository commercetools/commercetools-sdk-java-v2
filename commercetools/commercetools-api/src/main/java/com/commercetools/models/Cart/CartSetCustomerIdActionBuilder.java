package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import java.lang.String;
import com.commercetools.models.cart.CartSetCustomerIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetCustomerIdActionBuilder {
   
   @Nullable
   private java.lang.String customerId;
   
   public CartSetCustomerIdActionBuilder customerId(@Nullable final java.lang.String customerId) {
      this.customerId = customerId;
      return this;
   }
   
   @Nullable
   public java.lang.String getCustomerId(){
      return this.customerId;
   }

   public CartSetCustomerIdAction build() {
       return new CartSetCustomerIdActionImpl(customerId);
   }
   
   public static CartSetCustomerIdActionBuilder of() {
      return new CartSetCustomerIdActionBuilder();
   }
   
   public static CartSetCustomerIdActionBuilder of(final CartSetCustomerIdAction template) {
      CartSetCustomerIdActionBuilder builder = new CartSetCustomerIdActionBuilder();
      builder.customerId = template.getCustomerId();
      return builder;
   }
   
}