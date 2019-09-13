package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountTarget;
import java.lang.String;
import com.commercetools.models.cart_discount.CartDiscountLineItemsTarget;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountLineItemsTargetBuilder {
   
   
   private java.lang.String predicate;
   
   public CartDiscountLineItemsTargetBuilder predicate( final java.lang.String predicate) {
      this.predicate = predicate;
      return this;
   }
   
   
   public java.lang.String getPredicate(){
      return this.predicate;
   }

   public CartDiscountLineItemsTarget build() {
       return new CartDiscountLineItemsTargetImpl(predicate);
   }
   
   public static CartDiscountLineItemsTargetBuilder of() {
      return new CartDiscountLineItemsTargetBuilder();
   }
   
   public static CartDiscountLineItemsTargetBuilder of(final CartDiscountLineItemsTarget template) {
      CartDiscountLineItemsTargetBuilder builder = new CartDiscountLineItemsTargetBuilder();
      builder.predicate = template.getPredicate();
      return builder;
   }
   
}