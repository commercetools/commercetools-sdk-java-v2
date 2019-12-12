package com.commercetools.api.generated.models.custom_object;

import com.commercetools.api.generated.models.custom_object.CustomObject;
import com.commercetools.api.generated.models.custom_object.CustomObjectPagedQueryResponse;
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
public final class CustomObjectPagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.api.generated.models.custom_object.CustomObject> results;
   
   public CustomObjectPagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public CustomObjectPagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public CustomObjectPagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public CustomObjectPagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public CustomObjectPagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.generated.models.custom_object.CustomObject> results) {
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
   
   
   public java.util.List<com.commercetools.api.generated.models.custom_object.CustomObject> getResults(){
      return this.results;
   }

   public CustomObjectPagedQueryResponse build() {
       return new CustomObjectPagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static CustomObjectPagedQueryResponseBuilder of() {
      return new CustomObjectPagedQueryResponseBuilder();
   }
   
   public static CustomObjectPagedQueryResponseBuilder of(final CustomObjectPagedQueryResponse template) {
      CustomObjectPagedQueryResponseBuilder builder = new CustomObjectPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}