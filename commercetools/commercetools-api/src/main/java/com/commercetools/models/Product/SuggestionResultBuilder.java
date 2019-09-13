package com.commercetools.models.product;

import com.commercetools.models.product.Suggestion;
import com.commercetools.models.product.SuggestionResult;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class SuggestionResultBuilder {
   
   
   private Map<String, java.util.List<com.commercetools.models.product.Suggestion>> values;
   
   public SuggestionResultBuilder values( final Map<String, java.util.List<com.commercetools.models.product.Suggestion>> values){
      this.values = values;
      return this;
   }
   
   
   public Map<String, java.util.List<com.commercetools.models.product.Suggestion>> getValues(){
      return this.values;
   }

   public SuggestionResult build() {
       return new SuggestionResultImpl(values);
   }
   
   public static SuggestionResultBuilder of() {
      return new SuggestionResultBuilder();
   }
   
   public static SuggestionResultBuilder of(final SuggestionResult template) {
      SuggestionResultBuilder builder = new SuggestionResultBuilder();
      builder.values = template.values();
      return builder;
   }
   
}