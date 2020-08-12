package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.CustomerAddressAddedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = CustomerAddressAddedMessagePayloadImpl.class)
public interface CustomerAddressAddedMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setAddress(final Address address);
   
   public static CustomerAddressAddedMessagePayloadImpl of(){
      return new CustomerAddressAddedMessagePayloadImpl();
   }
   

   public static CustomerAddressAddedMessagePayloadImpl of(final CustomerAddressAddedMessagePayload template) {
      CustomerAddressAddedMessagePayloadImpl instance = new CustomerAddressAddedMessagePayloadImpl();
      instance.setAddress(template.getAddress());
      return instance;
   }

}
