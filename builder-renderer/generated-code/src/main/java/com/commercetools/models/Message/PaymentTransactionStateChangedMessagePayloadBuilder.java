package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Payment.TransactionState;
import java.lang.String;
import com.commercetools.models.Message.PaymentTransactionStateChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentTransactionStateChangedMessagePayloadBuilder {
   
   
   private com.commercetools.models.Payment.TransactionState state;
   
   
   private java.lang.String transactionId;
   
   public PaymentTransactionStateChangedMessagePayloadBuilder state( final com.commercetools.models.Payment.TransactionState state) {
      this.state = state;
      return this;
   }
   
   public PaymentTransactionStateChangedMessagePayloadBuilder transactionId( final java.lang.String transactionId) {
      this.transactionId = transactionId;
      return this;
   }
   
   
   public com.commercetools.models.Payment.TransactionState getState(){
      return this.state;
   }
   
   
   public java.lang.String getTransactionId(){
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