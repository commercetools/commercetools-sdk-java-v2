package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.DeliveryItem;
import com.commercetools.api.generated.models.order.ParcelMeasurements;
import com.commercetools.api.generated.models.order.TrackingData;
import com.commercetools.api.generated.models.order.ParcelDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ParcelDraftBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items;
   
   @Nullable
   private com.commercetools.api.generated.models.order.TrackingData trackingData;
   
   @Nullable
   private com.commercetools.api.generated.models.order.ParcelMeasurements measurements;
   
   public ParcelDraftBuilder items(@Nullable final java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   public ParcelDraftBuilder trackingData(@Nullable final com.commercetools.api.generated.models.order.TrackingData trackingData) {
      this.trackingData = trackingData;
      return this;
   }
   
   public ParcelDraftBuilder measurements(@Nullable final com.commercetools.api.generated.models.order.ParcelMeasurements measurements) {
      this.measurements = measurements;
      return this;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> getItems(){
      return this.items;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.order.TrackingData getTrackingData(){
      return this.trackingData;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.order.ParcelMeasurements getMeasurements(){
      return this.measurements;
   }

   public ParcelDraft build() {
       return new ParcelDraftImpl(items, trackingData, measurements);
   }
   
   public static ParcelDraftBuilder of() {
      return new ParcelDraftBuilder();
   }
   
   public static ParcelDraftBuilder of(final ParcelDraft template) {
      ParcelDraftBuilder builder = new ParcelDraftBuilder();
      builder.items = template.getItems();
      builder.trackingData = template.getTrackingData();
      builder.measurements = template.getMeasurements();
      return builder;
   }
   
}