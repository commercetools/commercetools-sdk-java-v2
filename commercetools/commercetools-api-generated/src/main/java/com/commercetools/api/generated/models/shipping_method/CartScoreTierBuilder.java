package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.shipping_method.PriceFunction;
import com.commercetools.api.generated.models.shipping_method.ShippingRatePriceTier;
import com.commercetools.api.generated.models.shipping_method.ShippingRateTierType;
import com.commercetools.api.generated.models.shipping_method.CartScoreTier;
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
public final class CartScoreTierBuilder {
   
   
   private Integer score;
   
   @Nullable
   private com.commercetools.api.generated.models.common.Money price;
   
   @Nullable
   private Boolean isMatching;
   
   @Nullable
   private com.commercetools.api.generated.models.shipping_method.PriceFunction priceFunction;
   
   public CartScoreTierBuilder score( final Integer score) {
      this.score = score;
      return this;
   }
   
   public CartScoreTierBuilder price(@Nullable final com.commercetools.api.generated.models.common.Money price) {
      this.price = price;
      return this;
   }
   
   public CartScoreTierBuilder isMatching(@Nullable final Boolean isMatching) {
      this.isMatching = isMatching;
      return this;
   }
   
   public CartScoreTierBuilder priceFunction(@Nullable final com.commercetools.api.generated.models.shipping_method.PriceFunction priceFunction) {
      this.priceFunction = priceFunction;
      return this;
   }
   
   
   public Integer getScore(){
      return this.score;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Money getPrice(){
      return this.price;
   }
   
   @Nullable
   public Boolean getIsMatching(){
      return this.isMatching;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.shipping_method.PriceFunction getPriceFunction(){
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