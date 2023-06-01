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
 * ImageDimensions
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ImageDimensionsImpl implements ImageDimensions, ModelBase {

    
    private Integer w;
    
    
    private Integer h;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ImageDimensionsImpl(@JsonProperty("w") final Integer w, @JsonProperty("h") final Integer h) {
        this.w = w;
        this.h = h;
    }
    /**
     * create empty instance
     */
    public ImageDimensionsImpl() {
    }

    /**
     *
     */
    
    public Integer getW(){
        return this.w;
    }
    
    /**
     *
     */
    
    public Integer getH(){
        return this.h;
    }

    
    public void setW(final Integer w){
        this.w = w;
    }
    
    
    public void setH(final Integer h){
        this.h = h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ImageDimensionsImpl that = (ImageDimensionsImpl) o;
    
        return new EqualsBuilder()
                .append(w, that.w)
                .append(h, that.h)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(w)
            .append(h)
            .toHashCode();
    }

}
