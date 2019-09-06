package com.commercetools.models.Message;

import com.commercetools.models.Message.Message;
import com.commercetools.models.Order.Delivery;
import com.commercetools.models.Message.DeliveryAddedMessageImpl;

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
@JsonDeserialize(as = DeliveryAddedMessageImpl.class)
public interface DeliveryAddedMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("delivery")
   public Delivery getDelivery();

   public void setDelivery(final Delivery delivery);
   
   public static DeliveryAddedMessageImpl of(){
      return new DeliveryAddedMessageImpl();
   }
   

   public static DeliveryAddedMessageImpl of(final DeliveryAddedMessage template) {
      DeliveryAddedMessageImpl instance = new DeliveryAddedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setDelivery(template.getDelivery());
      return instance;
   }

}