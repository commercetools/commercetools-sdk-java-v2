package com.commercetools.api.generated.models.product;


import com.commercetools.api.generated.models.product.FacetResultTerm;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class FacetResultTermBuilder {
   
   
   private Long count;
   
   
   private JsonNode term;
   
   @Nullable
   private Long productCount;
   
   public FacetResultTermBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public FacetResultTermBuilder term( final JsonNode term) {
      this.term = term;
      return this;
   }
   
   public FacetResultTermBuilder productCount(@Nullable final Long productCount) {
      this.productCount = productCount;
      return this;
   }
   
   
   public Long getCount(){
      return this.count;
   }
   
   
   public JsonNode getTerm(){
      return this.term;
   }
   
   @Nullable
   public Long getProductCount(){
      return this.productCount;
   }

   public FacetResultTerm build() {
       return new FacetResultTermImpl(count, term, productCount);
   }
   
   public static FacetResultTermBuilder of() {
      return new FacetResultTermBuilder();
   }
   
   public static FacetResultTermBuilder of(final FacetResultTerm template) {
      FacetResultTermBuilder builder = new FacetResultTermBuilder();
      builder.count = template.getCount();
      builder.term = template.getTerm();
      builder.productCount = template.getProductCount();
      return builder;
   }
   
}