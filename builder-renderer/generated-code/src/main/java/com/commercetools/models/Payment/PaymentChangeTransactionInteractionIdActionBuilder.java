package com.commercetools.models.Payment;

import com.commercetools.models.Payment.PaymentUpdateAction;
import java.lang.String;
import com.commercetools.models.Payment.PaymentChangeTransactionInteractionIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentChangeTransactionInteractionIdActionBuilder {
   
   
   private java.lang.String interactionId;
   
   
   private java.lang.String transactionId;
   
   public PaymentChangeTransactionInteractionIdActionBuilder interactionId( final java.lang.String interactionId) {
      this.interactionId = interactionId;
      return this;
   }
   
   public PaymentChangeTransactionInteractionIdActionBuilder transactionId( final java.lang.String transactionId) {
      this.transactionId = transactionId;
      return this;
   }
   
   
   public java.lang.String getInteractionId(){
      return this.interactionId;
   }
   
   
   public java.lang.String getTransactionId(){
      return this.transactionId;
   }

   public PaymentChangeTransactionInteractionIdAction build() {
       return new PaymentChangeTransactionInteractionIdActionImpl(interactionId, transactionId);
   }
   
   public static PaymentChangeTransactionInteractionIdActionBuilder of() {
      return new PaymentChangeTransactionInteractionIdActionBuilder();
   }
   
   public static PaymentChangeTransactionInteractionIdActionBuilder of(final PaymentChangeTransactionInteractionIdAction template) {
      PaymentChangeTransactionInteractionIdActionBuilder builder = new PaymentChangeTransactionInteractionIdActionBuilder();
      builder.interactionId = template.getInteractionId();
      builder.transactionId = template.getTransactionId();
      return builder;
   }
   
}