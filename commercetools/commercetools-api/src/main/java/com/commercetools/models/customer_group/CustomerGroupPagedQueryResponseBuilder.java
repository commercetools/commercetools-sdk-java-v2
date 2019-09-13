package com.commercetools.models.customer_group;

import com.commercetools.models.customer_group.CustomerGroup;
import java.lang.Long;
import com.commercetools.models.customer_group.CustomerGroupPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerGroupPagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.customer_group.CustomerGroup> results;
   
   public CustomerGroupPagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public CustomerGroupPagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public CustomerGroupPagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public CustomerGroupPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.customer_group.CustomerGroup> results) {
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
   
   
   public java.util.List<com.commercetools.models.customer_group.CustomerGroup> getResults(){
      return this.results;
   }

   public CustomerGroupPagedQueryResponse build() {
       return new CustomerGroupPagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static CustomerGroupPagedQueryResponseBuilder of() {
      return new CustomerGroupPagedQueryResponseBuilder();
   }
   
   public static CustomerGroupPagedQueryResponseBuilder of(final CustomerGroupPagedQueryResponse template) {
      CustomerGroupPagedQueryResponseBuilder builder = new CustomerGroupPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}