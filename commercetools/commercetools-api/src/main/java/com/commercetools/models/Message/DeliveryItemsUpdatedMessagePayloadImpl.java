package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.order.DeliveryItem;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DeliveryItemsUpdatedMessagePayloadImpl implements DeliveryItemsUpdatedMessagePayload {

   private java.lang.String type;
   
   private java.lang.String deliveryId;
   
   private java.util.List<com.commercetools.models.order.DeliveryItem> oldItems;
   
   private java.util.List<com.commercetools.models.order.DeliveryItem> items;

   @JsonCreator
   DeliveryItemsUpdatedMessagePayloadImpl(@JsonProperty("deliveryId") final java.lang.String deliveryId, @JsonProperty("oldItems") final java.util.List<com.commercetools.models.order.DeliveryItem> oldItems, @JsonProperty("items") final java.util.List<com.commercetools.models.order.DeliveryItem> items) {
      this.deliveryId = deliveryId;
      this.oldItems = oldItems;
      this.items = items;
      this.type = "DeliveryItemsUpdated";
   }
   public DeliveryItemsUpdatedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.String getDeliveryId(){
      return this.deliveryId;
   }
   
   
   public java.util.List<com.commercetools.models.order.DeliveryItem> getOldItems(){
      return this.oldItems;
   }
   
   
   public java.util.List<com.commercetools.models.order.DeliveryItem> getItems(){
      return this.items;
   }

   public void setDeliveryId(final java.lang.String deliveryId){
      this.deliveryId = deliveryId;
   }
   
   public void setOldItems(final java.util.List<com.commercetools.models.order.DeliveryItem> oldItems){
      this.oldItems = oldItems;
   }
   
   public void setItems(final java.util.List<com.commercetools.models.order.DeliveryItem> items){
      this.items = items;
   }

}