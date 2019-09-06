package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.Order.PaymentState;
import java.lang.String;
import com.commercetools.models.Order.OrderChangePaymentStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderChangePaymentStateActionBuilder {
   
   @Nullable
   private com.commercetools.models.Order.PaymentState paymentState;
   
   public OrderChangePaymentStateActionBuilder paymentState(@Nullable final com.commercetools.models.Order.PaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Order.PaymentState getPaymentState(){
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