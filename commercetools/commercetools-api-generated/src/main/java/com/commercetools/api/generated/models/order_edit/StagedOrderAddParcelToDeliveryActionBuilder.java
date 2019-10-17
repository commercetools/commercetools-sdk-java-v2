package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.DeliveryItem;
import com.commercetools.api.generated.models.order.ParcelMeasurements;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order.TrackingData;
import com.commercetools.api.generated.models.order_edit.StagedOrderAddParcelToDeliveryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderAddParcelToDeliveryActionBuilder {
   
   
   private String deliveryId;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items;
   
   @Nullable
   private com.commercetools.api.generated.models.order.TrackingData trackingData;
   
   @Nullable
   private com.commercetools.api.generated.models.order.ParcelMeasurements measurements;
   
   public StagedOrderAddParcelToDeliveryActionBuilder deliveryId( final String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public StagedOrderAddParcelToDeliveryActionBuilder items(@Nullable final java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   public StagedOrderAddParcelToDeliveryActionBuilder trackingData(@Nullable final com.commercetools.api.generated.models.order.TrackingData trackingData) {
      this.trackingData = trackingData;
      return this;
   }
   
   public StagedOrderAddParcelToDeliveryActionBuilder measurements(@Nullable final com.commercetools.api.generated.models.order.ParcelMeasurements measurements) {
      this.measurements = measurements;
      return this;
   }
   
   
   public String getDeliveryId(){
      return this.deliveryId;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> getItems(){
      return this.items;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.order.TrackingData getTrackingData(){
      return this.trackingData;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.order.ParcelMeasurements getMeasurements(){
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