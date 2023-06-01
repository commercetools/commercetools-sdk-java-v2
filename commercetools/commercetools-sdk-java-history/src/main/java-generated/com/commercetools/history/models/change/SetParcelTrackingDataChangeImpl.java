package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.ParcelChangeValue;
import com.commercetools.history.models.common.TrackingData;
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
 * SetParcelTrackingDataChange
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetParcelTrackingDataChangeImpl implements SetParcelTrackingDataChange, ModelBase {

    
    private String type;
    
    
    private String change;
    
    
    private com.commercetools.history.models.change_value.ParcelChangeValue parcel;
    
    
    private com.commercetools.history.models.common.TrackingData nextValue;
    
    
    private com.commercetools.history.models.common.TrackingData previousValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetParcelTrackingDataChangeImpl(@JsonProperty("change") final String change, @JsonProperty("parcel") final com.commercetools.history.models.change_value.ParcelChangeValue parcel, @JsonProperty("nextValue") final com.commercetools.history.models.common.TrackingData nextValue, @JsonProperty("previousValue") final com.commercetools.history.models.common.TrackingData previousValue) {
        this.change = change;
        this.parcel = parcel;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type =  SET_PARCEL_TRACKING_DATA_CHANGE;
    }
    /**
     * create empty instance
     */
    public SetParcelTrackingDataChangeImpl() {
        this.type =  SET_PARCEL_TRACKING_DATA_CHANGE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Update action for <code>setParcelTrackingData</code></p>
     */
    
    public String getChange(){
        return this.change;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.change_value.ParcelChangeValue getParcel(){
        return this.parcel;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.TrackingData getNextValue(){
        return this.nextValue;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.TrackingData getPreviousValue(){
        return this.previousValue;
    }

    
    public void setChange(final String change){
        this.change = change;
    }
    
    
    public void setParcel(final com.commercetools.history.models.change_value.ParcelChangeValue parcel){
        this.parcel = parcel;
    }
    
    
    public void setNextValue(final com.commercetools.history.models.common.TrackingData nextValue){
        this.nextValue = nextValue;
    }
    
    
    public void setPreviousValue(final com.commercetools.history.models.common.TrackingData previousValue){
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        SetParcelTrackingDataChangeImpl that = (SetParcelTrackingDataChangeImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(change, that.change)
                .append(parcel, that.parcel)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(change)
            .append(parcel)
            .append(nextValue)
            .append(previousValue)
            .toHashCode();
    }

}
