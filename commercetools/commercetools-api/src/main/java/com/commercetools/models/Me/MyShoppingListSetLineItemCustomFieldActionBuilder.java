package com.commercetools.models.me;

import com.commercetools.models.me.MyShoppingListUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.me.MyShoppingListSetLineItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListSetLineItemCustomFieldActionBuilder {
   
   
   private java.lang.String lineItemId;
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public MyShoppingListSetLineItemCustomFieldActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public MyShoppingListSetLineItemCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public MyShoppingListSetLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.Object getValue(){
      return this.value;
   }

   public MyShoppingListSetLineItemCustomFieldAction build() {
       return new MyShoppingListSetLineItemCustomFieldActionImpl(lineItemId, name, value);
   }
   
   public static MyShoppingListSetLineItemCustomFieldActionBuilder of() {
      return new MyShoppingListSetLineItemCustomFieldActionBuilder();
   }
   
   public static MyShoppingListSetLineItemCustomFieldActionBuilder of(final MyShoppingListSetLineItemCustomFieldAction template) {
      MyShoppingListSetLineItemCustomFieldActionBuilder builder = new MyShoppingListSetLineItemCustomFieldActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}