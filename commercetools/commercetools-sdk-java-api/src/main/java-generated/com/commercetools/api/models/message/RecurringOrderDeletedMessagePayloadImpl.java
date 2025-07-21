
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
 *  <p>Generated after a successful Delete RecurringOrder request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderDeletedMessagePayloadImpl implements RecurringOrderDeletedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.recurring_order.RecurringOrder recurringOrder;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringOrderDeletedMessagePayloadImpl(
            @JsonProperty("recurringOrder") final com.commercetools.api.models.recurring_order.RecurringOrder recurringOrder) {
        this.recurringOrder = recurringOrder;
        this.type = RECURRING_ORDER_DELETED;
    }

    /**
     * create empty instance
     */
    public RecurringOrderDeletedMessagePayloadImpl() {
        this.type = RECURRING_ORDER_DELETED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>RecurringOrder that was deleted.</p>
     */

    public com.commercetools.api.models.recurring_order.RecurringOrder getRecurringOrder() {
        return this.recurringOrder;
    }

    public void setRecurringOrder(final com.commercetools.api.models.recurring_order.RecurringOrder recurringOrder) {
        this.recurringOrder = recurringOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringOrderDeletedMessagePayloadImpl that = (RecurringOrderDeletedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(recurringOrder, that.recurringOrder)
                .append(type, that.type)
                .append(recurringOrder, that.recurringOrder)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(recurringOrder).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("recurringOrder", recurringOrder)
                .build();
    }

    @Override
    public RecurringOrderDeletedMessagePayload copyDeep() {
        return RecurringOrderDeletedMessagePayload.deepCopy(this);
    }
}
