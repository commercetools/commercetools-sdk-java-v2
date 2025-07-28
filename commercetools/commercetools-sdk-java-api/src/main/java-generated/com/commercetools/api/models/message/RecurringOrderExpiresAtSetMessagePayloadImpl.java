
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
 *  <p>Generated after a successful Set Expires At update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderExpiresAtSetMessagePayloadImpl
        implements RecurringOrderExpiresAtSetMessagePayload, ModelBase {

    private String type;

    private java.time.ZonedDateTime newExpiresAt;

    private java.time.ZonedDateTime oldExpiresAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringOrderExpiresAtSetMessagePayloadImpl(
            @JsonProperty("newExpiresAt") final java.time.ZonedDateTime newExpiresAt,
            @JsonProperty("oldExpiresAt") final java.time.ZonedDateTime oldExpiresAt) {
        this.newExpiresAt = newExpiresAt;
        this.oldExpiresAt = oldExpiresAt;
        this.type = RECURRING_ORDER_EXPIRES_AT_SET;
    }

    /**
     * create empty instance
     */
    public RecurringOrderExpiresAtSetMessagePayloadImpl() {
        this.type = RECURRING_ORDER_EXPIRES_AT_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Expiration date and time of the Recurring Order after the Set Expires At update action.</p>
     */

    public java.time.ZonedDateTime getNewExpiresAt() {
        return this.newExpiresAt;
    }

    /**
     *  <p>Expiration date and time of the Recurring Order before the Set Expires At update action.</p>
     */

    public java.time.ZonedDateTime getOldExpiresAt() {
        return this.oldExpiresAt;
    }

    public void setNewExpiresAt(final java.time.ZonedDateTime newExpiresAt) {
        this.newExpiresAt = newExpiresAt;
    }

    public void setOldExpiresAt(final java.time.ZonedDateTime oldExpiresAt) {
        this.oldExpiresAt = oldExpiresAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringOrderExpiresAtSetMessagePayloadImpl that = (RecurringOrderExpiresAtSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(newExpiresAt, that.newExpiresAt)
                .append(oldExpiresAt, that.oldExpiresAt)
                .append(type, that.type)
                .append(newExpiresAt, that.newExpiresAt)
                .append(oldExpiresAt, that.oldExpiresAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(newExpiresAt).append(oldExpiresAt).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("newExpiresAt", newExpiresAt)
                .append("oldExpiresAt", oldExpiresAt)
                .build();
    }

    @Override
    public RecurringOrderExpiresAtSetMessagePayload copyDeep() {
        return RecurringOrderExpiresAtSetMessagePayload.deepCopy(this);
    }
}
