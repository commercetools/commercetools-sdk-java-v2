package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.message.OrderShippingAddressSetMessageImpl;

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
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setOldAddress(template.getOldAddress());
      instance.setAddress(template.getAddress());
      return instance;
   }

}