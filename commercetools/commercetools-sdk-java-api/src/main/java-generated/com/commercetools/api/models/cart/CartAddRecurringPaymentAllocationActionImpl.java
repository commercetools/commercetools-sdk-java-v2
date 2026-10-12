
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
 *  <p>Adds a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentAllocation" rel="nofollow">RecurringPaymentAllocation</a> to the <code>paymentAllocations</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentConfiguration" rel="nofollow">RecurringPaymentConfiguration</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartAddRecurringPaymentAllocationActionImpl implements CartAddRecurringPaymentAllocationAction, ModelBase {

    private String action;

    private String id;

    private com.commercetools.api.models.payment_method.PaymentMethodReference paymentMethod;

    private com.commercetools.api.models.cart.AllocationDraft allocation;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartAddRecurringPaymentAllocationActionImpl(@JsonProperty("id") final String id,
            @JsonProperty("paymentMethod") final com.commercetools.api.models.payment_method.PaymentMethodReference paymentMethod,
            @JsonProperty("allocation") final com.commercetools.api.models.cart.AllocationDraft allocation) {
        this.id = id;
        this.paymentMethod = paymentMethod;
        this.allocation = allocation;
        this.action = ADD_RECURRING_PAYMENT_ALLOCATION;
    }

    /**
     * create empty instance
     */
    public CartAddRecurringPaymentAllocationActionImpl() {
        this.action = ADD_RECURRING_PAYMENT_ALLOCATION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Unique identifier of the new <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentAllocation" rel="nofollow">RecurringPaymentAllocation</a> within the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentConfiguration" rel="nofollow">RecurringPaymentConfiguration</a>.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Payment Method charged for this share of the Order total.</p>
     */

    public com.commercetools.api.models.payment_method.PaymentMethodReference getPaymentMethod() {
        return this.paymentMethod;
    }

    /**
     *  <p>Share of the Order total charged to the <code>paymentMethod</code>.</p>
     */

    public com.commercetools.api.models.cart.AllocationDraft getAllocation() {
        return this.allocation;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setPaymentMethod(
            final com.commercetools.api.models.payment_method.PaymentMethodReference paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setAllocation(final com.commercetools.api.models.cart.AllocationDraft allocation) {
        this.allocation = allocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartAddRecurringPaymentAllocationActionImpl that = (CartAddRecurringPaymentAllocationActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(id, that.id)
                .append(paymentMethod, that.paymentMethod)
                .append(allocation, that.allocation)
                .append(action, that.action)
                .append(id, that.id)
                .append(paymentMethod, that.paymentMethod)
                .append(allocation, that.allocation)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(id)
                .append(paymentMethod)
                .append(allocation)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("id", id)
                .append("paymentMethod", paymentMethod)
                .append("allocation", allocation)
                .build();
    }

    @Override
    public CartAddRecurringPaymentAllocationAction copyDeep() {
        return CartAddRecurringPaymentAllocationAction.deepCopy(this);
    }
}
