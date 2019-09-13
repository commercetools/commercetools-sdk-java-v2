package com.commercetools.models.product;

import com.commercetools.models.product.SuggestTokenizer;
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
public final class CustomTokenizerImpl implements CustomTokenizer {

   private java.lang.String type;
   
   private java.util.List<java.lang.String> inputs;

   @JsonCreator
   CustomTokenizerImpl(@JsonProperty("inputs") final java.util.List<java.lang.String> inputs) {
      this.inputs = inputs;
      this.type = "custom";
   }
   public CustomTokenizerImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.util.List<java.lang.String> getInputs(){
      return this.inputs;
   }

   public void setInputs(final java.util.List<java.lang.String> inputs){
      this.inputs = inputs;
   }

}