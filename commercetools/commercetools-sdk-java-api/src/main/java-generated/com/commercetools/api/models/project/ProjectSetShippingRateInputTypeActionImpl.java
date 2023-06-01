package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ProjectUpdateAction;
import com.commercetools.api.models.project.ShippingRateInputType;
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
 * ProjectSetShippingRateInputTypeAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProjectSetShippingRateInputTypeActionImpl implements ProjectSetShippingRateInputTypeAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProjectSetShippingRateInputTypeActionImpl(@JsonProperty("shippingRateInputType") final com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType) {
        this.shippingRateInputType = shippingRateInputType;
        this.action =  SET_SHIPPING_RATE_INPUT_TYPE;
    }
    /**
     * create empty instance
     */
    public ProjectSetShippingRateInputTypeActionImpl() {
        this.action =  SET_SHIPPING_RATE_INPUT_TYPE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */
    
    public com.commercetools.api.models.project.ShippingRateInputType getShippingRateInputType(){
        return this.shippingRateInputType;
    }

    
    public void setShippingRateInputType(final com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType){
        this.shippingRateInputType = shippingRateInputType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProjectSetShippingRateInputTypeActionImpl that = (ProjectSetShippingRateInputTypeActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(shippingRateInputType, that.shippingRateInputType)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(shippingRateInputType)
            .toHashCode();
    }

}
