package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountUpdateAction;
import com.commercetools.models.CartDiscount.StackingMode;
import java.lang.String;
import com.commercetools.models.CartDiscount.CartDiscountChangeStackingModeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountChangeStackingModeActionBuilder {
   
   
   private com.commercetools.models.CartDiscount.StackingMode stackingMode;
   
   public CartDiscountChangeStackingModeActionBuilder stackingMode( final com.commercetools.models.CartDiscount.StackingMode stackingMode) {
      this.stackingMode = stackingMode;
      return this;
   }
   
   
   public com.commercetools.models.CartDiscount.StackingMode getStackingMode(){
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