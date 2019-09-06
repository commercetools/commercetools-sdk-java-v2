package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.Delivery;
import java.lang.String;
import com.commercetools.models.Message.DeliveryAddedMessagePayloadImpl;

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
@JsonDeserialize(as = DeliveryAddedMessagePayloadImpl.class)
public interface DeliveryAddedMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("delivery")
   public Delivery getDelivery();

   public void setDelivery(final Delivery delivery);
   
   public static DeliveryAddedMessagePayloadImpl of(){
      return new DeliveryAddedMessagePayloadImpl();
   }
   

   public static DeliveryAddedMessagePayloadImpl of(final DeliveryAddedMessagePayload template) {
      DeliveryAddedMessagePayloadImpl instance = new DeliveryAddedMessagePayloadImpl();
      instance.setDelivery(template.getDelivery());
      return instance;
   }

}