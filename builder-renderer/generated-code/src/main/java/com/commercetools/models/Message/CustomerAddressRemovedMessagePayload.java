package com.commercetools.models.Message;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.CustomerAddressRemovedMessagePayloadImpl;

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
@JsonDeserialize(as = CustomerAddressRemovedMessagePayloadImpl.class)
public interface CustomerAddressRemovedMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setAddress(final Address address);
   
   public static CustomerAddressRemovedMessagePayloadImpl of(){
      return new CustomerAddressRemovedMessagePayloadImpl();
   }
   

   public static CustomerAddressRemovedMessagePayloadImpl of(final CustomerAddressRemovedMessagePayload template) {
      CustomerAddressRemovedMessagePayloadImpl instance = new CustomerAddressRemovedMessagePayloadImpl();
      instance.setAddress(template.getAddress());
      return instance;
   }

}