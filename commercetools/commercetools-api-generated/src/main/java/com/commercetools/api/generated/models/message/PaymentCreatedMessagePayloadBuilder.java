package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.payment.Payment;
import com.commercetools.api.generated.models.message.PaymentCreatedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentCreatedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.payment.Payment payment;
   
   public PaymentCreatedMessagePayloadBuilder payment( final com.commercetools.api.generated.models.payment.Payment payment) {
      this.payment = payment;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.payment.Payment getPayment(){
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