package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.Customer;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerPagedQueryResponseImpl implements CustomerPagedQueryResponse {

   private Long limit;
   
   private Long count;
   
   private Long total;
   
   private Long offset;
   
   private java.util.List<com.commercetools.api.models.customer.Customer> results;

   @JsonCreator
   CustomerPagedQueryResponseImpl(@JsonProperty("limit") final Long limit, @JsonProperty("count") final Long count, @JsonProperty("total") final Long total, @JsonProperty("offset") final Long offset, @JsonProperty("results") final java.util.List<com.commercetools.api.models.customer.Customer> results) {
      this.limit = limit;
      this.count = count;
      this.total = total;
      this.offset = offset;
      this.results = results;
   }
   public CustomerPagedQueryResponseImpl() {
      
   }
   
   
   public Long getLimit(){
      return this.limit;
   }
   
   
   public Long getCount(){
      return this.count;
   }
   
   
   public Long getTotal(){
      return this.total;
   }
   
   
   public Long getOffset(){
      return this.offset;
   }
   
   
   public java.util.List<com.commercetools.api.models.customer.Customer> getResults(){
      return this.results;
   }

   public void setLimit(final Long limit){
      this.limit = limit;
   }
   
   public void setCount(final Long count){
      this.count = count;
   }
   
   public void setTotal(final Long total){
      this.total = total;
   }
   
   public void setOffset(final Long offset){
      this.offset = offset;
   }
   
   public void setResults(final java.util.List<com.commercetools.api.models.customer.Customer> results){
      this.results = results;
   }

}
