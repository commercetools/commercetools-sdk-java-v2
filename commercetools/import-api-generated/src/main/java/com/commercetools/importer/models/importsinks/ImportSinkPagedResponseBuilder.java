package com.commercetools.importer.models.importsinks;

import com.commercetools.importer.models.importsinks.ImportSink;
import com.commercetools.importer.models.importsinks.ImportSinkPagedResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImportSinkPagedResponseBuilder {
   
   
   private Integer offset;
   
   
   private Integer count;
   
   
   private Integer limit;
   
   
   private java.util.List<com.commercetools.importer.models.importsinks.ImportSink> results;
   
   public ImportSinkPagedResponseBuilder offset( final Integer offset) {
      this.offset = offset;
      return this;
   }
   
   public ImportSinkPagedResponseBuilder count( final Integer count) {
      this.count = count;
      return this;
   }
   
   public ImportSinkPagedResponseBuilder limit( final Integer limit) {
      this.limit = limit;
      return this;
   }
   
   public ImportSinkPagedResponseBuilder results( final java.util.List<com.commercetools.importer.models.importsinks.ImportSink> results) {
      this.results = results;
      return this;
   }
   
   
   public Integer getOffset(){
      return this.offset;
   }
   
   
   public Integer getCount(){
      return this.count;
   }
   
   
   public Integer getLimit(){
      return this.limit;
   }
   
   
   public java.util.List<com.commercetools.importer.models.importsinks.ImportSink> getResults(){
      return this.results;
   }

   public ImportSinkPagedResponse build() {
       return new ImportSinkPagedResponseImpl(offset, count, limit, results);
   }
   
   public static ImportSinkPagedResponseBuilder of() {
      return new ImportSinkPagedResponseBuilder();
   }
   
   public static ImportSinkPagedResponseBuilder of(final ImportSinkPagedResponse template) {
      ImportSinkPagedResponseBuilder builder = new ImportSinkPagedResponseBuilder();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}