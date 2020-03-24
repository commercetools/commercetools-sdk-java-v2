package com.commercetools.api.generated.models.tax_category;


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
public final class SubRateImpl implements SubRate {

   private Integer amount;
   
   private String name;

   @JsonCreator
   SubRateImpl(@JsonProperty("amount") final Integer amount, @JsonProperty("name") final String name) {
      this.amount = amount;
      this.name = name;
   }
   public SubRateImpl() {
      
   }
   
   
   public Integer getAmount(){
      return this.amount;
   }
   
   
   public String getName(){
      return this.name;
   }

   public void setAmount(final Integer amount){
      this.amount = amount;
   }
   
   public void setName(final String name){
      this.name = name;
   }

}