package com.commercetools.models.customer;

import com.commercetools.models.customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.customer.CustomerSetFirstNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerSetFirstNameActionBuilder {
   
   @Nullable
   private java.lang.String firstName;
   
   public CustomerSetFirstNameActionBuilder firstName(@Nullable final java.lang.String firstName) {
      this.firstName = firstName;
      return this;
   }
   
   @Nullable
   public java.lang.String getFirstName(){
      return this.firstName;
   }

   public CustomerSetFirstNameAction build() {
       return new CustomerSetFirstNameActionImpl(firstName);
   }
   
   public static CustomerSetFirstNameActionBuilder of() {
      return new CustomerSetFirstNameActionBuilder();
   }
   
   public static CustomerSetFirstNameActionBuilder of(final CustomerSetFirstNameAction template) {
      CustomerSetFirstNameActionBuilder builder = new CustomerSetFirstNameActionBuilder();
      builder.firstName = template.getFirstName();
      return builder;
   }
   
}