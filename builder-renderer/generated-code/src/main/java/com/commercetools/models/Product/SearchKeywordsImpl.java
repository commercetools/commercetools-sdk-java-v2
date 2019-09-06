package com.commercetools.models.Product;

import com.commercetools.models.Product.SearchKeyword;
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
public final class SearchKeywordsImpl implements SearchKeywords {

   private Map<String, java.util.List<com.commercetools.models.Product.SearchKeyword>> values;

   @JsonCreator
   SearchKeywordsImpl(@JsonProperty("values") final Map<String, java.util.List<com.commercetools.models.Product.SearchKeyword>> values) {
      this.values = values;
   }
   public SearchKeywordsImpl() {
      
   }
   
   
   public Map<String,java.util.List<com.commercetools.models.Product.SearchKeyword>> values() {
       return values;
   }

   public void setValue(String key, java.util.List<com.commercetools.models.Product.SearchKeyword> value) {
       if (values == null) {
           values = new HashMap<>();
       }
       values.put(key, value);
   }

}