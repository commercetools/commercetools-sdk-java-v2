package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.SearchKeyword;
import com.commercetools.api.generated.models.product.SearchKeywordsImpl;

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
@JsonDeserialize(as = SearchKeywordsImpl.class)
public interface SearchKeywords  {

   
   @NotNull
   @Valid
   @JsonAnyGetter
   public Map<String, List<SearchKeyword>> values();

   @JsonAnySetter
   public void setValue(String key, List<SearchKeyword> value);
   
   public static SearchKeywordsImpl of(){
      return new SearchKeywordsImpl();
   }
   

   public static SearchKeywordsImpl of(final SearchKeywords template) {
      SearchKeywordsImpl instance = new SearchKeywordsImpl();
      return instance;
   }

}