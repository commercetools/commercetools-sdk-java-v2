package com.commercetools.api.generated.models.shopping_list;

import com.commercetools.api.generated.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.generated.models.type.FieldContainer;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import com.commercetools.api.generated.models.shopping_list.ShoppingListSetTextLineItemCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListSetTextLineItemCustomTypeActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.api.generated.models.type.TypeResourceIdentifier type;
   
   
   private String textLineItemId;
   
   public ShoppingListSetTextLineItemCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.generated.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public ShoppingListSetTextLineItemCustomTypeActionBuilder type(@Nullable final com.commercetools.api.generated.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   public ShoppingListSetTextLineItemCustomTypeActionBuilder textLineItemId( final String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }
   
   
   public String getTextLineItemId(){
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