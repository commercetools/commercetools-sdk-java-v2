package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.DeliveryItem;
import com.commercetools.api.generated.models.message.DeliveryItemsUpdatedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = DeliveryItemsUpdatedMessagePayloadImpl.class)
public interface DeliveryItemsUpdatedMessagePayload extends MessagePayload {

   
   @NotNull
   @JsonProperty("deliveryId")
   public String getDeliveryId();
   
   @NotNull
   @Valid
   @JsonProperty("items")
   public List<DeliveryItem> getItems();
   
   @NotNull
   @Valid
   @JsonProperty("oldItems")
   public List<DeliveryItem> getOldItems();

   public void setDeliveryId(final String deliveryId);
   
   public void setItems(final List<DeliveryItem> items);
   
   public void setOldItems(final List<DeliveryItem> oldItems);
   
   public static DeliveryItemsUpdatedMessagePayloadImpl of(){
      return new DeliveryItemsUpdatedMessagePayloadImpl();
   }
   

   public static DeliveryItemsUpdatedMessagePayloadImpl of(final DeliveryItemsUpdatedMessagePayload template) {
      DeliveryItemsUpdatedMessagePayloadImpl instance = new DeliveryItemsUpdatedMessagePayloadImpl();
      instance.setDeliveryId(template.getDeliveryId());
      instance.setOldItems(template.getOldItems());
      instance.setItems(template.getItems());
      return instance;
   }

}