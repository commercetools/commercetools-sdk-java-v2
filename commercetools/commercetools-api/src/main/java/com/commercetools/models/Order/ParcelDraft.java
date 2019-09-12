package com.commercetools.models.Order;

import com.commercetools.models.Order.DeliveryItem;
import com.commercetools.models.Order.ParcelMeasurements;
import com.commercetools.models.Order.TrackingData;
import com.commercetools.models.Order.ParcelDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = ParcelDraftImpl.class)
public interface ParcelDraft  {

   
   @Valid
   @JsonProperty("measurements")
   public ParcelMeasurements getMeasurements();
   
   @Valid
   @JsonProperty("trackingData")
   public TrackingData getTrackingData();
   
   @Valid
   @JsonProperty("items")
   public List<DeliveryItem> getItems();

   public void setMeasurements(final ParcelMeasurements measurements);
   
   public void setTrackingData(final TrackingData trackingData);
   
   public void setItems(final List<DeliveryItem> items);
   
   public static ParcelDraftImpl of(){
      return new ParcelDraftImpl();
   }
   

   public static ParcelDraftImpl of(final ParcelDraft template) {
      ParcelDraftImpl instance = new ParcelDraftImpl();
      instance.setItems(template.getItems());
      instance.setTrackingData(template.getTrackingData());
      instance.setMeasurements(template.getMeasurements());
      return instance;
   }

}