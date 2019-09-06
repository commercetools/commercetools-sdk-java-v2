package com.commercetools.models.Product;

import com.commercetools.models.Product.SuggestTokenizer;
import java.lang.String;
import com.commercetools.models.Product.WhitespaceTokenizer;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class WhitespaceTokenizerBuilder {
   
   
   

   public WhitespaceTokenizer build() {
       return new WhitespaceTokenizerImpl();
   }
   
   public static WhitespaceTokenizerBuilder of() {
      return new WhitespaceTokenizerBuilder();
   }
   
   public static WhitespaceTokenizerBuilder of(final WhitespaceTokenizer template) {
      WhitespaceTokenizerBuilder builder = new WhitespaceTokenizerBuilder();
      return builder;
   }
   
}