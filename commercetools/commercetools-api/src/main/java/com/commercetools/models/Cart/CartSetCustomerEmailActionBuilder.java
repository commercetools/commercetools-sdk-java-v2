package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import java.lang.String;
import com.commercetools.models.cart.CartSetCustomerEmailAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetCustomerEmailActionBuilder {
   
   
   private java.lang.String email;
   
   public CartSetCustomerEmailActionBuilder email( final java.lang.String email) {
      this.email = email;
      return this;
   }
   
   
   public java.lang.String getEmail(){
      return this.email;
   }

   public CartSetCustomerEmailAction build() {
       return new CartSetCustomerEmailActionImpl(email);
   }
   
   public static CartSetCustomerEmailActionBuilder of() {
      return new CartSetCustomerEmailActionBuilder();
   }
   
   public static CartSetCustomerEmailActionBuilder of(final CartSetCustomerEmailAction template) {
      CartSetCustomerEmailActionBuilder builder = new CartSetCustomerEmailActionBuilder();
      builder.email = template.getEmail();
      return builder;
   }
   
}