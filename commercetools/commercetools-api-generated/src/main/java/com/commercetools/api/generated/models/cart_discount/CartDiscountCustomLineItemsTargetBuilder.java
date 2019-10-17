package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.generated.models.cart_discount.CartDiscountCustomLineItemsTarget;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountCustomLineItemsTargetBuilder {
   
   
   private String predicate;
   
   public CartDiscountCustomLineItemsTargetBuilder predicate( final String predicate) {
      this.predicate = predicate;
      return this;
   }
   
   
   public String getPredicate(){
      return this.predicate;
   }

   public CartDiscountCustomLineItemsTarget build() {
       return new CartDiscountCustomLineItemsTargetImpl(predicate);
   }
   
   public static CartDiscountCustomLineItemsTargetBuilder of() {
      return new CartDiscountCustomLineItemsTargetBuilder();
   }
   
   public static CartDiscountCustomLineItemsTargetBuilder of(final CartDiscountCustomLineItemsTarget template) {
      CartDiscountCustomLineItemsTargetBuilder builder = new CartDiscountCustomLineItemsTargetBuilder();
      builder.predicate = template.getPredicate();
      return builder;
   }
   
}