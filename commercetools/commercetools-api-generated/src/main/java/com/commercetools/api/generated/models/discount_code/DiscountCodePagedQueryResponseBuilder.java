package com.commercetools.api.generated.models.discount_code;

import com.commercetools.api.generated.models.discount_code.DiscountCode;
import com.commercetools.api.generated.models.discount_code.DiscountCodePagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DiscountCodePagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.api.generated.models.discount_code.DiscountCode> results;
   
   public DiscountCodePagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public DiscountCodePagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public DiscountCodePagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public DiscountCodePagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public DiscountCodePagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.generated.models.discount_code.DiscountCode> results) {
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
   
   
   public java.util.List<com.commercetools.api.generated.models.discount_code.DiscountCode> getResults(){
      return this.results;
   }

   public DiscountCodePagedQueryResponse build() {
       return new DiscountCodePagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static DiscountCodePagedQueryResponseBuilder of() {
      return new DiscountCodePagedQueryResponseBuilder();
   }
   
   public static DiscountCodePagedQueryResponseBuilder of(final DiscountCodePagedQueryResponse template) {
      DiscountCodePagedQueryResponseBuilder builder = new DiscountCodePagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}