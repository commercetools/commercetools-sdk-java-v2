package com.commercetools.models.extension;

import com.commercetools.models.extension.Extension;
import com.commercetools.models.extension.ExtensionPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionPagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.models.extension.Extension> results;
   
   public ExtensionPagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public ExtensionPagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public ExtensionPagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public ExtensionPagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public ExtensionPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.extension.Extension> results) {
      this.results = results;
      return this;
   }
   
   @Nullable
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
   
   
   public java.util.List<com.commercetools.models.extension.Extension> getResults(){
      return this.results;
   }

   public ExtensionPagedQueryResponse build() {
       return new ExtensionPagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static ExtensionPagedQueryResponseBuilder of() {
      return new ExtensionPagedQueryResponseBuilder();
   }
   
   public static ExtensionPagedQueryResponseBuilder of(final ExtensionPagedQueryResponse template) {
      ExtensionPagedQueryResponseBuilder builder = new ExtensionPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}