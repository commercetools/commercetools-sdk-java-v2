package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.Payment.PaymentResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Order.OrderAddPaymentAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderAddPaymentActionBuilder {
   
   
   private com.commercetools.models.Payment.PaymentResourceIdentifier payment;
   
   public OrderAddPaymentActionBuilder payment( final com.commercetools.models.Payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      return this;
   }
   
   
   public com.commercetools.models.Payment.PaymentResourceIdentifier getPayment(){
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