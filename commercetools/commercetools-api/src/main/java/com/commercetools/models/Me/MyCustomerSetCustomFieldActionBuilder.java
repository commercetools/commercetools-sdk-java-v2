package com.commercetools.models.me;

import com.commercetools.models.me.MyCustomerUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.me.MyCustomerSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerSetCustomFieldActionBuilder {
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public MyCustomerSetCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public MyCustomerSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

   public MyCustomerSetCustomFieldAction build() {
       return new MyCustomerSetCustomFieldActionImpl(name, value);
   }
   
   public static MyCustomerSetCustomFieldActionBuilder of() {
      return new MyCustomerSetCustomFieldActionBuilder();
   }
   
   public static MyCustomerSetCustomFieldActionBuilder of(final MyCustomerSetCustomFieldAction template) {
      MyCustomerSetCustomFieldActionBuilder builder = new MyCustomerSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}