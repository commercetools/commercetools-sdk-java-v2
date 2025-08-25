
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/recurring-orders:POST" rel="nofollow">Create RecurringOrder</a> request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderCreatedMessagePayloadImpl implements RecurringOrderCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.recurring_order.RecurringOrder order;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringOrderCreatedMessagePayloadImpl(
            @JsonProperty("order") final com.commercetools.api.models.recurring_order.RecurringOrder order) {
        this.order = order;
        this.type = RECURRING_ORDER_CREATED;
    }

    /**
     * create empty instance
     */
    public RecurringOrderCreatedMessagePayloadImpl() {
        this.type = RECURRING_ORDER_CREATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> that was created.</p>
     */

    public com.commercetools.api.models.recurring_order.RecurringOrder getOrder() {
        return this.order;
    }

    public void setOrder(final com.commercetools.api.models.recurring_order.RecurringOrder order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringOrderCreatedMessagePayloadImpl that = (RecurringOrderCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(order, that.order)
                .append(type, that.type)
                .append(order, that.order)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(order).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("order", order)
                .build();
    }

    @Override
    public RecurringOrderCreatedMessagePayload copyDeep() {
        return RecurringOrderCreatedMessagePayload.deepCopy(this);
    }
}
