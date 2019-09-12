package com.commercetools.models.Payment;

import com.commercetools.models.Payment.Payment;
import java.lang.Long;
import com.commercetools.models.Payment.PaymentPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentPagedQueryResponseBuilder {
   
   @Nullable
   private java.lang.Long total;
   
   
   private java.lang.Long offset;
   
   
   private java.lang.Long count;
   
   
   private java.util.List<com.commercetools.models.Payment.Payment> results;
   
   public PaymentPagedQueryResponseBuilder total(@Nullable final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public PaymentPagedQueryResponseBuilder offset( final java.lang.Long offset) {
      this.offset = offset;
      return this;
   }
   
   public PaymentPagedQueryResponseBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public PaymentPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.Payment.Payment> results) {
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
   
   
   public java.util.List<com.commercetools.models.Payment.Payment> getResults(){
      return this.results;
   }

   public PaymentPagedQueryResponse build() {
       return new PaymentPagedQueryResponseImpl(total, offset, count, results);
   }
   
   public static PaymentPagedQueryResponseBuilder of() {
      return new PaymentPagedQueryResponseBuilder();
   }
   
   public static PaymentPagedQueryResponseBuilder of(final PaymentPagedQueryResponse template) {
      PaymentPagedQueryResponseBuilder builder = new PaymentPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.results = template.getResults();
      return builder;
   }
   
}