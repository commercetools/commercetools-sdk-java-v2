package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.DeliveryItem;
import com.commercetools.api.generated.models.order.ParcelMeasurements;
import com.commercetools.api.generated.models.order.TrackingData;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.order.ParcelImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ParcelImpl.class)
public interface Parcel  {

   
   @NotNull
   @JsonProperty("id")
   public String getId();
   
   @NotNull
   @JsonProperty("createdAt")
   public ZonedDateTime getCreatedAt();
   
   @Valid
   @JsonProperty("measurements")
   public ParcelMeasurements getMeasurements();
   
   @Valid
   @JsonProperty("trackingData")
   public TrackingData getTrackingData();
   
   @Valid
   @JsonProperty("items")
   public List<DeliveryItem> getItems();

   public void setId(final String id);
   
   public void setCreatedAt(final ZonedDateTime createdAt);
   
   public void setMeasurements(final ParcelMeasurements measurements);
   
   public void setTrackingData(final TrackingData trackingData);
   
   public void setItems(final List<DeliveryItem> items);
   
   public static ParcelImpl of(){
      return new ParcelImpl();
   }
   

   public static ParcelImpl of(final Parcel template) {
      ParcelImpl instance = new ParcelImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setId(template.getId());
      instance.setItems(template.getItems());
      instance.setTrackingData(template.getTrackingData());
      instance.setMeasurements(template.getMeasurements());
      return instance;
   }

}