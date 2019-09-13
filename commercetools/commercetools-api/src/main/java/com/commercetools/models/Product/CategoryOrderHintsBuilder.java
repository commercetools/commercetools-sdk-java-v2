package com.commercetools.models.product;

import java.lang.String;
import com.commercetools.models.product.CategoryOrderHints;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategoryOrderHintsBuilder {
   
   
   private Map<String, java.lang.String> values;
   
   public CategoryOrderHintsBuilder values( final Map<String, java.lang.String> values){
      this.values = values;
      return this;
   }
   
   
   public Map<String, java.lang.String> getValues(){
      return this.values;
   }

   public CategoryOrderHints build() {
       return new CategoryOrderHintsImpl(values);
   }
   
   public static CategoryOrderHintsBuilder of() {
      return new CategoryOrderHintsBuilder();
   }
   
   public static CategoryOrderHintsBuilder of(final CategoryOrderHints template) {
      CategoryOrderHintsBuilder builder = new CategoryOrderHintsBuilder();
      builder.values = template.values();
      return builder;
   }
   
}