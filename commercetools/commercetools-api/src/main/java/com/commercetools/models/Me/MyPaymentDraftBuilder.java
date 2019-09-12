package com.commercetools.models.Me;

import com.commercetools.models.Common.Money;
import com.commercetools.models.Me.MyTransactionDraft;
import com.commercetools.models.Payment.PaymentMethodInfo;
import com.commercetools.models.Type.CustomFieldsDraft;
import com.commercetools.models.Me.MyPaymentDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyPaymentDraftBuilder {
   
   @Nullable
   private com.commercetools.models.Payment.PaymentMethodInfo paymentMethodInfo;
   
   @Nullable
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   
   private com.commercetools.models.Common.Money amountPlanned;
   
   @Nullable
   private com.commercetools.models.Me.MyTransactionDraft transaction;
   
   public MyPaymentDraftBuilder paymentMethodInfo(@Nullable final com.commercetools.models.Payment.PaymentMethodInfo paymentMethodInfo) {
      this.paymentMethodInfo = paymentMethodInfo;
      return this;
   }
   
   public MyPaymentDraftBuilder custom(@Nullable final com.commercetools.models.Type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public MyPaymentDraftBuilder amountPlanned( final com.commercetools.models.Common.Money amountPlanned) {
      this.amountPlanned = amountPlanned;
      return this;
   }
   
   public MyPaymentDraftBuilder transaction(@Nullable final com.commercetools.models.Me.MyTransactionDraft transaction) {
      this.transaction = transaction;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Payment.PaymentMethodInfo getPaymentMethodInfo(){
      return this.paymentMethodInfo;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.Common.Money getAmountPlanned(){
      return this.amountPlanned;
   }
   
   @Nullable
   public com.commercetools.models.Me.MyTransactionDraft getTransaction(){
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