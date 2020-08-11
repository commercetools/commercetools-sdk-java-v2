package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.Payment;
import com.commercetools.api.models.payment.PaymentPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentPagedQueryResponseBuilder {

   @Nullable
   private Long total;


   private Long offset;


   private Long count;


   private Long limit;


   private java.util.List<com.commercetools.api.models.payment.Payment> results;

   public PaymentPagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }

   public PaymentPagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }

   public PaymentPagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }

   public PaymentPagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }

   public PaymentPagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.models.payment.Payment> results) {
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


   public java.util.List<com.commercetools.api.models.payment.Payment> getResults(){
      return this.results;
   }

   public PaymentPagedQueryResponse build() {
       return new PaymentPagedQueryResponseImpl(total, offset, count, limit, results);
   }

   public static PaymentPagedQueryResponseBuilder of() {
      return new PaymentPagedQueryResponseBuilder();
   }

   public static PaymentPagedQueryResponseBuilder of(final PaymentPagedQueryResponse template) {
      PaymentPagedQueryResponseBuilder builder = new PaymentPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }

}
