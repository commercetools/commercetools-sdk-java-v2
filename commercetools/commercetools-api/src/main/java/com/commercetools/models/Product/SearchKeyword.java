package com.commercetools.models.product;

import java.lang.Object;
import java.lang.String;
import com.commercetools.models.product.SearchKeywordImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = SearchKeywordImpl.class)
public interface SearchKeyword  {

   
   @NotNull
   @JsonProperty("text")
   public String getText();
   
   
   @JsonProperty("suggestTokenizer")
   public Object getSuggestTokenizer();

   public void setText(final String text);
   
   public void setSuggestTokenizer(final Object suggestTokenizer);
   
   public static SearchKeywordImpl of(){
      return new SearchKeywordImpl();
   }
   

   public static SearchKeywordImpl of(final SearchKeyword template) {
      SearchKeywordImpl instance = new SearchKeywordImpl();
      instance.setSuggestTokenizer(template.getSuggestTokenizer());
      instance.setText(template.getText());
      return instance;
   }

}