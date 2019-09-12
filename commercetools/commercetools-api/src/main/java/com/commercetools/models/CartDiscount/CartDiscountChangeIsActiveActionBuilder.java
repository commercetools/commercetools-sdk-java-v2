package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.CartDiscount.CartDiscountChangeIsActiveAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountChangeIsActiveActionBuilder {
   
   
   private java.lang.Boolean isActive;
   
   public CartDiscountChangeIsActiveActionBuilder isActive( final java.lang.Boolean isActive) {
      this.isActive = isActive;
      return this;
   }
   
   
   public java.lang.Boolean getIsActive(){
      return this.isActive;
   }

   public CartDiscountChangeIsActiveAction build() {
       return new CartDiscountChangeIsActiveActionImpl(isActive);
   }
   
   public static CartDiscountChangeIsActiveActionBuilder of() {
      return new CartDiscountChangeIsActiveActionBuilder();
   }
   
   public static CartDiscountChangeIsActiveActionBuilder of(final CartDiscountChangeIsActiveAction template) {
      CartDiscountChangeIsActiveActionBuilder builder = new CartDiscountChangeIsActiveActionBuilder();
      builder.isActive = template.getIsActive();
      return builder;
   }
   
}