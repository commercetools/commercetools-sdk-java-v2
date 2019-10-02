package com.commercetools.models.message;

import com.commercetools.models.common.Address;
import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.message.OrderShippingAddressSetMessagePayloadImpl;

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
@JsonDeserialize(as = OrderShippingAddressSetMessagePayloadImpl.class)
public interface OrderShippingAddressSetMessagePayload extends MessagePayload {

   
   @Valid
   @JsonProperty("address")
   public Address getAddress();
   
   @Valid
   @JsonProperty("oldAddress")
   public Address getOldAddress();

   public void setAddress(final Address address);
   
   public void setOldAddress(final Address oldAddress);
   
   public static OrderShippingAddressSetMessagePayloadImpl of(){
      return new OrderShippingAddressSetMessagePayloadImpl();
   }
   

   public static OrderShippingAddressSetMessagePayloadImpl of(final OrderShippingAddressSetMessagePayload template) {
      OrderShippingAddressSetMessagePayloadImpl instance = new OrderShippingAddressSetMessagePayloadImpl();
      instance.setOldAddress(template.getOldAddress());
      instance.setAddress(template.getAddress());
      return instance;
   }

}