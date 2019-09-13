package com.commercetools.models.me;

import com.commercetools.models.common.Money;
import com.commercetools.models.me.MyTransactionDraft;
import com.commercetools.models.payment.PaymentMethodInfo;
import com.commercetools.models.type.CustomFieldsDraft;
import com.commercetools.models.me.MyPaymentDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyPaymentDraftBuilder {
   
   @Nullable
   private com.commercetools.models.payment.PaymentMethodInfo paymentMethodInfo;
   
   @Nullable
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   
   private com.commercetools.models.common.Money amountPlanned;
   
   @Nullable
   private com.commercetools.models.me.MyTransactionDraft transaction;
   
   public MyPaymentDraftBuilder paymentMethodInfo(@Nullable final com.commercetools.models.payment.PaymentMethodInfo paymentMethodInfo) {
      this.paymentMethodInfo = paymentMethodInfo;
      return this;
   }
   
   public MyPaymentDraftBuilder custom(@Nullable final com.commercetools.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public MyPaymentDraftBuilder amountPlanned( final com.commercetools.models.common.Money amountPlanned) {
      this.amountPlanned = amountPlanned;
      return this;
   }
   
   public MyPaymentDraftBuilder transaction(@Nullable final com.commercetools.models.me.MyTransactionDraft transaction) {
      this.transaction = transaction;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.payment.PaymentMethodInfo getPaymentMethodInfo(){
      return this.paymentMethodInfo;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.common.Money getAmountPlanned(){
      return this.amountPlanned;
   }
   
   @Nullable
   public com.commercetools.models.me.MyTransactionDraft getTransaction(){
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