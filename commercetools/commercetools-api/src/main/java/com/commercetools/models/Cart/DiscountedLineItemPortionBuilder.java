package com.commercetools.models.Cart;

import com.commercetools.models.CartDiscount.CartDiscountReference;
import com.commercetools.models.Common.Money;
import com.commercetools.models.Cart.DiscountedLineItemPortion;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountedLineItemPortionBuilder {
   
   
   private com.commercetools.models.Common.Money discountedAmount;
   
   
   private com.commercetools.models.CartDiscount.CartDiscountReference discount;
   
   public DiscountedLineItemPortionBuilder discountedAmount( final com.commercetools.models.Common.Money discountedAmount) {
      this.discountedAmount = discountedAmount;
      return this;
   }
   
   public DiscountedLineItemPortionBuilder discount( final com.commercetools.models.CartDiscount.CartDiscountReference discount) {
      this.discount = discount;
      return this;
   }
   
   
   public com.commercetools.models.Common.Money getDiscountedAmount(){
      return this.discountedAmount;
   }
   
   
   public com.commercetools.models.CartDiscount.CartDiscountReference getDiscount(){
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