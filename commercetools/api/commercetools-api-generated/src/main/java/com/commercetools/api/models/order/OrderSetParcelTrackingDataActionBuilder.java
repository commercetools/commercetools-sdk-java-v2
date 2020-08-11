package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.TrackingData;
import com.commercetools.api.models.order.OrderSetParcelTrackingDataAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderSetParcelTrackingDataActionBuilder {

   @Nullable
   private com.commercetools.api.models.order.TrackingData trackingData;


   private String parcelId;

   public OrderSetParcelTrackingDataActionBuilder trackingData(@Nullable final com.commercetools.api.models.order.TrackingData trackingData) {
      this.trackingData = trackingData;
      return this;
   }

   public OrderSetParcelTrackingDataActionBuilder parcelId( final String parcelId) {
      this.parcelId = parcelId;
      return this;
   }

   @Nullable
   public com.commercetools.api.models.order.TrackingData getTrackingData(){
      return this.trackingData;
   }


   public String getParcelId(){
      return this.parcelId;
   }

   public OrderSetParcelTrackingDataAction build() {
       return new OrderSetParcelTrackingDataActionImpl(trackingData, parcelId);
   }

   public static OrderSetParcelTrackingDataActionBuilder of() {
      return new OrderSetParcelTrackingDataActionBuilder();
   }

   public static OrderSetParcelTrackingDataActionBuilder of(final OrderSetParcelTrackingDataAction template) {
      OrderSetParcelTrackingDataActionBuilder builder = new OrderSetParcelTrackingDataActionBuilder();
      builder.trackingData = template.getTrackingData();
      builder.parcelId = template.getParcelId();
      return builder;
   }

}
