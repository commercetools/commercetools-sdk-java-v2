package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.shipping_method.ShippingRatePriceTier;
import com.commercetools.api.generated.models.shipping_method.ShippingRate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingRateBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingRatePriceTier> tiers;
   
   
   private com.commercetools.api.generated.models.common.TypedMoney price;
   
   @Nullable
   private com.commercetools.api.generated.models.common.TypedMoney freeAbove;
   
   @Nullable
   private Boolean isMatching;
   
   public ShippingRateBuilder tiers( final java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingRatePriceTier> tiers) {
      this.tiers = tiers;
      return this;
   }
   
   public ShippingRateBuilder price( final com.commercetools.api.generated.models.common.TypedMoney price) {
      this.price = price;
      return this;
   }
   
   public ShippingRateBuilder freeAbove(@Nullable final com.commercetools.api.generated.models.common.TypedMoney freeAbove) {
      this.freeAbove = freeAbove;
      return this;
   }
   
   public ShippingRateBuilder isMatching(@Nullable final Boolean isMatching) {
      this.isMatching = isMatching;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingRatePriceTier> getTiers(){
      return this.tiers;
   }
   
   
   public com.commercetools.api.generated.models.common.TypedMoney getPrice(){
      return this.price;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.TypedMoney getFreeAbove(){
      return this.freeAbove;
   }
   
   @Nullable
   public Boolean getIsMatching(){
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