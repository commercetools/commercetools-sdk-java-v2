package com.commercetools.importer.models.importsinks;

import com.commercetools.importer.models.importsinks.ImportSink;
import io.vrap.rmf.base.client.utils.Generated;
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


/**
*  <p>This type represents a paged importsink result.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImportSinkPagedResponseImpl implements ImportSinkPagedResponse {

   private Integer offset;
   
   private Integer count;
   
   private Integer limit;
   
   private java.util.List<com.commercetools.importer.models.importsinks.ImportSink> results;

   @JsonCreator
   ImportSinkPagedResponseImpl(@JsonProperty("offset") final Integer offset, @JsonProperty("count") final Integer count, @JsonProperty("limit") final Integer limit, @JsonProperty("results") final java.util.List<com.commercetools.importer.models.importsinks.ImportSink> results) {
      this.offset = offset;
      this.count = count;
      this.limit = limit;
      this.results = results;
   }
   public ImportSinkPagedResponseImpl() {
      
   }
   
   /**
   *  <p>The offset supplied by the client or the server default. It is the number of elements skipped.</p>
   */
   public Integer getOffset(){
      return this.offset;
   }
   
   /**
   *  <p>The actual number of results returned by this response.</p>
   */
   public Integer getCount(){
      return this.count;
   }
   
   /**
   *  <p>The maximum number of import operations returned for a page.</p>
   */
   public Integer getLimit(){
      return this.limit;
   }
   
   /**
   *  <p>The results for this paged response.</p>
   */
   public java.util.List<com.commercetools.importer.models.importsinks.ImportSink> getResults(){
      return this.results;
   }

   public void setOffset(final Integer offset){
      this.offset = offset;
   }
   
   public void setCount(final Integer count){
      this.count = count;
   }
   
   public void setLimit(final Integer limit){
      this.limit = limit;
   }
   
   public void setResults(final java.util.List<com.commercetools.importer.models.importsinks.ImportSink> results){
      this.results = results;
   }

}