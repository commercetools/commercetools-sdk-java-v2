package com.commercetools.models.product;

import com.commercetools.models.product.FacetResults;
import com.commercetools.models.product.ProductProjection;
import java.lang.Long;
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
public final class ProductProjectionPagedSearchResponseImpl implements ProductProjectionPagedSearchResponse {

   private java.lang.Long total;
   
   private java.lang.Long offset;
   
   private java.lang.Long count;
   
   private java.util.List<com.commercetools.models.product.ProductProjection> results;
   
   private com.commercetools.models.product.FacetResults facets;

   @JsonCreator
   ProductProjectionPagedSearchResponseImpl(@JsonProperty("total") final java.lang.Long total, @JsonProperty("offset") final java.lang.Long offset, @JsonProperty("count") final java.lang.Long count, @JsonProperty("results") final java.util.List<com.commercetools.models.product.ProductProjection> results, @JsonProperty("facets") final com.commercetools.models.product.FacetResults facets) {
      this.total = total;
      this.offset = offset;
      this.count = count;
      this.results = results;
      this.facets = facets;
   }
   public ProductProjectionPagedSearchResponseImpl() {
      
   }
   
   
   public java.lang.Long getTotal(){
      return this.total;
   }
   
   
   public java.lang.Long getOffset(){
      return this.offset;
   }
   
   
   public java.lang.Long getCount(){
      return this.count;
   }
   
   
   public java.util.List<com.commercetools.models.product.ProductProjection> getResults(){
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
   
   public void setCount(final java.lang.Long count){
      this.count = count;
   }
   
   public void setResults(final java.util.List<com.commercetools.models.product.ProductProjection> results){
      this.results = results;
   }
   
   public void setFacets(final com.commercetools.models.product.FacetResults facets){
      this.facets = facets;
   }

}