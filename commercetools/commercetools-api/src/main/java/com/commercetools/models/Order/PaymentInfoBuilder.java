package com.commercetools.models.order;

import com.commercetools.models.payment.PaymentReference;
import com.commercetools.models.order.PaymentInfo;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentInfoBuilder {
   
   
   private java.util.List<com.commercetools.models.payment.PaymentReference> payments;
   
   public PaymentInfoBuilder payments( final java.util.List<com.commercetools.models.payment.PaymentReference> payments) {
      this.payments = payments;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.payment.PaymentReference> getPayments(){
      return this.payments;
   }

   public PaymentInfo build() {
       return new PaymentInfoImpl(payments);
   }
   
   public static PaymentInfoBuilder of() {
      return new PaymentInfoBuilder();
   }
   
   public static PaymentInfoBuilder of(final PaymentInfo template) {
      PaymentInfoBuilder builder = new PaymentInfoBuilder();
      builder.payments = template.getPayments();
      return builder;
   }
   
}