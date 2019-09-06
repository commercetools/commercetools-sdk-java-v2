package com.commercetools.models.ShoppingList;

import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
import com.commercetools.models.Type.FieldContainer;
import com.commercetools.models.Type.TypeResourceIdentifier;
import java.lang.String;
import com.commercetools.models.ShoppingList.ShoppingListSetTextLineItemCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListSetTextLineItemCustomTypeActionBuilder {
   
   @Nullable
   private com.commercetools.models.Type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.models.Type.TypeResourceIdentifier type;
   
   
   private java.lang.String textLineItemId;
   
   public ShoppingListSetTextLineItemCustomTypeActionBuilder fields(@Nullable final com.commercetools.models.Type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public ShoppingListSetTextLineItemCustomTypeActionBuilder type(@Nullable final com.commercetools.models.Type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   public ShoppingListSetTextLineItemCustomTypeActionBuilder textLineItemId( final java.lang.String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.models.Type.TypeResourceIdentifier getType(){
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