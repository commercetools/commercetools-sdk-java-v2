
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentSetAmountRefundedActionImpl implements PaymentSetAmountRefundedAction {

    private String action;

    private com.commercetools.api.models.common.Money amount;

    @JsonCreator
    PaymentSetAmountRefundedActionImpl(@JsonProperty("amount") final com.commercetools.api.models.common.Money amount) {
        this.amount = amount;
        this.action = SET_AMOUNT_REFUNDED;
    }

    public PaymentSetAmountRefundedActionImpl() {
        this.action = SET_AMOUNT_REFUNDED;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.common.Money getAmount() {
        return this.amount;
    }

    public void setAmount(final com.commercetools.api.models.common.Money amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentSetAmountRefundedActionImpl that = (PaymentSetAmountRefundedActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(amount, that.amount).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(amount).toHashCode();
    }

}
