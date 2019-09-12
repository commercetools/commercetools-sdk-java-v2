package com.commercetools.models.Order;

import com.commercetools.models.Order.Order;
import java.lang.Long;
import com.commercetools.models.Order.OrderPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderPagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.Order.Order> results;
   
   public OrderPagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public OrderPagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public OrderPagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public OrderPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.Order.Order> results) {
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
   
   
   public java.util.List<com.commercetools.models.Order.Order> getResults(){
      return this.results;
   }

   public OrderPagedQueryResponse build() {
       return new OrderPagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static OrderPagedQueryResponseBuilder of() {
      return new OrderPagedQueryResponseBuilder();
   }
   
   public static OrderPagedQueryResponseBuilder of(final OrderPagedQueryResponse template) {
      OrderPagedQueryResponseBuilder builder = new OrderPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}