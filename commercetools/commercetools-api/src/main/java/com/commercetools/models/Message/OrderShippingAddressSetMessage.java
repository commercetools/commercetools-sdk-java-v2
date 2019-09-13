package com.commercetools.models.message;

import com.commercetools.models.common.Address;
import com.commercetools.models.message.Message;
import com.commercetools.models.message.OrderShippingAddressSetMessageImpl;

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
@JsonDeserialize(as = OrderShippingAddressSetMessageImpl.class)
public interface OrderShippingAddressSetMessage extends Message {

   
   @Valid
   @JsonProperty("address")
   public Address getAddress();
   
   @Valid
   @JsonProperty("oldAddress")
   public Address getOldAddress();

   public void setAddress(final Address address);
   
   public void setOldAddress(final Address oldAddress);
   
   public static OrderShippingAddressSetMessageImpl of(){
      return new OrderShippingAddressSetMessageImpl();
   }
   

   public static OrderShippingAddressSetMessageImpl of(final OrderShippingAddressSetMessage template) {
      OrderShippingAddressSetMessageImpl instance = new OrderShippingAddressSetMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setOldAddress(template.getOldAddress());
      instance.setAddress(template.getAddress());
      return instance;
   }

}