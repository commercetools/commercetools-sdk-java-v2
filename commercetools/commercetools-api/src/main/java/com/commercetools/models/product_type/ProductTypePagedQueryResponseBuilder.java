package com.commercetools.models.product_type;

import com.commercetools.models.product_type.ProductType;
import com.commercetools.models.product_type.ProductTypePagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypePagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.models.product_type.ProductType> results;
   
   public ProductTypePagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public ProductTypePagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public ProductTypePagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public ProductTypePagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public ProductTypePagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.product_type.ProductType> results) {
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
   
   
   public java.util.List<com.commercetools.models.product_type.ProductType> getResults(){
      return this.results;
   }

   public ProductTypePagedQueryResponse build() {
       return new ProductTypePagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static ProductTypePagedQueryResponseBuilder of() {
      return new ProductTypePagedQueryResponseBuilder();
   }
   
   public static ProductTypePagedQueryResponseBuilder of(final ProductTypePagedQueryResponse template) {
      ProductTypePagedQueryResponseBuilder builder = new ProductTypePagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}