package com.commercetools.models.ShoppingList;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
import java.lang.String;
import com.commercetools.models.ShoppingList.ShoppingListSetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListSetDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   public ShoppingListSetDescriptionActionBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }

   public ShoppingListSetDescriptionAction build() {
       return new ShoppingListSetDescriptionActionImpl(description);
   }
   
   public static ShoppingListSetDescriptionActionBuilder of() {
      return new ShoppingListSetDescriptionActionBuilder();
   }
   
   public static ShoppingListSetDescriptionActionBuilder of(final ShoppingListSetDescriptionAction template) {
      ShoppingListSetDescriptionActionBuilder builder = new ShoppingListSetDescriptionActionBuilder();
      builder.description = template.getDescription();
      return builder;
   }
   
}