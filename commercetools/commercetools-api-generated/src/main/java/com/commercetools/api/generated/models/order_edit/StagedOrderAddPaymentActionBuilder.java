package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.generated.models.order_edit.StagedOrderAddPaymentAction;
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
public final class StagedOrderAddPaymentActionBuilder {
   
   
   private com.commercetools.api.generated.models.payment.PaymentResourceIdentifier payment;
   
   public StagedOrderAddPaymentActionBuilder payment( final com.commercetools.api.generated.models.payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.payment.PaymentResourceIdentifier getPayment(){
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