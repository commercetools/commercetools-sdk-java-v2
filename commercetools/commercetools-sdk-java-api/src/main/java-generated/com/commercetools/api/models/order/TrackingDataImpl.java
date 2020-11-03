package com.commercetools.api.models.order;


import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TrackingDataImpl implements TrackingData {

    private String trackingId;
    
    private String carrier;
    
    private String provider;
    
    private String providerTransaction;
    
    private Boolean isReturn;

    @JsonCreator
    TrackingDataImpl(@JsonProperty("trackingId") final String trackingId, @JsonProperty("carrier") final String carrier, @JsonProperty("provider") final String provider, @JsonProperty("providerTransaction") final String providerTransaction, @JsonProperty("isReturn") final Boolean isReturn) {
        this.trackingId = trackingId;
        this.carrier = carrier;
        this.provider = provider;
        this.providerTransaction = providerTransaction;
        this.isReturn = isReturn;
    }
    public TrackingDataImpl() {
       
    }

    /**
    *  <p>The ID to track one parcel.</p>
    */
    public String getTrackingId(){
        return this.trackingId;
    }
    
    /**
    *  <p>The carrier that delivers the parcel.</p>
    */
    public String getCarrier(){
        return this.carrier;
    }
    
    
    public String getProvider(){
        return this.provider;
    }
    
    
    public String getProviderTransaction(){
        return this.providerTransaction;
    }
    
    /**
    *  <p>Flag to distinguish if the parcel is on the way to the customer (false) or on the way back (true).</p>
    */
    public Boolean getIsReturn(){
        return this.isReturn;
    }

    public void setTrackingId(final String trackingId){
        this.trackingId = trackingId;
    }
    
    public void setCarrier(final String carrier){
        this.carrier = carrier;
    }
    
    public void setProvider(final String provider){
        this.provider = provider;
    }
    
    public void setProviderTransaction(final String providerTransaction){
        this.providerTransaction = providerTransaction;
    }
    
    public void setIsReturn(final Boolean isReturn){
        this.isReturn = isReturn;
    }

}
