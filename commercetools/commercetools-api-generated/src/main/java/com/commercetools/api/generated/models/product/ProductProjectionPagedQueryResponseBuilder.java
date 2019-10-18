package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductProjection;
import com.commercetools.api.generated.models.product.ProductProjectionPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductProjectionPagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.api.generated.models.product.ProductProjection> results;
   
   public ProductProjectionPagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public ProductProjectionPagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public ProductProjectionPagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public ProductProjectionPagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public ProductProjectionPagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.generated.models.product.ProductProjection> results) {
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
   
   
   public java.util.List<com.commercetools.api.generated.models.product.ProductProjection> getResults(){
      return this.results;
   }

   public ProductProjectionPagedQueryResponse build() {
       return new ProductProjectionPagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static ProductProjectionPagedQueryResponseBuilder of() {
      return new ProductProjectionPagedQueryResponseBuilder();
   }
   
   public static ProductProjectionPagedQueryResponseBuilder of(final ProductProjectionPagedQueryResponse template) {
      ProductProjectionPagedQueryResponseBuilder builder = new ProductProjectionPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}