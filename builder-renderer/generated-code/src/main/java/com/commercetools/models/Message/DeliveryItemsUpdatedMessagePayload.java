package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.DeliveryItem;
import java.lang.String;
import com.commercetools.models.Message.DeliveryItemsUpdatedMessagePayloadImpl;

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