package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.DeliveryItem;
import com.commercetools.api.generated.models.message.ParcelItemsUpdatedMessagePayloadImpl;

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
@JsonDeserialize(as = ParcelItemsUpdatedMessagePayloadImpl.class)
public interface ParcelItemsUpdatedMessagePayload extends MessagePayload {

   
   @NotNull
   @JsonProperty("parcelId")
   public String getParcelId();
   
   
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

   public void setParcelId(final String parcelId);
   
   public void setDeliveryId(final String deliveryId);
   
   public void setItems(final List<DeliveryItem> items);
   
   public void setOldItems(final List<DeliveryItem> oldItems);
   
   public static ParcelItemsUpdatedMessagePayloadImpl of(){
      return new ParcelItemsUpdatedMessagePayloadImpl();
   }
   

   public static ParcelItemsUpdatedMessagePayloadImpl of(final ParcelItemsUpdatedMessagePayload template) {
      ParcelItemsUpdatedMessagePayloadImpl instance = new ParcelItemsUpdatedMessagePayloadImpl();
      instance.setDeliveryId(template.getDeliveryId());
      instance.setOldItems(template.getOldItems());
      instance.setItems(template.getItems());
      instance.setParcelId(template.getParcelId());
      return instance;
   }

}