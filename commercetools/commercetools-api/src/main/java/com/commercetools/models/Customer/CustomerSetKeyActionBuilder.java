package com.commercetools.models.customer;

import com.commercetools.models.customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.customer.CustomerSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerSetKeyActionBuilder {
   
   @Nullable
   private java.lang.String key;
   
   public CustomerSetKeyActionBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public CustomerSetKeyAction build() {
       return new CustomerSetKeyActionImpl(key);
   }
   
   public static CustomerSetKeyActionBuilder of() {
      return new CustomerSetKeyActionBuilder();
   }
   
   public static CustomerSetKeyActionBuilder of(final CustomerSetKeyAction template) {
      CustomerSetKeyActionBuilder builder = new CustomerSetKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}