package com.commercetools.models.Order;

import com.commercetools.models.Order.DeliveryItem;
import com.commercetools.models.Order.ParcelMeasurements;
import com.commercetools.models.Order.TrackingData;
import com.commercetools.models.Order.ParcelDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ParcelDraftBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.models.Order.DeliveryItem> items;
   
   @Nullable
   private com.commercetools.models.Order.TrackingData trackingData;
   
   @Nullable
   private com.commercetools.models.Order.ParcelMeasurements measurements;
   
   public ParcelDraftBuilder items(@Nullable final java.util.List<com.commercetools.models.Order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   public ParcelDraftBuilder trackingData(@Nullable final com.commercetools.models.Order.TrackingData trackingData) {
      this.trackingData = trackingData;
      return this;
   }
   
   public ParcelDraftBuilder measurements(@Nullable final com.commercetools.models.Order.ParcelMeasurements measurements) {
      this.measurements = measurements;
      return this;
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

   public ParcelDraft build() {
       return new ParcelDraftImpl(items, trackingData, measurements);
   }
   
   public static ParcelDraftBuilder of() {
      return new ParcelDraftBuilder();
   }
   
   public static ParcelDraftBuilder of(final ParcelDraft template) {
      ParcelDraftBuilder builder = new ParcelDraftBuilder();
      builder.items = template.getItems();
      builder.trackingData = template.getTrackingData();
      builder.measurements = template.getMeasurements();
      return builder;
   }
   
}