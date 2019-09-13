package com.commercetools.models.me;

import com.commercetools.models.me.MyShoppingListUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.me.MyShoppingListSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListSetCustomFieldActionBuilder {
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public MyShoppingListSetCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public MyShoppingListSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

   public MyShoppingListSetCustomFieldAction build() {
       return new MyShoppingListSetCustomFieldActionImpl(name, value);
   }
   
   public static MyShoppingListSetCustomFieldActionBuilder of() {
      return new MyShoppingListSetCustomFieldActionBuilder();
   }
   
   public static MyShoppingListSetCustomFieldActionBuilder of(final MyShoppingListSetCustomFieldAction template) {
      MyShoppingListSetCustomFieldActionBuilder builder = new MyShoppingListSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}