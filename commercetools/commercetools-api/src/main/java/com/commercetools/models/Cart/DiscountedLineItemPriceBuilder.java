package com.commercetools.models.cart;

import com.commercetools.models.cart.DiscountedLineItemPortion;
import com.commercetools.models.common.TypedMoney;
import com.commercetools.models.cart.DiscountedLineItemPrice;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountedLineItemPriceBuilder {
   
   
   private java.util.List<com.commercetools.models.cart.DiscountedLineItemPortion> includedDiscounts;
   
   
   private com.commercetools.models.common.TypedMoney value;
   
   public DiscountedLineItemPriceBuilder includedDiscounts( final java.util.List<com.commercetools.models.cart.DiscountedLineItemPortion> includedDiscounts) {
      this.includedDiscounts = includedDiscounts;
      return this;
   }
   
   public DiscountedLineItemPriceBuilder value( final com.commercetools.models.common.TypedMoney value) {
      this.value = value;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.cart.DiscountedLineItemPortion> getIncludedDiscounts(){
      return this.includedDiscounts;
   }
   
   
   public com.commercetools.models.common.TypedMoney getValue(){
      return this.value;
   }

   public DiscountedLineItemPrice build() {
       return new DiscountedLineItemPriceImpl(includedDiscounts, value);
   }
   
   public static DiscountedLineItemPriceBuilder of() {
      return new DiscountedLineItemPriceBuilder();
   }
   
   public static DiscountedLineItemPriceBuilder of(final DiscountedLineItemPrice template) {
      DiscountedLineItemPriceBuilder builder = new DiscountedLineItemPriceBuilder();
      builder.includedDiscounts = template.getIncludedDiscounts();
      builder.value = template.getValue();
      return builder;
   }
   
}