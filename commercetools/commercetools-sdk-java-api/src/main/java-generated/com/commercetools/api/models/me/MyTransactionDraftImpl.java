
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyTransactionDraftImpl implements MyTransactionDraft {

    private java.time.ZonedDateTime timestamp;

    private com.commercetools.api.models.payment.TransactionType type;

    private com.commercetools.api.models.common.Money amount;

    private String interactionId;

    @JsonCreator
    MyTransactionDraftImpl(@JsonProperty("timestamp") final java.time.ZonedDateTime timestamp,
            @JsonProperty("type") final com.commercetools.api.models.payment.TransactionType type,
            @JsonProperty("amount") final com.commercetools.api.models.common.Money amount,
            @JsonProperty("interactionId") final String interactionId) {
        this.timestamp = timestamp;
        this.type = type;
        this.amount = amount;
        this.interactionId = interactionId;
    }

    public MyTransactionDraftImpl() {
    }

    /**
    *  <p>The time at which the transaction took place.</p>
    */
    public java.time.ZonedDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
    *  <p>The type of this transaction.
    *  Only the <code>Authorization</code> or <code>Charge</code>
    *  TransactionTypes are allowed here.</p>
    */
    public com.commercetools.api.models.payment.TransactionType getType() {
        return this.type;
    }

    public com.commercetools.api.models.common.Money getAmount() {
        return this.amount;
    }

    /**
    *  <p>The identifier that is used by the interface that managed the transaction (usually the PSP).
    *  If a matching interaction was logged in the interfaceInteractions array,
    *  the corresponding interaction should be findable with this ID.
    *  The <code>state</code> is set to the <code>Initial</code> TransactionState.</p>
    */
    public String getInteractionId() {
        return this.interactionId;
    }

    public void setTimestamp(final java.time.ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setType(final com.commercetools.api.models.payment.TransactionType type) {
        this.type = type;
    }

    public void setAmount(final com.commercetools.api.models.common.Money amount) {
        this.amount = amount;
    }

    public void setInteractionId(final String interactionId) {
        this.interactionId = interactionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyTransactionDraftImpl that = (MyTransactionDraftImpl) o;

        return new EqualsBuilder().append(timestamp, that.timestamp)
                .append(type, that.type)
                .append(amount, that.amount)
                .append(interactionId, that.interactionId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(timestamp)
                .append(type)
                .append(amount)
                .append(interactionId)
                .toHashCode();
    }

}
