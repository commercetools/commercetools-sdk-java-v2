package com.commercetools.api.models.product;


import com.commercetools.api.models.product.CategoryOrderHints;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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
