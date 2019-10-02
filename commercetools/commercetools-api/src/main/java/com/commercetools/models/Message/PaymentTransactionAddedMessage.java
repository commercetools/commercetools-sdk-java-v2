package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import com.commercetools.models.payment.Transaction;
import com.commercetools.models.message.PaymentTransactionAddedMessageImpl;

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
@JsonDeserialize(as = PaymentTransactionAddedMessageImpl.class)
public interface PaymentTransactionAddedMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("transaction")
   public Transaction getTransaction();

   public void setTransaction(final Transaction transaction);
   
   public static PaymentTransactionAddedMessageImpl of(){
      return new PaymentTransactionAddedMessageImpl();
   }
   

   public static PaymentTransactionAddedMessageImpl of(final PaymentTransactionAddedMessage template) {
      PaymentTransactionAddedMessageImpl instance = new PaymentTransactionAddedMessageImpl();
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
      instance.setTransaction(template.getTransaction());
      return instance;
   }

}