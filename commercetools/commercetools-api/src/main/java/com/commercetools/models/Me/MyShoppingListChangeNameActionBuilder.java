package com.commercetools.models.Me;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Me.MyShoppingListUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyShoppingListChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListChangeNameActionBuilder {
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   public MyShoppingListChangeNameActionBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
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