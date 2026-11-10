
package com.commercetools.api.models.recurrence_policy;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>The new value applies immediately to all <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a> that use the RecurrencePolicy. It does not affect the recurrence schedule.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurrencePolicySetMinDaysBetweenOrdersActionImpl
        implements RecurrencePolicySetMinDaysBetweenOrdersAction, ModelBase {

    private String action;

    private Integer minDaysBetweenOrders;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurrencePolicySetMinDaysBetweenOrdersActionImpl(
            @JsonProperty("minDaysBetweenOrders") final Integer minDaysBetweenOrders) {
        this.minDaysBetweenOrders = minDaysBetweenOrders;
        this.action = SET_MIN_DAYS_BETWEEN_ORDERS;
    }

    /**
     * create empty instance
     */
    public RecurrencePolicySetMinDaysBetweenOrdersActionImpl() {
        this.action = SET_MIN_DAYS_BETWEEN_ORDERS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. Must be greater than <code>0</code>. If omitted, any existing value is removed and there is no limit.</p>
     */

    public Integer getMinDaysBetweenOrders() {
        return this.minDaysBetweenOrders;
    }

    public void setMinDaysBetweenOrders(final Integer minDaysBetweenOrders) {
        this.minDaysBetweenOrders = minDaysBetweenOrders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurrencePolicySetMinDaysBetweenOrdersActionImpl that = (RecurrencePolicySetMinDaysBetweenOrdersActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(minDaysBetweenOrders, that.minDaysBetweenOrders)
                .append(action, that.action)
                .append(minDaysBetweenOrders, that.minDaysBetweenOrders)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(minDaysBetweenOrders).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("minDaysBetweenOrders", minDaysBetweenOrders)
                .build();
    }

    @Override
    public RecurrencePolicySetMinDaysBetweenOrdersAction copyDeep() {
        return RecurrencePolicySetMinDaysBetweenOrdersAction.deepCopy(this);
    }
}
