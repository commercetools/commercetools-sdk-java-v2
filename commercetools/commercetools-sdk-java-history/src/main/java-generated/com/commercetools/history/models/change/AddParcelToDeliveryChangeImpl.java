package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Parcel;
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
 * AddParcelToDeliveryChange
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AddParcelToDeliveryChangeImpl implements AddParcelToDeliveryChange, ModelBase {

    
    private String type;
    
    
    private String change;
    
    
    private String deliveryId;
    
    
    private com.commercetools.history.models.common.Parcel nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AddParcelToDeliveryChangeImpl(@JsonProperty("change") final String change, @JsonProperty("deliveryId") final String deliveryId, @JsonProperty("nextValue") final com.commercetools.history.models.common.Parcel nextValue) {
        this.change = change;
        this.deliveryId = deliveryId;
        this.nextValue = nextValue;
        this.type =  ADD_PARCEL_TO_DELIVERY_CHANGE;
    }
    /**
     * create empty instance
     */
    public AddParcelToDeliveryChangeImpl() {
        this.type =  ADD_PARCEL_TO_DELIVERY_CHANGE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Update action for <code>addParcelToDelivery</code></p>
     */
    
    public String getChange(){
        return this.change;
    }
    
    /**
     *
     */
    
    public String getDeliveryId(){
        return this.deliveryId;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.Parcel getNextValue(){
        return this.nextValue;
    }

    
    public void setChange(final String change){
        this.change = change;
    }
    
    
    public void setDeliveryId(final String deliveryId){
        this.deliveryId = deliveryId;
    }
    
    
    public void setNextValue(final com.commercetools.history.models.common.Parcel nextValue){
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        AddParcelToDeliveryChangeImpl that = (AddParcelToDeliveryChangeImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(change, that.change)
                .append(deliveryId, that.deliveryId)
                .append(nextValue, that.nextValue)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(change)
            .append(deliveryId)
            .append(nextValue)
            .toHashCode();
    }

}
