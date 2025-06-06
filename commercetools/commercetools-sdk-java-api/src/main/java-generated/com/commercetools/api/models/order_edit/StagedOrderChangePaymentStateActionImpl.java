
package com.commercetools.api.models.order_edit;

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
 *  <p>Produces the Order Payment State Changed Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderChangePaymentStateActionImpl implements StagedOrderChangePaymentStateAction, ModelBase {

    private String action;

    private com.commercetools.api.models.order.PaymentState paymentState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderChangePaymentStateActionImpl(
            @JsonProperty("paymentState") final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        this.action = CHANGE_PAYMENT_STATE;
    }

    /**
     * create empty instance
     */
    public StagedOrderChangePaymentStateActionImpl() {
        this.action = CHANGE_PAYMENT_STATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New payment status of the Order.</p>
     */

    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    public void setPaymentState(final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderChangePaymentStateActionImpl that = (StagedOrderChangePaymentStateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(paymentState, that.paymentState)
                .append(action, that.action)
                .append(paymentState, that.paymentState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(paymentState).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("paymentState", paymentState)
                .build();
    }

    @Override
    public StagedOrderChangePaymentStateAction copyDeep() {
        return StagedOrderChangePaymentStateAction.deepCopy(this);
    }
}
