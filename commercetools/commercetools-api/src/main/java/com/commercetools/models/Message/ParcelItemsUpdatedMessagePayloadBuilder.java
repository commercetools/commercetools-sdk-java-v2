package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.DeliveryItem;
import java.lang.String;
import com.commercetools.models.Message.ParcelItemsUpdatedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ParcelItemsUpdatedMessagePayloadBuilder {
   
   @Nullable
   private java.lang.String deliveryId;
   
   
   private java.util.List<com.commercetools.models.Order.DeliveryItem> oldItems;
   
   
   private java.util.List<com.commercetools.models.Order.DeliveryItem> items;
   
   
   private java.lang.String parcelId;
   
   public ParcelItemsUpdatedMessagePayloadBuilder deliveryId(@Nullable final java.lang.String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public ParcelItemsUpdatedMessagePayloadBuilder oldItems( final java.util.List<com.commercetools.models.Order.DeliveryItem> oldItems) {
      this.oldItems = oldItems;
      return this;
   }
   
   public ParcelItemsUpdatedMessagePayloadBuilder items( final java.util.List<com.commercetools.models.Order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   public ParcelItemsUpdatedMessagePayloadBuilder parcelId( final java.lang.String parcelId) {
      this.parcelId = parcelId;
      return this;
   }
   
   @Nullable
   public java.lang.String getDeliveryId(){
      return this.deliveryId;
   }
   
   
   public java.util.List<com.commercetools.models.Order.DeliveryItem> getOldItems(){
      return this.oldItems;
   }
   
   
   public java.util.List<com.commercetools.models.Order.DeliveryItem> getItems(){
      return this.items;
   }
   
   
   public java.lang.String getParcelId(){
      return this.parcelId;
   }

   public ParcelItemsUpdatedMessagePayload build() {
       return new ParcelItemsUpdatedMessagePayloadImpl(deliveryId, oldItems, items, parcelId);
   }
   
   public static ParcelItemsUpdatedMessagePayloadBuilder of() {
      return new ParcelItemsUpdatedMessagePayloadBuilder();
   }
   
   public static ParcelItemsUpdatedMessagePayloadBuilder of(final ParcelItemsUpdatedMessagePayload template) {
      ParcelItemsUpdatedMessagePayloadBuilder builder = new ParcelItemsUpdatedMessagePayloadBuilder();
      builder.deliveryId = template.getDeliveryId();
      builder.oldItems = template.getOldItems();
      builder.items = template.getItems();
      builder.parcelId = template.getParcelId();
      return builder;
   }
   
}