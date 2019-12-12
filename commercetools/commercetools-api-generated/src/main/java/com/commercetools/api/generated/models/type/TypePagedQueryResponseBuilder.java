package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.Type;
import com.commercetools.api.generated.models.type.TypePagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypePagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.api.generated.models.type.Type> results;
   
   public TypePagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public TypePagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public TypePagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public TypePagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public TypePagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.generated.models.type.Type> results) {
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
   
   
   public java.util.List<com.commercetools.api.generated.models.type.Type> getResults(){
      return this.results;
   }

   public TypePagedQueryResponse build() {
       return new TypePagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static TypePagedQueryResponseBuilder of() {
      return new TypePagedQueryResponseBuilder();
   }
   
   public static TypePagedQueryResponseBuilder of(final TypePagedQueryResponse template) {
      TypePagedQueryResponseBuilder builder = new TypePagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}