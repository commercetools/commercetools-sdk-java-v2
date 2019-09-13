package com.commercetools.models.shipping_method;

import com.commercetools.models.common.Money;
import com.commercetools.models.shipping_method.ShippingRatePriceTier;
import com.commercetools.models.shipping_method.ShippingRateTierType;
import java.lang.Boolean;
import java.lang.Long;
import com.commercetools.models.shipping_method.CartValueTier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartValueTierBuilder {
   
   
   private java.lang.Long minimumCentAmount;
   
   
   private com.commercetools.models.common.Money price;
   
   @Nullable
   private java.lang.Boolean isMatching;
   
   public CartValueTierBuilder minimumCentAmount( final java.lang.Long minimumCentAmount) {
      this.minimumCentAmount = minimumCentAmount;
      return this;
   }
   
   public CartValueTierBuilder price( final com.commercetools.models.common.Money price) {
      this.price = price;
      return this;
   }
   
   public CartValueTierBuilder isMatching(@Nullable final java.lang.Boolean isMatching) {
      this.isMatching = isMatching;
      return this;
   }
   
   
   public java.lang.Long getMinimumCentAmount(){
      return this.minimumCentAmount;
   }
   
   
   public com.commercetools.models.common.Money getPrice(){
      return this.price;
   }
   
   @Nullable
   public java.lang.Boolean getIsMatching(){
      return this.isMatching;
   }

   public CartValueTier build() {
       return new CartValueTierImpl(minimumCentAmount, price, isMatching);
   }
   
   public static CartValueTierBuilder of() {
      return new CartValueTierBuilder();
   }
   
   public static CartValueTierBuilder of(final CartValueTier template) {
      CartValueTierBuilder builder = new CartValueTierBuilder();
      builder.minimumCentAmount = template.getMinimumCentAmount();
      builder.price = template.getPrice();
      builder.isMatching = template.getIsMatching();
      return builder;
   }
   
}