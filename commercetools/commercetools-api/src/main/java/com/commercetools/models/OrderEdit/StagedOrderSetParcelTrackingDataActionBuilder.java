package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.StagedOrderUpdateAction;
import com.commercetools.models.Order.TrackingData;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetParcelTrackingDataAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetParcelTrackingDataActionBuilder {
   
   @Nullable
   private com.commercetools.models.Order.TrackingData trackingData;
   
   
   private java.lang.String parcelId;
   
   public StagedOrderSetParcelTrackingDataActionBuilder trackingData(@Nullable final com.commercetools.models.Order.TrackingData trackingData) {
      this.trackingData = trackingData;
      return this;
   }
   
   public StagedOrderSetParcelTrackingDataActionBuilder parcelId( final java.lang.String parcelId) {
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

   public StagedOrderSetParcelTrackingDataAction build() {
       return new StagedOrderSetParcelTrackingDataActionImpl(trackingData, parcelId);
   }
   
   public static StagedOrderSetParcelTrackingDataActionBuilder of() {
      return new StagedOrderSetParcelTrackingDataActionBuilder();
   }
   
   public static StagedOrderSetParcelTrackingDataActionBuilder of(final StagedOrderSetParcelTrackingDataAction template) {
      StagedOrderSetParcelTrackingDataActionBuilder builder = new StagedOrderSetParcelTrackingDataActionBuilder();
      builder.trackingData = template.getTrackingData();
      builder.parcelId = template.getParcelId();
      return builder;
   }
   
}