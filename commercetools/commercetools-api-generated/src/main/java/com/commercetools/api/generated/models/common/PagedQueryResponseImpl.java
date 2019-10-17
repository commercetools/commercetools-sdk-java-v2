package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.common.BaseResource;
import com.commercetools.api.generated.models.product.FacetResults;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PagedQueryResponseImpl implements PagedQueryResponse {

   private Long total;
   
   private Long offset;
   
   private Object meta;
   
   private Long count;
   
   private Long limit;
   
   private java.util.List<com.commercetools.api.generated.models.common.BaseResource> results;
   
   private com.commercetools.api.generated.models.product.FacetResults facets;

   @JsonCreator
   PagedQueryResponseImpl(@JsonProperty("total") final Long total, @JsonProperty("offset") final Long offset, @JsonProperty("meta") final Object meta, @JsonProperty("count") final Long count, @JsonProperty("limit") final Long limit, @JsonProperty("results") final java.util.List<com.commercetools.api.generated.models.common.BaseResource> results, @JsonProperty("facets") final com.commercetools.api.generated.models.product.FacetResults facets) {
      this.total = total;
      this.offset = offset;
      this.meta = meta;
      this.count = count;
      this.limit = limit;
      this.results = results;
      this.facets = facets;
   }
   public PagedQueryResponseImpl() {
      
   }
   
   
   public Long getTotal(){
      return this.total;
   }
   
   
   public Long getOffset(){
      return this.offset;
   }
   
   
   public Object getMeta(){
      return this.meta;
   }
   
   
   public Long getCount(){
      return this.count;
   }
   
   
   public Long getLimit(){
      return this.limit;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.common.BaseResource> getResults(){
      return this.results;
   }
   
   
   public com.commercetools.api.generated.models.product.FacetResults getFacets(){
      return this.facets;
   }

   public void setTotal(final Long total){
      this.total = total;
   }
   
   public void setOffset(final Long offset){
      this.offset = offset;
   }
   
   public void setMeta(final Object meta){
      this.meta = meta;
   }
   
   public void setCount(final Long count){
      this.count = count;
   }
   
   public void setLimit(final Long limit){
      this.limit = limit;
   }
   
   public void setResults(final java.util.List<com.commercetools.api.generated.models.common.BaseResource> results){
      this.results = results;
   }
   
   public void setFacets(final com.commercetools.api.generated.models.product.FacetResults facets){
      this.facets = facets;
   }

}