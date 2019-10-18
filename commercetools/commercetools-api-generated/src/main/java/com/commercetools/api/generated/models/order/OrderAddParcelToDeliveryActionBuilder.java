package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.DeliveryItem;
import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.order.ParcelMeasurements;
import com.commercetools.api.generated.models.order.TrackingData;
import com.commercetools.api.generated.models.order.OrderAddParcelToDeliveryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderAddParcelToDeliveryActionBuilder {
   
   
   private String deliveryId;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items;
   
   @Nullable
   private com.commercetools.api.generated.models.order.TrackingData trackingData;
   
   @Nullable
   private com.commercetools.api.generated.models.order.ParcelMeasurements measurements;
   
   public OrderAddParcelToDeliveryActionBuilder deliveryId( final String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public OrderAddParcelToDeliveryActionBuilder items(@Nullable final java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   public OrderAddParcelToDeliveryActionBuilder trackingData(@Nullable final com.commercetools.api.generated.models.order.TrackingData trackingData) {
      this.trackingData = trackingData;
      return this;
   }
   
   public OrderAddParcelToDeliveryActionBuilder measurements(@Nullable final com.commercetools.api.generated.models.order.ParcelMeasurements measurements) {
      this.measurements = measurements;
      return this;
   }
   
   
   public String getDeliveryId(){
      return this.deliveryId;
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

   public OrderAddParcelToDeliveryAction build() {
       return new OrderAddParcelToDeliveryActionImpl(deliveryId, items, trackingData, measurements);
   }
   
   public static OrderAddParcelToDeliveryActionBuilder of() {
      return new OrderAddParcelToDeliveryActionBuilder();
   }
   
   public static OrderAddParcelToDeliveryActionBuilder of(final OrderAddParcelToDeliveryAction template) {
      OrderAddParcelToDeliveryActionBuilder builder = new OrderAddParcelToDeliveryActionBuilder();
      builder.deliveryId = template.getDeliveryId();
      builder.items = template.getItems();
      builder.trackingData = template.getTrackingData();
      builder.measurements = template.getMeasurements();
      return builder;
   }
   
}