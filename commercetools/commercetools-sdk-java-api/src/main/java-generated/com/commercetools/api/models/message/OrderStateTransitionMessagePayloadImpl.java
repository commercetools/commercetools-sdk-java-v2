
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderStateTransitionMessagePayloadImpl implements OrderStateTransitionMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.state.StateReference state;

    private com.commercetools.api.models.state.StateReference oldState;

    private Boolean force;

    @JsonCreator
    OrderStateTransitionMessagePayloadImpl(
            @JsonProperty("state") final com.commercetools.api.models.state.StateReference state,
            @JsonProperty("oldState") final com.commercetools.api.models.state.StateReference oldState,
            @JsonProperty("force") final Boolean force) {
        this.state = state;
        this.oldState = oldState;
        this.force = force;
        this.type = ORDER_STATE_TRANSITION;
    }

    public OrderStateTransitionMessagePayloadImpl() {
        this.type = ORDER_STATE_TRANSITION;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:State">State</a>.</p>
    */
    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:State">State</a>.</p>
    */
    public com.commercetools.api.models.state.StateReference getOldState() {
        return this.oldState;
    }

    public Boolean getForce() {
        return this.force;
    }

    public void setState(final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
    }

    public void setOldState(final com.commercetools.api.models.state.StateReference oldState) {
        this.oldState = oldState;
    }

    public void setForce(final Boolean force) {
        this.force = force;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderStateTransitionMessagePayloadImpl that = (OrderStateTransitionMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(state, that.state)
                .append(oldState, that.oldState)
                .append(force, that.force)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(state).append(oldState).append(force).toHashCode();
    }

}
