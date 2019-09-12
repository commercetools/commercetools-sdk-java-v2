package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountUpdateAction;
import java.lang.String;
import com.commercetools.models.CartDiscount.CartDiscountChangeCartPredicateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountChangeCartPredicateActionBuilder {
   
   
   private java.lang.String cartPredicate;
   
   public CartDiscountChangeCartPredicateActionBuilder cartPredicate( final java.lang.String cartPredicate) {
      this.cartPredicate = cartPredicate;
      return this;
   }
   
   
   public java.lang.String getCartPredicate(){
      return this.cartPredicate;
   }

   public CartDiscountChangeCartPredicateAction build() {
       return new CartDiscountChangeCartPredicateActionImpl(cartPredicate);
   }
   
   public static CartDiscountChangeCartPredicateActionBuilder of() {
      return new CartDiscountChangeCartPredicateActionBuilder();
   }
   
   public static CartDiscountChangeCartPredicateActionBuilder of(final CartDiscountChangeCartPredicateAction template) {
      CartDiscountChangeCartPredicateActionBuilder builder = new CartDiscountChangeCartPredicateActionBuilder();
      builder.cartPredicate = template.getCartPredicate();
      return builder;
   }
   
}