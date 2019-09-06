package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.PaymentState;
import java.lang.String;
import com.commercetools.models.Message.OrderPaymentStateChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderPaymentStateChangedMessagePayloadBuilder {
   
   
   private com.commercetools.models.Order.PaymentState oldPaymentState;
   
   
   private com.commercetools.models.Order.PaymentState paymentState;
   
   public OrderPaymentStateChangedMessagePayloadBuilder oldPaymentState( final com.commercetools.models.Order.PaymentState oldPaymentState) {
      this.oldPaymentState = oldPaymentState;
      return this;
   }
   
   public OrderPaymentStateChangedMessagePayloadBuilder paymentState( final com.commercetools.models.Order.PaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   
   public com.commercetools.models.Order.PaymentState getOldPaymentState(){
      return this.oldPaymentState;
   }
   
   
   public com.commercetools.models.Order.PaymentState getPaymentState(){
      return this.paymentState;
   }

   public OrderPaymentStateChangedMessagePayload build() {
       return new OrderPaymentStateChangedMessagePayloadImpl(oldPaymentState, paymentState);
   }
   
   public static OrderPaymentStateChangedMessagePayloadBuilder of() {
      return new OrderPaymentStateChangedMessagePayloadBuilder();
   }
   
   public static OrderPaymentStateChangedMessagePayloadBuilder of(final OrderPaymentStateChangedMessagePayload template) {
      OrderPaymentStateChangedMessagePayloadBuilder builder = new OrderPaymentStateChangedMessagePayloadBuilder();
      builder.oldPaymentState = template.getOldPaymentState();
      builder.paymentState = template.getPaymentState();
      return builder;
   }
   
}