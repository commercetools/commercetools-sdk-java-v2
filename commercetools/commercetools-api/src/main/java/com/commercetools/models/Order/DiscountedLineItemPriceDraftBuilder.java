package com.commercetools.models.order;

import com.commercetools.models.cart.DiscountedLineItemPortion;
import com.commercetools.models.common.Money;
import com.commercetools.models.order.DiscountedLineItemPriceDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountedLineItemPriceDraftBuilder {
   
   
   private java.util.List<com.commercetools.models.cart.DiscountedLineItemPortion> includedDiscounts;
   
   
   private com.commercetools.models.common.Money value;
   
   public DiscountedLineItemPriceDraftBuilder includedDiscounts( final java.util.List<com.commercetools.models.cart.DiscountedLineItemPortion> includedDiscounts) {
      this.includedDiscounts = includedDiscounts;
      return this;
   }
   
   public DiscountedLineItemPriceDraftBuilder value( final com.commercetools.models.common.Money value) {
      this.value = value;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.cart.DiscountedLineItemPortion> getIncludedDiscounts(){
      return this.includedDiscounts;
   }
   
   
   public com.commercetools.models.common.Money getValue(){
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