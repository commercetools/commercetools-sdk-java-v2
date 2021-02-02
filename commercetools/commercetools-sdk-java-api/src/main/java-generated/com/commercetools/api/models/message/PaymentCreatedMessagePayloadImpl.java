
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentCreatedMessagePayloadImpl implements PaymentCreatedMessagePayload {

    private String type;

    private com.commercetools.api.models.payment.Payment payment;

    @JsonCreator
    PaymentCreatedMessagePayloadImpl(
            @JsonProperty("payment") final com.commercetools.api.models.payment.Payment payment) {
        this.payment = payment;
        this.type = PAYMENT_CREATED;
    }

    public PaymentCreatedMessagePayloadImpl() {
        this.type = PAYMENT_CREATED;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.payment.Payment getPayment() {
        return this.payment;
    }

    public void setPayment(final com.commercetools.api.models.payment.Payment payment) {
        this.payment = payment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentCreatedMessagePayloadImpl that = (PaymentCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(payment, that.payment).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(payment).toHashCode();
    }

}
