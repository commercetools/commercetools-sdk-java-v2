package com.commercetools.models.product_discount;

import com.commercetools.models.product_discount.ProductDiscountUpdateAction;
import java.lang.String;
import com.commercetools.models.product_discount.ProductDiscountChangePredicateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountChangePredicateActionBuilder {
   
   
   private java.lang.String predicate;
   
   public ProductDiscountChangePredicateActionBuilder predicate( final java.lang.String predicate) {
      this.predicate = predicate;
      return this;
   }
   
   
   public java.lang.String getPredicate(){
      return this.predicate;
   }

   public ProductDiscountChangePredicateAction build() {
       return new ProductDiscountChangePredicateActionImpl(predicate);
   }
   
   public static ProductDiscountChangePredicateActionBuilder of() {
      return new ProductDiscountChangePredicateActionBuilder();
   }
   
   public static ProductDiscountChangePredicateActionBuilder of(final ProductDiscountChangePredicateAction template) {
      ProductDiscountChangePredicateActionBuilder builder = new ProductDiscountChangePredicateActionBuilder();
      builder.predicate = template.getPredicate();
      return builder;
   }
   
}