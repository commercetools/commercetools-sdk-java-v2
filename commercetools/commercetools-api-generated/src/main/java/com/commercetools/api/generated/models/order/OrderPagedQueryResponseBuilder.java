package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.Order;
import com.commercetools.api.generated.models.order.OrderPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderPagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.api.generated.models.order.Order> results;
   
   public OrderPagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public OrderPagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public OrderPagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public OrderPagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public OrderPagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.generated.models.order.Order> results) {
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
   
   
   public java.util.List<com.commercetools.api.generated.models.order.Order> getResults(){
      return this.results;
   }

   public OrderPagedQueryResponse build() {
       return new OrderPagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static OrderPagedQueryResponseBuilder of() {
      return new OrderPagedQueryResponseBuilder();
   }
   
   public static OrderPagedQueryResponseBuilder of(final OrderPagedQueryResponse template) {
      OrderPagedQueryResponseBuilder builder = new OrderPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}