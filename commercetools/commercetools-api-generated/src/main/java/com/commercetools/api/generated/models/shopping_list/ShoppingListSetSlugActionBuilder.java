package com.commercetools.api.generated.models.shopping_list;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListSetSlugAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListSetSlugActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString slug;
   
   public ShoppingListSetSlugActionBuilder slug(@Nullable final com.commercetools.api.generated.models.common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getSlug(){
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