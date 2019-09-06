package com.commercetools.models.Product;

import com.commercetools.models.Product.SuggestTokenizer;
import java.lang.String;
import com.commercetools.models.Product.CustomTokenizerImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomTokenizerImpl.class)
public interface CustomTokenizer extends SuggestTokenizer {

   
   @NotNull
   @JsonProperty("inputs")
   public List<String> getInputs();

   public void setInputs(final List<String> inputs);
   
   public static CustomTokenizerImpl of(){
      return new CustomTokenizerImpl();
   }
   

   public static CustomTokenizerImpl of(final CustomTokenizer template) {
      CustomTokenizerImpl instance = new CustomTokenizerImpl();
      instance.setInputs(template.getInputs());
      return instance;
   }

}