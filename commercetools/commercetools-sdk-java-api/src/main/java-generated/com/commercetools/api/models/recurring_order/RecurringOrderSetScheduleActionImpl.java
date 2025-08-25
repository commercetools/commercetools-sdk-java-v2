
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
 *  <p>To set the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicySchedule" rel="nofollow">schedule</a>, the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Order</a> must be active, with no active <a href="https://docs.commercetools.com/apis/ctp:api:type:SkipConfiguration" rel="nofollow">Skip Configuration</a> and with available prices for all Cart items for the new schedule. Setting the schedule generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderScheduleSetMessage" rel="nofollow">RecurringOrderScheduleSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderSetScheduleActionImpl implements RecurringOrderSetScheduleAction, ModelBase {

    private String action;

    private com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier recurrencePolicy;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringOrderSetScheduleActionImpl(
            @JsonProperty("recurrencePolicy") final com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier recurrencePolicy) {
        this.recurrencePolicy = recurrencePolicy;
        this.action = SET_SCHEDULE;
    }

    /**
     * create empty instance
     */
    public RecurringOrderSetScheduleActionImpl() {
        this.action = SET_SCHEDULE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set.</p>
     */

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier getRecurrencePolicy() {
        return this.recurrencePolicy;
    }

    public void setRecurrencePolicy(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier recurrencePolicy) {
        this.recurrencePolicy = recurrencePolicy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringOrderSetScheduleActionImpl that = (RecurringOrderSetScheduleActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(recurrencePolicy, that.recurrencePolicy)
                .append(action, that.action)
                .append(recurrencePolicy, that.recurrencePolicy)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(recurrencePolicy).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("recurrencePolicy", recurrencePolicy)
                .build();
    }

    @Override
    public RecurringOrderSetScheduleAction copyDeep() {
        return RecurringOrderSetScheduleAction.deepCopy(this);
    }
}
