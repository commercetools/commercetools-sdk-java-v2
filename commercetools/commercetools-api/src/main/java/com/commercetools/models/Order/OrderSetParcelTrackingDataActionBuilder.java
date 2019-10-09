package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.order.TrackingData;
import com.commercetools.models.order.OrderSetParcelTrackingDataAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetParcelTrackingDataActionBuilder {
   
   @Nullable
   private com.commercetools.models.order.TrackingData trackingData;
   
   
   private String parcelId;
   
   public OrderSetParcelTrackingDataActionBuilder trackingData(@Nullable final com.commercetools.models.order.TrackingData trackingData) {
      this.trackingData = trackingData;
      return this;
   }
   
   public OrderSetParcelTrackingDataActionBuilder parcelId( final String parcelId) {
      this.parcelId = parcelId;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.order.TrackingData getTrackingData(){
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