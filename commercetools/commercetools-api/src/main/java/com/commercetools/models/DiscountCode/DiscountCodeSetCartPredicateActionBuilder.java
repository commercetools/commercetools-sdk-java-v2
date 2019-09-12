package com.commercetools.models.DiscountCode;

import com.commercetools.models.DiscountCode.DiscountCodeUpdateAction;
import java.lang.String;
import com.commercetools.models.DiscountCode.DiscountCodeSetCartPredicateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountCodeSetCartPredicateActionBuilder {
   
   @Nullable
   private java.lang.String cartPredicate;
   
   public DiscountCodeSetCartPredicateActionBuilder cartPredicate(@Nullable final java.lang.String cartPredicate) {
      this.cartPredicate = cartPredicate;
      return this;
   }
   
   @Nullable
   public java.lang.String getCartPredicate(){
      return this.cartPredicate;
   }

   public DiscountCodeSetCartPredicateAction build() {
       return new DiscountCodeSetCartPredicateActionImpl(cartPredicate);
   }
   
   public static DiscountCodeSetCartPredicateActionBuilder of() {
      return new DiscountCodeSetCartPredicateActionBuilder();
   }
   
   public static DiscountCodeSetCartPredicateActionBuilder of(final DiscountCodeSetCartPredicateAction template) {
      DiscountCodeSetCartPredicateActionBuilder builder = new DiscountCodeSetCartPredicateActionBuilder();
      builder.cartPredicate = template.getCartPredicate();
      return builder;
   }
   
}