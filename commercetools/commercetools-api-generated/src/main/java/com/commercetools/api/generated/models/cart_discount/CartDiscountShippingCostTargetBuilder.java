package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.generated.models.cart_discount.CartDiscountShippingCostTarget;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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