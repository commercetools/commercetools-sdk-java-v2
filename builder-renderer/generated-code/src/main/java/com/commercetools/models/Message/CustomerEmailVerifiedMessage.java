package com.commercetools.models.Message;

import com.commercetools.models.Message.Message;
import com.commercetools.models.Message.CustomerEmailVerifiedMessageImpl;

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
@JsonDeserialize(as = CustomerEmailVerifiedMessageImpl.class)
public interface CustomerEmailVerifiedMessage extends Message {


   
   public static CustomerEmailVerifiedMessageImpl of(){
      return new CustomerEmailVerifiedMessageImpl();
   }
   

   public static CustomerEmailVerifiedMessageImpl of(final CustomerEmailVerifiedMessage template) {
      CustomerEmailVerifiedMessageImpl instance = new CustomerEmailVerifiedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      return instance;
   }

}