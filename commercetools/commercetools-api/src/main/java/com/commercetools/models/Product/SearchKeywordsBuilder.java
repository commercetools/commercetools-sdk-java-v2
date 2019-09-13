package com.commercetools.models.product;

import com.commercetools.models.product.SearchKeyword;
import com.commercetools.models.product.SearchKeywords;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class SearchKeywordsBuilder {
   
   
   private Map<String, java.util.List<com.commercetools.models.product.SearchKeyword>> values;
   
   public SearchKeywordsBuilder values( final Map<String, java.util.List<com.commercetools.models.product.SearchKeyword>> values){
      this.values = values;
      return this;
   }
   
   
   public Map<String, java.util.List<com.commercetools.models.product.SearchKeyword>> getValues(){
      return this.values;
   }

   public SearchKeywords build() {
       return new SearchKeywordsImpl(values);
   }
   
   public static SearchKeywordsBuilder of() {
      return new SearchKeywordsBuilder();
   }
   
   public static SearchKeywordsBuilder of(final SearchKeywords template) {
      SearchKeywordsBuilder builder = new SearchKeywordsBuilder();
      builder.values = template.values();
      return builder;
   }
   
}