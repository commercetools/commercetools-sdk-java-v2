package com.commercetools.models.shopping_list;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
import java.lang.String;
import com.commercetools.models.shopping_list.ShoppingListSetSlugAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListSetSlugActionBuilder {
   
   @Nullable
   private com.commercetools.models.common.LocalizedString slug;
   
   public ShoppingListSetSlugActionBuilder slug(@Nullable final com.commercetools.models.common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getSlug(){
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