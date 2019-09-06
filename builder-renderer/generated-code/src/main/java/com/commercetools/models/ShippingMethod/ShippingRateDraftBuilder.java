package com.commercetools.models.ShippingMethod;

import com.commercetools.models.Common.Money;
import com.commercetools.models.ShippingMethod.ShippingRatePriceTier;
import com.commercetools.models.ShippingMethod.ShippingRateDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingRateDraftBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.models.ShippingMethod.ShippingRatePriceTier> tiers;
   
   
   private com.commercetools.models.Common.Money price;
   
   @Nullable
   private com.commercetools.models.Common.Money freeAbove;
   
   public ShippingRateDraftBuilder tiers(@Nullable final java.util.List<com.commercetools.models.ShippingMethod.ShippingRatePriceTier> tiers) {
      this.tiers = tiers;
      return this;
   }
   
   public ShippingRateDraftBuilder price( final com.commercetools.models.Common.Money price) {
      this.price = price;
      return this;
   }
   
   public ShippingRateDraftBuilder freeAbove(@Nullable final com.commercetools.models.Common.Money freeAbove) {
      this.freeAbove = freeAbove;
      return this;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.ShippingMethod.ShippingRatePriceTier> getTiers(){
      return this.tiers;
   }
   
   
   public com.commercetools.models.Common.Money getPrice(){
      return this.price;
   }
   
   @Nullable
   public com.commercetools.models.Common.Money getFreeAbove(){
      return this.freeAbove;
   }

   public ShippingRateDraft build() {
       return new ShippingRateDraftImpl(tiers, price, freeAbove);
   }
   
   public static ShippingRateDraftBuilder of() {
      return new ShippingRateDraftBuilder();
   }
   
   public static ShippingRateDraftBuilder of(final ShippingRateDraft template) {
      ShippingRateDraftBuilder builder = new ShippingRateDraftBuilder();
      builder.tiers = template.getTiers();
      builder.price = template.getPrice();
      builder.freeAbove = template.getFreeAbove();
      return builder;
   }
   
}