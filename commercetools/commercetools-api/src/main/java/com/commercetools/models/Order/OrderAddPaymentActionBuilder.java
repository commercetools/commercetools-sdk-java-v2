package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.payment.PaymentResourceIdentifier;
import com.commercetools.models.order.OrderAddPaymentAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderAddPaymentActionBuilder {
   
   
   private com.commercetools.models.payment.PaymentResourceIdentifier payment;
   
   public OrderAddPaymentActionBuilder payment( final com.commercetools.models.payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      return this;
   }
   
   
   public com.commercetools.models.payment.PaymentResourceIdentifier getPayment(){
      return this.payment;
   }

   public OrderAddPaymentAction build() {
       return new OrderAddPaymentActionImpl(payment);
   }
   
   public static OrderAddPaymentActionBuilder of() {
      return new OrderAddPaymentActionBuilder();
   }
   
   public static OrderAddPaymentActionBuilder of(final OrderAddPaymentAction template) {
      OrderAddPaymentActionBuilder builder = new OrderAddPaymentActionBuilder();
      builder.payment = template.getPayment();
      return builder;
   }
   
}