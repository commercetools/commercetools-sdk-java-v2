package com.commercetools.models.product;

import com.commercetools.models.product.Product;
import com.commercetools.models.product.ProductPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductPagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.models.product.Product> results;
   
   public ProductPagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public ProductPagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public ProductPagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public ProductPagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public ProductPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.product.Product> results) {
      this.results = results;
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
   
   
   public Long getLimit(){
      return this.limit;
   }
   
   
   public java.util.List<com.commercetools.models.product.Product> getResults(){
      return this.results;
   }

   public ProductPagedQueryResponse build() {
       return new ProductPagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static ProductPagedQueryResponseBuilder of() {
      return new ProductPagedQueryResponseBuilder();
   }
   
   public static ProductPagedQueryResponseBuilder of(final ProductPagedQueryResponse template) {
      ProductPagedQueryResponseBuilder builder = new ProductPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}