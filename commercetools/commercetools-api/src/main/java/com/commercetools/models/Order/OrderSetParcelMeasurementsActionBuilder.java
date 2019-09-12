package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.Order.ParcelMeasurements;
import java.lang.String;
import com.commercetools.models.Order.OrderSetParcelMeasurementsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetParcelMeasurementsActionBuilder {
   
   @Nullable
   private com.commercetools.models.Order.ParcelMeasurements measurements;
   
   
   private java.lang.String parcelId;
   
   public OrderSetParcelMeasurementsActionBuilder measurements(@Nullable final com.commercetools.models.Order.ParcelMeasurements measurements) {
      this.measurements = measurements;
      return this;
   }
   
   public OrderSetParcelMeasurementsActionBuilder parcelId( final java.lang.String parcelId) {
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

   public OrderSetParcelMeasurementsAction build() {
       return new OrderSetParcelMeasurementsActionImpl(measurements, parcelId);
   }
   
   public static OrderSetParcelMeasurementsActionBuilder of() {
      return new OrderSetParcelMeasurementsActionBuilder();
   }
   
   public static OrderSetParcelMeasurementsActionBuilder of(final OrderSetParcelMeasurementsAction template) {
      OrderSetParcelMeasurementsActionBuilder builder = new OrderSetParcelMeasurementsActionBuilder();
      builder.measurements = template.getMeasurements();
      builder.parcelId = template.getParcelId();
      return builder;
   }
   
}