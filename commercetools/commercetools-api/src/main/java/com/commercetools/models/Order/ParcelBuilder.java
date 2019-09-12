package com.commercetools.models.Order;

import com.commercetools.models.Order.DeliveryItem;
import com.commercetools.models.Order.ParcelMeasurements;
import com.commercetools.models.Order.TrackingData;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Order.Parcel;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ParcelBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.lang.String id;
   
   @Nullable
   private java.util.List<com.commercetools.models.Order.DeliveryItem> items;
   
   @Nullable
   private com.commercetools.models.Order.TrackingData trackingData;
   
   @Nullable
   private com.commercetools.models.Order.ParcelMeasurements measurements;
   
   public ParcelBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ParcelBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ParcelBuilder items(@Nullable final java.util.List<com.commercetools.models.Order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   public ParcelBuilder trackingData(@Nullable final com.commercetools.models.Order.TrackingData trackingData) {
      this.trackingData = trackingData;
      return this;
   }
   
   public ParcelBuilder measurements(@Nullable final com.commercetools.models.Order.ParcelMeasurements measurements) {
      this.measurements = measurements;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
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

   public Parcel build() {
       return new ParcelImpl(createdAt, id, items, trackingData, measurements);
   }
   
   public static ParcelBuilder of() {
      return new ParcelBuilder();
   }
   
   public static ParcelBuilder of(final Parcel template) {
      ParcelBuilder builder = new ParcelBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.id = template.getId();
      builder.items = template.getItems();
      builder.trackingData = template.getTrackingData();
      builder.measurements = template.getMeasurements();
      return builder;
   }
   
}