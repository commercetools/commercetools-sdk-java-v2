package com.commercetools.api.ml.generated.models.missing_data;

import com.commercetools.api.ml.generated.models.missing_data.MissingImages;
import com.commercetools.api.ml.generated.models.missing_data.MissingImagesMeta;
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
public final class MissingImagesPagedQueryResultImpl implements MissingImagesPagedQueryResult {

   private Long count;
   
   private Long total;
   
   private Long offset;
   
   private java.util.List<com.commercetools.api.ml.generated.models.missing_data.MissingImages> results;
   
   private com.commercetools.api.ml.generated.models.missing_data.MissingImagesMeta meta;

   @JsonCreator
   MissingImagesPagedQueryResultImpl(@JsonProperty("count") final Long count, @JsonProperty("total") final Long total, @JsonProperty("offset") final Long offset, @JsonProperty("results") final java.util.List<com.commercetools.api.ml.generated.models.missing_data.MissingImages> results, @JsonProperty("meta") final com.commercetools.api.ml.generated.models.missing_data.MissingImagesMeta meta) {
      this.count = count;
      this.total = total;
      this.offset = offset;
      this.results = results;
      this.meta = meta;
   }
   public MissingImagesPagedQueryResultImpl() {
      
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
   
   
   public java.util.List<com.commercetools.api.ml.generated.models.missing_data.MissingImages> getResults(){
      return this.results;
   }
   
   
   public com.commercetools.api.ml.generated.models.missing_data.MissingImagesMeta getMeta(){
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
   
   public void setResults(final java.util.List<com.commercetools.api.ml.generated.models.missing_data.MissingImages> results){
      this.results = results;
   }
   
   public void setMeta(final com.commercetools.api.ml.generated.models.missing_data.MissingImagesMeta meta){
      this.meta = meta;
   }

}
