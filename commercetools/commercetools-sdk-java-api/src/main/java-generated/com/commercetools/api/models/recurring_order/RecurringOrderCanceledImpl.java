
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
 *  <p>Changes the Recurring Order state to canceled.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderCanceledImpl implements RecurringOrderCanceled, ModelBase {

    private String type;

    private String reason;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringOrderCanceledImpl(@JsonProperty("reason") final String reason) {
        this.reason = reason;
        this.type = CANCELED;
    }

    /**
     * create empty instance
     */
    public RecurringOrderCanceledImpl() {
        this.type = CANCELED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The reason for the cancelation.</p>
     */

    public String getReason() {
        return this.reason;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringOrderCanceledImpl that = (RecurringOrderCanceledImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(reason, that.reason)
                .append(type, that.type)
                .append(reason, that.reason)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(reason).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("reason", reason)
                .build();
    }

    @Override
    public RecurringOrderCanceled copyDeep() {
        return RecurringOrderCanceled.deepCopy(this);
    }
}
