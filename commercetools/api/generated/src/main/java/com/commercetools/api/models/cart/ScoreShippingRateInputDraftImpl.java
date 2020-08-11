package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ShippingRateInputDraft;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ScoreShippingRateInputDraftImpl implements ScoreShippingRateInputDraft {

   private String type;

   private Integer score;

   @JsonCreator
   ScoreShippingRateInputDraftImpl(@JsonProperty("score") final Integer score) {
      this.score = score;
      this.type = "Score";
   }
   public ScoreShippingRateInputDraftImpl() {

   }


   public String getType(){
      return this.type;
   }


   public Integer getScore(){
      return this.score;
   }

   public void setScore(final Integer score){
      this.score = score;
   }

}
