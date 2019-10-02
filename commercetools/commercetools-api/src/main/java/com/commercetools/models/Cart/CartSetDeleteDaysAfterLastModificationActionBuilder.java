package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.CartSetDeleteDaysAfterLastModificationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetDeleteDaysAfterLastModificationActionBuilder {
   
   @Nullable
   private Integer deleteDaysAfterLastModification;
   
   public CartSetDeleteDaysAfterLastModificationActionBuilder deleteDaysAfterLastModification(@Nullable final Integer deleteDaysAfterLastModification) {
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      return this;
   }
   
   @Nullable
   public Integer getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }

   public CartSetDeleteDaysAfterLastModificationAction build() {
       return new CartSetDeleteDaysAfterLastModificationActionImpl(deleteDaysAfterLastModification);
   }
   
   public static CartSetDeleteDaysAfterLastModificationActionBuilder of() {
      return new CartSetDeleteDaysAfterLastModificationActionBuilder();
   }
   
   public static CartSetDeleteDaysAfterLastModificationActionBuilder of(final CartSetDeleteDaysAfterLastModificationAction template) {
      CartSetDeleteDaysAfterLastModificationActionBuilder builder = new CartSetDeleteDaysAfterLastModificationActionBuilder();
      builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
      return builder;
   }
   
}