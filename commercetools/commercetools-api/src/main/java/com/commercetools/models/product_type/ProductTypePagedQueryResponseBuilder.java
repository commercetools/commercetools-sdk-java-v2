package com.commercetools.models.product_type;

import com.commercetools.models.product_type.ProductType;
import java.lang.Long;
import com.commercetools.models.product_type.ProductTypePagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypePagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.product_type.ProductType> results;
   
   public ProductTypePagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public ProductTypePagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public ProductTypePagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public ProductTypePagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.product_type.ProductType> results) {
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
   
   
   public java.util.List<com.commercetools.models.product_type.ProductType> getResults(){
      return this.results;
   }

   public ProductTypePagedQueryResponse build() {
       return new ProductTypePagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static ProductTypePagedQueryResponseBuilder of() {
      return new ProductTypePagedQueryResponseBuilder();
   }
   
   public static ProductTypePagedQueryResponseBuilder of(final ProductTypePagedQueryResponse template) {
      ProductTypePagedQueryResponseBuilder builder = new ProductTypePagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}