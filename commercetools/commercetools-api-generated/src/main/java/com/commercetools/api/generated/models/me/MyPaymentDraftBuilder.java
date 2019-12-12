package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.me.MyTransactionDraft;
import com.commercetools.api.generated.models.payment.PaymentMethodInfo;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import com.commercetools.api.generated.models.me.MyPaymentDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyPaymentDraftBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.payment.PaymentMethodInfo paymentMethodInfo;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   
   private com.commercetools.api.generated.models.common.Money amountPlanned;
   
   @Nullable
   private com.commercetools.api.generated.models.me.MyTransactionDraft transaction;
   
   public MyPaymentDraftBuilder paymentMethodInfo(@Nullable final com.commercetools.api.generated.models.payment.PaymentMethodInfo paymentMethodInfo) {
      this.paymentMethodInfo = paymentMethodInfo;
      return this;
   }
   
   public MyPaymentDraftBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public MyPaymentDraftBuilder amountPlanned( final com.commercetools.api.generated.models.common.Money amountPlanned) {
      this.amountPlanned = amountPlanned;
      return this;
   }
   
   public MyPaymentDraftBuilder transaction(@Nullable final com.commercetools.api.generated.models.me.MyTransactionDraft transaction) {
      this.transaction = transaction;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.payment.PaymentMethodInfo getPaymentMethodInfo(){
      return this.paymentMethodInfo;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getAmountPlanned(){
      return this.amountPlanned;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.me.MyTransactionDraft getTransaction(){
      return this.transaction;
   }

   public MyPaymentDraft build() {
       return new MyPaymentDraftImpl(paymentMethodInfo, custom, amountPlanned, transaction);
   }
   
   public static MyPaymentDraftBuilder of() {
      return new MyPaymentDraftBuilder();
   }
   
   public static MyPaymentDraftBuilder of(final MyPaymentDraft template) {
      MyPaymentDraftBuilder builder = new MyPaymentDraftBuilder();
      builder.paymentMethodInfo = template.getPaymentMethodInfo();
      builder.custom = template.getCustom();
      builder.amountPlanned = template.getAmountPlanned();
      builder.transaction = template.getTransaction();
      return builder;
   }
   
}