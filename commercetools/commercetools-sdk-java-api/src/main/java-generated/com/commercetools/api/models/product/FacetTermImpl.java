package com.commercetools.api.models.product;

import java.lang.Object;
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
 * FacetTerm
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class FacetTermImpl implements FacetTerm, ModelBase {

    
    private java.lang.Object term;
    
    
    private Long count;
    
    
    private Long productCount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    FacetTermImpl(@JsonProperty("term") final java.lang.Object term, @JsonProperty("count") final Long count, @JsonProperty("productCount") final Long productCount) {
        this.term = term;
        this.count = count;
        this.productCount = productCount;
    }
    /**
     * create empty instance
     */
    public FacetTermImpl() {
    }

    /**
     *
     */
    
    public java.lang.Object getTerm(){
        return this.term;
    }
    
    /**
     *
     */
    
    public Long getCount(){
        return this.count;
    }
    
    /**
     *
     */
    
    public Long getProductCount(){
        return this.productCount;
    }

    
    public void setTerm(final java.lang.Object term){
        this.term = term;
    }
    
    
    public void setCount(final Long count){
        this.count = count;
    }
    
    
    public void setProductCount(final Long productCount){
        this.productCount = productCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        FacetTermImpl that = (FacetTermImpl) o;
    
        return new EqualsBuilder()
                .append(term, that.term)
                .append(count, that.count)
                .append(productCount, that.productCount)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(term)
            .append(count)
            .append(productCount)
            .toHashCode();
    }

}
