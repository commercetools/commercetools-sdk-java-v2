package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.ShippingRateInput;
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
public final class ScoreShippingRateInputImpl implements ScoreShippingRateInput {

   private String type;
   
   private Integer score;

   @JsonCreator
   ScoreShippingRateInputImpl(@JsonProperty("score") final Integer score) {
      this.score = score;
      this.type = "Score";
   }
   public ScoreShippingRateInputImpl() {
      
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