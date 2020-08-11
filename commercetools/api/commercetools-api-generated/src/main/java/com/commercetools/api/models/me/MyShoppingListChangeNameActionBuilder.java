package com.commercetools.api.models.me;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.me.MyShoppingListChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyShoppingListChangeNameActionBuilder {
   
   
   private com.commercetools.api.models.common.LocalizedString name;
   
   public MyShoppingListChangeNameActionBuilder name( final com.commercetools.api.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }

   public MyShoppingListChangeNameAction build() {
       return new MyShoppingListChangeNameActionImpl(name);
   }
   
   public static MyShoppingListChangeNameActionBuilder of() {
      return new MyShoppingListChangeNameActionBuilder();
   }
   
   public static MyShoppingListChangeNameActionBuilder of(final MyShoppingListChangeNameAction template) {
      MyShoppingListChangeNameActionBuilder builder = new MyShoppingListChangeNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}
