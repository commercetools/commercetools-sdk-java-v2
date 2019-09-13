package com.commercetools.models.common;

import com.commercetools.models.common.BaseResource;
import com.commercetools.models.product.FacetResults;
import java.lang.Long;
import java.lang.Object;
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

   private java.lang.Long total;
   
   private java.lang.Long offset;
   
   private java.lang.Object meta;
   
   private java.lang.Long count;
   
   private java.util.List<com.commercetools.models.common.BaseResource> results;
   
   private com.commercetools.models.product.FacetResults facets;

   @JsonCreator
   PagedQueryResponseImpl(@JsonProperty("total") final java.lang.Long total, @JsonProperty("offset") final java.lang.Long offset, @JsonProperty("meta") final java.lang.Object meta, @JsonProperty("count") final java.lang.Long count, @JsonProperty("results") final java.util.List<com.commercetools.models.common.BaseResource> results, @JsonProperty("facets") final com.commercetools.models.product.FacetResults facets) {
      this.total = total;
      this.offset = offset;
      this.meta = meta;
      this.count = count;
      this.results = results;
      this.facets = facets;
   }
   public PagedQueryResponseImpl() {
      
   }
   
   
   public java.lang.Long getTotal(){
      return this.total;
   }
   
   
   public java.lang.Long getOffset(){
      return this.offset;
   }
   
   
   public java.lang.Object getMeta(){
      return this.meta;
   }
   
   
   public java.lang.Long getCount(){
      return this.count;
   }
   
   
   public java.util.List<com.commercetools.models.common.BaseResource> getResults(){
      return this.results;
   }
   
   
   public com.commercetools.models.product.FacetResults getFacets(){
      return this.facets;
   }

   public void setTotal(final java.lang.Long total){
      this.total = total;
   }
   
   public void setOffset(final java.lang.Long offset){
      this.offset = offset;
   }
   
   public void setMeta(final java.lang.Object meta){
      this.meta = meta;
   }
   
   public void setCount(final java.lang.Long count){
      this.count = count;
   }
   
   public void setResults(final java.util.List<com.commercetools.models.common.BaseResource> results){
      this.results = results;
   }
   
   public void setFacets(final com.commercetools.models.product.FacetResults facets){
      this.facets = facets;
   }

}