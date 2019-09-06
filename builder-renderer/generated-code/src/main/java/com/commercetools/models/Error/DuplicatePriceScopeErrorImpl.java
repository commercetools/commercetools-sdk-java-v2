package com.commercetools.models.Error;

import com.commercetools.models.Common.Price;
import com.commercetools.models.Error.ErrorObject;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DuplicatePriceScopeErrorImpl implements DuplicatePriceScopeError {

   private java.lang.String code;
   
   private java.lang.String message;
   
   private java.util.List<com.commercetools.models.Common.Price> conflictingPrices;

   @JsonCreator
   DuplicatePriceScopeErrorImpl(@JsonProperty("message") final java.lang.String message, @JsonProperty("conflictingPrices") final java.util.List<com.commercetools.models.Common.Price> conflictingPrices) {
      this.message = message;
      this.conflictingPrices = conflictingPrices;
      this.code = "DuplicatePriceScope";
   }
   public DuplicatePriceScopeErrorImpl() {
      
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public java.util.List<com.commercetools.models.Common.Price> getConflictingPrices(){
      return this.conflictingPrices;
   }

   public void setMessage(final java.lang.String message){
      this.message = message;
   }
   
   public void setConflictingPrices(final java.util.List<com.commercetools.models.Common.Price> conflictingPrices){
      this.conflictingPrices = conflictingPrices;
   }

}