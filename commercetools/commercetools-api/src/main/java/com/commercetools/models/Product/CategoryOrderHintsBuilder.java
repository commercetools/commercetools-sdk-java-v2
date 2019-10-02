package com.commercetools.models.product;


import com.commercetools.models.product.CategoryOrderHints;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategoryOrderHintsBuilder {
   
   
   private Map<String, String> values;
   
   public CategoryOrderHintsBuilder values( final Map<String, String> values){
      this.values = values;
      return this;
   }
   
   
   public Map<String, String> getValues(){
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