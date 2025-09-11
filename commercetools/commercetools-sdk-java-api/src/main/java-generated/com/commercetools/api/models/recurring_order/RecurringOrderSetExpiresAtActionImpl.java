
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
 *  <p>Setting the expiration date and time generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderExpiresAtSetMessage" rel="nofollow">RecurringOrderExpiresAtSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderSetExpiresAtActionImpl implements RecurringOrderSetExpiresAtAction, ModelBase {

    private String action;

    private java.time.ZonedDateTime expiresAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringOrderSetExpiresAtActionImpl(@JsonProperty("expiresAt") final java.time.ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
        this.action = SET_EXPIRES_AT;
    }

    /**
     * create empty instance
     */
    public RecurringOrderSetExpiresAtActionImpl() {
        this.action = SET_EXPIRES_AT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Date and time (UTC) the Recurring Order should expire. If empty, any existing value will be removed.</p>
     *  <p>If the date or time is extended or removed when the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderState" rel="nofollow">RecurringOrderState</a> is <code>Expired</code>, the state will be updated to <code>Active</code>.</p>
     */

    public java.time.ZonedDateTime getExpiresAt() {
        return this.expiresAt;
    }

    public void setExpiresAt(final java.time.ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringOrderSetExpiresAtActionImpl that = (RecurringOrderSetExpiresAtActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(expiresAt, that.expiresAt)
                .append(action, that.action)
                .append(expiresAt, that.expiresAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(expiresAt).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("expiresAt", expiresAt)
                .build();
    }

    @Override
    public RecurringOrderSetExpiresAtAction copyDeep() {
        return RecurringOrderSetExpiresAtAction.deepCopy(this);
    }
}
