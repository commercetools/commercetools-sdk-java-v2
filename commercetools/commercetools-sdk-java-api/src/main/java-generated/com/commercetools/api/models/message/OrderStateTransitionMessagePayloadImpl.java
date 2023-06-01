package com.commercetools.api.models.message;

import com.commercetools.api.models.message.OrderMessagePayload;
import com.commercetools.api.models.state.StateReference;
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
 *  <p>Generated after a successful Transition State update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderStateTransitionMessagePayloadImpl implements OrderStateTransitionMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.state.StateReference state;
    
    
    private com.commercetools.api.models.state.StateReference oldState;
    
    
    private Boolean force;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderStateTransitionMessagePayloadImpl(@JsonProperty("state") final com.commercetools.api.models.state.StateReference state, @JsonProperty("oldState") final com.commercetools.api.models.state.StateReference oldState, @JsonProperty("force") final Boolean force) {
        this.state = state;
        this.oldState = oldState;
        this.force = force;
        this.type =  ORDER_STATE_TRANSITION;
    }
    /**
     * create empty instance
     */
    public OrderStateTransitionMessagePayloadImpl() {
        this.type =  ORDER_STATE_TRANSITION;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>OrderState after the Transition State update action.</p>
     */
    
    public com.commercetools.api.models.state.StateReference getState(){
        return this.state;
    }
    
    /**
     *  <p>OrderState before the Transition State update action.</p>
     */
    
    public com.commercetools.api.models.state.StateReference getOldState(){
        return this.oldState;
    }
    
    /**
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     */
    
    public Boolean getForce(){
        return this.force;
    }

    
    public void setState(final com.commercetools.api.models.state.StateReference state){
        this.state = state;
    }
    
    
    public void setOldState(final com.commercetools.api.models.state.StateReference oldState){
        this.oldState = oldState;
    }
    
    
    public void setForce(final Boolean force){
        this.force = force;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderStateTransitionMessagePayloadImpl that = (OrderStateTransitionMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(state, that.state)
                .append(oldState, that.oldState)
                .append(force, that.force)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(state)
            .append(oldState)
            .append(force)
            .toHashCode();
    }

}
