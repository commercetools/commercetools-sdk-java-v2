package com.commercetools.models.me;

import com.commercetools.models.me.MyShoppingListUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.me.MyShoppingListSetDeleteDaysAfterLastModificationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder {
   
   @Nullable
   private java.lang.Long deleteDaysAfterLastModification;
   
   public MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder deleteDaysAfterLastModification(@Nullable final java.lang.Long deleteDaysAfterLastModification) {
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      return this;
   }
   
   @Nullable
   public java.lang.Long getDeleteDaysAfterLastModification(){
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