package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Cart.CartSetDeleteDaysAfterLastModificationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetDeleteDaysAfterLastModificationActionBuilder {
   
   @Nullable
   private java.lang.Integer deleteDaysAfterLastModification;
   
   public CartSetDeleteDaysAfterLastModificationActionBuilder deleteDaysAfterLastModification(@Nullable final java.lang.Integer deleteDaysAfterLastModification) {
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      return this;
   }
   
   @Nullable
   public java.lang.Integer getDeleteDaysAfterLastModification(){
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