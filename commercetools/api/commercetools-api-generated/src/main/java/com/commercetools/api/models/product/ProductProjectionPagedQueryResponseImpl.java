package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductProjection;
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
public final class ProductProjectionPagedQueryResponseImpl implements ProductProjectionPagedQueryResponse {

   private Long total;

   private Long offset;

   private Long count;

   private Long limit;

   private java.util.List<com.commercetools.api.models.product.ProductProjection> results;

   @JsonCreator
   ProductProjectionPagedQueryResponseImpl(@JsonProperty("total") final Long total, @JsonProperty("offset") final Long offset, @JsonProperty("count") final Long count, @JsonProperty("limit") final Long limit, @JsonProperty("results") final java.util.List<com.commercetools.api.models.product.ProductProjection> results) {
      this.total = total;
      this.offset = offset;
      this.count = count;
      this.limit = limit;
      this.results = results;
   }
   public ProductProjectionPagedQueryResponseImpl() {

   }


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


   public java.util.List<com.commercetools.api.models.product.ProductProjection> getResults(){
      return this.results;
   }

   public void setTotal(final Long total){
      this.total = total;
   }

   public void setOffset(final Long offset){
      this.offset = offset;
   }

   public void setCount(final Long count){
      this.count = count;
   }

   public void setLimit(final Long limit){
      this.limit = limit;
   }

   public void setResults(final java.util.List<com.commercetools.api.models.product.ProductProjection> results){
      this.results = results;
   }

}
