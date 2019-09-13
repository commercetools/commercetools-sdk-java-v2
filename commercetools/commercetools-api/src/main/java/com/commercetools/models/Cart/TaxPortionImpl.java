package com.commercetools.models.cart;

import com.commercetools.models.common.Money;
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
public final class TaxPortionImpl implements TaxPortion {

   private com.commercetools.models.common.Money amount;
   
   private java.lang.Integer rate;
   
   private java.lang.String name;

   @JsonCreator
   TaxPortionImpl(@JsonProperty("amount") final com.commercetools.models.common.Money amount, @JsonProperty("rate") final java.lang.Integer rate, @JsonProperty("name") final java.lang.String name) {
      this.amount = amount;
      this.rate = rate;
      this.name = name;
   }
   public TaxPortionImpl() {
      
   }
   
   
   public com.commercetools.models.common.Money getAmount(){
      return this.amount;
   }
   
   
   public java.lang.Integer getRate(){
      return this.rate;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }

   public void setAmount(final com.commercetools.models.common.Money amount){
      this.amount = amount;
   }
   
   public void setRate(final java.lang.Integer rate){
      this.rate = rate;
   }
   
   public void setName(final java.lang.String name){
      this.name = name;
   }

}