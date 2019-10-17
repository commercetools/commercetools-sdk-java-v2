package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.Suggestion;
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
public final class SuggestionResultImpl implements SuggestionResult {

   private Map<String, java.util.List<com.commercetools.api.generated.models.product.Suggestion>> values;

   @JsonCreator
   SuggestionResultImpl(@JsonProperty("values") final Map<String, java.util.List<com.commercetools.api.generated.models.product.Suggestion>> values) {
      this.values = values;
   }
   public SuggestionResultImpl() {
      
   }
   
   
   public Map<String,java.util.List<com.commercetools.api.generated.models.product.Suggestion>> values() {
       return values;
   }

   public void setValue(String key, java.util.List<com.commercetools.api.generated.models.product.Suggestion> value) {
       if (values == null) {
           values = new HashMap<>();
       }
       values.put(key, value);
   }

}