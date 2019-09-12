package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.ParcelMeasurements;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetParcelMeasurementsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetParcelMeasurementsActionBuilder {
   
   @Nullable
   private com.commercetools.models.Order.ParcelMeasurements measurements;
   
   
   private java.lang.String parcelId;
   
   public StagedOrderSetParcelMeasurementsActionBuilder measurements(@Nullable final com.commercetools.models.Order.ParcelMeasurements measurements) {
      this.measurements = measurements;
      return this;
   }
   
   public StagedOrderSetParcelMeasurementsActionBuilder parcelId( final java.lang.String parcelId) {
      this.parcelId = parcelId;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Order.ParcelMeasurements getMeasurements(){
      return this.measurements;
   }
   
   
   public java.lang.String getParcelId(){
      return this.parcelId;
   }

   public StagedOrderSetParcelMeasurementsAction build() {
       return new StagedOrderSetParcelMeasurementsActionImpl(measurements, parcelId);
   }
   
   public static StagedOrderSetParcelMeasurementsActionBuilder of() {
      return new StagedOrderSetParcelMeasurementsActionBuilder();
   }
   
   public static StagedOrderSetParcelMeasurementsActionBuilder of(final StagedOrderSetParcelMeasurementsAction template) {
      StagedOrderSetParcelMeasurementsActionBuilder builder = new StagedOrderSetParcelMeasurementsActionBuilder();
      builder.measurements = template.getMeasurements();
      builder.parcelId = template.getParcelId();
      return builder;
   }
   
}