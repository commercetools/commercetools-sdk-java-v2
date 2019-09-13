package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import com.commercetools.models.order.DeliveryItem;
import java.lang.String;
import com.commercetools.models.message.ParcelItemsUpdatedMessageImpl;

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
@JsonDeserialize(as = ParcelItemsUpdatedMessageImpl.class)
public interface ParcelItemsUpdatedMessage extends Message {

   
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
   
   public static ParcelItemsUpdatedMessageImpl of(){
      return new ParcelItemsUpdatedMessageImpl();
   }
   

   public static ParcelItemsUpdatedMessageImpl of(final ParcelItemsUpdatedMessage template) {
      ParcelItemsUpdatedMessageImpl instance = new ParcelItemsUpdatedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setDeliveryId(template.getDeliveryId());
      instance.setOldItems(template.getOldItems());
      instance.setItems(template.getItems());
      instance.setParcelId(template.getParcelId());
      return instance;
   }

}