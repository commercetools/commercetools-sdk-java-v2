package com.commercetools.models.ShoppingList;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
import java.lang.String;
import com.commercetools.models.ShoppingList.ShoppingListChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListChangeNameActionBuilder {
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   public ShoppingListChangeNameActionBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }

   public ShoppingListChangeNameAction build() {
       return new ShoppingListChangeNameActionImpl(name);
   }
   
   public static ShoppingListChangeNameActionBuilder of() {
      return new ShoppingListChangeNameActionBuilder();
   }
   
   public static ShoppingListChangeNameActionBuilder of(final ShoppingListChangeNameAction template) {
      ShoppingListChangeNameActionBuilder builder = new ShoppingListChangeNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}