package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.Order.TrackingData;
import java.lang.String;
import com.commercetools.models.Order.OrderSetParcelTrackingDataAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetParcelTrackingDataActionBuilder {
   
   @Nullable
   private com.commercetools.models.Order.TrackingData trackingData;
   
   
   private java.lang.String parcelId;
   
   public OrderSetParcelTrackingDataActionBuilder trackingData(@Nullable final com.commercetools.models.Order.TrackingData trackingData) {
      this.trackingData = trackingData;
      return this;
   }
   
   public OrderSetParcelTrackingDataActionBuilder parcelId( final java.lang.String parcelId) {
      this.parcelId = parcelId;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Order.TrackingData getTrackingData(){
      return this.trackingData;
   }
   
   
   public java.lang.String getParcelId(){
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