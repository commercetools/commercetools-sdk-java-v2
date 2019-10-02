package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.models.cart_discount.StackingMode;
import com.commercetools.models.cart_discount.CartDiscountChangeStackingModeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountChangeStackingModeActionBuilder {
   
   
   private com.commercetools.models.cart_discount.StackingMode stackingMode;
   
   public CartDiscountChangeStackingModeActionBuilder stackingMode( final com.commercetools.models.cart_discount.StackingMode stackingMode) {
      this.stackingMode = stackingMode;
      return this;
   }
   
   
   public com.commercetools.models.cart_discount.StackingMode getStackingMode(){
      return this.stackingMode;
   }

   public CartDiscountChangeStackingModeAction build() {
       return new CartDiscountChangeStackingModeActionImpl(stackingMode);
   }
   
   public static CartDiscountChangeStackingModeActionBuilder of() {
      return new CartDiscountChangeStackingModeActionBuilder();
   }
   
   public static CartDiscountChangeStackingModeActionBuilder of(final CartDiscountChangeStackingModeAction template) {
      CartDiscountChangeStackingModeActionBuilder builder = new CartDiscountChangeStackingModeActionBuilder();
      builder.stackingMode = template.getStackingMode();
      return builder;
   }
   
}