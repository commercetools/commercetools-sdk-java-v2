package com.commercetools.models.Product;

import com.commercetools.models.Product.FacetResults;
import com.commercetools.models.Product.ProductProjection;
import java.lang.Long;
import com.commercetools.models.Product.ProductProjectionPagedSearchResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductProjectionPagedSearchResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.Product.ProductProjection> results;
   
   
   private com.commercetools.models.Product.FacetResults facets;
   
   public ProductProjectionPagedSearchResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public ProductProjectionPagedSearchResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public ProductProjectionPagedSearchResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public ProductProjectionPagedSearchResponseBuilder results( final java.util.List<com.commercetools.models.Product.ProductProjection> results) {
      this.results = results;
      return this;
   }
   
   public ProductProjectionPagedSearchResponseBuilder facets( final com.commercetools.models.Product.FacetResults facets) {
      this.facets = facets;
      return this;
   }
   
   @Nullable
   public java.lang.Long getTotal(){
      return this.total;
   }
   
   
   public java.lang.Long getOffset(){
      return this.offset;
   }
   
   
   public java.lang.Long getCount(){
      return this.count;
   }
   
   
   public java.util.List<com.commercetools.models.Product.ProductProjection> getResults(){
      return this.results;
   }
   
   
   public com.commercetools.models.Product.FacetResults getFacets(){
      return this.facets;
   }

   public ProductProjectionPagedSearchResponse build() {
       return new ProductProjectionPagedSearchResponseImpl(total, offset, count, results, facets);
   }
   
   public static ProductProjectionPagedSearchResponseBuilder of() {
      return new ProductProjectionPagedSearchResponseBuilder();
   }
   
   public static ProductProjectionPagedSearchResponseBuilder of(final ProductProjectionPagedSearchResponse template) {
      ProductProjectionPagedSearchResponseBuilder builder = new ProductProjectionPagedSearchResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      builder.facets = template.getFacets();
      return builder;
   }
   
}