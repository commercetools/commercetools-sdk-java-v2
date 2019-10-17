package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.payment.PaymentUpdateAction;
import com.commercetools.api.generated.models.payment.PaymentChangeTransactionInteractionIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentChangeTransactionInteractionIdActionBuilder {
   
   
   private String interactionId;
   
   
   private String transactionId;
   
   public PaymentChangeTransactionInteractionIdActionBuilder interactionId( final String interactionId) {
      this.interactionId = interactionId;
      return this;
   }
   
   public PaymentChangeTransactionInteractionIdActionBuilder transactionId( final String transactionId) {
      this.transactionId = transactionId;
      return this;
   }
   
   
   public String getInteractionId(){
      return this.interactionId;
   }
   
   
   public String getTransactionId(){
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