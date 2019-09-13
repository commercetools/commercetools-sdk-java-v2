package com.commercetools.models.product;

import java.lang.String;
import com.commercetools.models.product.Suggestion;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class SuggestionBuilder {
   
   
   private java.lang.String text;
   
   public SuggestionBuilder text( final java.lang.String text) {
      this.text = text;
      return this;
   }
   
   
   public java.lang.String getText(){
      return this.text;
   }

   public Suggestion build() {
       return new SuggestionImpl(text);
   }
   
   public static SuggestionBuilder of() {
      return new SuggestionBuilder();
   }
   
   public static SuggestionBuilder of(final Suggestion template) {
      SuggestionBuilder builder = new SuggestionBuilder();
      builder.text = template.getText();
      return builder;
   }
   
}