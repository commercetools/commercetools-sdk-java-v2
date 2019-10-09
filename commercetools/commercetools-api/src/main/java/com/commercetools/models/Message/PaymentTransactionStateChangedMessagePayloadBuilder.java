package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.payment.TransactionState;
import com.commercetools.models.message.PaymentTransactionStateChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentTransactionStateChangedMessagePayloadBuilder {
   
   
   private com.commercetools.models.payment.TransactionState state;
   
   
   private String transactionId;
   
   public PaymentTransactionStateChangedMessagePayloadBuilder state( final com.commercetools.models.payment.TransactionState state) {
      this.state = state;
      return this;
   }
   
   public PaymentTransactionStateChangedMessagePayloadBuilder transactionId( final String transactionId) {
      this.transactionId = transactionId;
      return this;
   }
   
   
   public com.commercetools.models.payment.TransactionState getState(){
      return this.state;
   }
   
   
   public String getTransactionId(){
      return this.transactionId;
   }

   public PaymentTransactionStateChangedMessagePayload build() {
       return new PaymentTransactionStateChangedMessagePayloadImpl(state, transactionId);
   }
   
   public static PaymentTransactionStateChangedMessagePayloadBuilder of() {
      return new PaymentTransactionStateChangedMessagePayloadBuilder();
   }
   
   public static PaymentTransactionStateChangedMessagePayloadBuilder of(final PaymentTransactionStateChangedMessagePayload template) {
      PaymentTransactionStateChangedMessagePayloadBuilder builder = new PaymentTransactionStateChangedMessagePayloadBuilder();
      builder.state = template.getState();
      builder.transactionId = template.getTransactionId();
      return builder;
   }
   
}