package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.order.ParcelMeasurements;
import com.commercetools.api.generated.models.order.OrderSetParcelMeasurementsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderSetParcelMeasurementsActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.order.ParcelMeasurements measurements;
   
   
   private String parcelId;
   
   public OrderSetParcelMeasurementsActionBuilder measurements(@Nullable final com.commercetools.api.generated.models.order.ParcelMeasurements measurements) {
      this.measurements = measurements;
      return this;
   }
   
   public OrderSetParcelMeasurementsActionBuilder parcelId( final String parcelId) {
      this.parcelId = parcelId;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.order.ParcelMeasurements getMeasurements(){
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