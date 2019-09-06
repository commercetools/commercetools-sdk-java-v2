package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.ShippingMethodUpdateAction;
import java.lang.String;
import com.commercetools.models.ShippingMethod.ShippingMethodSetPredicateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingMethodSetPredicateActionBuilder {
   
   @Nullable
   private java.lang.String predicate;
   
   public ShippingMethodSetPredicateActionBuilder predicate(@Nullable final java.lang.String predicate) {
      this.predicate = predicate;
      return this;
   }
   
   @Nullable
   public java.lang.String getPredicate(){
      return this.predicate;
   }

   public ShippingMethodSetPredicateAction build() {
       return new ShippingMethodSetPredicateActionImpl(predicate);
   }
   
   public static ShippingMethodSetPredicateActionBuilder of() {
      return new ShippingMethodSetPredicateActionBuilder();
   }
   
   public static ShippingMethodSetPredicateActionBuilder of(final ShippingMethodSetPredicateAction template) {
      ShippingMethodSetPredicateActionBuilder builder = new ShippingMethodSetPredicateActionBuilder();
      builder.predicate = template.getPredicate();
      return builder;
   }
   
}