package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.DeliveryItem;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ParcelItemsUpdatedMessagePayloadImpl implements ParcelItemsUpdatedMessagePayload {

   private String type;
   
   private String parcelId;
   
   private String deliveryId;
   
   private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;
   
   private java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems;

   @JsonCreator
   ParcelItemsUpdatedMessagePayloadImpl(@JsonProperty("parcelId") final String parcelId, @JsonProperty("deliveryId") final String deliveryId, @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.DeliveryItem> items, @JsonProperty("oldItems") final java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems) {
      this.parcelId = parcelId;
      this.deliveryId = deliveryId;
      this.items = items;
      this.oldItems = oldItems;
      this.type = "ParcelItemsUpdated";
   }
   public ParcelItemsUpdatedMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public String getParcelId(){
      return this.parcelId;
   }
   
   
   public String getDeliveryId(){
      return this.deliveryId;
   }
   
   
   public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems(){
      return this.items;
   }
   
   
   public java.util.List<com.commercetools.api.models.order.DeliveryItem> getOldItems(){
      return this.oldItems;
   }

   public void setParcelId(final String parcelId){
      this.parcelId = parcelId;
   }
   
   public void setDeliveryId(final String deliveryId){
      this.deliveryId = deliveryId;
   }
   
   public void setItems(final java.util.List<com.commercetools.api.models.order.DeliveryItem> items){
      this.items = items;
   }
   
   public void setOldItems(final java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems){
      this.oldItems = oldItems;
   }

}
