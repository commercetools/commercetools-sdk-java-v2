package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.PaymentState;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangePaymentStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderChangePaymentStateActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.order.PaymentState paymentState;
   
   public StagedOrderChangePaymentStateActionBuilder paymentState(@Nullable final com.commercetools.api.generated.models.order.PaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.order.PaymentState getPaymentState(){
      return this.paymentState;
   }

   public StagedOrderChangePaymentStateAction build() {
       return new StagedOrderChangePaymentStateActionImpl(paymentState);
   }
   
   public static StagedOrderChangePaymentStateActionBuilder of() {
      return new StagedOrderChangePaymentStateActionBuilder();
   }
   
   public static StagedOrderChangePaymentStateActionBuilder of(final StagedOrderChangePaymentStateAction template) {
      StagedOrderChangePaymentStateActionBuilder builder = new StagedOrderChangePaymentStateActionBuilder();
      builder.paymentState = template.getPaymentState();
      return builder;
   }
   
}