package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Payment.Transaction;
import java.lang.String;
import com.commercetools.models.Message.PaymentTransactionAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentTransactionAddedMessagePayloadBuilder {
   
   
   private com.commercetools.models.Payment.Transaction transaction;
   
   public PaymentTransactionAddedMessagePayloadBuilder transaction( final com.commercetools.models.Payment.Transaction transaction) {
      this.transaction = transaction;
      return this;
   }
   
   
   public com.commercetools.models.Payment.Transaction getTransaction(){
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