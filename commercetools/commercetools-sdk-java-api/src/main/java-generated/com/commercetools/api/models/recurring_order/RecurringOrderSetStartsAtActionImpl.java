
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
 *  <p>To set the start date and time, the Recurring Order must not have been started yet. Setting the start date and time generates the RecurringOrderStartsAtSet Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderSetStartsAtActionImpl implements RecurringOrderSetStartsAtAction, ModelBase {

    private String action;

    private java.time.ZonedDateTime startsAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringOrderSetStartsAtActionImpl(@JsonProperty("startsAt") final java.time.ZonedDateTime startsAt) {
        this.startsAt = startsAt;
        this.action = SET_STARTS_AT;
    }

    /**
     * create empty instance
     */
    public RecurringOrderSetStartsAtActionImpl() {
        this.action = SET_STARTS_AT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Date and time (UTC) the Recurring Order should be started. The date and time must be in the future.</p>
     */

    public java.time.ZonedDateTime getStartsAt() {
        return this.startsAt;
    }

    public void setStartsAt(final java.time.ZonedDateTime startsAt) {
        this.startsAt = startsAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringOrderSetStartsAtActionImpl that = (RecurringOrderSetStartsAtActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(startsAt, that.startsAt)
                .append(action, that.action)
                .append(startsAt, that.startsAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(startsAt).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("startsAt", startsAt)
                .build();
    }

    @Override
    public RecurringOrderSetStartsAtAction copyDeep() {
        return RecurringOrderSetStartsAtAction.deepCopy(this);
    }
}
