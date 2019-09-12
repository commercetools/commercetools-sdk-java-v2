package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Customer.CustomerSetMiddleNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerSetMiddleNameActionBuilder {
   
   @Nullable
   private java.lang.String middleName;
   
   public CustomerSetMiddleNameActionBuilder middleName(@Nullable final java.lang.String middleName) {
      this.middleName = middleName;
      return this;
   }
   
   @Nullable
   public java.lang.String getMiddleName(){
      return this.middleName;
   }

   public CustomerSetMiddleNameAction build() {
       return new CustomerSetMiddleNameActionImpl(middleName);
   }
   
   public static CustomerSetMiddleNameActionBuilder of() {
      return new CustomerSetMiddleNameActionBuilder();
   }
   
   public static CustomerSetMiddleNameActionBuilder of(final CustomerSetMiddleNameAction template) {
      CustomerSetMiddleNameActionBuilder builder = new CustomerSetMiddleNameActionBuilder();
      builder.middleName = template.getMiddleName();
      return builder;
   }
   
}