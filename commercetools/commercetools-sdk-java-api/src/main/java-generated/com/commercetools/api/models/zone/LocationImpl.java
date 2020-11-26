package com.commercetools.api.models.zone;


import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class LocationImpl implements Location {

    private String country;
    
    private String state;

    @JsonCreator
    LocationImpl(@JsonProperty("country") final String country, @JsonProperty("state") final String state) {
        this.country = country;
        this.state = state;
    }
    public LocationImpl() {
    }

    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */
    public String getCountry(){
        return this.country;
    }
    
    
    public String getState(){
        return this.state;
    }

    public void setCountry(final String country){
        this.country = country;
    }
    
    public void setState(final String state){
        this.state = state;
    }

}
