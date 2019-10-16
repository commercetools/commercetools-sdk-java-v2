package com.commercetools.api.generated.models.shopping_list;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListChangeNameActionBuilder {
   
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   public ShoppingListChangeNameActionBuilder name( final com.commercetools.api.generated.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
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