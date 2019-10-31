package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.common.TypedMoneyDraft;
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
public final class TaxPortionDraftImpl implements TaxPortionDraft {

   private com.commercetools.api.generated.models.common.TypedMoneyDraft amount;
   
   private Integer rate;
   
   private String name;

   @JsonCreator
   TaxPortionDraftImpl(@JsonProperty("amount") final com.commercetools.api.generated.models.common.TypedMoneyDraft amount, @JsonProperty("rate") final Integer rate, @JsonProperty("name") final String name) {
      this.amount = amount;
      this.rate = rate;
      this.name = name;
   }
   public TaxPortionDraftImpl() {
      
   }
   
   
   public com.commercetools.api.generated.models.common.TypedMoneyDraft getAmount(){
      return this.amount;
   }
   
   
   public Integer getRate(){
      return this.rate;
   }
   
   
   public String getName(){
      return this.name;
   }

   public void setAmount(final com.commercetools.api.generated.models.common.TypedMoneyDraft amount){
      this.amount = amount;
   }
   
   public void setRate(final Integer rate){
      this.rate = rate;
   }
   
   public void setName(final String name){
      this.name = name;
   }

}