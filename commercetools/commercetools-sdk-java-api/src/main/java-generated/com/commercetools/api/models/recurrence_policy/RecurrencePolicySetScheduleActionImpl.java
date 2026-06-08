
package com.commercetools.api.models.recurrence_policy;

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
 * RecurrencePolicySetScheduleAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurrencePolicySetScheduleActionImpl implements RecurrencePolicySetScheduleAction, ModelBase {

    private String action;

    private com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraft schedule;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurrencePolicySetScheduleActionImpl(
            @JsonProperty("schedule") final com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraft schedule) {
        this.schedule = schedule;
        this.action = SET_SCHEDULE;
    }

    /**
     * create empty instance
     */
    public RecurrencePolicySetScheduleActionImpl() {
        this.action = SET_SCHEDULE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Schedule where the recurrence is defined.</p>
     */

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraft getSchedule() {
        return this.schedule;
    }

    public void setSchedule(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraft schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurrencePolicySetScheduleActionImpl that = (RecurrencePolicySetScheduleActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(schedule, that.schedule)
                .append(action, that.action)
                .append(schedule, that.schedule)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(schedule).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("schedule", schedule)
                .build();
    }

    @Override
    public RecurrencePolicySetScheduleAction copyDeep() {
        return RecurrencePolicySetScheduleAction.deepCopy(this);
    }
}
