package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Customer.CustomerSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerSetCustomFieldActionBuilder {
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public CustomerSetCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public CustomerSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.Object getValue(){
      return this.value;
   }

   public CustomerSetCustomFieldAction build() {
       return new CustomerSetCustomFieldActionImpl(name, value);
   }
   
   public static CustomerSetCustomFieldActionBuilder of() {
      return new CustomerSetCustomFieldActionBuilder();
   }
   
   public static CustomerSetCustomFieldActionBuilder of(final CustomerSetCustomFieldAction template) {
      CustomerSetCustomFieldActionBuilder builder = new CustomerSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}