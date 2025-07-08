
package com.commercetools.api.models.recurring_order;

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
 *  <p>Setting the RecurringOrderState generates the RecurringOrderStateChanged Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderSetStateActionImpl implements RecurringOrderSetStateAction, ModelBase {

    private String action;

    private com.commercetools.api.models.recurring_order.RecurringOrderStateDraft recurringOrderState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringOrderSetStateActionImpl(
            @JsonProperty("recurringOrderState") final com.commercetools.api.models.recurring_order.RecurringOrderStateDraft recurringOrderState) {
        this.recurringOrderState = recurringOrderState;
        this.action = SET_RECURRING_ORDER_STATE;
    }

    /**
     * create empty instance
     */
    public RecurringOrderSetStateActionImpl() {
        this.action = SET_RECURRING_ORDER_STATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New state of the RecurringOrder.</p>
     */

    public com.commercetools.api.models.recurring_order.RecurringOrderStateDraft getRecurringOrderState() {
        return this.recurringOrderState;
    }

    public void setRecurringOrderState(
            final com.commercetools.api.models.recurring_order.RecurringOrderStateDraft recurringOrderState) {
        this.recurringOrderState = recurringOrderState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringOrderSetStateActionImpl that = (RecurringOrderSetStateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(recurringOrderState, that.recurringOrderState)
                .append(action, that.action)
                .append(recurringOrderState, that.recurringOrderState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(recurringOrderState).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("recurringOrderState", recurringOrderState)
                .build();
    }

    @Override
    public RecurringOrderSetStateAction copyDeep() {
        return RecurringOrderSetStateAction.deepCopy(this);
    }
}
