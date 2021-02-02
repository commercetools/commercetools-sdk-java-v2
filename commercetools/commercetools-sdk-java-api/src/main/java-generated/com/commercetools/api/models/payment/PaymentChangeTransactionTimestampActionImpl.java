
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
public final class PaymentChangeTransactionTimestampActionImpl implements PaymentChangeTransactionTimestampAction {

    private String action;

    private String transactionId;

    private java.time.ZonedDateTime timestamp;

    @JsonCreator
    PaymentChangeTransactionTimestampActionImpl(@JsonProperty("transactionId") final String transactionId,
            @JsonProperty("timestamp") final java.time.ZonedDateTime timestamp) {
        this.transactionId = transactionId;
        this.timestamp = timestamp;
        this.action = CHANGE_TRANSACTION_TIMESTAMP;
    }

    public PaymentChangeTransactionTimestampActionImpl() {
        this.action = CHANGE_TRANSACTION_TIMESTAMP;
    }

    public String getAction() {
        return this.action;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public java.time.ZonedDateTime getTimestamp() {
        return this.timestamp;
    }

    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    public void setTimestamp(final java.time.ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentChangeTransactionTimestampActionImpl that = (PaymentChangeTransactionTimestampActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(transactionId, that.transactionId).append(
            timestamp, that.timestamp).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(transactionId).append(timestamp).toHashCode();
    }

}
