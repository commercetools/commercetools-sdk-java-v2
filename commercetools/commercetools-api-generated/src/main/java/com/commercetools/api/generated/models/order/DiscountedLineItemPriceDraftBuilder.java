package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.cart.DiscountedLineItemPortion;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.order.DiscountedLineItemPriceDraft;
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
public final class DiscountedLineItemPriceDraftBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.cart.DiscountedLineItemPortion> includedDiscounts;
   
   
   private com.commercetools.api.generated.models.common.Money value;
   
   public DiscountedLineItemPriceDraftBuilder includedDiscounts( final java.util.List<com.commercetools.api.generated.models.cart.DiscountedLineItemPortion> includedDiscounts) {
      this.includedDiscounts = includedDiscounts;
      return this;
   }
   
   public DiscountedLineItemPriceDraftBuilder value( final com.commercetools.api.generated.models.common.Money value) {
      this.value = value;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart.DiscountedLineItemPortion> getIncludedDiscounts(){
      return this.includedDiscounts;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getValue(){
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