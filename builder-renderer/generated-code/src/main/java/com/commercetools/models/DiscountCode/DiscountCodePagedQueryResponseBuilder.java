package com.commercetools.models.DiscountCode;

import com.commercetools.models.DiscountCode.DiscountCode;
import java.lang.Long;
import com.commercetools.models.DiscountCode.DiscountCodePagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountCodePagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.DiscountCode.DiscountCode> results;
   
   public DiscountCodePagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public DiscountCodePagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public DiscountCodePagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public DiscountCodePagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.DiscountCode.DiscountCode> results) {
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
   
   
   public java.util.List<com.commercetools.models.DiscountCode.DiscountCode> getResults(){
      return this.results;
   }

   public DiscountCodePagedQueryResponse build() {
       return new DiscountCodePagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static DiscountCodePagedQueryResponseBuilder of() {
      return new DiscountCodePagedQueryResponseBuilder();
   }
   
   public static DiscountCodePagedQueryResponseBuilder of(final DiscountCodePagedQueryResponse template) {
      DiscountCodePagedQueryResponseBuilder builder = new DiscountCodePagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}