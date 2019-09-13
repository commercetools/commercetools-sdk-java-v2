package com.commercetools.models.shopping_list;

import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.models.type.FieldContainer;
import com.commercetools.models.type.TypeResourceIdentifier;
import java.lang.String;
import com.commercetools.models.shopping_list.ShoppingListSetTextLineItemCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListSetTextLineItemCustomTypeActionBuilder {
   
   @Nullable
   private com.commercetools.models.type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.models.type.TypeResourceIdentifier type;
   
   
   private java.lang.String textLineItemId;
   
   public ShoppingListSetTextLineItemCustomTypeActionBuilder fields(@Nullable final com.commercetools.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public ShoppingListSetTextLineItemCustomTypeActionBuilder type(@Nullable final com.commercetools.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   public ShoppingListSetTextLineItemCustomTypeActionBuilder textLineItemId( final java.lang.String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }
   
   
   public java.lang.String getTextLineItemId(){
      return this.textLineItemId;
   }

   public ShoppingListSetTextLineItemCustomTypeAction build() {
       return new ShoppingListSetTextLineItemCustomTypeActionImpl(fields, type, textLineItemId);
   }
   
   public static ShoppingListSetTextLineItemCustomTypeActionBuilder of() {
      return new ShoppingListSetTextLineItemCustomTypeActionBuilder();
   }
   
   public static ShoppingListSetTextLineItemCustomTypeActionBuilder of(final ShoppingListSetTextLineItemCustomTypeAction template) {
      ShoppingListSetTextLineItemCustomTypeActionBuilder builder = new ShoppingListSetTextLineItemCustomTypeActionBuilder();
      builder.fields = template.getFields();
      builder.type = template.getType();
      builder.textLineItemId = template.getTextLineItemId();
      return builder;
   }
   
}