package com.commercetools.models.cart;

import com.commercetools.models.cart.ShippingRateInput;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.cart.ScoreShippingRateInput;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ScoreShippingRateInputBuilder {
   
   
   private java.lang.Integer score;
   
   public ScoreShippingRateInputBuilder score( final java.lang.Integer score) {
      this.score = score;
      return this;
   }
   
   
   public java.lang.Integer getScore(){
      return this.score;
   }

   public ScoreShippingRateInput build() {
       return new ScoreShippingRateInputImpl(score);
   }
   
   public static ScoreShippingRateInputBuilder of() {
      return new ScoreShippingRateInputBuilder();
   }
   
   public static ScoreShippingRateInputBuilder of(final ScoreShippingRateInput template) {
      ScoreShippingRateInputBuilder builder = new ScoreShippingRateInputBuilder();
      builder.score = template.getScore();
      return builder;
   }
   
}