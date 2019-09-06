package com.commercetools.models.Message;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.DeliveryAddressSetMessagePayloadImpl;

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
@JsonDeserialize(as = DeliveryAddressSetMessagePayloadImpl.class)
public interface DeliveryAddressSetMessagePayload extends MessagePayload {

   
   @NotNull
   @JsonProperty("deliveryId")
   public String getDeliveryId();
   
   @Valid
   @JsonProperty("address")
   public Address getAddress();
   
   @Valid
   @JsonProperty("oldAddress")
   public Address getOldAddress();

   public void setDeliveryId(final String deliveryId);
   
   public void setAddress(final Address address);
   
   public void setOldAddress(final Address oldAddress);
   
   public static DeliveryAddressSetMessagePayloadImpl of(){
      return new DeliveryAddressSetMessagePayloadImpl();
   }
   

   public static DeliveryAddressSetMessagePayloadImpl of(final DeliveryAddressSetMessagePayload template) {
      DeliveryAddressSetMessagePayloadImpl instance = new DeliveryAddressSetMessagePayloadImpl();
      instance.setOldAddress(template.getOldAddress());
      instance.setDeliveryId(template.getDeliveryId());
      instance.setAddress(template.getAddress());
      return instance;
   }

}