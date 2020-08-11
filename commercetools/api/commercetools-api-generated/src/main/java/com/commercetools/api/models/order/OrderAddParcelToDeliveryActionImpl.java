package com.commercetools.api.models.order;

import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.ParcelMeasurements;
import com.commercetools.api.models.order.TrackingData;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderAddParcelToDeliveryActionImpl implements OrderAddParcelToDeliveryAction {

   private String action;

   private String deliveryId;

   private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

   private com.commercetools.api.models.order.TrackingData trackingData;

   private com.commercetools.api.models.order.ParcelMeasurements measurements;

   @JsonCreator
   OrderAddParcelToDeliveryActionImpl(@JsonProperty("deliveryId") final String deliveryId, @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.DeliveryItem> items, @JsonProperty("trackingData") final com.commercetools.api.models.order.TrackingData trackingData, @JsonProperty("measurements") final com.commercetools.api.models.order.ParcelMeasurements measurements) {
      this.deliveryId = deliveryId;
      this.items = items;
      this.trackingData = trackingData;
      this.measurements = measurements;
      this.action = "addParcelToDelivery";
   }
   public OrderAddParcelToDeliveryActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public String getDeliveryId(){
      return this.deliveryId;
   }


   public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems(){
      return this.items;
   }


   public com.commercetools.api.models.order.TrackingData getTrackingData(){
      return this.trackingData;
   }


   public com.commercetools.api.models.order.ParcelMeasurements getMeasurements(){
      return this.measurements;
   }

   public void setDeliveryId(final String deliveryId){
      this.deliveryId = deliveryId;
   }

   public void setItems(final java.util.List<com.commercetools.api.models.order.DeliveryItem> items){
      this.items = items;
   }

   public void setTrackingData(final com.commercetools.api.models.order.TrackingData trackingData){
      this.trackingData = trackingData;
   }

   public void setMeasurements(final com.commercetools.api.models.order.ParcelMeasurements measurements){
      this.measurements = measurements;
   }

}
