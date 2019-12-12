package com.commercetools.api.generated.models.shopping_list;

import com.commercetools.api.generated.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationAction;
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
public final class ShoppingListSetDeleteDaysAfterLastModificationActionBuilder {
   
   @Nullable
   private Long deleteDaysAfterLastModification;
   
   public ShoppingListSetDeleteDaysAfterLastModificationActionBuilder deleteDaysAfterLastModification(@Nullable final Long deleteDaysAfterLastModification) {
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      return this;
   }
   
   @Nullable
   public Long getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }

   public ShoppingListSetDeleteDaysAfterLastModificationAction build() {
       return new ShoppingListSetDeleteDaysAfterLastModificationActionImpl(deleteDaysAfterLastModification);
   }
   
   public static ShoppingListSetDeleteDaysAfterLastModificationActionBuilder of() {
      return new ShoppingListSetDeleteDaysAfterLastModificationActionBuilder();
   }
   
   public static ShoppingListSetDeleteDaysAfterLastModificationActionBuilder of(final ShoppingListSetDeleteDaysAfterLastModificationAction template) {
      ShoppingListSetDeleteDaysAfterLastModificationActionBuilder builder = new ShoppingListSetDeleteDaysAfterLastModificationActionBuilder();
      builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
      return builder;
   }
   
}