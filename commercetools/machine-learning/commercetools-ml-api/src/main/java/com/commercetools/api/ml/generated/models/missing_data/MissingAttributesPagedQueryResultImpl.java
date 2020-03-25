package com.commercetools.api.ml.generated.models.missing_data;

import com.commercetools.api.ml.generated.models.missing_data.MissingAttributes;
import com.commercetools.api.ml.generated.models.missing_data.MissingAttributesMeta;
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
public final class MissingAttributesPagedQueryResultImpl implements MissingAttributesPagedQueryResult {

   private Long count;
   
   private Long total;
   
   private Long offset;
   
   private List<MissingAttributes> results;
   
   private MissingAttributesMeta meta;

   @JsonCreator
   MissingAttributesPagedQueryResultImpl(@JsonProperty("count") final Long count, @JsonProperty("total") final Long total, @JsonProperty("offset") final Long offset, @JsonProperty("results") final List<MissingAttributes> results, @JsonProperty("meta") final MissingAttributesMeta meta) {
      this.count = count;
      this.total = total;
      this.offset = offset;
      this.results = results;
      this.meta = meta;
   }
   public MissingAttributesPagedQueryResultImpl() {
      
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
   
   
   public List<MissingAttributes> getResults(){
      return this.results;
   }
   
   
   public MissingAttributesMeta getMeta(){
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
   
   public void setResults(final List<MissingAttributes> results){
      this.results = results;
   }
   
   public void setMeta(final MissingAttributesMeta meta){
      this.meta = meta;
   }

}
