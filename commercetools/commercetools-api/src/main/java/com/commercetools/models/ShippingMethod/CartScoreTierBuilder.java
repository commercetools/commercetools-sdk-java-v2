package com.commercetools.models.ShippingMethod;

import com.commercetools.models.Common.Money;
import com.commercetools.models.ShippingMethod.PriceFunction;
import com.commercetools.models.ShippingMethod.ShippingRatePriceTier;
import com.commercetools.models.ShippingMethod.ShippingRateTierType;
import java.lang.Boolean;
import java.lang.Integer;
import com.commercetools.models.ShippingMethod.CartScoreTier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartScoreTierBuilder {
   
   
   private java.lang.Integer score;
   
   @Nullable
   private com.commercetools.models.Common.Money price;
   
   @Nullable
   private java.lang.Boolean isMatching;
   
   @Nullable
   private com.commercetools.models.ShippingMethod.PriceFunction priceFunction;
   
   public CartScoreTierBuilder score( final java.lang.Integer score) {
      this.score = score;
      return this;
   }
   
   public CartScoreTierBuilder price(@Nullable final com.commercetools.models.Common.Money price) {
      this.price = price;
      return this;
   }
   
   public CartScoreTierBuilder isMatching(@Nullable final java.lang.Boolean isMatching) {
      this.isMatching = isMatching;
      return this;
   }
   
   public CartScoreTierBuilder priceFunction(@Nullable final com.commercetools.models.ShippingMethod.PriceFunction priceFunction) {
      this.priceFunction = priceFunction;
      return this;
   }
   
   
   public java.lang.Integer getScore(){
      return this.score;
   }
   
   @Nullable
   public com.commercetools.models.Common.Money getPrice(){
      return this.price;
   }
   
   @Nullable
   public java.lang.Boolean getIsMatching(){
      return this.isMatching;
   }
   
   @Nullable
   public com.commercetools.models.ShippingMethod.PriceFunction getPriceFunction(){
      return this.priceFunction;
   }

   public CartScoreTier build() {
       return new CartScoreTierImpl(score, price, isMatching, priceFunction);
   }
   
   public static CartScoreTierBuilder of() {
      return new CartScoreTierBuilder();
   }
   
   public static CartScoreTierBuilder of(final CartScoreTier template) {
      CartScoreTierBuilder builder = new CartScoreTierBuilder();
      builder.score = template.getScore();
      builder.price = template.getPrice();
      builder.isMatching = template.getIsMatching();
      builder.priceFunction = template.getPriceFunction();
      return builder;
   }
   
}