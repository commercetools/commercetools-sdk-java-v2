package com.commercetools.api.models.common;

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
 * GeoJsonPoint
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GeoJsonPointImpl implements GeoJsonPoint, ModelBase {

    
    private String type;
    
    
    private java.util.List<Double> coordinates;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GeoJsonPointImpl(@JsonProperty("coordinates") final java.util.List<Double> coordinates) {
        this.coordinates = coordinates;
        this.type =  POINT;
    }
    /**
     * create empty instance
     */
    public GeoJsonPointImpl() {
        this.type =  POINT;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Longitude (stored on index <code>[0]</code>) and latitude (stored on index <code>[1]</code>) of the Point.</p>
     */
    
    public java.util.List<Double> getCoordinates(){
        return this.coordinates;
    }

    
    public void setCoordinates(final Double ...coordinates){
       this.coordinates = new ArrayList<>(Arrays.asList(coordinates));
    }
    
    
    public void setCoordinates(final java.util.List<Double> coordinates){
       this.coordinates = coordinates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        GeoJsonPointImpl that = (GeoJsonPointImpl) o;
    
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
