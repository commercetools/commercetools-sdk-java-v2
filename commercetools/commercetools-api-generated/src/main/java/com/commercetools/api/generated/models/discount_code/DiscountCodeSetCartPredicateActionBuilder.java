package com.commercetools.api.generated.models.discount_code;

import com.commercetools.api.generated.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.generated.models.discount_code.DiscountCodeSetCartPredicateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DiscountCodeSetCartPredicateActionBuilder {
   
   @Nullable
   private String cartPredicate;
   
   public DiscountCodeSetCartPredicateActionBuilder cartPredicate(@Nullable final String cartPredicate) {
      this.cartPredicate = cartPredicate;
      return this;
   }
   
   @Nullable
   public String getCartPredicate(){
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