package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountTarget;
import java.lang.String;
import com.commercetools.models.CartDiscount.CartDiscountShippingCostTarget;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountShippingCostTargetBuilder {
   
   
   

   public CartDiscountShippingCostTarget build() {
       return new CartDiscountShippingCostTargetImpl();
   }
   
   public static CartDiscountShippingCostTargetBuilder of() {
      return new CartDiscountShippingCostTargetBuilder();
   }
   
   public static CartDiscountShippingCostTargetBuilder of(final CartDiscountShippingCostTarget template) {
      CartDiscountShippingCostTargetBuilder builder = new CartDiscountShippingCostTargetBuilder();
      return builder;
   }
   
}