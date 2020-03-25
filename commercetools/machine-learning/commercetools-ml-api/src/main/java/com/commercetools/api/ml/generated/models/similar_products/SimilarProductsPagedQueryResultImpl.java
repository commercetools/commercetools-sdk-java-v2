package com.commercetools.api.ml.generated.models.similar_products;

import com.commercetools.api.ml.generated.models.similar_products.SimilarProductPair;
import com.commercetools.api.ml.generated.models.similar_products.SimilarProductSearchRequestMeta;
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
public final class SimilarProductsPagedQueryResultImpl implements SimilarProductsPagedQueryResult {

   private Long count;
   
   private Long total;
   
   private Long offset;
   
   private List<SimilarProductPair> results;
   
   private SimilarProductSearchRequestMeta meta;

   @JsonCreator
   SimilarProductsPagedQueryResultImpl(@JsonProperty("count") final Long count, @JsonProperty("total") final Long total, @JsonProperty("offset") final Long offset, @JsonProperty("results") final List<SimilarProductPair> results, @JsonProperty("meta") final SimilarProductSearchRequestMeta meta) {
      this.count = count;
      this.total = total;
      this.offset = offset;
      this.results = results;
      this.meta = meta;
   }
   public SimilarProductsPagedQueryResultImpl() {
      
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
   
   
   public List<SimilarProductPair> getResults(){
      return this.results;
   }
   
   
   public SimilarProductSearchRequestMeta getMeta(){
      return this.meta;
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
   
   public void setResults(final List<SimilarProductPair> results){
      this.results = results;
   }
   
   public void setMeta(final SimilarProductSearchRequestMeta meta){
      this.meta = meta;
   }

}
