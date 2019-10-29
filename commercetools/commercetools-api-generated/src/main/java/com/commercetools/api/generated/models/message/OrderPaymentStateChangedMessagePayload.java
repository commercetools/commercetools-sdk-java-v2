package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.PaymentState;
import com.commercetools.api.generated.models.message.OrderPaymentStateChangedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderPaymentStateChangedMessagePayloadImpl.class)
public interface OrderPaymentStateChangedMessagePayload extends MessagePayload {

   
   @NotNull
   @JsonProperty("paymentState")
   public PaymentState getPaymentState();
   
   
   @JsonProperty("oldPaymentState")
   public PaymentState getOldPaymentState();

   public void setPaymentState(final PaymentState paymentState);
   
   public void setOldPaymentState(final PaymentState oldPaymentState);
   
   public static OrderPaymentStateChangedMessagePayloadImpl of(){
      return new OrderPaymentStateChangedMessagePayloadImpl();
   }
   

   public static OrderPaymentStateChangedMessagePayloadImpl of(final OrderPaymentStateChangedMessagePayload template) {
      OrderPaymentStateChangedMessagePayloadImpl instance = new OrderPaymentStateChangedMessagePayloadImpl();
      instance.setOldPaymentState(template.getOldPaymentState());
      instance.setPaymentState(template.getPaymentState());
      return instance;
   }

}