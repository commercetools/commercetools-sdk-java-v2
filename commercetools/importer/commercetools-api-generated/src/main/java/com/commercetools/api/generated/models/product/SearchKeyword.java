package com.commercetools.api.generated.models.product;

import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.generated.models.product.SearchKeywordImpl;

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
@JsonDeserialize(as = SearchKeywordImpl.class)
public interface SearchKeyword  {

   
   @NotNull
   @JsonProperty("text")
   public String getText();
   
   
   @JsonProperty("suggestTokenizer")
   public JsonNode getSuggestTokenizer();

   public void setText(final String text);
   
   public void setSuggestTokenizer(final JsonNode suggestTokenizer);
   
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