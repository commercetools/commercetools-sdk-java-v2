package com.commercetools.models.order;

import com.commercetools.models.order.DeliveryItem;
import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.order.ParcelMeasurements;
import com.commercetools.models.order.TrackingData;
import java.lang.String;
import com.commercetools.models.order.OrderAddParcelToDeliveryActionImpl;

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
@JsonDeserialize(as = OrderAddParcelToDeliveryActionImpl.class)
public interface OrderAddParcelToDeliveryAction extends OrderUpdateAction {

   
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
   
   public static OrderAddParcelToDeliveryActionImpl of(){
      return new OrderAddParcelToDeliveryActionImpl();
   }
   

   public static OrderAddParcelToDeliveryActionImpl of(final OrderAddParcelToDeliveryAction template) {
      OrderAddParcelToDeliveryActionImpl instance = new OrderAddParcelToDeliveryActionImpl();
      instance.setDeliveryId(template.getDeliveryId());
      instance.setItems(template.getItems());
      instance.setTrackingData(template.getTrackingData());
      instance.setMeasurements(template.getMeasurements());
      return instance;
   }

}