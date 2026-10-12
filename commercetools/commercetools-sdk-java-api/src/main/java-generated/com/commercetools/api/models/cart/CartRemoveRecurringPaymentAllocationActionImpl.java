
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
 *  <p>Removes a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentAllocation" rel="nofollow">RecurringPaymentAllocation</a> from the <code>paymentAllocations</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentConfiguration" rel="nofollow">RecurringPaymentConfiguration</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartRemoveRecurringPaymentAllocationActionImpl
        implements CartRemoveRecurringPaymentAllocationAction, ModelBase {

    private String action;

    private String id;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartRemoveRecurringPaymentAllocationActionImpl(@JsonProperty("id") final String id) {
        this.id = id;
        this.action = REMOVE_RECURRING_PAYMENT_ALLOCATION;
    }

    /**
     * create empty instance
     */
    public CartRemoveRecurringPaymentAllocationActionImpl() {
        this.action = REMOVE_RECURRING_PAYMENT_ALLOCATION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentAllocation" rel="nofollow">RecurringPaymentAllocation</a> to remove.</p>
     */

    public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartRemoveRecurringPaymentAllocationActionImpl that = (CartRemoveRecurringPaymentAllocationActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(id, that.id)
                .append(action, that.action)
                .append(id, that.id)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(id).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("id", id)
                .build();
    }

    @Override
    public CartRemoveRecurringPaymentAllocationAction copyDeep() {
        return CartRemoveRecurringPaymentAllocationAction.deepCopy(this);
    }
}
