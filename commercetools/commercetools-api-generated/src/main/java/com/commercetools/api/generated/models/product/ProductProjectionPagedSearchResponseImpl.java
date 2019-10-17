package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.FacetResults;
import com.commercetools.api.generated.models.product.ProductProjection;
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

   private Long total;
   
   private Long offset;
   
   private Long count;
   
   private java.util.List<com.commercetools.api.generated.models.product.ProductProjection> results;
   
   private com.commercetools.api.generated.models.product.FacetResults facets;

   @JsonCreator
   ProductProjectionPagedSearchResponseImpl(@JsonProperty("total") final Long total, @JsonProperty("offset") final Long offset, @JsonProperty("count") final Long count, @JsonProperty("results") final java.util.List<com.commercetools.api.generated.models.product.ProductProjection> results, @JsonProperty("facets") final com.commercetools.api.generated.models.product.FacetResults facets) {
      this.total = total;
      this.offset = offset;
      this.count = count;
      this.results = results;
      this.facets = facets;
   }
   public ProductProjectionPagedSearchResponseImpl() {
      
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
   
   
   public java.util.List<com.commercetools.api.generated.models.product.ProductProjection> getResults(){
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
   
   public void setCount(final Long count){
      this.count = count;
   }
   
   public void setResults(final java.util.List<com.commercetools.api.generated.models.product.ProductProjection> results){
      this.results = results;
   }
   
   public void setFacets(final com.commercetools.api.generated.models.product.FacetResults facets){
      this.facets = facets;
   }

}