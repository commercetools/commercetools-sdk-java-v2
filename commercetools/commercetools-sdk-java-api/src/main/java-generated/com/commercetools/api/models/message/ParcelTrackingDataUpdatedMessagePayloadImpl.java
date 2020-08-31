package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.TrackingData;
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
public final class ParcelTrackingDataUpdatedMessagePayloadImpl implements ParcelTrackingDataUpdatedMessagePayload {

    private String type;
    
    private String deliveryId;
    
    private String parcelId;
    
    private com.commercetools.api.models.order.TrackingData trackingData;

    @JsonCreator
    ParcelTrackingDataUpdatedMessagePayloadImpl(@JsonProperty("deliveryId") final String deliveryId, @JsonProperty("parcelId") final String parcelId, @JsonProperty("trackingData") final com.commercetools.api.models.order.TrackingData trackingData) {
        this.deliveryId = deliveryId;
        this.parcelId = parcelId;
        this.trackingData = trackingData;
        this.type = "ParcelTrackingDataUpdated";
    }
    public ParcelTrackingDataUpdatedMessagePayloadImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public String getDeliveryId(){
        return this.deliveryId;
    }
    
    
    public String getParcelId(){
        return this.parcelId;
    }
    
    
    public com.commercetools.api.models.order.TrackingData getTrackingData(){
        return this.trackingData;
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

}
