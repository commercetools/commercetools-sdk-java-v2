
package com.commercetools.checkout.models.recurring_payment;

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
 *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> of a RecurringPayment.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringPaymentSetRecurringOrderUpdateActionImpl
        implements RecurringPaymentSetRecurringOrderUpdateAction, ModelBase {

    private String action;

    private com.commercetools.checkout.models.recurring_payment.RecurringOrderReference recurringOrder;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringPaymentSetRecurringOrderUpdateActionImpl(
            @JsonProperty("recurringOrder") final com.commercetools.checkout.models.recurring_payment.RecurringOrderReference recurringOrder) {
        this.recurringOrder = recurringOrder;
        this.action = SET_RECURRING_ORDER;
    }

    /**
     * create empty instance
     */
    public RecurringPaymentSetRecurringOrderUpdateActionImpl() {
        this.action = SET_RECURRING_ORDER;
    }

    /**
     *  <p>Type of update action to be performed on the RecurringPayment.</p>
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> to set.</p>
     */

    public com.commercetools.checkout.models.recurring_payment.RecurringOrderReference getRecurringOrder() {
        return this.recurringOrder;
    }

    public void setRecurringOrder(
            final com.commercetools.checkout.models.recurring_payment.RecurringOrderReference recurringOrder) {
        this.recurringOrder = recurringOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringPaymentSetRecurringOrderUpdateActionImpl that = (RecurringPaymentSetRecurringOrderUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(recurringOrder, that.recurringOrder)
                .append(action, that.action)
                .append(recurringOrder, that.recurringOrder)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(recurringOrder).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("recurringOrder", recurringOrder)
                .build();
    }

    @Override
    public RecurringPaymentSetRecurringOrderUpdateAction copyDeep() {
        return RecurringPaymentSetRecurringOrderUpdateAction.deepCopy(this);
    }
}
