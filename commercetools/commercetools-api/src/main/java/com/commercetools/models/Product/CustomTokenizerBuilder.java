package com.commercetools.models.product;

import com.commercetools.models.product.SuggestTokenizer;
import com.commercetools.models.product.CustomTokenizer;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomTokenizerBuilder {
   
   
   private java.util.List<String> inputs;
   
   public CustomTokenizerBuilder inputs( final java.util.List<String> inputs) {
      this.inputs = inputs;
      return this;
   }
   
   
   public java.util.List<String> getInputs(){
      return this.inputs;
   }

   public CustomTokenizer build() {
       return new CustomTokenizerImpl(inputs);
   }
   
   public static CustomTokenizerBuilder of() {
      return new CustomTokenizerBuilder();
   }
   
   public static CustomTokenizerBuilder of(final CustomTokenizer template) {
      CustomTokenizerBuilder builder = new CustomTokenizerBuilder();
      builder.inputs = template.getInputs();
      return builder;
   }
   
}