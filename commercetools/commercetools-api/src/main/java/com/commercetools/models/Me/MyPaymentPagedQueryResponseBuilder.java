package com.commercetools.models.Me;

import com.commercetools.models.Me.MyPayment;
import java.lang.Long;
import com.commercetools.models.Me.MyPaymentPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyPaymentPagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.Me.MyPayment> results;
   
   public MyPaymentPagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public MyPaymentPagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public MyPaymentPagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public MyPaymentPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.Me.MyPayment> results) {
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
   
   
   public java.util.List<com.commercetools.models.Me.MyPayment> getResults(){
      return this.results;
   }

   public MyPaymentPagedQueryResponse build() {
       return new MyPaymentPagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static MyPaymentPagedQueryResponseBuilder of() {
      return new MyPaymentPagedQueryResponseBuilder();
   }
   
   public static MyPaymentPagedQueryResponseBuilder of(final MyPaymentPagedQueryResponse template) {
      MyPaymentPagedQueryResponseBuilder builder = new MyPaymentPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}