package com.commercetools.models.Message;

import com.commercetools.models.Message.Message;
import com.commercetools.models.Payment.Payment;
import com.commercetools.models.Message.PaymentCreatedMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
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
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setPayment(template.getPayment());
      return instance;
   }

}