package com.commercetools.models.store;

import com.commercetools.models.store.Store;
import com.commercetools.models.store.StorePagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StorePagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.models.store.Store> results;
   
   public StorePagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public StorePagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public StorePagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public StorePagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public StorePagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.store.Store> results) {
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
   
   
   public java.util.List<com.commercetools.models.store.Store> getResults(){
      return this.results;
   }

   public StorePagedQueryResponse build() {
       return new StorePagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static StorePagedQueryResponseBuilder of() {
      return new StorePagedQueryResponseBuilder();
   }
   
   public static StorePagedQueryResponseBuilder of(final StorePagedQueryResponse template) {
      StorePagedQueryResponseBuilder builder = new StorePagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}