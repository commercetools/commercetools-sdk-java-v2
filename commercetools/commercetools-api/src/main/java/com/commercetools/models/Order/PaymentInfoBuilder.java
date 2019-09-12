package com.commercetools.models.Order;

import com.commercetools.models.Payment.PaymentReference;
import com.commercetools.models.Order.PaymentInfo;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentInfoBuilder {
   
   
   private java.util.List<com.commercetools.models.Payment.PaymentReference> payments;
   
   public PaymentInfoBuilder payments( final java.util.List<com.commercetools.models.Payment.PaymentReference> payments) {
      this.payments = payments;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.Payment.PaymentReference> getPayments(){
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