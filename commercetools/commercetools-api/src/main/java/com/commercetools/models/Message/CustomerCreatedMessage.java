package com.commercetools.models.Message;

import com.commercetools.models.Customer.Customer;
import com.commercetools.models.Message.Message;
import com.commercetools.models.Message.CustomerCreatedMessageImpl;

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
@JsonDeserialize(as = CustomerCreatedMessageImpl.class)
public interface CustomerCreatedMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("customer")
   public Customer getCustomer();

   public void setCustomer(final Customer customer);
   
   public static CustomerCreatedMessageImpl of(){
      return new CustomerCreatedMessageImpl();
   }
   

   public static CustomerCreatedMessageImpl of(final CustomerCreatedMessage template) {
      CustomerCreatedMessageImpl instance = new CustomerCreatedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setCustomer(template.getCustomer());
      return instance;
   }

}