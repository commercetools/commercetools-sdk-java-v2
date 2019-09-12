package com.commercetools.models.Cart;

import com.commercetools.models.Cart.ShippingRateInput;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Cart.ScoreShippingRateInputImpl;

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
@JsonDeserialize(as = ScoreShippingRateInputImpl.class)
public interface ScoreShippingRateInput extends ShippingRateInput {

   
   @NotNull
   @JsonProperty("score")
   public Integer getScore();

   public void setScore(final Integer score);
   
   public static ScoreShippingRateInputImpl of(){
      return new ScoreShippingRateInputImpl();
   }
   

   public static ScoreShippingRateInputImpl of(final ScoreShippingRateInput template) {
      ScoreShippingRateInputImpl instance = new ScoreShippingRateInputImpl();
      instance.setScore(template.getScore());
      return instance;
   }

}