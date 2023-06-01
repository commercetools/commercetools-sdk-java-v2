package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
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
 * OrderSetParcelCustomTypeAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSetParcelCustomTypeActionImpl implements OrderSetParcelCustomTypeAction, ModelBase {

    
    private String action;
    
    
    private String parcelId;
    
    
    private com.commercetools.api.models.type.TypeResourceIdentifier type;
    
    
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSetParcelCustomTypeActionImpl(@JsonProperty("parcelId") final String parcelId, @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type, @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.parcelId = parcelId;
        this.type = type;
        this.fields = fields;
        this.action =  SET_PARCEL_CUSTOM_TYPE;
    }
    /**
     * create empty instance
     */
    public OrderSetParcelCustomTypeActionImpl() {
        this.action =  SET_PARCEL_CUSTOM_TYPE;
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
     *  <p>Defines the Type that extends the Parcel with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Parcel.</p>
     */
    
    public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
        return this.type;
    }
    
    /**
     *  <p>Sets the Custom Fields fields for the Parcel.</p>
     */
    
    public com.commercetools.api.models.type.FieldContainer getFields(){
        return this.fields;
    }

    
    public void setParcelId(final String parcelId){
        this.parcelId = parcelId;
    }
    
    
    public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type){
        this.type = type;
    }
    
    
    public void setFields(final com.commercetools.api.models.type.FieldContainer fields){
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderSetParcelCustomTypeActionImpl that = (OrderSetParcelCustomTypeActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(parcelId, that.parcelId)
                .append(type, that.type)
                .append(fields, that.fields)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(parcelId)
            .append(type)
            .append(fields)
            .toHashCode();
    }

}
