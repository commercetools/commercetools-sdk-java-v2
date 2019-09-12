package com.commercetools.models.CustomerGroup;

import com.commercetools.models.CustomerGroup.CustomerGroupUpdateAction;
import java.lang.String;
import com.commercetools.models.CustomerGroup.CustomerGroupSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerGroupSetKeyActionBuilder {
   
   @Nullable
   private java.lang.String key;
   
   public CustomerGroupSetKeyActionBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public CustomerGroupSetKeyAction build() {
       return new CustomerGroupSetKeyActionImpl(key);
   }
   
   public static CustomerGroupSetKeyActionBuilder of() {
      return new CustomerGroupSetKeyActionBuilder();
   }
   
   public static CustomerGroupSetKeyActionBuilder of(final CustomerGroupSetKeyAction template) {
      CustomerGroupSetKeyActionBuilder builder = new CustomerGroupSetKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}