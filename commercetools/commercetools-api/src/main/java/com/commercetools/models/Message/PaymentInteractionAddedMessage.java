package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import com.commercetools.models.type.CustomFields;
import com.commercetools.models.message.PaymentInteractionAddedMessageImpl;

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
@JsonDeserialize(as = PaymentInteractionAddedMessageImpl.class)
public interface PaymentInteractionAddedMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("interaction")
   public CustomFields getInteraction();

   public void setInteraction(final CustomFields interaction);
   
   public static PaymentInteractionAddedMessageImpl of(){
      return new PaymentInteractionAddedMessageImpl();
   }
   

   public static PaymentInteractionAddedMessageImpl of(final PaymentInteractionAddedMessage template) {
      PaymentInteractionAddedMessageImpl instance = new PaymentInteractionAddedMessageImpl();
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
      instance.setInteraction(template.getInteraction());
      return instance;
   }

}