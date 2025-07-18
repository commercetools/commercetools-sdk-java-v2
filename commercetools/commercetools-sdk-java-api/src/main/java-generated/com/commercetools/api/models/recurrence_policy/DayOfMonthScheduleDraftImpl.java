
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
 *  <p>Determines the schedule for a Recurring Order to occur on a specific day of each month.</p>
 *  <ul>
 *   <li>Orders will be created even if the specified day is a weekend or holiday.</li>
 *   <li>To place orders on different dates within the same month (for example, the 1st and 15th), create separate Recurring Orders—each with its own schedule.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DayOfMonthScheduleDraftImpl implements DayOfMonthScheduleDraft, ModelBase {

    private String type;

    private Integer day;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DayOfMonthScheduleDraftImpl(@JsonProperty("day") final Integer day) {
        this.day = day;
        this.type = DAY_OF_MONTH;
    }

    /**
     * create empty instance
     */
    public DayOfMonthScheduleDraftImpl() {
        this.type = DAY_OF_MONTH;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The day of the month when the Recurring Order should be created. If the value is greater than the number of days in a given month, the order will be created on the last day of the month.</p>
     */

    public Integer getDay() {
        return this.day;
    }

    public void setDay(final Integer day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DayOfMonthScheduleDraftImpl that = (DayOfMonthScheduleDraftImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(day, that.day)
                .append(type, that.type)
                .append(day, that.day)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(day).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("day", day)
                .build();
    }

    @Override
    public DayOfMonthScheduleDraft copyDeep() {
        return DayOfMonthScheduleDraft.deepCopy(this);
    }
}
