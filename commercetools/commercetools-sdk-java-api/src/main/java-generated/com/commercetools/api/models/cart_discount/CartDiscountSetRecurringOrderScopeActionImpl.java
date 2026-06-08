
package com.commercetools.api.models.cart_discount;

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
 *  <p>Sets the scope of the Cart Discount for Recurring Orders.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountSetRecurringOrderScopeActionImpl
        implements CartDiscountSetRecurringOrderScopeAction, ModelBase {

    private String action;

    private com.commercetools.api.models.recurring_order.RecurringOrderScopeDraft recurringOrderScope;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountSetRecurringOrderScopeActionImpl(
            @JsonProperty("recurringOrderScope") final com.commercetools.api.models.recurring_order.RecurringOrderScopeDraft recurringOrderScope) {
        this.recurringOrderScope = recurringOrderScope;
        this.action = SET_RECURRING_ORDER_SCOPE;
    }

    /**
     * create empty instance
     */
    public CartDiscountSetRecurringOrderScopeActionImpl() {
        this.action = SET_RECURRING_ORDER_SCOPE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Scope of the Cart Discount for Recurring Orders.</p>
     */

    public com.commercetools.api.models.recurring_order.RecurringOrderScopeDraft getRecurringOrderScope() {
        return this.recurringOrderScope;
    }

    public void setRecurringOrderScope(
            final com.commercetools.api.models.recurring_order.RecurringOrderScopeDraft recurringOrderScope) {
        this.recurringOrderScope = recurringOrderScope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartDiscountSetRecurringOrderScopeActionImpl that = (CartDiscountSetRecurringOrderScopeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(recurringOrderScope, that.recurringOrderScope)
                .append(action, that.action)
                .append(recurringOrderScope, that.recurringOrderScope)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(recurringOrderScope).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("recurringOrderScope", recurringOrderScope)
                .build();
    }

    @Override
    public CartDiscountSetRecurringOrderScopeAction copyDeep() {
        return CartDiscountSetRecurringOrderScopeAction.deepCopy(this);
    }
}
