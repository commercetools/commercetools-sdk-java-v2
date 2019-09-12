package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.StagedOrderUpdateAction;
import com.commercetools.models.Payment.PaymentResourceIdentifier;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderAddPaymentAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderAddPaymentActionBuilder {
   
   
   private com.commercetools.models.Payment.PaymentResourceIdentifier payment;
   
   public StagedOrderAddPaymentActionBuilder payment( final com.commercetools.models.Payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      return this;
   }
   
   
   public com.commercetools.models.Payment.PaymentResourceIdentifier getPayment(){
      return this.payment;
   }

   public StagedOrderAddPaymentAction build() {
       return new StagedOrderAddPaymentActionImpl(payment);
   }
   
   public static StagedOrderAddPaymentActionBuilder of() {
      return new StagedOrderAddPaymentActionBuilder();
   }
   
   public static StagedOrderAddPaymentActionBuilder of(final StagedOrderAddPaymentAction template) {
      StagedOrderAddPaymentActionBuilder builder = new StagedOrderAddPaymentActionBuilder();
      builder.payment = template.getPayment();
      return builder;
   }
   
}