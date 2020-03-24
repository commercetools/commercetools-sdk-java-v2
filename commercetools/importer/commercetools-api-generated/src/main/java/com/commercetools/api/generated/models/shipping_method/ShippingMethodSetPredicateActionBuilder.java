package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodSetPredicateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingMethodSetPredicateActionBuilder {
   
   @Nullable
   private String predicate;
   
   public ShippingMethodSetPredicateActionBuilder predicate(@Nullable final String predicate) {
      this.predicate = predicate;
      return this;
   }
   
   @Nullable
   public String getPredicate(){
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