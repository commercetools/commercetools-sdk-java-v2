package com.commercetools.models.custom_object;

import com.commercetools.models.custom_object.CustomObject;
import java.lang.Long;
import com.commercetools.models.custom_object.CustomObjectPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomObjectPagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.custom_object.CustomObject> results;
   
   public CustomObjectPagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public CustomObjectPagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public CustomObjectPagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public CustomObjectPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.custom_object.CustomObject> results) {
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
   
   
   public java.util.List<com.commercetools.models.custom_object.CustomObject> getResults(){
      return this.results;
   }

   public CustomObjectPagedQueryResponse build() {
       return new CustomObjectPagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static CustomObjectPagedQueryResponseBuilder of() {
      return new CustomObjectPagedQueryResponseBuilder();
   }
   
   public static CustomObjectPagedQueryResponseBuilder of(final CustomObjectPagedQueryResponse template) {
      CustomObjectPagedQueryResponseBuilder builder = new CustomObjectPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}