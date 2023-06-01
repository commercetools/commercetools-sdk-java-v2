package com.commercetools.history.models.common;


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
 *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class LocationImpl implements Location, ModelBase {

    
    private String country;
    
    
    private String state;

    /**
     * create instance with all properties
     */
    @JsonCreator
    LocationImpl(@JsonProperty("country") final String country, @JsonProperty("state") final String state) {
        this.country = country;
        this.state = state;
    }
    /**
     * create empty instance
     */
    public LocationImpl() {
    }

    /**
     *  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>
     */
    
    public String getCountry(){
        return this.country;
    }
    
    /**
     *
     */
    
    public String getState(){
        return this.state;
    }

    
    public void setCountry(final String country){
        this.country = country;
    }
    
    
    public void setState(final String state){
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        LocationImpl that = (LocationImpl) o;
    
        return new EqualsBuilder()
                .append(country, that.country)
                .append(state, that.state)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(country)
            .append(state)
            .toHashCode();
    }

}
