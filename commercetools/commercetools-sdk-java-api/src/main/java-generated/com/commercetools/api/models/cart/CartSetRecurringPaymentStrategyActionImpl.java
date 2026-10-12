
package com.commercetools.api.models.cart;

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
 *  <p>Sets the <code>paymentStrategy</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentConfiguration" rel="nofollow">RecurringPaymentConfiguration</a> without changing the existing <code>paymentAllocations</code>. To set both at once, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetRecurringPaymentConfigurationAction" rel="nofollow">Set RecurringPaymentConfiguration</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetRecurringPaymentStrategyActionImpl implements CartSetRecurringPaymentStrategyAction, ModelBase {

    private String action;

    private com.commercetools.api.models.cart.PaymentStrategy paymentStrategy;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetRecurringPaymentStrategyActionImpl(
            @JsonProperty("paymentStrategy") final com.commercetools.api.models.cart.PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
        this.action = SET_RECURRING_PAYMENT_STRATEGY;
    }

    /**
     * create empty instance
     */
    public CartSetRecurringPaymentStrategyActionImpl() {
        this.action = SET_RECURRING_PAYMENT_STRATEGY;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New value to set.</p>
     */

    public com.commercetools.api.models.cart.PaymentStrategy getPaymentStrategy() {
        return this.paymentStrategy;
    }

    public void setPaymentStrategy(final com.commercetools.api.models.cart.PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartSetRecurringPaymentStrategyActionImpl that = (CartSetRecurringPaymentStrategyActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(paymentStrategy, that.paymentStrategy)
                .append(action, that.action)
                .append(paymentStrategy, that.paymentStrategy)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(paymentStrategy).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("paymentStrategy", paymentStrategy)
                .build();
    }

    @Override
    public CartSetRecurringPaymentStrategyAction copyDeep() {
        return CartSetRecurringPaymentStrategyAction.deepCopy(this);
    }
}
