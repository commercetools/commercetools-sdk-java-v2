package com.commercetools.api.models.product;

import com.commercetools.api.models.product.SuggestTokenizer;
import com.commercetools.api.models.product.CustomTokenizerImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

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
