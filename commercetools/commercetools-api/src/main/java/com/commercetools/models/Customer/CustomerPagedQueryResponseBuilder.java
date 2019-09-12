package com.commercetools.models.Customer;

import com.commercetools.models.Customer.Customer;
import java.lang.Long;
import com.commercetools.models.Customer.CustomerPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerPagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.Customer.Customer> results;
   
   public CustomerPagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public CustomerPagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public CustomerPagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public CustomerPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.Customer.Customer> results) {
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
   
   
   public java.util.List<com.commercetools.models.Customer.Customer> getResults(){
      return this.results;
   }

   public CustomerPagedQueryResponse build() {
       return new CustomerPagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static CustomerPagedQueryResponseBuilder of() {
      return new CustomerPagedQueryResponseBuilder();
   }
   
   public static CustomerPagedQueryResponseBuilder of(final CustomerPagedQueryResponse template) {
      CustomerPagedQueryResponseBuilder builder = new CustomerPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}