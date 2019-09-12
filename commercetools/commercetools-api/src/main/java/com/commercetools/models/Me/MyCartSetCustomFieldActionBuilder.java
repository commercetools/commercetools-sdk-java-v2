package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCartUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Me.MyCartSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartSetCustomFieldActionBuilder {
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public MyCartSetCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public MyCartSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

   public MyCartSetCustomFieldAction build() {
       return new MyCartSetCustomFieldActionImpl(name, value);
   }
   
   public static MyCartSetCustomFieldActionBuilder of() {
      return new MyCartSetCustomFieldActionBuilder();
   }
   
   public static MyCartSetCustomFieldActionBuilder of(final MyCartSetCustomFieldAction template) {
      MyCartSetCustomFieldActionBuilder builder = new MyCartSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}