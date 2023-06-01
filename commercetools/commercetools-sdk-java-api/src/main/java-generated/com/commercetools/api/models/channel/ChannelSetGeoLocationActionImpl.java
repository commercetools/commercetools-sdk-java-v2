package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelUpdateAction;
import com.commercetools.api.models.common.GeoJson;
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
 * ChannelSetGeoLocationAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChannelSetGeoLocationActionImpl implements ChannelSetGeoLocationAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.common.GeoJson geoLocation;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChannelSetGeoLocationActionImpl(@JsonProperty("geoLocation") final com.commercetools.api.models.common.GeoJson geoLocation) {
        this.geoLocation = geoLocation;
        this.action =  SET_GEO_LOCATION;
    }
    /**
     * create empty instance
     */
    public ChannelSetGeoLocationActionImpl() {
        this.action =  SET_GEO_LOCATION;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Value to set.</p>
     */
    
    public com.commercetools.api.models.common.GeoJson getGeoLocation(){
        return this.geoLocation;
    }

    
    public void setGeoLocation(final com.commercetools.api.models.common.GeoJson geoLocation){
        this.geoLocation = geoLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ChannelSetGeoLocationActionImpl that = (ChannelSetGeoLocationActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(geoLocation, that.geoLocation)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(geoLocation)
            .toHashCode();
    }

}
