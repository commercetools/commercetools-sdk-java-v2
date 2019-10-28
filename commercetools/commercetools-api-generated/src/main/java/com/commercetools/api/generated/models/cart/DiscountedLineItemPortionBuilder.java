package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart_discount.CartDiscountReference;
import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.cart.DiscountedLineItemPortion;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DiscountedLineItemPortionBuilder {
   
   
   private com.commercetools.api.generated.models.common.TypedMoney discountedAmount;
   
   
   private com.commercetools.api.generated.models.cart_discount.CartDiscountReference discount;
   
   public DiscountedLineItemPortionBuilder discountedAmount( final com.commercetools.api.generated.models.common.TypedMoney discountedAmount) {
      this.discountedAmount = discountedAmount;
      return this;
   }
   
   public DiscountedLineItemPortionBuilder discount( final com.commercetools.api.generated.models.cart_discount.CartDiscountReference discount) {
      this.discount = discount;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.TypedMoney getDiscountedAmount(){
      return this.discountedAmount;
   }
   
   
   public com.commercetools.api.generated.models.cart_discount.CartDiscountReference getDiscount(){
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