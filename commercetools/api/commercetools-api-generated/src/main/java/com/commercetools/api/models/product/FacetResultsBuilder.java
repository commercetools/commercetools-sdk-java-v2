package com.commercetools.api.models.product;

import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.product.FacetResults;
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
   
   
   private Map<String, com.fasterxml.jackson.databind.JsonNode> values;
   
   public FacetResultsBuilder values( final Map<String, com.fasterxml.jackson.databind.JsonNode> values){
      this.values = values;
      return this;
   }
   
   
   public Map<String, com.fasterxml.jackson.databind.JsonNode> getValues(){
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
