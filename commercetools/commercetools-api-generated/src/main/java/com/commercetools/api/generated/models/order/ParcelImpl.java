package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.DeliveryItem;
import com.commercetools.api.generated.models.order.ParcelMeasurements;
import com.commercetools.api.generated.models.order.TrackingData;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ParcelImpl implements Parcel {

   private java.time.ZonedDateTime createdAt;
   
   private String id;
   
   private java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items;
   
   private com.commercetools.api.generated.models.order.TrackingData trackingData;
   
   private com.commercetools.api.generated.models.order.ParcelMeasurements measurements;

   @JsonCreator
   ParcelImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("id") final String id, @JsonProperty("items") final java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items, @JsonProperty("trackingData") final com.commercetools.api.generated.models.order.TrackingData trackingData, @JsonProperty("measurements") final com.commercetools.api.generated.models.order.ParcelMeasurements measurements) {
      this.createdAt = createdAt;
      this.id = id;
      this.items = items;
      this.trackingData = trackingData;
      this.measurements = measurements;
   }
   public ParcelImpl() {
      
   }
   
   /**
   	
   */
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   /**
   	
   */
   public String getId(){
      return this.id;
   }
   
   /**
   	<p>The delivery items contained in this parcel.</p>
   */
   public java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> getItems(){
      return this.items;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.order.TrackingData getTrackingData(){
      return this.trackingData;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.order.ParcelMeasurements getMeasurements(){
      return this.measurements;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setItems(final java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items){
      this.items = items;
   }
   
   public void setTrackingData(final com.commercetools.api.generated.models.order.TrackingData trackingData){
      this.trackingData = trackingData;
   }
   
   public void setMeasurements(final com.commercetools.api.generated.models.order.ParcelMeasurements measurements){
      this.measurements = measurements;
   }

}