package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.order.PaymentState;
import java.lang.String;
import com.commercetools.models.order.OrderChangePaymentStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderChangePaymentStateActionBuilder {
   
   @Nullable
   private com.commercetools.models.order.PaymentState paymentState;
   
   public OrderChangePaymentStateActionBuilder paymentState(@Nullable final com.commercetools.models.order.PaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.order.PaymentState getPaymentState(){
      return this.paymentState;
   }

   public OrderChangePaymentStateAction build() {
       return new OrderChangePaymentStateActionImpl(paymentState);
   }
   
   public static OrderChangePaymentStateActionBuilder of() {
      return new OrderChangePaymentStateActionBuilder();
   }
   
   public static OrderChangePaymentStateActionBuilder of(final OrderChangePaymentStateAction template) {
      OrderChangePaymentStateActionBuilder builder = new OrderChangePaymentStateActionBuilder();
      builder.paymentState = template.getPaymentState();
      return builder;
   }
   
}