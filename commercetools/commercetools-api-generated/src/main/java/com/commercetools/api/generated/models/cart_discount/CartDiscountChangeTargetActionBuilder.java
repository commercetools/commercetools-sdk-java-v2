package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.generated.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.generated.models.cart_discount.CartDiscountChangeTargetAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountChangeTargetActionBuilder {
   
   
   private com.commercetools.api.generated.models.cart_discount.CartDiscountTarget target;
   
   public CartDiscountChangeTargetActionBuilder target( final com.commercetools.api.generated.models.cart_discount.CartDiscountTarget target) {
      this.target = target;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.cart_discount.CartDiscountTarget getTarget(){
      return this.target;
   }

   public CartDiscountChangeTargetAction build() {
       return new CartDiscountChangeTargetActionImpl(target);
   }
   
   public static CartDiscountChangeTargetActionBuilder of() {
      return new CartDiscountChangeTargetActionBuilder();
   }
   
   public static CartDiscountChangeTargetActionBuilder of(final CartDiscountChangeTargetAction template) {
      CartDiscountChangeTargetActionBuilder builder = new CartDiscountChangeTargetActionBuilder();
      builder.target = template.getTarget();
      return builder;
   }
   
}