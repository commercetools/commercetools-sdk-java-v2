
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
 *  <p>Information about recurring orders and frequencies.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LineItemRecurrenceInfoImpl implements LineItemRecurrenceInfo, ModelBase {

    private com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference recurrencePolicy;

    private com.commercetools.api.models.recurring_order.PriceSelectionMode priceSelectionMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    LineItemRecurrenceInfoImpl(
            @JsonProperty("recurrencePolicy") final com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference recurrencePolicy,
            @JsonProperty("priceSelectionMode") final com.commercetools.api.models.recurring_order.PriceSelectionMode priceSelectionMode) {
        this.recurrencePolicy = recurrencePolicy;
        this.priceSelectionMode = priceSelectionMode;
    }

    /**
     * create empty instance
     */
    public LineItemRecurrenceInfoImpl() {
    }

    /**
     *  <p>Reference to a RecurrencePolicy.</p>
     */

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference getRecurrencePolicy() {
        return this.recurrencePolicy;
    }

    /**
     *  <p>Indicates how the price of a line item will be selected during order creation.</p>
     */

    public com.commercetools.api.models.recurring_order.PriceSelectionMode getPriceSelectionMode() {
        return this.priceSelectionMode;
    }

    public void setRecurrencePolicy(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference recurrencePolicy) {
        this.recurrencePolicy = recurrencePolicy;
    }

    public void setPriceSelectionMode(
            final com.commercetools.api.models.recurring_order.PriceSelectionMode priceSelectionMode) {
        this.priceSelectionMode = priceSelectionMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        LineItemRecurrenceInfoImpl that = (LineItemRecurrenceInfoImpl) o;

        return new EqualsBuilder().append(recurrencePolicy, that.recurrencePolicy)
                .append(priceSelectionMode, that.priceSelectionMode)
                .append(recurrencePolicy, that.recurrencePolicy)
                .append(priceSelectionMode, that.priceSelectionMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(recurrencePolicy).append(priceSelectionMode).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("recurrencePolicy", recurrencePolicy)
                .append("priceSelectionMode", priceSelectionMode)
                .build();
    }

    @Override
    public LineItemRecurrenceInfo copyDeep() {
        return LineItemRecurrenceInfo.deepCopy(this);
    }
}
