package com.commercetools.models.common;

import com.commercetools.models.common.Money;
import java.lang.Long;
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
public final class PriceTierImpl implements PriceTier {

   private com.commercetools.models.common.Money value;
   
   private java.lang.Long minimumQuantity;

   @JsonCreator
   PriceTierImpl(@JsonProperty("value") final com.commercetools.models.common.Money value, @JsonProperty("minimumQuantity") final java.lang.Long minimumQuantity) {
      this.value = value;
      this.minimumQuantity = minimumQuantity;
   }
   public PriceTierImpl() {
      
   }
   
   
   public com.commercetools.models.common.Money getValue(){
      return this.value;
   }
   
   
   public java.lang.Long getMinimumQuantity(){
      return this.minimumQuantity;
   }

   public void setValue(final com.commercetools.models.common.Money value){
      this.value = value;
   }
   
   public void setMinimumQuantity(final java.lang.Long minimumQuantity){
      this.minimumQuantity = minimumQuantity;
   }

}