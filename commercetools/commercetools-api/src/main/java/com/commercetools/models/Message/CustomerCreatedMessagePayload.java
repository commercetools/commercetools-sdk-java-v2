package com.commercetools.models.message;

import com.commercetools.models.customer.Customer;
import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.message.CustomerCreatedMessagePayloadImpl;

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
@JsonDeserialize(as = CustomerCreatedMessagePayloadImpl.class)
public interface CustomerCreatedMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("customer")
   public Customer getCustomer();

   public void setCustomer(final Customer customer);
   
   public static CustomerCreatedMessagePayloadImpl of(){
      return new CustomerCreatedMessagePayloadImpl();
   }
   

   public static CustomerCreatedMessagePayloadImpl of(final CustomerCreatedMessagePayload template) {
      CustomerCreatedMessagePayloadImpl instance = new CustomerCreatedMessagePayloadImpl();
      instance.setCustomer(template.getCustomer());
      return instance;
   }

}