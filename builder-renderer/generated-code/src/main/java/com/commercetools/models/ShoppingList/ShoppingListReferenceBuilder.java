package com.commercetools.models.ShoppingList;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.ShoppingList.ShoppingList;
import com.commercetools.models.ShoppingList.ShoppingListReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.ShoppingList.ShoppingList obj;
   
   public ShoppingListReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ShoppingListReferenceBuilder obj(@Nullable final com.commercetools.models.ShoppingList.ShoppingList obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.ShoppingList.ShoppingList getObj(){
      return this.obj;
   }

   public ShoppingListReference build() {
       return new ShoppingListReferenceImpl(id, obj);
   }
   
   public static ShoppingListReferenceBuilder of() {
      return new ShoppingListReferenceBuilder();
   }
   
   public static ShoppingListReferenceBuilder of(final ShoppingListReference template) {
      ShoppingListReferenceBuilder builder = new ShoppingListReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}