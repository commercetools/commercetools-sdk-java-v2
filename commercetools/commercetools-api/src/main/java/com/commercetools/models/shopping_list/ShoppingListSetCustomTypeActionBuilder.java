package com.commercetools.models.shopping_list;

import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.models.type.FieldContainer;
import com.commercetools.models.type.TypeResourceIdentifier;
import java.lang.String;
import com.commercetools.models.shopping_list.ShoppingListSetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListSetCustomTypeActionBuilder {
   
   @Nullable
   private com.commercetools.models.type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.models.type.TypeResourceIdentifier type;
   
   public ShoppingListSetCustomTypeActionBuilder fields(@Nullable final com.commercetools.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public ShoppingListSetCustomTypeActionBuilder type(@Nullable final com.commercetools.models.type.TypeResourceIdentifier type) {
      this.type = type;
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

   public ShoppingListSetCustomTypeAction build() {
       return new ShoppingListSetCustomTypeActionImpl(fields, type);
   }
   
   public static ShoppingListSetCustomTypeActionBuilder of() {
      return new ShoppingListSetCustomTypeActionBuilder();
   }
   
   public static ShoppingListSetCustomTypeActionBuilder of(final ShoppingListSetCustomTypeAction template) {
      ShoppingListSetCustomTypeActionBuilder builder = new ShoppingListSetCustomTypeActionBuilder();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}