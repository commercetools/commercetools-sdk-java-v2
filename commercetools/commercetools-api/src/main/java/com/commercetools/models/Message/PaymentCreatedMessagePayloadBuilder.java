package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.payment.Payment;
import java.lang.String;
import com.commercetools.models.message.PaymentCreatedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentCreatedMessagePayloadBuilder {
   
   
   private com.commercetools.models.payment.Payment payment;
   
   public PaymentCreatedMessagePayloadBuilder payment( final com.commercetools.models.payment.Payment payment) {
      this.payment = payment;
      return this;
   }
   
   
   public com.commercetools.models.payment.Payment getPayment(){
      return this.payment;
   }

   public PaymentCreatedMessagePayload build() {
       return new PaymentCreatedMessagePayloadImpl(payment);
   }
   
   public static PaymentCreatedMessagePayloadBuilder of() {
      return new PaymentCreatedMessagePayloadBuilder();
   }
   
   public static PaymentCreatedMessagePayloadBuilder of(final PaymentCreatedMessagePayload template) {
      PaymentCreatedMessagePayloadBuilder builder = new PaymentCreatedMessagePayloadBuilder();
      builder.payment = template.getPayment();
      return builder;
   }
   
}