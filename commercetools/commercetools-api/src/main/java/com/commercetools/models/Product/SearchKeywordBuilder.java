package com.commercetools.models.product;

import java.lang.Object;
import java.lang.String;
import com.commercetools.models.product.SearchKeyword;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class SearchKeywordBuilder {
   
   @Nullable
   private java.lang.Object suggestTokenizer;
   
   
   private java.lang.String text;
   
   public SearchKeywordBuilder suggestTokenizer(@Nullable final java.lang.Object suggestTokenizer) {
      this.suggestTokenizer = suggestTokenizer;
      return this;
   }
   
   public SearchKeywordBuilder text( final java.lang.String text) {
      this.text = text;
      return this;
   }
   
   @Nullable
   public java.lang.Object getSuggestTokenizer(){
      return this.suggestTokenizer;
   }
   
   
   public java.lang.String getText(){
      return this.text;
   }

   public SearchKeyword build() {
       return new SearchKeywordImpl(suggestTokenizer, text);
   }
   
   public static SearchKeywordBuilder of() {
      return new SearchKeywordBuilder();
   }
   
   public static SearchKeywordBuilder of(final SearchKeyword template) {
      SearchKeywordBuilder builder = new SearchKeywordBuilder();
      builder.suggestTokenizer = template.getSuggestTokenizer();
      builder.text = template.getText();
      return builder;
   }
   
}