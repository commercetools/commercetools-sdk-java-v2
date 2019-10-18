package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.Customer;
import com.commercetools.api.generated.models.customer.CustomerPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerPagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.api.generated.models.customer.Customer> results;
   
   public CustomerPagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public CustomerPagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public CustomerPagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public CustomerPagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public CustomerPagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.generated.models.customer.Customer> results) {
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
   
   
   public java.util.List<com.commercetools.api.generated.models.customer.Customer> getResults(){
      return this.results;
   }

   public CustomerPagedQueryResponse build() {
       return new CustomerPagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static CustomerPagedQueryResponseBuilder of() {
      return new CustomerPagedQueryResponseBuilder();
   }
   
   public static CustomerPagedQueryResponseBuilder of(final CustomerPagedQueryResponse template) {
      CustomerPagedQueryResponseBuilder builder = new CustomerPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}