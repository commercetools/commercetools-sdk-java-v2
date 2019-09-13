package com.commercetools.models.product;

import com.commercetools.models.product.Product;
import java.lang.Long;
import com.commercetools.models.product.ProductPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductPagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.product.Product> results;
   
   public ProductPagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public ProductPagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public ProductPagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public ProductPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.product.Product> results) {
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
   
   
   public java.util.List<com.commercetools.models.product.Product> getResults(){
      return this.results;
   }

   public ProductPagedQueryResponse build() {
       return new ProductPagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static ProductPagedQueryResponseBuilder of() {
      return new ProductPagedQueryResponseBuilder();
   }
   
   public static ProductPagedQueryResponseBuilder of(final ProductPagedQueryResponse template) {
      ProductPagedQueryResponseBuilder builder = new ProductPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}