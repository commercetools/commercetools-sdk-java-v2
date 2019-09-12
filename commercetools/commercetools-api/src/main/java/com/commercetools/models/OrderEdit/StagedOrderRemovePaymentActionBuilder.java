package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.StagedOrderUpdateAction;
import com.commercetools.models.Payment.PaymentResourceIdentifier;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderRemovePaymentAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderRemovePaymentActionBuilder {
   
   
   private com.commercetools.models.Payment.PaymentResourceIdentifier payment;
   
   public StagedOrderRemovePaymentActionBuilder payment( final com.commercetools.models.Payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      return this;
   }
   
   
   public com.commercetools.models.Payment.PaymentResourceIdentifier getPayment(){
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