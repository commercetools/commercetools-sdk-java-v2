package com.commercetools.models.shopping_list;

import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListSetDeleteDaysAfterLastModificationActionBuilder {
   
   @Nullable
   private java.lang.Long deleteDaysAfterLastModification;
   
   public ShoppingListSetDeleteDaysAfterLastModificationActionBuilder deleteDaysAfterLastModification(@Nullable final java.lang.Long deleteDaysAfterLastModification) {
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      return this;
   }
   
   @Nullable
   public java.lang.Long getDeleteDaysAfterLastModification(){
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