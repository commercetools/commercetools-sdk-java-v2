package com.commercetools.models.Common;

import com.commercetools.models.Common.BaseResource;
import com.commercetools.models.Product.FacetResults;
import java.lang.Long;
import java.lang.Object;
import com.commercetools.models.Common.PagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   @Nullable
   private java.lang.Object meta;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.Common.BaseResource> results;
   
   @Nullable
   private com.commercetools.models.Product.FacetResults facets;
   
   public PagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public PagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public PagedQueryResponseBuilder meta(@Nullable final java.lang.Object meta) {
      this.meta = meta;
      return this;
   }
   
   public PagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public PagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.Common.BaseResource> results) {
      this.results = results;
      return this;
   }
   
   public PagedQueryResponseBuilder facets(@Nullable final com.commercetools.models.Product.FacetResults facets) {
      this.facets = facets;
      return this;
   }
   
   @Nullable
   public java.lang.Long getTotal(){
      return this.total;
   }
   
   
   public java.lang.Long getOffset(){
      return this.offset;
   }
   
   @Nullable
   public java.lang.Object getMeta(){
      return this.meta;
   }
   
   
   public java.lang.Long getCount(){
      return this.count;
   }
   
   
   public java.util.List<com.commercetools.models.Common.BaseResource> getResults(){
      return this.results;
   }
   
   @Nullable
   public com.commercetools.models.Product.FacetResults getFacets(){
      return this.facets;
   }

   public PagedQueryResponse build() {
       return new PagedQueryResponseImpl(total, offset, meta, count, results, facets);
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
      builder.results = template.getResults();
      builder.facets = template.getFacets();
      return builder;
   }
   
}