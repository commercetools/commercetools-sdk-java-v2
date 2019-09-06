package com.commercetools.models.Payment;

import com.commercetools.models.Payment.PaymentUpdateAction;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Payment.PaymentChangeTransactionTimestampAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentChangeTransactionTimestampActionBuilder {
   
   
   private java.lang.String transactionId;
   
   
   private java.time.ZonedDateTime timestamp;
   
   public PaymentChangeTransactionTimestampActionBuilder transactionId( final java.lang.String transactionId) {
      this.transactionId = transactionId;
      return this;
   }
   
   public PaymentChangeTransactionTimestampActionBuilder timestamp( final java.time.ZonedDateTime timestamp) {
      this.timestamp = timestamp;
      return this;
   }
   
   
   public java.lang.String getTransactionId(){
      return this.transactionId;
   }
   
   
   public java.time.ZonedDateTime getTimestamp(){
      return this.timestamp;
   }

   public PaymentChangeTransactionTimestampAction build() {
       return new PaymentChangeTransactionTimestampActionImpl(transactionId, timestamp);
   }
   
   public static PaymentChangeTransactionTimestampActionBuilder of() {
      return new PaymentChangeTransactionTimestampActionBuilder();
   }
   
   public static PaymentChangeTransactionTimestampActionBuilder of(final PaymentChangeTransactionTimestampAction template) {
      PaymentChangeTransactionTimestampActionBuilder builder = new PaymentChangeTransactionTimestampActionBuilder();
      builder.transactionId = template.getTransactionId();
      builder.timestamp = template.getTimestamp();
      return builder;
   }
   
}