package com.commercetools.models.Order;

import com.commercetools.models.Cart.DiscountedLineItemPortion;
import com.commercetools.models.Common.Money;
import com.commercetools.models.Order.DiscountedLineItemPriceDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountedLineItemPriceDraftBuilder {
   
   
   private java.util.List<com.commercetools.models.Cart.DiscountedLineItemPortion> includedDiscounts;
   
   
   private com.commercetools.models.Common.Money value;
   
   public DiscountedLineItemPriceDraftBuilder includedDiscounts( final java.util.List<com.commercetools.models.Cart.DiscountedLineItemPortion> includedDiscounts) {
      this.includedDiscounts = includedDiscounts;
      return this;
   }
   
   public DiscountedLineItemPriceDraftBuilder value( final com.commercetools.models.Common.Money value) {
      this.value = value;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.Cart.DiscountedLineItemPortion> getIncludedDiscounts(){
      return this.includedDiscounts;
   }
   
   
   public com.commercetools.models.Common.Money getValue(){
      return this.value;
   }

   public DiscountedLineItemPriceDraft build() {
       return new DiscountedLineItemPriceDraftImpl(includedDiscounts, value);
   }
   
   public static DiscountedLineItemPriceDraftBuilder of() {
      return new DiscountedLineItemPriceDraftBuilder();
   }
   
   public static DiscountedLineItemPriceDraftBuilder of(final DiscountedLineItemPriceDraft template) {
      DiscountedLineItemPriceDraftBuilder builder = new DiscountedLineItemPriceDraftBuilder();
      builder.includedDiscounts = template.getIncludedDiscounts();
      builder.value = template.getValue();
      return builder;
   }
   
}