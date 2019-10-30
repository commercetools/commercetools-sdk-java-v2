package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.payment.TransactionState;
import com.commercetools.api.generated.models.message.PaymentTransactionStateChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentTransactionStateChangedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.payment.TransactionState state;
   
   
   private String transactionId;
   
   public PaymentTransactionStateChangedMessagePayloadBuilder state( final com.commercetools.api.generated.models.payment.TransactionState state) {
      this.state = state;
      return this;
   }
   
   public PaymentTransactionStateChangedMessagePayloadBuilder transactionId( final String transactionId) {
      this.transactionId = transactionId;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.payment.TransactionState getState(){
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