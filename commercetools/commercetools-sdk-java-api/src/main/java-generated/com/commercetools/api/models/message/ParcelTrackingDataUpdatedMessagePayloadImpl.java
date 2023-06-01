package com.commercetools.api.models.message;

import com.commercetools.api.models.message.OrderMessagePayload;
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
 *  <p>Generated after a successful Set Parcel TrackingData update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ParcelTrackingDataUpdatedMessagePayloadImpl implements ParcelTrackingDataUpdatedMessagePayload, ModelBase {

    
    private String type;
    
    
    private String deliveryId;
    
    
    private String parcelId;
    
    
    private com.commercetools.api.models.order.TrackingData trackingData;
    
    
    private String shippingKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ParcelTrackingDataUpdatedMessagePayloadImpl(@JsonProperty("deliveryId") final String deliveryId, @JsonProperty("parcelId") final String parcelId, @JsonProperty("trackingData") final com.commercetools.api.models.order.TrackingData trackingData, @JsonProperty("shippingKey") final String shippingKey) {
        this.deliveryId = deliveryId;
        this.parcelId = parcelId;
        this.trackingData = trackingData;
        this.shippingKey = shippingKey;
        this.type =  PARCEL_TRACKING_DATA_UPDATED;
    }
    /**
     * create empty instance
     */
    public ParcelTrackingDataUpdatedMessagePayloadImpl() {
        this.type =  PARCEL_TRACKING_DATA_UPDATED;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Unique identifier of the Delivery.</p>
     */
    
    public String getDeliveryId(){
        return this.deliveryId;
    }
    
    /**
     *  <p>Unique identifier of the Parcel.</p>
     */
    
    public String getParcelId(){
        return this.parcelId;
    }
    
    /**
     *  <p>The Tracking Data that was added to the Parcel.</p>
     */
    
    public com.commercetools.api.models.order.TrackingData getTrackingData(){
        return this.trackingData;
    }
    
    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     */
    
    public String getShippingKey(){
        return this.shippingKey;
    }

    
    public void setDeliveryId(final String deliveryId){
        this.deliveryId = deliveryId;
    }
    
    
    public void setParcelId(final String parcelId){
        this.parcelId = parcelId;
    }
    
    
    public void setTrackingData(final com.commercetools.api.models.order.TrackingData trackingData){
        this.trackingData = trackingData;
    }
    
    
    public void setShippingKey(final String shippingKey){
        this.shippingKey = shippingKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ParcelTrackingDataUpdatedMessagePayloadImpl that = (ParcelTrackingDataUpdatedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(deliveryId, that.deliveryId)
                .append(parcelId, that.parcelId)
                .append(trackingData, that.trackingData)
                .append(shippingKey, that.shippingKey)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(deliveryId)
            .append(parcelId)
            .append(trackingData)
            .append(shippingKey)
            .toHashCode();
    }

}
