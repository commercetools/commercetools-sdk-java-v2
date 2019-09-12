package com.commercetools.models.Me;

import com.commercetools.models.Me.MyShoppingListUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Me.MyShoppingListSetTextLineItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListSetTextLineItemCustomFieldActionBuilder {
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   
   private java.lang.String textLineItemId;
   
   public MyShoppingListSetTextLineItemCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public MyShoppingListSetTextLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   public MyShoppingListSetTextLineItemCustomFieldActionBuilder textLineItemId( final java.lang.String textLineItemId) {
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

   public MyShoppingListSetTextLineItemCustomFieldAction build() {
       return new MyShoppingListSetTextLineItemCustomFieldActionImpl(name, value, textLineItemId);
   }
   
   public static MyShoppingListSetTextLineItemCustomFieldActionBuilder of() {
      return new MyShoppingListSetTextLineItemCustomFieldActionBuilder();
   }
   
   public static MyShoppingListSetTextLineItemCustomFieldActionBuilder of(final MyShoppingListSetTextLineItemCustomFieldAction template) {
      MyShoppingListSetTextLineItemCustomFieldActionBuilder builder = new MyShoppingListSetTextLineItemCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      builder.textLineItemId = template.getTextLineItemId();
      return builder;
   }
   
}