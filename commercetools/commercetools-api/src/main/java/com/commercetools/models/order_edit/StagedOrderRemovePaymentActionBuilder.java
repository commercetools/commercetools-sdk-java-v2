package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.payment.PaymentResourceIdentifier;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderRemovePaymentAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderRemovePaymentActionBuilder {
   
   
   private com.commercetools.models.payment.PaymentResourceIdentifier payment;
   
   public StagedOrderRemovePaymentActionBuilder payment( final com.commercetools.models.payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      return this;
   }
   
   
   public com.commercetools.models.payment.PaymentResourceIdentifier getPayment(){
      return this.payment;
   }

   public StagedOrderRemovePaymentAction build() {
       return new StagedOrderRemovePaymentActionImpl(payment);
   }
   
   public static StagedOrderRemovePaymentActionBuilder of() {
      return new StagedOrderRemovePaymentActionBuilder();
   }
   
   public static StagedOrderRemovePaymentActionBuilder of(final StagedOrderRemovePaymentAction template) {
      StagedOrderRemovePaymentActionBuilder builder = new StagedOrderRemovePaymentActionBuilder();
      builder.payment = template.getPayment();
      return builder;
   }
   
}