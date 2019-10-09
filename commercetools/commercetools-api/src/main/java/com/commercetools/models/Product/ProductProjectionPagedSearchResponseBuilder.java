package com.commercetools.models.product;

import com.commercetools.models.product.FacetResults;
import com.commercetools.models.product.ProductProjection;
import com.commercetools.models.product.ProductProjectionPagedSearchResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductProjectionPagedSearchResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private java.util.List<com.commercetools.models.product.ProductProjection> results;
   
   
   private com.commercetools.models.product.FacetResults facets;
   
   public ProductProjectionPagedSearchResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public ProductProjectionPagedSearchResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public ProductProjectionPagedSearchResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public ProductProjectionPagedSearchResponseBuilder results( final java.util.List<com.commercetools.models.product.ProductProjection> results) {
      this.results = results;
      return this;
   }
   
   public ProductProjectionPagedSearchResponseBuilder facets( final com.commercetools.models.product.FacetResults facets) {
      this.facets = facets;
      return this;
   }
   
   @Nullable
   public Long getTotal(){
      return this.total;
   }
   
   
   public Long getOffset(){
      return this.offset;
   }
   
   
   public Long getCount(){
      return this.count;
   }
   
   
   public java.util.List<com.commercetools.models.product.ProductProjection> getResults(){
      return this.results;
   }
   
   
   public com.commercetools.models.product.FacetResults getFacets(){
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