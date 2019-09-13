package com.commercetools.models.customer;

import com.commercetools.models.customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.customer.CustomerChangeEmailAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerChangeEmailActionBuilder {
   
   
   private java.lang.String email;
   
   public CustomerChangeEmailActionBuilder email( final java.lang.String email) {
      this.email = email;
      return this;
   }
   
   
   public java.lang.String getEmail(){
      return this.email;
   }

   public CustomerChangeEmailAction build() {
       return new CustomerChangeEmailActionImpl(email);
   }
   
   public static CustomerChangeEmailActionBuilder of() {
      return new CustomerChangeEmailActionBuilder();
   }
   
   public static CustomerChangeEmailActionBuilder of(final CustomerChangeEmailAction template) {
      CustomerChangeEmailActionBuilder builder = new CustomerChangeEmailActionBuilder();
      builder.email = template.getEmail();
      return builder;
   }
   
}