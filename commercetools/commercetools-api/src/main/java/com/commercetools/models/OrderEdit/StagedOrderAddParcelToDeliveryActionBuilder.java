package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.DeliveryItem;
import com.commercetools.models.Order.ParcelMeasurements;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import com.commercetools.models.Order.TrackingData;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderAddParcelToDeliveryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderAddParcelToDeliveryActionBuilder {
   
   
   private java.lang.String deliveryId;
   
   @Nullable
   private java.util.List<com.commercetools.models.Order.DeliveryItem> items;
   
   @Nullable
   private com.commercetools.models.Order.TrackingData trackingData;
   
   @Nullable
   private com.commercetools.models.Order.ParcelMeasurements measurements;
   
   public StagedOrderAddParcelToDeliveryActionBuilder deliveryId( final java.lang.String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public StagedOrderAddParcelToDeliveryActionBuilder items(@Nullable final java.util.List<com.commercetools.models.Order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   public StagedOrderAddParcelToDeliveryActionBuilder trackingData(@Nullable final com.commercetools.models.Order.TrackingData trackingData) {
      this.trackingData = trackingData;
      return this;
   }
   
   public StagedOrderAddParcelToDeliveryActionBuilder measurements(@Nullable final com.commercetools.models.Order.ParcelMeasurements measurements) {
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

   public StagedOrderAddParcelToDeliveryAction build() {
       return new StagedOrderAddParcelToDeliveryActionImpl(deliveryId, items, trackingData, measurements);
   }
   
   public static StagedOrderAddParcelToDeliveryActionBuilder of() {
      return new StagedOrderAddParcelToDeliveryActionBuilder();
   }
   
   public static StagedOrderAddParcelToDeliveryActionBuilder of(final StagedOrderAddParcelToDeliveryAction template) {
      StagedOrderAddParcelToDeliveryActionBuilder builder = new StagedOrderAddParcelToDeliveryActionBuilder();
      builder.deliveryId = template.getDeliveryId();
      builder.items = template.getItems();
      builder.trackingData = template.getTrackingData();
      builder.measurements = template.getMeasurements();
      return builder;
   }
   
}