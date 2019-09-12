package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.CustomerEmailChangedMessagePayloadImpl;

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
@JsonDeserialize(as = CustomerEmailChangedMessagePayloadImpl.class)
public interface CustomerEmailChangedMessagePayload extends MessagePayload {

   
   @NotNull
   @JsonProperty("email")
   public String getEmail();

   public void setEmail(final String email);
   
   public static CustomerEmailChangedMessagePayloadImpl of(){
      return new CustomerEmailChangedMessagePayloadImpl();
   }
   

   public static CustomerEmailChangedMessagePayloadImpl of(final CustomerEmailChangedMessagePayload template) {
      CustomerEmailChangedMessagePayloadImpl instance = new CustomerEmailChangedMessagePayloadImpl();
      instance.setEmail(template.getEmail());
      return instance;
   }

}