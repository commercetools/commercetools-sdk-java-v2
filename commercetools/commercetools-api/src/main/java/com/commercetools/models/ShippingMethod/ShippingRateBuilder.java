package com.commercetools.models.ShippingMethod;

import com.commercetools.models.Common.TypedMoney;
import com.commercetools.models.ShippingMethod.ShippingRatePriceTier;
import java.lang.Boolean;
import com.commercetools.models.ShippingMethod.ShippingRate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingRateBuilder {
   
   
   private java.util.List<com.commercetools.models.ShippingMethod.ShippingRatePriceTier> tiers;
   
   
   private com.commercetools.models.Common.TypedMoney price;
   
   @Nullable
   private com.commercetools.models.Common.TypedMoney freeAbove;
   
   @Nullable
   private java.lang.Boolean isMatching;
   
   public ShippingRateBuilder tiers( final java.util.List<com.commercetools.models.ShippingMethod.ShippingRatePriceTier> tiers) {
      this.tiers = tiers;
      return this;
   }
   
   public ShippingRateBuilder price( final com.commercetools.models.Common.TypedMoney price) {
      this.price = price;
      return this;
   }
   
   public ShippingRateBuilder freeAbove(@Nullable final com.commercetools.models.Common.TypedMoney freeAbove) {
      this.freeAbove = freeAbove;
      return this;
   }
   
   public ShippingRateBuilder isMatching(@Nullable final java.lang.Boolean isMatching) {
      this.isMatching = isMatching;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.ShippingMethod.ShippingRatePriceTier> getTiers(){
      return this.tiers;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getPrice(){
      return this.price;
   }
   
   @Nullable
   public com.commercetools.models.Common.TypedMoney getFreeAbove(){
      return this.freeAbove;
   }
   
   @Nullable
   public java.lang.Boolean getIsMatching(){
      return this.isMatching;
   }

   public ShippingRate build() {
       return new ShippingRateImpl(tiers, price, freeAbove, isMatching);
   }
   
   public static ShippingRateBuilder of() {
      return new ShippingRateBuilder();
   }
   
   public static ShippingRateBuilder of(final ShippingRate template) {
      ShippingRateBuilder builder = new ShippingRateBuilder();
      builder.tiers = template.getTiers();
      builder.price = template.getPrice();
      builder.freeAbove = template.getFreeAbove();
      builder.isMatching = template.getIsMatching();
      return builder;
   }
   
}