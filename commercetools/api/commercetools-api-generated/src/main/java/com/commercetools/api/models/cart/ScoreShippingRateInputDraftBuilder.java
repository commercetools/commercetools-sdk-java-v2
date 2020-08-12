package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ShippingRateInputDraft;
import com.commercetools.api.models.cart.ScoreShippingRateInputDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ScoreShippingRateInputDraftBuilder {
   
   
   private Double score;
   
   public ScoreShippingRateInputDraftBuilder score( final Double score) {
      this.score = score;
      return this;
   }
   
   
   public Double getScore(){
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
