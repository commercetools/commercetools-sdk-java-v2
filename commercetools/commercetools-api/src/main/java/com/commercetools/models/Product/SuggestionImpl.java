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
public final class SuggestionImpl implements Suggestion {

   private java.lang.String text;

   @JsonCreator
   SuggestionImpl(@JsonProperty("text") final java.lang.String text) {
      this.text = text;
   }
   public SuggestionImpl() {
      
   }
   
   
   public java.lang.String getText(){
      return this.text;
   }

   public void setText(final java.lang.String text){
      this.text = text;
   }

}