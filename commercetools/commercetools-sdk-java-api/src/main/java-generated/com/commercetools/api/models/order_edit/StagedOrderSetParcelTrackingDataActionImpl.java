package com.commercetools.api.models.order_edit;

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
 * StagedOrderSetParcelTrackingDataAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderSetParcelTrackingDataActionImpl implements StagedOrderSetParcelTrackingDataAction, ModelBase {

    
    private String action;
    
    
    private String parcelId;
    
    
    private com.commercetools.api.models.order.TrackingData trackingData;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderSetParcelTrackingDataActionImpl(@JsonProperty("parcelId") final String parcelId, @JsonProperty("trackingData") final com.commercetools.api.models.order.TrackingData trackingData) {
        this.parcelId = parcelId;
        this.trackingData = trackingData;
        this.action =  SET_PARCEL_TRACKING_DATA;
    }
    /**
     * create empty instance
     */
    public StagedOrderSetParcelTrackingDataActionImpl() {
        this.action =  SET_PARCEL_TRACKING_DATA;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
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
    
    public com.commercetools.api.models.order.TrackingData getTrackingData(){
        return this.trackingData;
    }

    
    public void setParcelId(final String parcelId){
        this.parcelId = parcelId;
    }
    
    
    public void setTrackingData(final com.commercetools.api.models.order.TrackingData trackingData){
        this.trackingData = trackingData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StagedOrderSetParcelTrackingDataActionImpl that = (StagedOrderSetParcelTrackingDataActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(parcelId, that.parcelId)
                .append(trackingData, that.trackingData)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(parcelId)
            .append(trackingData)
            .toHashCode();
    }

}
