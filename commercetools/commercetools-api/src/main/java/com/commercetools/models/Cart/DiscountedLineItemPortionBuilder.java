package com.commercetools.models.cart;

import com.commercetools.models.cart_discount.CartDiscountReference;
import com.commercetools.models.common.Money;
import com.commercetools.models.cart.DiscountedLineItemPortion;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountedLineItemPortionBuilder {
   
   
   private com.commercetools.models.common.Money discountedAmount;
   
   
   private com.commercetools.models.cart_discount.CartDiscountReference discount;
   
   public DiscountedLineItemPortionBuilder discountedAmount( final com.commercetools.models.common.Money discountedAmount) {
      this.discountedAmount = discountedAmount;
      return this;
   }
   
   public DiscountedLineItemPortionBuilder discount( final com.commercetools.models.cart_discount.CartDiscountReference discount) {
      this.discount = discount;
      return this;
   }
   
   
   public com.commercetools.models.common.Money getDiscountedAmount(){
      return this.discountedAmount;
   }
   
   
   public com.commercetools.models.cart_discount.CartDiscountReference getDiscount(){
      return this.discount;
   }

   public DiscountedLineItemPortion build() {
       return new DiscountedLineItemPortionImpl(discountedAmount, discount);
   }
   
   public static DiscountedLineItemPortionBuilder of() {
      return new DiscountedLineItemPortionBuilder();
   }
   
   public static DiscountedLineItemPortionBuilder of(final DiscountedLineItemPortion template) {
      DiscountedLineItemPortionBuilder builder = new DiscountedLineItemPortionBuilder();
      builder.discountedAmount = template.getDiscountedAmount();
      builder.discount = template.getDiscount();
      return builder;
   }
   
}