package com.commercetools.api.generated.models.discount_code;

import com.commercetools.api.generated.models.cart_discount.CartDiscountResourceIdentifier;
import com.commercetools.api.generated.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.generated.models.discount_code.DiscountCodeChangeCartDiscountsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DiscountCodeChangeCartDiscountsActionBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountResourceIdentifier> cartDiscounts;
   
   public DiscountCodeChangeCartDiscountsActionBuilder cartDiscounts( final java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountResourceIdentifier> cartDiscounts) {
      this.cartDiscounts = cartDiscounts;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountResourceIdentifier> getCartDiscounts(){
      return this.cartDiscounts;
   }

   public DiscountCodeChangeCartDiscountsAction build() {
       return new DiscountCodeChangeCartDiscountsActionImpl(cartDiscounts);
   }
   
   public static DiscountCodeChangeCartDiscountsActionBuilder of() {
      return new DiscountCodeChangeCartDiscountsActionBuilder();
   }
   
   public static DiscountCodeChangeCartDiscountsActionBuilder of(final DiscountCodeChangeCartDiscountsAction template) {
      DiscountCodeChangeCartDiscountsActionBuilder builder = new DiscountCodeChangeCartDiscountsActionBuilder();
      builder.cartDiscounts = template.getCartDiscounts();
      return builder;
   }
   
}