package com.commercetools.models.Message;

import com.commercetools.models.CustomerGroup.CustomerGroupReference;
import com.commercetools.models.Message.Message;
import com.commercetools.models.Message.CustomerGroupSetMessageImpl;

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
@JsonDeserialize(as = CustomerGroupSetMessageImpl.class)
public interface CustomerGroupSetMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("customerGroup")
   public CustomerGroupReference getCustomerGroup();

   public void setCustomerGroup(final CustomerGroupReference customerGroup);
   
   public static CustomerGroupSetMessageImpl of(){
      return new CustomerGroupSetMessageImpl();
   }
   

   public static CustomerGroupSetMessageImpl of(final CustomerGroupSetMessage template) {
      CustomerGroupSetMessageImpl instance = new CustomerGroupSetMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setCustomerGroup(template.getCustomerGroup());
      return instance;
   }

}