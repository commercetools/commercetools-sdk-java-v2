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
 * GeoLocation
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GeoLocationImpl implements GeoLocation, ModelBase {

    
    private String type;
    
    
    private java.util.List<Integer> coordinates;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GeoLocationImpl(@JsonProperty("type") final String type, @JsonProperty("coordinates") final java.util.List<Integer> coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }
    /**
     * create empty instance
     */
    public GeoLocationImpl() {
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *
     */
    
    public java.util.List<Integer> getCoordinates(){
        return this.coordinates;
    }

    
    public void setType(final String type){
        this.type = type;
    }
    
    
    public void setCoordinates(final Integer ...coordinates){
       this.coordinates = new ArrayList<>(Arrays.asList(coordinates));
    }
    
    
    public void setCoordinates(final java.util.List<Integer> coordinates){
       this.coordinates = coordinates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        GeoLocationImpl that = (GeoLocationImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(coordinates, that.coordinates)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(coordinates)
            .toHashCode();
    }

}
