package com.commercetools.models.state;

import com.commercetools.models.state.State;
import java.lang.Long;
import com.commercetools.models.state.StatePagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StatePagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.state.State> results;
   
   public StatePagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public StatePagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public StatePagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public StatePagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.state.State> results) {
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
   
   
   public java.util.List<com.commercetools.models.state.State> getResults(){
      return this.results;
   }

   public StatePagedQueryResponse build() {
       return new StatePagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static StatePagedQueryResponseBuilder of() {
      return new StatePagedQueryResponseBuilder();
   }
   
   public static StatePagedQueryResponseBuilder of(final StatePagedQueryResponse template) {
      StatePagedQueryResponseBuilder builder = new StatePagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}