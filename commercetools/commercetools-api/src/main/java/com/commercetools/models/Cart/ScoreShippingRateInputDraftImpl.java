package com.commercetools.models.cart;

import com.commercetools.models.cart.ShippingRateInputDraft;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ScoreShippingRateInputDraftImpl implements ScoreShippingRateInputDraft {

   private java.lang.String type;
   
   private java.lang.Integer score;

   @JsonCreator
   ScoreShippingRateInputDraftImpl(@JsonProperty("score") final java.lang.Integer score) {
      this.score = score;
      this.type = "Score";
   }
   public ScoreShippingRateInputDraftImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.Integer getScore(){
      return this.score;
   }

   public void setScore(final java.lang.Integer score){
      this.score = score;
   }

}