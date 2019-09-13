package com.commercetools.models.subscription;

import com.commercetools.models.subscription.Subscription;
import java.lang.Long;
import com.commercetools.models.subscription.SubscriptionPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class SubscriptionPagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.subscription.Subscription> results;
   
   public SubscriptionPagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public SubscriptionPagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public SubscriptionPagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public SubscriptionPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.subscription.Subscription> results) {
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
   
   
   public java.util.List<com.commercetools.models.subscription.Subscription> getResults(){
      return this.results;
   }

   public SubscriptionPagedQueryResponse build() {
       return new SubscriptionPagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static SubscriptionPagedQueryResponseBuilder of() {
      return new SubscriptionPagedQueryResponseBuilder();
   }
   
   public static SubscriptionPagedQueryResponseBuilder of(final SubscriptionPagedQueryResponse template) {
      SubscriptionPagedQueryResponseBuilder builder = new SubscriptionPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}