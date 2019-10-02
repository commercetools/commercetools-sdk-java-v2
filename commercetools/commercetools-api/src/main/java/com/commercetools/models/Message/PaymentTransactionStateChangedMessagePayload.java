package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.payment.TransactionState;
import com.commercetools.models.message.PaymentTransactionStateChangedMessagePayloadImpl;

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
@JsonDeserialize(as = PaymentTransactionStateChangedMessagePayloadImpl.class)
public interface PaymentTransactionStateChangedMessagePayload extends MessagePayload {

   
   @NotNull
   @JsonProperty("transactionId")
   public String getTransactionId();
   
   @NotNull
   @JsonProperty("state")
   public TransactionState getState();

   public void setTransactionId(final String transactionId);
   
   public void setState(final TransactionState state);
   
   public static PaymentTransactionStateChangedMessagePayloadImpl of(){
      return new PaymentTransactionStateChangedMessagePayloadImpl();
   }
   

   public static PaymentTransactionStateChangedMessagePayloadImpl of(final PaymentTransactionStateChangedMessagePayload template) {
      PaymentTransactionStateChangedMessagePayloadImpl instance = new PaymentTransactionStateChangedMessagePayloadImpl();
      instance.setState(template.getState());
      instance.setTransactionId(template.getTransactionId());
      return instance;
   }

}