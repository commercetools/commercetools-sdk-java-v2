package com.commercetools.models.product;

import java.lang.Long;
import java.lang.Object;
import com.commercetools.models.product.FacetResultTerm;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class FacetResultTermBuilder {
   
   
   private java.lang.Long count;
   
   
   private java.lang.Object term;
   
   @Nullable
   private java.lang.Long productCount;
   
   public FacetResultTermBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public FacetResultTermBuilder term( final java.lang.Object term) {
      this.term = term;
      return this;
   }
   
   public FacetResultTermBuilder productCount(@Nullable final java.lang.Long productCount) {
      this.productCount = productCount;
      return this;
   }
   
   
   public java.lang.Long getCount(){
      return this.count;
   }
   
   
   public java.lang.Object getTerm(){
      return this.term;
   }
   
   @Nullable
   public java.lang.Long getProductCount(){
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