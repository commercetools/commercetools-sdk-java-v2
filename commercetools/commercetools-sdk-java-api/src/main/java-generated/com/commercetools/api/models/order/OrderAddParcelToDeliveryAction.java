package com.commercetools.api.models.order;

import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.ParcelMeasurements;
import com.commercetools.api.models.order.TrackingData;
import com.commercetools.api.models.order.OrderAddParcelToDeliveryActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
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
    
    @JsonIgnore
    public void setItems(final DeliveryItem ...items);
    public void setItems(final List<DeliveryItem> items);

    public static OrderAddParcelToDeliveryActionImpl of(){
        return new OrderAddParcelToDeliveryActionImpl();
    }
    

    public static OrderAddParcelToDeliveryActionImpl of(final OrderAddParcelToDeliveryAction template) {
        OrderAddParcelToDeliveryActionImpl instance = new OrderAddParcelToDeliveryActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setMeasurements(template.getMeasurements());
        instance.setTrackingData(template.getTrackingData());
        instance.setItems(template.getItems());
        return instance;
    }

    default <T> T withOrderAddParcelToDeliveryAction(Function<OrderAddParcelToDeliveryAction, T> helper) {
        return helper.apply(this);
    }
}
