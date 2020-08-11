package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.payment.TransactionState;
import com.commercetools.api.models.message.PaymentTransactionStateChangedMessageImpl;

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
@JsonDeserialize(as = PaymentTransactionStateChangedMessageImpl.class)
public interface PaymentTransactionStateChangedMessage extends Message {


   @NotNull
   @JsonProperty("transactionId")
   public String getTransactionId();

   @NotNull
   @JsonProperty("state")
   public TransactionState getState();

   public void setTransactionId(final String transactionId);

   public void setState(final TransactionState state);

   public static PaymentTransactionStateChangedMessageImpl of(){
      return new PaymentTransactionStateChangedMessageImpl();
   }


   public static PaymentTransactionStateChangedMessageImpl of(final PaymentTransactionStateChangedMessage template) {
      PaymentTransactionStateChangedMessageImpl instance = new PaymentTransactionStateChangedMessageImpl();
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
      instance.setState(template.getState());
      instance.setTransactionId(template.getTransactionId());
      return instance;
   }

}
