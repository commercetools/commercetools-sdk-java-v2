package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order_edit.OrderEdit;
import com.commercetools.api.generated.models.order_edit.OrderEditPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderEditPagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.api.generated.models.order_edit.OrderEdit> results;
   
   public OrderEditPagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public OrderEditPagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public OrderEditPagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public OrderEditPagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public OrderEditPagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.generated.models.order_edit.OrderEdit> results) {
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
   
   
   public java.util.List<com.commercetools.api.generated.models.order_edit.OrderEdit> getResults(){
      return this.results;
   }

   public OrderEditPagedQueryResponse build() {
       return new OrderEditPagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static OrderEditPagedQueryResponseBuilder of() {
      return new OrderEditPagedQueryResponseBuilder();
   }
   
   public static OrderEditPagedQueryResponseBuilder of(final OrderEditPagedQueryResponse template) {
      OrderEditPagedQueryResponseBuilder builder = new OrderEditPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}