package com.commercetools.api.models.order;

import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.ParcelMeasurements;
import com.commercetools.api.models.order.TrackingData;
import java.time.ZonedDateTime;
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
public final class ParcelImpl implements Parcel {

   private String id;
   
   private java.time.ZonedDateTime createdAt;
   
   private com.commercetools.api.models.order.ParcelMeasurements measurements;
   
   private com.commercetools.api.models.order.TrackingData trackingData;
   
   private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

   @JsonCreator
   ParcelImpl(@JsonProperty("id") final String id, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("measurements") final com.commercetools.api.models.order.ParcelMeasurements measurements, @JsonProperty("trackingData") final com.commercetools.api.models.order.TrackingData trackingData, @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
      this.id = id;
      this.createdAt = createdAt;
      this.measurements = measurements;
      this.trackingData = trackingData;
      this.items = items;
   }
   public ParcelImpl() {
      
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public com.commercetools.api.models.order.ParcelMeasurements getMeasurements(){
      return this.measurements;
   }
   
   
   public com.commercetools.api.models.order.TrackingData getTrackingData(){
      return this.trackingData;
   }
   
   /**
   *  <p>The delivery items contained in this parcel.</p>
   */
   public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems(){
      return this.items;
   }

   public void setId(final String id){
      this.id = id;
   }
   
   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setMeasurements(final com.commercetools.api.models.order.ParcelMeasurements measurements){
      this.measurements = measurements;
   }
   
   public void setTrackingData(final com.commercetools.api.models.order.TrackingData trackingData){
      this.trackingData = trackingData;
   }
   
   public void setItems(final java.util.List<com.commercetools.api.models.order.DeliveryItem> items){
      this.items = items;
   }

}
