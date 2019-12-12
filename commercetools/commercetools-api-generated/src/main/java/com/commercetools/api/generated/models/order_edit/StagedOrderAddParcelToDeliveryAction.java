package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.DeliveryItem;
import com.commercetools.api.generated.models.order.ParcelMeasurements;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order.TrackingData;
import com.commercetools.api.generated.models.order_edit.StagedOrderAddParcelToDeliveryActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = StagedOrderAddParcelToDeliveryActionImpl.class)
public interface StagedOrderAddParcelToDeliveryAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("deliveryId")
   public String getDeliveryId();
   
   @Valid
   @JsonProperty("measurements")
   public ParcelMeasurements getMeasurements();
   
   @Valid
   @JsonProperty("trackingData")
   public TrackingData getTrackingData();
   
   @Valid
   @JsonProperty("items")
   public List<DeliveryItem> getItems();

   public void setDeliveryId(final String deliveryId);
   
   public void setMeasurements(final ParcelMeasurements measurements);
   
   public void setTrackingData(final TrackingData trackingData);
   
   public void setItems(final List<DeliveryItem> items);
   
   public static StagedOrderAddParcelToDeliveryActionImpl of(){
      return new StagedOrderAddParcelToDeliveryActionImpl();
   }
   

   public static StagedOrderAddParcelToDeliveryActionImpl of(final StagedOrderAddParcelToDeliveryAction template) {
      StagedOrderAddParcelToDeliveryActionImpl instance = new StagedOrderAddParcelToDeliveryActionImpl();
      instance.setDeliveryId(template.getDeliveryId());
      instance.setItems(template.getItems());
      instance.setTrackingData(template.getTrackingData());
      instance.setMeasurements(template.getMeasurements());
      return instance;
   }

}