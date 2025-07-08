
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
 *  <p>Determines the schedule for a Recurring Order to occur at a fixed interval—for example, every two weeks or every month.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandardScheduleDraftImpl implements StandardScheduleDraft, ModelBase {

    private String type;

    private Long value;

    private com.commercetools.api.models.recurrence_policy.IntervalUnit intervalUnit;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandardScheduleDraftImpl(@JsonProperty("value") final Long value,
            @JsonProperty("intervalUnit") final com.commercetools.api.models.recurrence_policy.IntervalUnit intervalUnit) {
        this.value = value;
        this.intervalUnit = intervalUnit;
        this.type = STANDARD;
    }

    /**
     * create empty instance
     */
    public StandardScheduleDraftImpl() {
        this.type = STANDARD;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Number of intervals between orders.</p>
     */

    public Long getValue() {
        return this.value;
    }

    /**
     *  <p>Interval for this schedule.</p>
     */

    public com.commercetools.api.models.recurrence_policy.IntervalUnit getIntervalUnit() {
        return this.intervalUnit;
    }

    public void setValue(final Long value) {
        this.value = value;
    }

    public void setIntervalUnit(final com.commercetools.api.models.recurrence_policy.IntervalUnit intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandardScheduleDraftImpl that = (StandardScheduleDraftImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(value, that.value)
                .append(intervalUnit, that.intervalUnit)
                .append(type, that.type)
                .append(value, that.value)
                .append(intervalUnit, that.intervalUnit)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(value).append(intervalUnit).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("value", value)
                .append("intervalUnit", intervalUnit)
                .build();
    }

    @Override
    public StandardScheduleDraft copyDeep() {
        return StandardScheduleDraft.deepCopy(this);
    }
}
