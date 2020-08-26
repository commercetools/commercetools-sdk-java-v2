package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelUpdateAction;
import com.commercetools.api.models.common.GeoJson;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ChannelSetGeoLocationActionImpl implements ChannelSetGeoLocationAction {

    private String action;
    
    private com.commercetools.api.models.common.GeoJson geoLocation;

    @JsonCreator
    ChannelSetGeoLocationActionImpl(@JsonProperty("geoLocation") final com.commercetools.api.models.common.GeoJson geoLocation) {
        this.geoLocation = geoLocation;
        this.action = "setGeoLocation";
    }
    public ChannelSetGeoLocationActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.common.GeoJson getGeoLocation(){
        return this.geoLocation;
    }

    public void setGeoLocation(final com.commercetools.api.models.common.GeoJson geoLocation){
        this.geoLocation = geoLocation;
    }

}
