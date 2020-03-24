package com.commercetools.importer.models.prices;


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

   private String name;
   
   private Integer amount;

   @JsonCreator
   SubRateImpl(@JsonProperty("name") final String name, @JsonProperty("amount") final Integer amount) {
      this.name = name;
      this.amount = amount;
   }
   public SubRateImpl() {
      
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public Integer getAmount(){
      return this.amount;
   }

   public void setName(final String name){
      this.name = name;
   }
   
   public void setAmount(final Integer amount){
      this.amount = amount;
   }

}