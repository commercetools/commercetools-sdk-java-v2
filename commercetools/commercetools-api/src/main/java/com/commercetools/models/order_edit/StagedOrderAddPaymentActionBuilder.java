package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.payment.PaymentResourceIdentifier;
import com.commercetools.models.order_edit.StagedOrderAddPaymentAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderAddPaymentActionBuilder {
   
   
   private com.commercetools.models.payment.PaymentResourceIdentifier payment;
   
   public StagedOrderAddPaymentActionBuilder payment( final com.commercetools.models.payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      return this;
   }
   
   
   public com.commercetools.models.payment.PaymentResourceIdentifier getPayment(){
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