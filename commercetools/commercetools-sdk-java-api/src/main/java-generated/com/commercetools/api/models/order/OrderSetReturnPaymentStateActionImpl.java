
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetReturnPaymentStateActionImpl implements OrderSetReturnPaymentStateAction {

    private String action;

    private String returnItemId;

    private com.commercetools.api.models.order.ReturnPaymentState paymentState;

    @JsonCreator
    OrderSetReturnPaymentStateActionImpl(@JsonProperty("returnItemId") final String returnItemId,
            @JsonProperty("paymentState") final com.commercetools.api.models.order.ReturnPaymentState paymentState) {
        this.returnItemId = returnItemId;
        this.paymentState = paymentState;
        this.action = SET_RETURN_PAYMENT_STATE;
    }

    public OrderSetReturnPaymentStateActionImpl() {
        this.action = SET_RETURN_PAYMENT_STATE;
    }

    public String getAction() {
        return this.action;
    }

    public String getReturnItemId() {
        return this.returnItemId;
    }

    public com.commercetools.api.models.order.ReturnPaymentState getPaymentState() {
        return this.paymentState;
    }

    public void setReturnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
    }

    public void setPaymentState(final com.commercetools.api.models.order.ReturnPaymentState paymentState) {
        this.paymentState = paymentState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSetReturnPaymentStateActionImpl that = (OrderSetReturnPaymentStateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(returnItemId, that.returnItemId)
                .append(paymentState, that.paymentState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(returnItemId).append(paymentState).toHashCode();
    }

}
