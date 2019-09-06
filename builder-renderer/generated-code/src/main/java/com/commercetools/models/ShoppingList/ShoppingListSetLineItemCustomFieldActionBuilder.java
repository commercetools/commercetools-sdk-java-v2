package com.commercetools.models.ShoppingList;

import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.ShoppingList.ShoppingListSetLineItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListSetLineItemCustomFieldActionBuilder {
   
   
   private java.lang.String lineItemId;
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public ShoppingListSetLineItemCustomFieldActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public ShoppingListSetLineItemCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public ShoppingListSetLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

   public ShoppingListSetLineItemCustomFieldAction build() {
       return new ShoppingListSetLineItemCustomFieldActionImpl(lineItemId, name, value);
   }
   
   public static ShoppingListSetLineItemCustomFieldActionBuilder of() {
      return new ShoppingListSetLineItemCustomFieldActionBuilder();
   }
   
   public static ShoppingListSetLineItemCustomFieldActionBuilder of(final ShoppingListSetLineItemCustomFieldAction template) {
      ShoppingListSetLineItemCustomFieldActionBuilder builder = new ShoppingListSetLineItemCustomFieldActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}