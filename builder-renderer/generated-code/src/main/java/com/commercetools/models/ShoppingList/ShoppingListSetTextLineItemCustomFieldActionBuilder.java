package com.commercetools.models.ShoppingList;

import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.ShoppingList.ShoppingListSetTextLineItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListSetTextLineItemCustomFieldActionBuilder {
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   
   private java.lang.String textLineItemId;
   
   public ShoppingListSetTextLineItemCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public ShoppingListSetTextLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   public ShoppingListSetTextLineItemCustomFieldActionBuilder textLineItemId( final java.lang.String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.Object getValue(){
      return this.value;
   }
   
   
   public java.lang.String getTextLineItemId(){
      return this.textLineItemId;
   }

   public ShoppingListSetTextLineItemCustomFieldAction build() {
       return new ShoppingListSetTextLineItemCustomFieldActionImpl(name, value, textLineItemId);
   }
   
   public static ShoppingListSetTextLineItemCustomFieldActionBuilder of() {
      return new ShoppingListSetTextLineItemCustomFieldActionBuilder();
   }
   
   public static ShoppingListSetTextLineItemCustomFieldActionBuilder of(final ShoppingListSetTextLineItemCustomFieldAction template) {
      ShoppingListSetTextLineItemCustomFieldActionBuilder builder = new ShoppingListSetTextLineItemCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      builder.textLineItemId = template.getTextLineItemId();
      return builder;
   }
   
}