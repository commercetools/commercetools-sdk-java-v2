package com.commercetools.models.order_edit;

import com.commercetools.models.order.PaymentState;
import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderChangePaymentStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderChangePaymentStateActionBuilder {
   
   @Nullable
   private com.commercetools.models.order.PaymentState paymentState;
   
   public StagedOrderChangePaymentStateActionBuilder paymentState(@Nullable final com.commercetools.models.order.PaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.order.PaymentState getPaymentState(){
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