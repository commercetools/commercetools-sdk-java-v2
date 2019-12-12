package com.commercetools.api.generated.models.api_client;

import com.commercetools.api.generated.models.api_client.ApiClient;
import com.commercetools.api.generated.models.api_client.ApiClientPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ApiClientPagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.api.generated.models.api_client.ApiClient> results;
   
   public ApiClientPagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public ApiClientPagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public ApiClientPagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public ApiClientPagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public ApiClientPagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.generated.models.api_client.ApiClient> results) {
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
   
   
   public java.util.List<com.commercetools.api.generated.models.api_client.ApiClient> getResults(){
      return this.results;
   }

   public ApiClientPagedQueryResponse build() {
       return new ApiClientPagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static ApiClientPagedQueryResponseBuilder of() {
      return new ApiClientPagedQueryResponseBuilder();
   }
   
   public static ApiClientPagedQueryResponseBuilder of(final ApiClientPagedQueryResponse template) {
      ApiClientPagedQueryResponseBuilder builder = new ApiClientPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}