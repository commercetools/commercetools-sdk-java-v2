package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.state.StateResourceIdentifier;
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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderTransitionStateActionImpl implements OrderTransitionStateAction {

    private String action;
    
    private com.commercetools.api.models.state.StateResourceIdentifier state;
    
    private Boolean force;

    @JsonCreator
    OrderTransitionStateActionImpl(@JsonProperty("state") final com.commercetools.api.models.state.StateResourceIdentifier state, @JsonProperty("force") final Boolean force) {
        this.state = state;
        this.force = force;
        this.action = "transitionState";
    }
    public OrderTransitionStateActionImpl() {
        this.action = "transitionState";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.state.StateResourceIdentifier getState(){
        return this.state;
    }
    
    
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
    
        OrderTransitionStateActionImpl that = (OrderTransitionStateActionImpl) o;
    
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
