package com.commercetools.models.me;

import com.commercetools.models.me.MyShoppingListUpdateAction;
import com.commercetools.models.me.MyShoppingListSetDeleteDaysAfterLastModificationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder {
   
   @Nullable
   private Long deleteDaysAfterLastModification;
   
   public MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder deleteDaysAfterLastModification(@Nullable final Long deleteDaysAfterLastModification) {
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      return this;
   }
   
   @Nullable
   public Long getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }

   public MyShoppingListSetDeleteDaysAfterLastModificationAction build() {
       return new MyShoppingListSetDeleteDaysAfterLastModificationActionImpl(deleteDaysAfterLastModification);
   }
   
   public static MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder of() {
      return new MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder();
   }
   
   public static MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder of(final MyShoppingListSetDeleteDaysAfterLastModificationAction template) {
      MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder builder = new MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder();
      builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
      return builder;
   }
   
}