package com.commercetools.models.ShoppingList;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Common.ResourceIdentifier;
import com.commercetools.models.ShoppingList.ShoppingListResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListResourceIdentifierBuilder {
   
   @Nullable
   private java.lang.String id;
   
   @Nullable
   private java.lang.String key;
   
   public ShoppingListResourceIdentifierBuilder id(@Nullable final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ShoppingListResourceIdentifierBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public ShoppingListResourceIdentifier build() {
       return new ShoppingListResourceIdentifierImpl(id, key);
   }
   
   public static ShoppingListResourceIdentifierBuilder of() {
      return new ShoppingListResourceIdentifierBuilder();
   }
   
   public static ShoppingListResourceIdentifierBuilder of(final ShoppingListResourceIdentifier template) {
      ShoppingListResourceIdentifierBuilder builder = new ShoppingListResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}