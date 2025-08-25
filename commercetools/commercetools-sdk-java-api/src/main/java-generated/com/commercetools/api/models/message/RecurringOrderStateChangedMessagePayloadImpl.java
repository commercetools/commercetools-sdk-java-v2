
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetStateAction" rel="nofollow">Set RecurringOrderState</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderStateChangedMessagePayloadImpl
        implements RecurringOrderStateChangedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.recurring_order.RecurringOrderState state;

    private com.commercetools.api.models.recurring_order.RecurringOrderState oldState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringOrderStateChangedMessagePayloadImpl(
            @JsonProperty("state") final com.commercetools.api.models.recurring_order.RecurringOrderState state,
            @JsonProperty("oldState") final com.commercetools.api.models.recurring_order.RecurringOrderState oldState) {
        this.state = state;
        this.oldState = oldState;
        this.type = RECURRING_ORDER_STATE_CHANGED;
    }

    /**
     * create empty instance
     */
    public RecurringOrderStateChangedMessagePayloadImpl() {
        this.type = RECURRING_ORDER_STATE_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderState" rel="nofollow">RecurringOrderState</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetStateAction" rel="nofollow">Set RecurringOrderState</a> update action.</p>
     */

    public com.commercetools.api.models.recurring_order.RecurringOrderState getState() {
        return this.state;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderState" rel="nofollow">RecurringOrderState</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetStateAction" rel="nofollow">Set RecurringOrderState</a> update action.</p>
     */

    public com.commercetools.api.models.recurring_order.RecurringOrderState getOldState() {
        return this.oldState;
    }

    public void setState(final com.commercetools.api.models.recurring_order.RecurringOrderState state) {
        this.state = state;
    }

    public void setOldState(final com.commercetools.api.models.recurring_order.RecurringOrderState oldState) {
        this.oldState = oldState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringOrderStateChangedMessagePayloadImpl that = (RecurringOrderStateChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(state, that.state)
                .append(oldState, that.oldState)
                .append(type, that.type)
                .append(state, that.state)
                .append(oldState, that.oldState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(state).append(oldState).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("state", state)
                .append("oldState", oldState)
                .build();
    }

    @Override
    public RecurringOrderStateChangedMessagePayload copyDeep() {
        return RecurringOrderStateChangedMessagePayload.deepCopy(this);
    }
}
