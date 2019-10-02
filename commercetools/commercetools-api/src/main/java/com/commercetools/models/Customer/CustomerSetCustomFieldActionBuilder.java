package com.commercetools.models.customer;

import com.commercetools.models.customer.CustomerUpdateAction;
import com.commercetools.models.customer.CustomerSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerSetCustomFieldActionBuilder {
   
   
   private String name;
   
   @Nullable
   private Object value;
   
   public CustomerSetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public CustomerSetCustomFieldActionBuilder value(@Nullable final Object value) {
      this.value = value;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public Object getValue(){
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