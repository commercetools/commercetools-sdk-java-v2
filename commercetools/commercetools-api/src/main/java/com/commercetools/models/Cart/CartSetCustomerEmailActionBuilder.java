package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import java.lang.String;
import com.commercetools.models.Cart.CartSetCustomerEmailAction;
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