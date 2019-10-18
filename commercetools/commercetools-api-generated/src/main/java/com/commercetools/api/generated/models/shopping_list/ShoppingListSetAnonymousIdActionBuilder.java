package com.commercetools.api.generated.models.shopping_list;

import com.commercetools.api.generated.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListSetAnonymousIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListSetAnonymousIdActionBuilder {
   
   @Nullable
   private String anonymousId;
   
   public ShoppingListSetAnonymousIdActionBuilder anonymousId(@Nullable final String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   @Nullable
   public String getAnonymousId(){
      return this.anonymousId;
   }

   public ShoppingListSetAnonymousIdAction build() {
       return new ShoppingListSetAnonymousIdActionImpl(anonymousId);
   }
   
   public static ShoppingListSetAnonymousIdActionBuilder of() {
      return new ShoppingListSetAnonymousIdActionBuilder();
   }
   
   public static ShoppingListSetAnonymousIdActionBuilder of(final ShoppingListSetAnonymousIdAction template) {
      ShoppingListSetAnonymousIdActionBuilder builder = new ShoppingListSetAnonymousIdActionBuilder();
      builder.anonymousId = template.getAnonymousId();
      return builder;
   }
   
}