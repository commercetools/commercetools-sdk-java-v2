package com.commercetools.models.Product;

import java.lang.Object;
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
public final class SearchKeywordImpl implements SearchKeyword {

   private java.lang.Object suggestTokenizer;
   
   private java.lang.String text;

   @JsonCreator
   SearchKeywordImpl(@JsonProperty("suggestTokenizer") final java.lang.Object suggestTokenizer, @JsonProperty("text") final java.lang.String text) {
      this.suggestTokenizer = suggestTokenizer;
      this.text = text;
   }
   public SearchKeywordImpl() {
      
   }
   
   
   public java.lang.Object getSuggestTokenizer(){
      return this.suggestTokenizer;
   }
   
   
   public java.lang.String getText(){
      return this.text;
   }

   public void setSuggestTokenizer(final java.lang.Object suggestTokenizer){
      this.suggestTokenizer = suggestTokenizer;
   }
   
   public void setText(final java.lang.String text){
      this.text = text;
   }

}