package com.commercetools.api.generated.models.product;


import com.commercetools.api.generated.models.product.FacetResults;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class FacetResultsBuilder {
   
   
   private Map<String, Object> values;
   
   public FacetResultsBuilder values( final Map<String, Object> values){
      this.values = values;
      return this;
   }
   
   
   public Map<String, Object> getValues(){
      return this.values;
   }

   public FacetResults build() {
       return new FacetResultsImpl(values);
   }
   
   public static FacetResultsBuilder of() {
      return new FacetResultsBuilder();
   }
   
   public static FacetResultsBuilder of(final FacetResults template) {
      FacetResultsBuilder builder = new FacetResultsBuilder();
      builder.values = template.values();
      return builder;
   }
   
}