package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyPaymentUpdateAction;
import com.commercetools.api.models.payment.TransactionDraft;
import com.commercetools.api.models.me.MyPaymentAddTransactionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyPaymentAddTransactionActionBuilder {


   private com.commercetools.api.models.payment.TransactionDraft transaction;

   public MyPaymentAddTransactionActionBuilder transaction( final com.commercetools.api.models.payment.TransactionDraft transaction) {
      this.transaction = transaction;
      return this;
   }


   public com.commercetools.api.models.payment.TransactionDraft getTransaction(){
      return this.transaction;
   }

   public MyPaymentAddTransactionAction build() {
       return new MyPaymentAddTransactionActionImpl(transaction);
   }

   public static MyPaymentAddTransactionActionBuilder of() {
      return new MyPaymentAddTransactionActionBuilder();
   }

   public static MyPaymentAddTransactionActionBuilder of(final MyPaymentAddTransactionAction template) {
      MyPaymentAddTransactionActionBuilder builder = new MyPaymentAddTransactionActionBuilder();
      builder.transaction = template.getTransaction();
      return builder;
   }

}
