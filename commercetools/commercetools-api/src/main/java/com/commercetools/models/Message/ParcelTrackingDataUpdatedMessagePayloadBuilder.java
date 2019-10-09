package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.order.TrackingData;
import com.commercetools.models.message.ParcelTrackingDataUpdatedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ParcelTrackingDataUpdatedMessagePayloadBuilder {
   
   
   private String deliveryId;
   
   @Nullable
   private com.commercetools.models.order.TrackingData trackingData;
   
   
   private String parcelId;
   
   public ParcelTrackingDataUpdatedMessagePayloadBuilder deliveryId( final String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public ParcelTrackingDataUpdatedMessagePayloadBuilder trackingData(@Nullable final com.commercetools.models.order.TrackingData trackingData) {
      this.trackingData = trackingData;
      return this;
   }
   
   public ParcelTrackingDataUpdatedMessagePayloadBuilder parcelId( final String parcelId) {
      this.parcelId = parcelId;
      return this;
   }
   
   
   public String getDeliveryId(){
      return this.deliveryId;
   }
   
   @Nullable
   public com.commercetools.models.order.TrackingData getTrackingData(){
      return this.trackingData;
   }
   
   
   public String getParcelId(){
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