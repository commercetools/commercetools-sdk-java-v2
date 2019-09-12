package com.commercetools.models.OrderEdit;

import com.commercetools.models.OrderEdit.OrderEdit;
import java.lang.Long;
import com.commercetools.models.OrderEdit.OrderEditPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditPagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.OrderEdit.OrderEdit> results;
   
   public OrderEditPagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public OrderEditPagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public OrderEditPagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public OrderEditPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.OrderEdit.OrderEdit> results) {
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
   
   
   public java.util.List<com.commercetools.models.OrderEdit.OrderEdit> getResults(){
      return this.results;
   }

   public OrderEditPagedQueryResponse build() {
       return new OrderEditPagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static OrderEditPagedQueryResponseBuilder of() {
      return new OrderEditPagedQueryResponseBuilder();
   }
   
   public static OrderEditPagedQueryResponseBuilder of(final OrderEditPagedQueryResponse template) {
      OrderEditPagedQueryResponseBuilder builder = new OrderEditPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}