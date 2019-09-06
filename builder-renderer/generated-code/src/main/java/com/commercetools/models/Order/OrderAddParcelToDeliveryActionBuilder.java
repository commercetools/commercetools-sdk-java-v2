package com.commercetools.models.Order;

import com.commercetools.models.Order.DeliveryItem;
import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.Order.ParcelMeasurements;
import com.commercetools.models.Order.TrackingData;
import java.lang.String;
import com.commercetools.models.Order.OrderAddParcelToDeliveryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderAddParcelToDeliveryActionBuilder {
   
   
   private java.lang.String deliveryId;
   
   @Nullable
   private java.util.List<com.commercetools.models.Order.DeliveryItem> items;
   
   @Nullable
   private com.commercetools.models.Order.TrackingData trackingData;
   
   @Nullable
   private com.commercetools.models.Order.ParcelMeasurements measurements;
   
   public OrderAddParcelToDeliveryActionBuilder deliveryId( final java.lang.String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public OrderAddParcelToDeliveryActionBuilder items(@Nullable final java.util.List<com.commercetools.models.Order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   public OrderAddParcelToDeliveryActionBuilder trackingData(@Nullable final com.commercetools.models.Order.TrackingData trackingData) {
      this.trackingData = trackingData;
      return this;
   }
   
   public OrderAddParcelToDeliveryActionBuilder measurements(@Nullable final com.commercetools.models.Order.ParcelMeasurements measurements) {
      this.measurements = measurements;
      return this;
   }
   
   
   public java.lang.String getDeliveryId(){
      return this.deliveryId;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Order.DeliveryItem> getItems(){
      return this.items;
   }
   
   @Nullable
   public com.commercetools.models.Order.TrackingData getTrackingData(){
      return this.trackingData;
   }
   
   @Nullable
   public com.commercetools.models.Order.ParcelMeasurements getMeasurements(){
      return this.measurements;
   }

   public OrderAddParcelToDeliveryAction build() {
       return new OrderAddParcelToDeliveryActionImpl(deliveryId, items, trackingData, measurements);
   }
   
   public static OrderAddParcelToDeliveryActionBuilder of() {
      return new OrderAddParcelToDeliveryActionBuilder();
   }
   
   public static OrderAddParcelToDeliveryActionBuilder of(final OrderAddParcelToDeliveryAction template) {
      OrderAddParcelToDeliveryActionBuilder builder = new OrderAddParcelToDeliveryActionBuilder();
      builder.deliveryId = template.getDeliveryId();
      builder.items = template.getItems();
      builder.trackingData = template.getTrackingData();
      builder.measurements = template.getMeasurements();
      return builder;
   }
   
}