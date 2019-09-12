package com.commercetools.models.Product;

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
public final class CategoryOrderHintsImpl implements CategoryOrderHints {

   private Map<String, java.lang.String> values;

   @JsonCreator
   CategoryOrderHintsImpl(@JsonProperty("values") final Map<String, java.lang.String> values) {
      this.values = values;
   }
   public CategoryOrderHintsImpl() {
      
   }
   
   
   public Map<String,java.lang.String> values() {
       return values;
   }

   public void setValue(String key, java.lang.String value) {
       if (values == null) {
           values = new HashMap<>();
       }
       values.put(key, value);
   }

}