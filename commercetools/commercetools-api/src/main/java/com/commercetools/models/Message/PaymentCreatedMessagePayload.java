package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Payment.Payment;
import java.lang.String;
import com.commercetools.models.Message.PaymentCreatedMessagePayloadImpl;

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
@JsonDeserialize(as = PaymentCreatedMessagePayloadImpl.class)
public interface PaymentCreatedMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("payment")
   public Payment getPayment();

   public void setPayment(final Payment payment);
   
   public static PaymentCreatedMessagePayloadImpl of(){
      return new PaymentCreatedMessagePayloadImpl();
   }
   

   public static PaymentCreatedMessagePayloadImpl of(final PaymentCreatedMessagePayload template) {
      PaymentCreatedMessagePayloadImpl instance = new PaymentCreatedMessagePayloadImpl();
      instance.setPayment(template.getPayment());
      return instance;
   }

}