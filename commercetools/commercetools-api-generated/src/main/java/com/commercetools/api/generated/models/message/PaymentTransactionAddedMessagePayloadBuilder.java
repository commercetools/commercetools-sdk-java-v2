package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.payment.Transaction;
import com.commercetools.api.generated.models.message.PaymentTransactionAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentTransactionAddedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.payment.Transaction transaction;
   
   public PaymentTransactionAddedMessagePayloadBuilder transaction( final com.commercetools.api.generated.models.payment.Transaction transaction) {
      this.transaction = transaction;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.payment.Transaction getTransaction(){
      return this.transaction;
   }

   public PaymentTransactionAddedMessagePayload build() {
       return new PaymentTransactionAddedMessagePayloadImpl(transaction);
   }
   
   public static PaymentTransactionAddedMessagePayloadBuilder of() {
      return new PaymentTransactionAddedMessagePayloadBuilder();
   }
   
   public static PaymentTransactionAddedMessagePayloadBuilder of(final PaymentTransactionAddedMessagePayload template) {
      PaymentTransactionAddedMessagePayloadBuilder builder = new PaymentTransactionAddedMessagePayloadBuilder();
      builder.transaction = template.getTransaction();
      return builder;
   }
   
}