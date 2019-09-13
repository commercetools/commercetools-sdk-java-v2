package com.commercetools.models.payment;

import com.commercetools.models.payment.PaymentUpdateAction;
import com.commercetools.models.payment.TransactionState;
import java.lang.String;
import com.commercetools.models.payment.PaymentChangeTransactionStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentChangeTransactionStateActionBuilder {
   
   
   private com.commercetools.models.payment.TransactionState state;
   
   
   private java.lang.String transactionId;
   
   public PaymentChangeTransactionStateActionBuilder state( final com.commercetools.models.payment.TransactionState state) {
      this.state = state;
      return this;
   }
   
   public PaymentChangeTransactionStateActionBuilder transactionId( final java.lang.String transactionId) {
      this.transactionId = transactionId;
      return this;
   }
   
   
   public com.commercetools.models.payment.TransactionState getState(){
      return this.state;
   }
   
   
   public java.lang.String getTransactionId(){
      return this.transactionId;
   }

   public PaymentChangeTransactionStateAction build() {
       return new PaymentChangeTransactionStateActionImpl(state, transactionId);
   }
   
   public static PaymentChangeTransactionStateActionBuilder of() {
      return new PaymentChangeTransactionStateActionBuilder();
   }
   
   public static PaymentChangeTransactionStateActionBuilder of(final PaymentChangeTransactionStateAction template) {
      PaymentChangeTransactionStateActionBuilder builder = new PaymentChangeTransactionStateActionBuilder();
      builder.state = template.getState();
      builder.transactionId = template.getTransactionId();
      return builder;
   }
   
}