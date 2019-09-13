package com.commercetools.models.api_client;

import com.commercetools.models.api_client.ApiClient;
import java.lang.Long;
import com.commercetools.models.api_client.ApiClientPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ApiClientPagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.api_client.ApiClient> results;
   
   public ApiClientPagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public ApiClientPagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public ApiClientPagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public ApiClientPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.api_client.ApiClient> results) {
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
   
   
   public java.util.List<com.commercetools.models.api_client.ApiClient> getResults(){
      return this.results;
   }

   public ApiClientPagedQueryResponse build() {
       return new ApiClientPagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static ApiClientPagedQueryResponseBuilder of() {
      return new ApiClientPagedQueryResponseBuilder();
   }
   
   public static ApiClientPagedQueryResponseBuilder of(final ApiClientPagedQueryResponse template) {
      ApiClientPagedQueryResponseBuilder builder = new ApiClientPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}