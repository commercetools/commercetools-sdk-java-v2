package com.commercetools.models.customer;

import com.commercetools.models.customer.Customer;
import com.commercetools.models.customer.CustomerSignInResult;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerSignInResultBuilder {
   
   @Nullable
   private Object cart;
   
   
   private com.commercetools.models.customer.Customer customer;
   
   public CustomerSignInResultBuilder cart(@Nullable final Object cart) {
      this.cart = cart;
      return this;
   }
   
   public CustomerSignInResultBuilder customer( final com.commercetools.models.customer.Customer customer) {
      this.customer = customer;
      return this;
   }
   
   @Nullable
   public Object getCart(){
      return this.cart;
   }
   
   
   public com.commercetools.models.customer.Customer getCustomer(){
      return this.customer;
   }

   public CustomerSignInResult build() {
       return new CustomerSignInResultImpl(cart, customer);
   }
   
   public static CustomerSignInResultBuilder of() {
      return new CustomerSignInResultBuilder();
   }
   
   public static CustomerSignInResultBuilder of(final CustomerSignInResult template) {
      CustomerSignInResultBuilder builder = new CustomerSignInResultBuilder();
      builder.cart = template.getCart();
      builder.customer = template.getCustomer();
      return builder;
   }
   
}