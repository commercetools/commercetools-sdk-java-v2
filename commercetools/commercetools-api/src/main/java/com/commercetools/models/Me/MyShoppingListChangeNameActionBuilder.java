package com.commercetools.models.me;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.me.MyShoppingListUpdateAction;
import com.commercetools.models.me.MyShoppingListChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListChangeNameActionBuilder {
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   public MyShoppingListChangeNameActionBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
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