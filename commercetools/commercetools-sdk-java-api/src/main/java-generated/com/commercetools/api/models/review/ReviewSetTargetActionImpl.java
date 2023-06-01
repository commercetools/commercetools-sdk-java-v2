package com.commercetools.api.models.review;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.commercetools.api.models.review.ReviewUpdateAction;
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
 * ReviewSetTargetAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReviewSetTargetActionImpl implements ReviewSetTargetAction, ModelBase {

    
    private String action;
    
    
    private java.lang.Object target;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReviewSetTargetActionImpl(@JsonProperty("target") final java.lang.Object target) {
        this.target = target;
        this.action =  SET_TARGET;
    }
    /**
     * create empty instance
     */
    public ReviewSetTargetActionImpl() {
        this.action =  SET_TARGET;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Value to set, specified as ProductResourceIdentifier or ChannelResourceIdentifier, respectively. If empty, any existing value will be removed.</p>
     */
    
    public java.lang.Object getTarget(){
        return this.target;
    }

    
    @JsonIgnore
    public void setTarget(final ProductResourceIdentifier target) {
        this.target = target;
                        }
    
    @JsonIgnore
    public void setTarget(final ChannelResourceIdentifier target) {
        this.target = target;
                        }
    
    public void setTarget(final java.lang.Object target){
        this.target = target;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ReviewSetTargetActionImpl that = (ReviewSetTargetActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(target, that.target)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(target)
            .toHashCode();
    }

}
