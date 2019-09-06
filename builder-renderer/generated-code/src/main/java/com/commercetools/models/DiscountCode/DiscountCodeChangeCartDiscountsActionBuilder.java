package com.commercetools.models.DiscountCode;

import com.commercetools.models.CartDiscount.CartDiscountResourceIdentifier;
import com.commercetools.models.DiscountCode.DiscountCodeUpdateAction;
import java.lang.String;
import com.commercetools.models.DiscountCode.DiscountCodeChangeCartDiscountsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountCodeChangeCartDiscountsActionBuilder {
   
   
   private java.util.List<com.commercetools.models.CartDiscount.CartDiscountResourceIdentifier> cartDiscounts;
   
   public DiscountCodeChangeCartDiscountsActionBuilder cartDiscounts( final java.util.List<com.commercetools.models.CartDiscount.CartDiscountResourceIdentifier> cartDiscounts) {
      this.cartDiscounts = cartDiscounts;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.CartDiscount.CartDiscountResourceIdentifier> getCartDiscounts(){
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