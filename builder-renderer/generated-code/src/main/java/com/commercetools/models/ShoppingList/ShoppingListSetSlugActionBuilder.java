package com.commercetools.models.ShoppingList;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
import java.lang.String;
import com.commercetools.models.ShoppingList.ShoppingListSetSlugAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListSetSlugActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString slug;
   
   public ShoppingListSetSlugActionBuilder slug(@Nullable final com.commercetools.models.Common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getSlug(){
      return this.slug;
   }

   public ShoppingListSetSlugAction build() {
       return new ShoppingListSetSlugActionImpl(slug);
   }
   
   public static ShoppingListSetSlugActionBuilder of() {
      return new ShoppingListSetSlugActionBuilder();
   }
   
   public static ShoppingListSetSlugActionBuilder of(final ShoppingListSetSlugAction template) {
      ShoppingListSetSlugActionBuilder builder = new ShoppingListSetSlugActionBuilder();
      builder.slug = template.getSlug();
      return builder;
   }
   
}