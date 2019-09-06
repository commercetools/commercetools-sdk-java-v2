package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.DeliveryItem;
import java.lang.String;
import com.commercetools.models.Message.DeliveryItemsUpdatedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DeliveryItemsUpdatedMessagePayloadBuilder {
   
   
   private java.lang.String deliveryId;
   
   
   private java.util.List<com.commercetools.models.Order.DeliveryItem> oldItems;
   
   
   private java.util.List<com.commercetools.models.Order.DeliveryItem> items;
   
   public DeliveryItemsUpdatedMessagePayloadBuilder deliveryId( final java.lang.String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public DeliveryItemsUpdatedMessagePayloadBuilder oldItems( final java.util.List<com.commercetools.models.Order.DeliveryItem> oldItems) {
      this.oldItems = oldItems;
      return this;
   }
   
   public DeliveryItemsUpdatedMessagePayloadBuilder items( final java.util.List<com.commercetools.models.Order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   
   public java.lang.String getDeliveryId(){
      return this.deliveryId;
   }
   
   
   public java.util.List<com.commercetools.models.Order.DeliveryItem> getOldItems(){
      return this.oldItems;
   }
   
   
   public java.util.List<com.commercetools.models.Order.DeliveryItem> getItems(){
      return this.items;
   }

   public DeliveryItemsUpdatedMessagePayload build() {
       return new DeliveryItemsUpdatedMessagePayloadImpl(deliveryId, oldItems, items);
   }
   
   public static DeliveryItemsUpdatedMessagePayloadBuilder of() {
      return new DeliveryItemsUpdatedMessagePayloadBuilder();
   }
   
   public static DeliveryItemsUpdatedMessagePayloadBuilder of(final DeliveryItemsUpdatedMessagePayload template) {
      DeliveryItemsUpdatedMessagePayloadBuilder builder = new DeliveryItemsUpdatedMessagePayloadBuilder();
      builder.deliveryId = template.getDeliveryId();
      builder.oldItems = template.getOldItems();
      builder.items = template.getItems();
      return builder;
   }
   
}