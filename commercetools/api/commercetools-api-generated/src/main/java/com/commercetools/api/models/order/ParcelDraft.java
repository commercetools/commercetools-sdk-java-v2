package com.commercetools.api.models.order;

import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.ParcelMeasurements;
import com.commercetools.api.models.order.TrackingData;
import com.commercetools.api.models.order.ParcelDraftImpl;

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
@JsonDeserialize(as = ParcelDraftImpl.class)
public interface ParcelDraft  {

   
   @Valid
   @JsonProperty("measurements")
   public ParcelMeasurements getMeasurements();
   
   @Valid
   @JsonProperty("trackingData")
   public TrackingData getTrackingData();
   /**
   *  <p>The delivery items contained in this parcel.</p>
   */
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
      instance.setMeasurements(template.getMeasurements());
      instance.setTrackingData(template.getTrackingData());
      instance.setItems(template.getItems());
      return instance;
   }

}
