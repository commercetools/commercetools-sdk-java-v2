package com.commercetools.models.Extension;

import com.commercetools.models.Extension.Extension;
import java.lang.Long;
import com.commercetools.models.Extension.ExtensionPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionPagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.Extension.Extension> results;
   
   public ExtensionPagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public ExtensionPagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public ExtensionPagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public ExtensionPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.Extension.Extension> results) {
      this.results = results;
      return this;
   }
   
   @Nullable
   public java.lang.Long getTotal(){
      return this.total;
   }
   
   
   public java.lang.Long getOffset(){
      return this.offset;
   }
   
   
   public java.lang.Long getCount(){
      return this.count;
   }
   
   
   public java.util.List<com.commercetools.models.Extension.Extension> getResults(){
      return this.results;
   }

   public ExtensionPagedQueryResponse build() {
       return new ExtensionPagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static ExtensionPagedQueryResponseBuilder of() {
      return new ExtensionPagedQueryResponseBuilder();
   }
   
   public static ExtensionPagedQueryResponseBuilder of(final ExtensionPagedQueryResponse template) {
      ExtensionPagedQueryResponseBuilder builder = new ExtensionPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}