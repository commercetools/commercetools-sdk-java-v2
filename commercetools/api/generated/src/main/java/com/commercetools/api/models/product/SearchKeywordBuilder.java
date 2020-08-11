package com.commercetools.api.models.product;

import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.product.SearchKeyword;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SearchKeywordBuilder {

   @Nullable
   private com.fasterxml.jackson.databind.JsonNode suggestTokenizer;


   private String text;

   public SearchKeywordBuilder suggestTokenizer(@Nullable final com.fasterxml.jackson.databind.JsonNode suggestTokenizer) {
      this.suggestTokenizer = suggestTokenizer;
      return this;
   }

   public SearchKeywordBuilder text( final String text) {
      this.text = text;
      return this;
   }

   @Nullable
   public com.fasterxml.jackson.databind.JsonNode getSuggestTokenizer(){
      return this.suggestTokenizer;
   }


   public String getText(){
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
