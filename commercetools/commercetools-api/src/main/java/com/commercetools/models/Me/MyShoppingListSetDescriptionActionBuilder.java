package com.commercetools.models.me;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.me.MyShoppingListUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyShoppingListSetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListSetDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.models.common.LocalizedString description;
   
   public MyShoppingListSetDescriptionActionBuilder description(@Nullable final com.commercetools.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }

   public MyShoppingListSetDescriptionAction build() {
       return new MyShoppingListSetDescriptionActionImpl(description);
   }
   
   public static MyShoppingListSetDescriptionActionBuilder of() {
      return new MyShoppingListSetDescriptionActionBuilder();
   }
   
   public static MyShoppingListSetDescriptionActionBuilder of(final MyShoppingListSetDescriptionAction template) {
      MyShoppingListSetDescriptionActionBuilder builder = new MyShoppingListSetDescriptionActionBuilder();
      builder.description = template.getDescription();
      return builder;
   }
   
}