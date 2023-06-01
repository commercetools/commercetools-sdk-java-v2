package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
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
 * StagedOrderSetCountryAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderSetCountryActionImpl implements StagedOrderSetCountryAction, ModelBase {

    
    private String action;
    
    
    private String country;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderSetCountryActionImpl(@JsonProperty("country") final String country) {
        this.country = country;
        this.action =  SET_COUNTRY;
    }
    /**
     * create empty instance
     */
    public StagedOrderSetCountryActionImpl() {
        this.action =  SET_COUNTRY;
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
    
    public String getCountry(){
        return this.country;
    }

    
    public void setCountry(final String country){
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StagedOrderSetCountryActionImpl that = (StagedOrderSetCountryActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(country, that.country)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(country)
            .toHashCode();
    }

}
