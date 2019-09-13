package com.commercetools.models.shopping_list;

import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
import java.lang.String;
import com.commercetools.models.shopping_list.ShoppingListSetAnonymousIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListSetAnonymousIdActionBuilder {
   
   @Nullable
   private java.lang.String anonymousId;
   
   public ShoppingListSetAnonymousIdActionBuilder anonymousId(@Nullable final java.lang.String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   @Nullable
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }

   public ShoppingListSetAnonymousIdAction build() {
       return new ShoppingListSetAnonymousIdActionImpl(anonymousId);
   }
   
   public static ShoppingListSetAnonymousIdActionBuilder of() {
      return new ShoppingListSetAnonymousIdActionBuilder();
   }
   
   public static ShoppingListSetAnonymousIdActionBuilder of(final ShoppingListSetAnonymousIdAction template) {
      ShoppingListSetAnonymousIdActionBuilder builder = new ShoppingListSetAnonymousIdActionBuilder();
      builder.anonymousId = template.getAnonymousId();
      return builder;
   }
   
}