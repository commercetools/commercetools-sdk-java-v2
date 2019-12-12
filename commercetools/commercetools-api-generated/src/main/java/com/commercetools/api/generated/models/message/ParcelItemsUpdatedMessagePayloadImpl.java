package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.DeliveryItem;
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
   
   private String deliveryId;
   
   private java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> oldItems;
   
   private java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items;
   
   private String parcelId;

   @JsonCreator
   ParcelItemsUpdatedMessagePayloadImpl(@JsonProperty("deliveryId") final String deliveryId, @JsonProperty("oldItems") final java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> oldItems, @JsonProperty("items") final java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items, @JsonProperty("parcelId") final String parcelId) {
      this.deliveryId = deliveryId;
      this.oldItems = oldItems;
      this.items = items;
      this.parcelId = parcelId;
      this.type = "ParcelItemsUpdated";
   }
   public ParcelItemsUpdatedMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public String getDeliveryId(){
      return this.deliveryId;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> getOldItems(){
      return this.oldItems;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> getItems(){
      return this.items;
   }
   
   
   public String getParcelId(){
      return this.parcelId;
   }

   public void setDeliveryId(final String deliveryId){
      this.deliveryId = deliveryId;
   }
   
   public void setOldItems(final java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> oldItems){
      this.oldItems = oldItems;
   }
   
   public void setItems(final java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items){
      this.items = items;
   }
   
   public void setParcelId(final String parcelId){
      this.parcelId = parcelId;
   }

}