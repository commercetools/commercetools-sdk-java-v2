package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.PaymentState;
import com.commercetools.api.generated.models.message.OrderPaymentStateChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderPaymentStateChangedMessagePayloadBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.order.PaymentState oldPaymentState;
   
   
   private com.commercetools.api.generated.models.order.PaymentState paymentState;
   
   public OrderPaymentStateChangedMessagePayloadBuilder oldPaymentState(@Nullable final com.commercetools.api.generated.models.order.PaymentState oldPaymentState) {
      this.oldPaymentState = oldPaymentState;
      return this;
   }
   
   public OrderPaymentStateChangedMessagePayloadBuilder paymentState( final com.commercetools.api.generated.models.order.PaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.order.PaymentState getOldPaymentState(){
      return this.oldPaymentState;
   }
   
   
   public com.commercetools.api.generated.models.order.PaymentState getPaymentState(){
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