package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.Payment.PaymentResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Order.OrderRemovePaymentAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderRemovePaymentActionBuilder {
   
   
   private com.commercetools.models.Payment.PaymentResourceIdentifier payment;
   
   public OrderRemovePaymentActionBuilder payment( final com.commercetools.models.Payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      return this;
   }
   
   
   public com.commercetools.models.Payment.PaymentResourceIdentifier getPayment(){
      return this.payment;
   }

   public OrderRemovePaymentAction build() {
       return new OrderRemovePaymentActionImpl(payment);
   }
   
   public static OrderRemovePaymentActionBuilder of() {
      return new OrderRemovePaymentActionBuilder();
   }
   
   public static OrderRemovePaymentActionBuilder of(final OrderRemovePaymentAction template) {
      OrderRemovePaymentActionBuilder builder = new OrderRemovePaymentActionBuilder();
      builder.payment = template.getPayment();
      return builder;
   }
   
}