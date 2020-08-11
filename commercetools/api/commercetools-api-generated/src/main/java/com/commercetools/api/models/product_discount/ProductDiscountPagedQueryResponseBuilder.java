package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscount;
import com.commercetools.api.models.product_discount.ProductDiscountPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDiscountPagedQueryResponseBuilder {

   @Nullable
   private Long total;


   private Long offset;


   private Long count;


   private Long limit;


   private java.util.List<com.commercetools.api.models.product_discount.ProductDiscount> results;

   public ProductDiscountPagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }

   public ProductDiscountPagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }

   public ProductDiscountPagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }

   public ProductDiscountPagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }

   public ProductDiscountPagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.models.product_discount.ProductDiscount> results) {
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


   public java.util.List<com.commercetools.api.models.product_discount.ProductDiscount> getResults(){
      return this.results;
   }

   public ProductDiscountPagedQueryResponse build() {
       return new ProductDiscountPagedQueryResponseImpl(total, offset, count, limit, results);
   }

   public static ProductDiscountPagedQueryResponseBuilder of() {
      return new ProductDiscountPagedQueryResponseBuilder();
   }

   public static ProductDiscountPagedQueryResponseBuilder of(final ProductDiscountPagedQueryResponse template) {
      ProductDiscountPagedQueryResponseBuilder builder = new ProductDiscountPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }

}
