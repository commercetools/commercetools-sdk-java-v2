package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.generated.models.me.MyShoppingListSetDescriptionAction;
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
public final class MyShoppingListSetDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   public MyShoppingListSetDescriptionActionBuilder description(@Nullable final com.commercetools.api.generated.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
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