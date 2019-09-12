package com.commercetools.models.ProductDiscount;

import com.commercetools.models.ProductDiscount.ProductDiscount;
import java.lang.Long;
import com.commercetools.models.ProductDiscount.ProductDiscountPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountPagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.ProductDiscount.ProductDiscount> results;
   
   public ProductDiscountPagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public ProductDiscountPagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public ProductDiscountPagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public ProductDiscountPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.ProductDiscount.ProductDiscount> results) {
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
   
   
   public java.util.List<com.commercetools.models.ProductDiscount.ProductDiscount> getResults(){
      return this.results;
   }

   public ProductDiscountPagedQueryResponse build() {
       return new ProductDiscountPagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static ProductDiscountPagedQueryResponseBuilder of() {
      return new ProductDiscountPagedQueryResponseBuilder();
   }
   
   public static ProductDiscountPagedQueryResponseBuilder of(final ProductDiscountPagedQueryResponse template) {
      ProductDiscountPagedQueryResponseBuilder builder = new ProductDiscountPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}