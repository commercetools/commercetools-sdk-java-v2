package com.commercetools.api.models.product;

import com.commercetools.api.models.product.FacetRange;
import com.commercetools.api.models.product.FacetResult;
import com.commercetools.api.models.product.FacetTypes;
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
 * RangeFacetResult
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class RangeFacetResultImpl implements RangeFacetResult, ModelBase {

    
    private com.commercetools.api.models.product.FacetTypes type;
    
    
    private java.util.List<com.commercetools.api.models.product.FacetRange> ranges;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RangeFacetResultImpl(@JsonProperty("ranges") final java.util.List<com.commercetools.api.models.product.FacetRange> ranges) {
        this.ranges = ranges;
        this.type = FacetTypes.findEnum("range");
    }
    /**
     * create empty instance
     */
    public RangeFacetResultImpl() {
        this.type = FacetTypes.findEnum("range");
    }

    /**
     *
     */
    
    public com.commercetools.api.models.product.FacetTypes getType(){
        return this.type;
    }
    
    /**
     *
     */
    
    public java.util.List<com.commercetools.api.models.product.FacetRange> getRanges(){
        return this.ranges;
    }

    
    public void setRanges(final com.commercetools.api.models.product.FacetRange ...ranges){
       this.ranges = new ArrayList<>(Arrays.asList(ranges));
    }
    
    
    public void setRanges(final java.util.List<com.commercetools.api.models.product.FacetRange> ranges){
       this.ranges = ranges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        RangeFacetResultImpl that = (RangeFacetResultImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(ranges, that.ranges)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(ranges)
            .toHashCode();
    }

}
