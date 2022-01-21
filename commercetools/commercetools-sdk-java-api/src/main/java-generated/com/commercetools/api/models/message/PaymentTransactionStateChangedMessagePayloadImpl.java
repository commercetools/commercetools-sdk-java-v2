
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class PaymentTransactionStateChangedMessagePayloadImpl
        implements PaymentTransactionStateChangedMessagePayload, ModelBase {

    private String type;

    private String transactionId;

    private com.commercetools.api.models.payment.TransactionState state;

    @JsonCreator
    PaymentTransactionStateChangedMessagePayloadImpl(@JsonProperty("transactionId") final String transactionId,
            @JsonProperty("state") final com.commercetools.api.models.payment.TransactionState state) {
        this.transactionId = transactionId;
        this.state = state;
        this.type = PAYMENT_TRANSACTION_STATE_CHANGED;
    }

    public PaymentTransactionStateChangedMessagePayloadImpl() {
        this.type = PAYMENT_TRANSACTION_STATE_CHANGED;
    }

    public String getType() {
        return this.type;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public com.commercetools.api.models.payment.TransactionState getState() {
        return this.state;
    }

    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    public void setState(final com.commercetools.api.models.payment.TransactionState state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentTransactionStateChangedMessagePayloadImpl that = (PaymentTransactionStateChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(transactionId, that.transactionId)
                .append(state, that.state)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(transactionId).append(state).toHashCode();
    }

}
