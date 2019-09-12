package com.commercetools.models.Payment;

import com.commercetools.models.Payment.PaymentUpdateAction;
import com.commercetools.models.Payment.TransactionDraft;
import java.lang.String;
import com.commercetools.models.Payment.PaymentAddTransactionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentAddTransactionActionBuilder {
   
   
   private com.commercetools.models.Payment.TransactionDraft transaction;
   
   public PaymentAddTransactionActionBuilder transaction( final com.commercetools.models.Payment.TransactionDraft transaction) {
      this.transaction = transaction;
      return this;
   }
   
   
   public com.commercetools.models.Payment.TransactionDraft getTransaction(){
      return this.transaction;
   }

   public PaymentAddTransactionAction build() {
       return new PaymentAddTransactionActionImpl(transaction);
   }
   
   public static PaymentAddTransactionActionBuilder of() {
      return new PaymentAddTransactionActionBuilder();
   }
   
   public static PaymentAddTransactionActionBuilder of(final PaymentAddTransactionAction template) {
      PaymentAddTransactionActionBuilder builder = new PaymentAddTransactionActionBuilder();
      builder.transaction = template.getTransaction();
      return builder;
   }
   
}