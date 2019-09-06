package com.commercetools.models.CustomerGroup;

import com.commercetools.models.CustomerGroup.CustomerGroupUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.CustomerGroup.CustomerGroupSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerGroupSetCustomFieldActionBuilder {
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public CustomerGroupSetCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public CustomerGroupSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

   public CustomerGroupSetCustomFieldAction build() {
       return new CustomerGroupSetCustomFieldActionImpl(name, value);
   }
   
   public static CustomerGroupSetCustomFieldActionBuilder of() {
      return new CustomerGroupSetCustomFieldActionBuilder();
   }
   
   public static CustomerGroupSetCustomFieldActionBuilder of(final CustomerGroupSetCustomFieldAction template) {
      CustomerGroupSetCustomFieldActionBuilder builder = new CustomerGroupSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}