
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
 *  <p>Changes the Recurring Order state to active.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderActiveImpl implements RecurringOrderActive, ModelBase {

    private String type;

    private java.time.ZonedDateTime resumesAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringOrderActiveImpl(@JsonProperty("resumesAt") final java.time.ZonedDateTime resumesAt) {
        this.resumesAt = resumesAt;
        this.type = ACTIVE;
    }

    /**
     * create empty instance
     */
    public RecurringOrderActiveImpl() {
        this.type = ACTIVE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>If set, the Recurring Order will automatically resume at the date and time (UTC) specified.</p>
     */

    public java.time.ZonedDateTime getResumesAt() {
        return this.resumesAt;
    }

    public void setResumesAt(final java.time.ZonedDateTime resumesAt) {
        this.resumesAt = resumesAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringOrderActiveImpl that = (RecurringOrderActiveImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(resumesAt, that.resumesAt)
                .append(type, that.type)
                .append(resumesAt, that.resumesAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(resumesAt).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("resumesAt", resumesAt)
                .build();
    }

    @Override
    public RecurringOrderActive copyDeep() {
        return RecurringOrderActive.deepCopy(this);
    }
}
