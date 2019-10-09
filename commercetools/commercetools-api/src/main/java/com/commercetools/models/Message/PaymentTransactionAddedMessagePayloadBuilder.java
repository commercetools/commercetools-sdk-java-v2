package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.payment.Transaction;
import com.commercetools.models.message.PaymentTransactionAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentTransactionAddedMessagePayloadBuilder {
   
   
   private com.commercetools.models.payment.Transaction transaction;
   
   public PaymentTransactionAddedMessagePayloadBuilder transaction( final com.commercetools.models.payment.Transaction transaction) {
      this.transaction = transaction;
      return this;
   }
   
   
   public com.commercetools.models.payment.Transaction getTransaction(){
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