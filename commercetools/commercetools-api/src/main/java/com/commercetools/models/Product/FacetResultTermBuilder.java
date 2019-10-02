package com.commercetools.models.product;


import com.commercetools.models.product.FacetResultTerm;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class FacetResultTermBuilder {
   
   
   private Long count;
   
   
   private Object term;
   
   @Nullable
   private Long productCount;
   
   public FacetResultTermBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public FacetResultTermBuilder term( final Object term) {
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
   
   
   public Object getTerm(){
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