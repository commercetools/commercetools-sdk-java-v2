package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.payment.PaymentUpdateAction;
import com.commercetools.api.generated.models.payment.TransactionState;
import com.commercetools.api.generated.models.payment.PaymentChangeTransactionStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentChangeTransactionStateActionBuilder {
   
   
   private com.commercetools.api.generated.models.payment.TransactionState state;
   
   
   private String transactionId;
   
   public PaymentChangeTransactionStateActionBuilder state( final com.commercetools.api.generated.models.payment.TransactionState state) {
      this.state = state;
      return this;
   }
   
   public PaymentChangeTransactionStateActionBuilder transactionId( final String transactionId) {
      this.transactionId = transactionId;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.payment.TransactionState getState(){
      return this.state;
   }
   
   
   public String getTransactionId(){
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