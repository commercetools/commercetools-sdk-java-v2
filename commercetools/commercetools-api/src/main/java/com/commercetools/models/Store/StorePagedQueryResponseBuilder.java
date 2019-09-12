package com.commercetools.models.Store;

import com.commercetools.models.Store.Store;
import java.lang.Long;
import com.commercetools.models.Store.StorePagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StorePagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.Store.Store> results;
   
   public StorePagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public StorePagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public StorePagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public StorePagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.Store.Store> results) {
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
   
   
   public java.util.List<com.commercetools.models.Store.Store> getResults(){
      return this.results;
   }

   public StorePagedQueryResponse build() {
       return new StorePagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static StorePagedQueryResponseBuilder of() {
      return new StorePagedQueryResponseBuilder();
   }
   
   public static StorePagedQueryResponseBuilder of(final StorePagedQueryResponse template) {
      StorePagedQueryResponseBuilder builder = new StorePagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}