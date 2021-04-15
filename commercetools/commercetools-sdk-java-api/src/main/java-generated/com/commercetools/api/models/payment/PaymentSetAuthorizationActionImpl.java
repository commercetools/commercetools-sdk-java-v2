
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
public final class PaymentSetAuthorizationActionImpl implements PaymentSetAuthorizationAction {

    private String action;

    private com.commercetools.api.models.common.Money amount;

    private java.time.ZonedDateTime until;

    @JsonCreator
    PaymentSetAuthorizationActionImpl(@JsonProperty("amount") final com.commercetools.api.models.common.Money amount,
            @JsonProperty("until") final java.time.ZonedDateTime until) {
        this.amount = amount;
        this.until = until;
        this.action = SET_AUTHORIZATION;
    }

    public PaymentSetAuthorizationActionImpl() {
        this.action = SET_AUTHORIZATION;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.common.Money getAmount() {
        return this.amount;
    }

    public java.time.ZonedDateTime getUntil() {
        return this.until;
    }

    public void setAmount(final com.commercetools.api.models.common.Money amount) {
        this.amount = amount;
    }

    public void setUntil(final java.time.ZonedDateTime until) {
        this.until = until;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentSetAuthorizationActionImpl that = (PaymentSetAuthorizationActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(amount, that.amount)
                .append(until, that.until)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(amount).append(until).toHashCode();
    }

}
