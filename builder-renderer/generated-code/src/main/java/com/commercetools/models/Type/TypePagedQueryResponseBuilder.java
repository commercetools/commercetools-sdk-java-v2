package com.commercetools.models.Type;

import com.commercetools.models.Type.Type;
import java.lang.Long;
import com.commercetools.models.Type.TypePagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypePagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.Type.Type> results;
   
   public TypePagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public TypePagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public TypePagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public TypePagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.Type.Type> results) {
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
   
   
   public java.util.List<com.commercetools.models.Type.Type> getResults(){
      return this.results;
   }

   public TypePagedQueryResponse build() {
       return new TypePagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static TypePagedQueryResponseBuilder of() {
      return new TypePagedQueryResponseBuilder();
   }
   
   public static TypePagedQueryResponseBuilder of(final TypePagedQueryResponse template) {
      TypePagedQueryResponseBuilder builder = new TypePagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}