package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.PaymentState;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderChangePaymentStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderChangePaymentStateActionBuilder {
   
   @Nullable
   private com.commercetools.models.Order.PaymentState paymentState;
   
   public StagedOrderChangePaymentStateActionBuilder paymentState(@Nullable final com.commercetools.models.Order.PaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Order.PaymentState getPaymentState(){
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