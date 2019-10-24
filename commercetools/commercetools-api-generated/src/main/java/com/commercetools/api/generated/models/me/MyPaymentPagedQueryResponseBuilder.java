package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyPayment;
import com.commercetools.api.generated.models.me.MyPaymentPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyPaymentPagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.api.generated.models.me.MyPayment> results;
   
   public MyPaymentPagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public MyPaymentPagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public MyPaymentPagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public MyPaymentPagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public MyPaymentPagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.generated.models.me.MyPayment> results) {
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
   
   
   public java.util.List<com.commercetools.api.generated.models.me.MyPayment> getResults(){
      return this.results;
   }

   public MyPaymentPagedQueryResponse build() {
       return new MyPaymentPagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static MyPaymentPagedQueryResponseBuilder of() {
      return new MyPaymentPagedQueryResponseBuilder();
   }
   
   public static MyPaymentPagedQueryResponseBuilder of(final MyPaymentPagedQueryResponse template) {
      MyPaymentPagedQueryResponseBuilder builder = new MyPaymentPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}