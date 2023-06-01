package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
import com.commercetools.api.models.state.StateResourceIdentifier;
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
 *  <p>Transition to a new State. This update action produces the Review State Transition Message.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReviewTransitionStateActionImpl implements ReviewTransitionStateAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.state.StateResourceIdentifier state;
    
    
    private Boolean force;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReviewTransitionStateActionImpl(@JsonProperty("state") final com.commercetools.api.models.state.StateResourceIdentifier state, @JsonProperty("force") final Boolean force) {
        this.state = state;
        this.force = force;
        this.action =  TRANSITION_STATE;
    }
    /**
     * create empty instance
     */
    public ReviewTransitionStateActionImpl() {
        this.action =  TRANSITION_STATE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Value to set. If there is no State yet, the new State must be an initial State. If the existing State has <code>transitions</code> set, there must be a direct transition to the new State. If <code>transitions</code> is not set, no validation is performed. If the new State does not have the role <code>ReviewIncludedInStatistics</code>, the Review is not taken into account in the ratings statistics of the target.</p>
     */
    
    public com.commercetools.api.models.state.StateResourceIdentifier getState(){
        return this.state;
    }
    
    /**
     *  <p>Switch validations on or off.</p>
     */
    
    public Boolean getForce(){
        return this.force;
    }

    
    public void setState(final com.commercetools.api.models.state.StateResourceIdentifier state){
        this.state = state;
    }
    
    
    public void setForce(final Boolean force){
        this.force = force;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ReviewTransitionStateActionImpl that = (ReviewTransitionStateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(state, that.state)
                .append(force, that.force)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(state)
            .append(force)
            .toHashCode();
    }

}
