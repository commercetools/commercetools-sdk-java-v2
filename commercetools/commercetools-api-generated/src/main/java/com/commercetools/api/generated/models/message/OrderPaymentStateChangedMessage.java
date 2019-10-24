package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.order.PaymentState;
import com.commercetools.api.generated.models.message.OrderPaymentStateChangedMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = OrderPaymentStateChangedMessageImpl.class)
public interface OrderPaymentStateChangedMessage extends Message {

   
   @NotNull
   @JsonProperty("paymentState")
   public PaymentState getPaymentState();
   
   @NotNull
   @JsonProperty("oldPaymentState")
   public PaymentState getOldPaymentState();

   public void setPaymentState(final PaymentState paymentState);
   
   public void setOldPaymentState(final PaymentState oldPaymentState);
   
   public static OrderPaymentStateChangedMessageImpl of(){
      return new OrderPaymentStateChangedMessageImpl();
   }
   

   public static OrderPaymentStateChangedMessageImpl of(final OrderPaymentStateChangedMessage template) {
      OrderPaymentStateChangedMessageImpl instance = new OrderPaymentStateChangedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setOldPaymentState(template.getOldPaymentState());
      instance.setPaymentState(template.getPaymentState());
      return instance;
   }

}