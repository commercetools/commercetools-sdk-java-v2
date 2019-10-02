package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.order.ParcelMeasurements;
import com.commercetools.models.order.OrderSetParcelMeasurementsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetParcelMeasurementsActionBuilder {
   
   @Nullable
   private com.commercetools.models.order.ParcelMeasurements measurements;
   
   
   private String parcelId;
   
   public OrderSetParcelMeasurementsActionBuilder measurements(@Nullable final com.commercetools.models.order.ParcelMeasurements measurements) {
      this.measurements = measurements;
      return this;
   }
   
   public OrderSetParcelMeasurementsActionBuilder parcelId( final String parcelId) {
      this.parcelId = parcelId;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.order.ParcelMeasurements getMeasurements(){
      return this.measurements;
   }
   
   
   public String getParcelId(){
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