package com.commercetools.models.product;

import com.commercetools.models.product.ProductProjection;
import java.lang.Long;
import com.commercetools.models.product.ProductProjectionPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductProjectionPagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.product.ProductProjection> results;
   
   public ProductProjectionPagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public ProductProjectionPagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public ProductProjectionPagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public ProductProjectionPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.product.ProductProjection> results) {
      this.results = results;
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
   
   
   public java.util.List<com.commercetools.models.product.ProductProjection> getResults(){
      return this.results;
   }

   public ProductProjectionPagedQueryResponse build() {
       return new ProductProjectionPagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static ProductProjectionPagedQueryResponseBuilder of() {
      return new ProductProjectionPagedQueryResponseBuilder();
   }
   
   public static ProductProjectionPagedQueryResponseBuilder of(final ProductProjectionPagedQueryResponse template) {
      ProductProjectionPagedQueryResponseBuilder builder = new ProductProjectionPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}