package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import com.commercetools.models.payment.Payment;
import com.commercetools.models.message.PaymentCreatedMessageImpl;

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
@JsonDeserialize(as = PaymentCreatedMessageImpl.class)
public interface PaymentCreatedMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("payment")
   public Payment getPayment();

   public void setPayment(final Payment payment);
   
   public static PaymentCreatedMessageImpl of(){
      return new PaymentCreatedMessageImpl();
   }
   

   public static PaymentCreatedMessageImpl of(final PaymentCreatedMessage template) {
      PaymentCreatedMessageImpl instance = new PaymentCreatedMessageImpl();
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
      instance.setPayment(template.getPayment());
      return instance;
   }

}