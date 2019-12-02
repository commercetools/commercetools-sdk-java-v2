package com.commercetools.importer.models.products;

import com.commercetools.importer.models.products.SuggestTokenizer;
import io.vrap.rmf.base.client.utils.Generated;
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
public final class SearchKeywordImpl implements SearchKeyword {

   private com.commercetools.importer.models.products.SuggestTokenizer suggestTokenizer;
   
   private String text;

   @JsonCreator
   SearchKeywordImpl(@JsonProperty("suggestTokenizer") final com.commercetools.importer.models.products.SuggestTokenizer suggestTokenizer, @JsonProperty("text") final String text) {
      this.suggestTokenizer = suggestTokenizer;
      this.text = text;
   }
   public SearchKeywordImpl() {
      
   }
   
   
   public com.commercetools.importer.models.products.SuggestTokenizer getSuggestTokenizer(){
      return this.suggestTokenizer;
   }
   
   
   public String getText(){
      return this.text;
   }

   public void setSuggestTokenizer(final com.commercetools.importer.models.products.SuggestTokenizer suggestTokenizer){
      this.suggestTokenizer = suggestTokenizer;
   }
   
   public void setText(final String text){
      this.text = text;
   }

}