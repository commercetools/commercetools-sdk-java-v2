
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
 *  <p>Defines the new state for the Recurring Order—for possible values, see RecurringOrderActive, RecurringOrderPaused, RecurringOrderExpired, and RecurringOrderCanceled.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderStateDraftImpl implements RecurringOrderStateDraft, ModelBase {

    private String type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringOrderStateDraftImpl(@JsonProperty("type") final String type) {
        this.type = type;
    }

    /**
     * create empty instance
     */
    public RecurringOrderStateDraftImpl() {
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringOrderStateDraftImpl that = (RecurringOrderStateDraftImpl) o;

        return new EqualsBuilder().append(type, that.type).append(type, that.type).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type).build();
    }

    @Override
    public RecurringOrderStateDraft copyDeep() {
        return RecurringOrderStateDraft.deepCopy(this);
    }
}
