package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.models.cart_discount.CartDiscountChangeIsActiveAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountChangeIsActiveActionBuilder {
   
   
   private Boolean isActive;
   
   public CartDiscountChangeIsActiveActionBuilder isActive( final Boolean isActive) {
      this.isActive = isActive;
      return this;
   }
   
   
   public Boolean getIsActive(){
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