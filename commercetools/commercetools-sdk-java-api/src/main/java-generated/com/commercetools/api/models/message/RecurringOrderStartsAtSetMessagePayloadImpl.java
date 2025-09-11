
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetStartsAtAction" rel="nofollow">Set Starts At</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderStartsAtSetMessagePayloadImpl implements RecurringOrderStartsAtSetMessagePayload, ModelBase {

    private String type;

    private java.time.ZonedDateTime startsAt;

    private java.time.ZonedDateTime oldStartsAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringOrderStartsAtSetMessagePayloadImpl(@JsonProperty("startsAt") final java.time.ZonedDateTime startsAt,
            @JsonProperty("oldStartsAt") final java.time.ZonedDateTime oldStartsAt) {
        this.startsAt = startsAt;
        this.oldStartsAt = oldStartsAt;
        this.type = RECURRING_ORDER_STARTS_AT_SET;
    }

    /**
     * create empty instance
     */
    public RecurringOrderStartsAtSetMessagePayloadImpl() {
        this.type = RECURRING_ORDER_STARTS_AT_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Start date and time of the Recurring Order after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetStartsAtAction" rel="nofollow">Set Starts At</a> update action.</p>
     */

    public java.time.ZonedDateTime getStartsAt() {
        return this.startsAt;
    }

    /**
     *  <p>Start date and time of the Recurring Order before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetStartsAtAction" rel="nofollow">Set Starts At</a> update action.</p>
     */

    public java.time.ZonedDateTime getOldStartsAt() {
        return this.oldStartsAt;
    }

    public void setStartsAt(final java.time.ZonedDateTime startsAt) {
        this.startsAt = startsAt;
    }

    public void setOldStartsAt(final java.time.ZonedDateTime oldStartsAt) {
        this.oldStartsAt = oldStartsAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringOrderStartsAtSetMessagePayloadImpl that = (RecurringOrderStartsAtSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(startsAt, that.startsAt)
                .append(oldStartsAt, that.oldStartsAt)
                .append(type, that.type)
                .append(startsAt, that.startsAt)
                .append(oldStartsAt, that.oldStartsAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(startsAt).append(oldStartsAt).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("startsAt", startsAt)
                .append("oldStartsAt", oldStartsAt)
                .build();
    }

    @Override
    public RecurringOrderStartsAtSetMessagePayload copyDeep() {
        return RecurringOrderStartsAtSetMessagePayload.deepCopy(this);
    }
}
