
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
 *  <p>Generated after a successful Set Schedule update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderScheduleSetMessagePayloadImpl implements RecurringOrderScheduleSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule recurrencePolicySchedule;

    private com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule oldRecurrencePolicySchedule;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringOrderScheduleSetMessagePayloadImpl(
            @JsonProperty("recurrencePolicySchedule") final com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule recurrencePolicySchedule,
            @JsonProperty("oldRecurrencePolicySchedule") final com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule oldRecurrencePolicySchedule) {
        this.recurrencePolicySchedule = recurrencePolicySchedule;
        this.oldRecurrencePolicySchedule = oldRecurrencePolicySchedule;
        this.type = RECURRING_ORDER_SCHEDULE_SET;
    }

    /**
     * create empty instance
     */
    public RecurringOrderScheduleSetMessagePayloadImpl() {
        this.type = RECURRING_ORDER_SCHEDULE_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Schedule of the Recurring Order after the Set Schedule update action.</p>
     */

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule getRecurrencePolicySchedule() {
        return this.recurrencePolicySchedule;
    }

    /**
     *  <p>Schedule of the Recurring Order before the Set Schedule update action.</p>
     */

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule getOldRecurrencePolicySchedule() {
        return this.oldRecurrencePolicySchedule;
    }

    public void setRecurrencePolicySchedule(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule recurrencePolicySchedule) {
        this.recurrencePolicySchedule = recurrencePolicySchedule;
    }

    public void setOldRecurrencePolicySchedule(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule oldRecurrencePolicySchedule) {
        this.oldRecurrencePolicySchedule = oldRecurrencePolicySchedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringOrderScheduleSetMessagePayloadImpl that = (RecurringOrderScheduleSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(recurrencePolicySchedule, that.recurrencePolicySchedule)
                .append(oldRecurrencePolicySchedule, that.oldRecurrencePolicySchedule)
                .append(type, that.type)
                .append(recurrencePolicySchedule, that.recurrencePolicySchedule)
                .append(oldRecurrencePolicySchedule, that.oldRecurrencePolicySchedule)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(recurrencePolicySchedule)
                .append(oldRecurrencePolicySchedule)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("recurrencePolicySchedule", recurrencePolicySchedule)
                .append("oldRecurrencePolicySchedule", oldRecurrencePolicySchedule)
                .build();
    }

    @Override
    public RecurringOrderScheduleSetMessagePayload copyDeep() {
        return RecurringOrderScheduleSetMessagePayload.deepCopy(this);
    }
}
