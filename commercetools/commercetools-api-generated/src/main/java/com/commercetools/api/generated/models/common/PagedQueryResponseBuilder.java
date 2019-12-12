package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.common.BaseResource;
import com.commercetools.api.generated.models.product.FacetResults;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.generated.models.common.PagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   @Nullable
   private com.fasterxml.jackson.databind.JsonNode meta;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.api.generated.models.common.BaseResource> results;
   
   @Nullable
   private com.commercetools.api.generated.models.product.FacetResults facets;
   
   public PagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public PagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public PagedQueryResponseBuilder meta(@Nullable final com.fasterxml.jackson.databind.JsonNode meta) {
      this.meta = meta;
      return this;
   }
   
   public PagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public PagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public PagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.generated.models.common.BaseResource> results) {
      this.results = results;
      return this;
   }
   
   public PagedQueryResponseBuilder facets(@Nullable final com.commercetools.api.generated.models.product.FacetResults facets) {
      this.facets = facets;
      return this;
   }
   
   @Nullable
   public Long getTotal(){
      return this.total;
   }
   
   
   public Long getOffset(){
      return this.offset;
   }
   
   @Nullable
   public com.fasterxml.jackson.databind.JsonNode getMeta(){
      return this.meta;
   }
   
   
   public Long getCount(){
      return this.count;
   }
   
   
   public Long getLimit(){
      return this.limit;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.common.BaseResource> getResults(){
      return this.results;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.product.FacetResults getFacets(){
      return this.facets;
   }

   public PagedQueryResponse build() {
       return new PagedQueryResponseImpl(total, offset, meta, count, limit, results, facets);
   }
   
   public static PagedQueryResponseBuilder of() {
      return new PagedQueryResponseBuilder();
   }
   
   public static PagedQueryResponseBuilder of(final PagedQueryResponse template) {
      PagedQueryResponseBuilder builder = new PagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.meta = template.getMeta();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      builder.facets = template.getFacets();
      return builder;
   }
   
}