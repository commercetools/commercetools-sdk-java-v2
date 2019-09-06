package com.commercetools.models.Message;

import com.commercetools.models.Message.Message;
import java.lang.String;
import com.commercetools.models.Message.CustomerEmailChangedMessageImpl;

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
@JsonDeserialize(as = CustomerEmailChangedMessageImpl.class)
public interface CustomerEmailChangedMessage extends Message {

   
   @NotNull
   @JsonProperty("email")
   public String getEmail();

   public void setEmail(final String email);
   
   public static CustomerEmailChangedMessageImpl of(){
      return new CustomerEmailChangedMessageImpl();
   }
   

   public static CustomerEmailChangedMessageImpl of(final CustomerEmailChangedMessage template) {
      CustomerEmailChangedMessageImpl instance = new CustomerEmailChangedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setEmail(template.getEmail());
      return instance;
   }

}