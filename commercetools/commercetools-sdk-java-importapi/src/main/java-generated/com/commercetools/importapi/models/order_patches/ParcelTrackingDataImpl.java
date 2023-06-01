package com.commercetools.importapi.models.order_patches;

import com.commercetools.importapi.models.orders.TrackingData;
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
 * ParcelTrackingData
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ParcelTrackingDataImpl implements ParcelTrackingData, ModelBase {

    
    private String parcelId;
    
    
    private com.commercetools.importapi.models.orders.TrackingData trackingData;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ParcelTrackingDataImpl(@JsonProperty("parcelId") final String parcelId, @JsonProperty("trackingData") final com.commercetools.importapi.models.orders.TrackingData trackingData) {
        this.parcelId = parcelId;
        this.trackingData = trackingData;
    }
    /**
     * create empty instance
     */
    public ParcelTrackingDataImpl() {
    }

    /**
     *
     */
    
    public String getParcelId(){
        return this.parcelId;
    }
    
    /**
     *
     */
    
    public com.commercetools.importapi.models.orders.TrackingData getTrackingData(){
        return this.trackingData;
    }

    
    public void setParcelId(final String parcelId){
        this.parcelId = parcelId;
    }
    
    
    public void setTrackingData(final com.commercetools.importapi.models.orders.TrackingData trackingData){
        this.trackingData = trackingData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ParcelTrackingDataImpl that = (ParcelTrackingDataImpl) o;
    
        return new EqualsBuilder()
                .append(parcelId, that.parcelId)
                .append(trackingData, that.trackingData)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(parcelId)
            .append(trackingData)
            .toHashCode();
    }

}
