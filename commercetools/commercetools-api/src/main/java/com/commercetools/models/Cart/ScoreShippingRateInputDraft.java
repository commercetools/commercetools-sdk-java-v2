package com.commercetools.models.cart;

import com.commercetools.models.cart.ShippingRateInputDraft;
import com.commercetools.models.cart.ScoreShippingRateInputDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ScoreShippingRateInputDraftImpl.class)
public interface ScoreShippingRateInputDraft extends ShippingRateInputDraft {

   
   @NotNull
   @JsonProperty("score")
   public Integer getScore();

   public void setScore(final Integer score);
   
   public static ScoreShippingRateInputDraftImpl of(){
      return new ScoreShippingRateInputDraftImpl();
   }
   

   public static ScoreShippingRateInputDraftImpl of(final ScoreShippingRateInputDraft template) {
      ScoreShippingRateInputDraftImpl instance = new ScoreShippingRateInputDraftImpl();
      instance.setScore(template.getScore());
      return instance;
   }

}