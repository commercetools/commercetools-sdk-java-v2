package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountTarget;
import com.commercetools.models.CartDiscount.CartDiscountUpdateAction;
import java.lang.String;
import com.commercetools.models.CartDiscount.CartDiscountChangeTargetAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountChangeTargetActionBuilder {
   
   
   private com.commercetools.models.CartDiscount.CartDiscountTarget target;
   
   public CartDiscountChangeTargetActionBuilder target( final com.commercetools.models.CartDiscount.CartDiscountTarget target) {
      this.target = target;
      return this;
   }
   
   
   public com.commercetools.models.CartDiscount.CartDiscountTarget getTarget(){
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