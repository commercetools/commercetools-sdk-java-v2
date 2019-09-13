package com.commercetools.models.cart;

import com.commercetools.models.cart.ShippingRateInputDraft;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.cart.ScoreShippingRateInputDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ScoreShippingRateInputDraftBuilder {
   
   
   private java.lang.Integer score;
   
   public ScoreShippingRateInputDraftBuilder score( final java.lang.Integer score) {
      this.score = score;
      return this;
   }
   
   
   public java.lang.Integer getScore(){
      return this.score;
   }

   public ScoreShippingRateInputDraft build() {
       return new ScoreShippingRateInputDraftImpl(score);
   }
   
   public static ScoreShippingRateInputDraftBuilder of() {
      return new ScoreShippingRateInputDraftBuilder();
   }
   
   public static ScoreShippingRateInputDraftBuilder of(final ScoreShippingRateInputDraft template) {
      ScoreShippingRateInputDraftBuilder builder = new ScoreShippingRateInputDraftBuilder();
      builder.score = template.getScore();
      return builder;
   }
   
}