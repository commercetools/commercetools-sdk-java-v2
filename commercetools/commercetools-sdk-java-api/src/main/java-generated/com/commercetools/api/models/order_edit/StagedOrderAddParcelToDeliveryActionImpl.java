package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.ParcelMeasurements;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order.TrackingData;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * StagedOrderAddParcelToDeliveryAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderAddParcelToDeliveryActionImpl implements StagedOrderAddParcelToDeliveryAction, ModelBase {

    
    private String action;
    
    
    private String deliveryId;
    
    
    private String deliveryKey;
    
    
    private com.commercetools.api.models.order.ParcelMeasurements measurements;
    
    
    private com.commercetools.api.models.order.TrackingData trackingData;
    
    
    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderAddParcelToDeliveryActionImpl(@JsonProperty("deliveryId") final String deliveryId, @JsonProperty("deliveryKey") final String deliveryKey, @JsonProperty("measurements") final com.commercetools.api.models.order.ParcelMeasurements measurements, @JsonProperty("trackingData") final com.commercetools.api.models.order.TrackingData trackingData, @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.deliveryId = deliveryId;
        this.deliveryKey = deliveryKey;
        this.measurements = measurements;
        this.trackingData = trackingData;
        this.items = items;
        this.action =  ADD_PARCEL_TO_DELIVERY;
    }
    /**
     * create empty instance
     */
    public StagedOrderAddParcelToDeliveryActionImpl() {
        this.action =  ADD_PARCEL_TO_DELIVERY;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     */
    
    public String getDeliveryId(){
        return this.deliveryId;
    }
    
    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     */
    
    public String getDeliveryKey(){
        return this.deliveryKey;
    }
    
    /**
     *
     */
    
    public com.commercetools.api.models.order.ParcelMeasurements getMeasurements(){
        return this.measurements;
    }
    
    /**
     *
     */
    
    public com.commercetools.api.models.order.TrackingData getTrackingData(){
        return this.trackingData;
    }
    
    /**
     *
     */
    
    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems(){
        return this.items;
    }

    
    public void setDeliveryId(final String deliveryId){
        this.deliveryId = deliveryId;
    }
    
    
    public void setDeliveryKey(final String deliveryKey){
        this.deliveryKey = deliveryKey;
    }
    
    
    public void setMeasurements(final com.commercetools.api.models.order.ParcelMeasurements measurements){
        this.measurements = measurements;
    }
    
    
    public void setTrackingData(final com.commercetools.api.models.order.TrackingData trackingData){
        this.trackingData = trackingData;
    }
    
    
    public void setItems(final com.commercetools.api.models.order.DeliveryItem ...items){
       this.items = new ArrayList<>(Arrays.asList(items));
    }
    
    
    public void setItems(final java.util.List<com.commercetools.api.models.order.DeliveryItem> items){
       this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StagedOrderAddParcelToDeliveryActionImpl that = (StagedOrderAddParcelToDeliveryActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(deliveryId, that.deliveryId)
                .append(deliveryKey, that.deliveryKey)
                .append(measurements, that.measurements)
                .append(trackingData, that.trackingData)
                .append(items, that.items)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(deliveryId)
            .append(deliveryKey)
            .append(measurements)
            .append(trackingData)
            .append(items)
            .toHashCode();
    }

}
