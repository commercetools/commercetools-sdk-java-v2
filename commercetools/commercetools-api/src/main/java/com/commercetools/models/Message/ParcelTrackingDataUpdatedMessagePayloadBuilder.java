package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.TrackingData;
import java.lang.String;
import com.commercetools.models.Message.ParcelTrackingDataUpdatedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ParcelTrackingDataUpdatedMessagePayloadBuilder {
   
   
   private java.lang.String deliveryId;
   
   @Nullable
   private com.commercetools.models.Order.TrackingData trackingData;
   
   
   private java.lang.String parcelId;
   
   public ParcelTrackingDataUpdatedMessagePayloadBuilder deliveryId( final java.lang.String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public ParcelTrackingDataUpdatedMessagePayloadBuilder trackingData(@Nullable final com.commercetools.models.Order.TrackingData trackingData) {
      this.trackingData = trackingData;
      return this;
   }
   
   public ParcelTrackingDataUpdatedMessagePayloadBuilder parcelId( final java.lang.String parcelId) {
      this.parcelId = parcelId;
      return this;
   }
   
   
   public java.lang.String getDeliveryId(){
      return this.deliveryId;
   }
   
   @Nullable
   public com.commercetools.models.Order.TrackingData getTrackingData(){
      return this.trackingData;
   }
   
   
   public java.lang.String getParcelId(){
      return this.parcelId;
   }

   public ParcelTrackingDataUpdatedMessagePayload build() {
       return new ParcelTrackingDataUpdatedMessagePayloadImpl(deliveryId, trackingData, parcelId);
   }
   
   public static ParcelTrackingDataUpdatedMessagePayloadBuilder of() {
      return new ParcelTrackingDataUpdatedMessagePayloadBuilder();
   }
   
   public static ParcelTrackingDataUpdatedMessagePayloadBuilder of(final ParcelTrackingDataUpdatedMessagePayload template) {
      ParcelTrackingDataUpdatedMessagePayloadBuilder builder = new ParcelTrackingDataUpdatedMessagePayloadBuilder();
      builder.deliveryId = template.getDeliveryId();
      builder.trackingData = template.getTrackingData();
      builder.parcelId = template.getParcelId();
      return builder;
   }
   
}