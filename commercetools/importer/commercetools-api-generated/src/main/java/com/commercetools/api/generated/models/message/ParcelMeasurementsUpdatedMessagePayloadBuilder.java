package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.ParcelMeasurements;
import com.commercetools.api.generated.models.message.ParcelMeasurementsUpdatedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ParcelMeasurementsUpdatedMessagePayloadBuilder {
   
   
   private String deliveryId;
   
   @Nullable
   private com.commercetools.api.generated.models.order.ParcelMeasurements measurements;
   
   
   private String parcelId;
   
   public ParcelMeasurementsUpdatedMessagePayloadBuilder deliveryId( final String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public ParcelMeasurementsUpdatedMessagePayloadBuilder measurements(@Nullable final com.commercetools.api.generated.models.order.ParcelMeasurements measurements) {
      this.measurements = measurements;
      return this;
   }
   
   public ParcelMeasurementsUpdatedMessagePayloadBuilder parcelId( final String parcelId) {
      this.parcelId = parcelId;
      return this;
   }
   
   
   public String getDeliveryId(){
      return this.deliveryId;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.order.ParcelMeasurements getMeasurements(){
      return this.measurements;
   }
   
   
   public String getParcelId(){
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