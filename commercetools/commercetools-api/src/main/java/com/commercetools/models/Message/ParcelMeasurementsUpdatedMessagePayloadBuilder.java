package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.order.ParcelMeasurements;
import java.lang.String;
import com.commercetools.models.message.ParcelMeasurementsUpdatedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ParcelMeasurementsUpdatedMessagePayloadBuilder {
   
   
   private java.lang.String deliveryId;
   
   @Nullable
   private com.commercetools.models.order.ParcelMeasurements measurements;
   
   
   private java.lang.String parcelId;
   
   public ParcelMeasurementsUpdatedMessagePayloadBuilder deliveryId( final java.lang.String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public ParcelMeasurementsUpdatedMessagePayloadBuilder measurements(@Nullable final com.commercetools.models.order.ParcelMeasurements measurements) {
      this.measurements = measurements;
      return this;
   }
   
   public ParcelMeasurementsUpdatedMessagePayloadBuilder parcelId( final java.lang.String parcelId) {
      this.parcelId = parcelId;
      return this;
   }
   
   
   public java.lang.String getDeliveryId(){
      return this.deliveryId;
   }
   
   @Nullable
   public com.commercetools.models.order.ParcelMeasurements getMeasurements(){
      return this.measurements;
   }
   
   
   public java.lang.String getParcelId(){
      return this.parcelId;
   }

   public ParcelMeasurementsUpdatedMessagePayload build() {
       return new ParcelMeasurementsUpdatedMessagePayloadImpl(deliveryId, measurements, parcelId);
   }
   
   public static ParcelMeasurementsUpdatedMessagePayloadBuilder of() {
      return new ParcelMeasurementsUpdatedMessagePayloadBuilder();
   }
   
   public static ParcelMeasurementsUpdatedMessagePayloadBuilder of(final ParcelMeasurementsUpdatedMessagePayload template) {
      ParcelMeasurementsUpdatedMessagePayloadBuilder builder = new ParcelMeasurementsUpdatedMessagePayloadBuilder();
      builder.deliveryId = template.getDeliveryId();
      builder.measurements = template.getMeasurements();
      builder.parcelId = template.getParcelId();
      return builder;
   }
   
}