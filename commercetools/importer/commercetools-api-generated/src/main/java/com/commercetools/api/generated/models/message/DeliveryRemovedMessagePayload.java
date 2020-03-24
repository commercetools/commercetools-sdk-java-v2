package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.Delivery;
import com.commercetools.api.generated.models.message.DeliveryRemovedMessagePayloadImpl;

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
@JsonDeserialize(as = DeliveryRemovedMessagePayloadImpl.class)
public interface DeliveryRemovedMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("delivery")
   public Delivery getDelivery();

   public void setDelivery(final Delivery delivery);
   
   public static DeliveryRemovedMessagePayloadImpl of(){
      return new DeliveryRemovedMessagePayloadImpl();
   }
   

   public static DeliveryRemovedMessagePayloadImpl of(final DeliveryRemovedMessagePayload template) {
      DeliveryRemovedMessagePayloadImpl instance = new DeliveryRemovedMessagePayloadImpl();
      instance.setDelivery(template.getDelivery());
      return instance;
   }

}