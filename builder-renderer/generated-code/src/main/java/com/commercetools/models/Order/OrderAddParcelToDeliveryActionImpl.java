package com.commercetools.models.Order;

import com.commercetools.models.Order.DeliveryItem;
import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.Order.ParcelMeasurements;
import com.commercetools.models.Order.TrackingData;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderAddParcelToDeliveryActionImpl implements OrderAddParcelToDeliveryAction {

   private java.lang.String action;
   
   private java.lang.String deliveryId;
   
   private java.util.List<com.commercetools.models.Order.DeliveryItem> items;
   
   private com.commercetools.models.Order.TrackingData trackingData;
   
   private com.commercetools.models.Order.ParcelMeasurements measurements;

   @JsonCreator
   OrderAddParcelToDeliveryActionImpl(@JsonProperty("deliveryId") final java.lang.String deliveryId, @JsonProperty("items") final java.util.List<com.commercetools.models.Order.DeliveryItem> items, @JsonProperty("trackingData") final com.commercetools.models.Order.TrackingData trackingData, @JsonProperty("measurements") final com.commercetools.models.Order.ParcelMeasurements measurements) {
      this.deliveryId = deliveryId;
      this.items = items;
      this.trackingData = trackingData;
      this.measurements = measurements;
      this.action = "addParcelToDelivery";
   }
   public OrderAddParcelToDeliveryActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getDeliveryId(){
      return this.deliveryId;
   }
   
   
   public java.util.List<com.commercetools.models.Order.DeliveryItem> getItems(){
      return this.items;
   }
   
   
   public com.commercetools.models.Order.TrackingData getTrackingData(){
      return this.trackingData;
   }
   
   
   public com.commercetools.models.Order.ParcelMeasurements getMeasurements(){
      return this.measurements;
   }

   public void setDeliveryId(final java.lang.String deliveryId){
      this.deliveryId = deliveryId;
   }
   
   public void setItems(final java.util.List<com.commercetools.models.Order.DeliveryItem> items){
      this.items = items;
   }
   
   public void setTrackingData(final com.commercetools.models.Order.TrackingData trackingData){
      this.trackingData = trackingData;
   }
   
   public void setMeasurements(final com.commercetools.models.Order.ParcelMeasurements measurements){
      this.measurements = measurements;
   }

}