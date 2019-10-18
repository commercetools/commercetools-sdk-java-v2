package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.SuggestTokenizer;
import com.commercetools.api.generated.models.product.WhitespaceTokenizer;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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