
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderStateTransitionMessagePayloadImpl
        implements RecurringOrderStateTransitionMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.state.StateReference state;

    private com.commercetools.api.models.state.StateReference oldState;

    private Boolean force;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringOrderStateTransitionMessagePayloadImpl(
            @JsonProperty("state") final com.commercetools.api.models.state.StateReference state,
            @JsonProperty("oldState") final com.commercetools.api.models.state.StateReference oldState,
            @JsonProperty("force") final Boolean force) {
        this.state = state;
        this.oldState = oldState;
        this.force = force;
        this.type = RECURRING_ORDER_STATE_TRANSITION;
    }

    /**
     * create empty instance
     */
    public RecurringOrderStateTransitionMessagePayloadImpl() {
        this.type = RECURRING_ORDER_STATE_TRANSITION;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderState" rel="nofollow">RecurringOrderState</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     */

    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderState" rel="nofollow">RecurringOrderState</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     */

    public com.commercetools.api.models.state.StateReference getOldState() {
        return this.oldState;
    }

    /**
     *  <p>Whether <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> transition validations were turned off during the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     */

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

        RecurringOrderStateTransitionMessagePayloadImpl that = (RecurringOrderStateTransitionMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(state, that.state)
                .append(oldState, that.oldState)
                .append(force, that.force)
                .append(type, that.type)
                .append(state, that.state)
                .append(oldState, that.oldState)
                .append(force, that.force)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(state).append(oldState).append(force).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("state", state)
                .append("oldState", oldState)
                .append("force", force)
                .build();
    }

    @Override
    public RecurringOrderStateTransitionMessagePayload copyDeep() {
        return RecurringOrderStateTransitionMessagePayload.deepCopy(this);
    }
}
