package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.type.CustomFields;
import java.lang.String;
import com.commercetools.models.message.PaymentInteractionAddedMessagePayloadImpl;

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
@JsonDeserialize(as = PaymentInteractionAddedMessagePayloadImpl.class)
public interface PaymentInteractionAddedMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("interaction")
   public CustomFields getInteraction();

   public void setInteraction(final CustomFields interaction);
   
   public static PaymentInteractionAddedMessagePayloadImpl of(){
      return new PaymentInteractionAddedMessagePayloadImpl();
   }
   

   public static PaymentInteractionAddedMessagePayloadImpl of(final PaymentInteractionAddedMessagePayload template) {
      PaymentInteractionAddedMessagePayloadImpl instance = new PaymentInteractionAddedMessagePayloadImpl();
      instance.setInteraction(template.getInteraction());
      return instance;
   }

}