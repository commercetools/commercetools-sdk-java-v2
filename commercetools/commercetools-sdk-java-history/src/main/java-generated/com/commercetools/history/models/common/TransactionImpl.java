
package com.commercetools.history.models.common;

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
public class TransactionImpl implements Transaction, ModelBase {

    private String id;

    private String timestamp;

    private com.commercetools.history.models.common.TransactionType type;

    private com.commercetools.history.models.common.Money amount;

    private String interactionId;

    private com.commercetools.history.models.common.TransactionState state;

    @JsonCreator
    TransactionImpl(@JsonProperty("id") final String id, @JsonProperty("timestamp") final String timestamp,
            @JsonProperty("type") final com.commercetools.history.models.common.TransactionType type,
            @JsonProperty("amount") final com.commercetools.history.models.common.Money amount,
            @JsonProperty("interactionId") final String interactionId,
            @JsonProperty("state") final com.commercetools.history.models.common.TransactionState state) {
        this.id = id;
        this.timestamp = timestamp;
        this.type = type;
        this.amount = amount;
        this.interactionId = interactionId;
        this.state = state;
    }

    public TransactionImpl() {
    }

    /**
    *  <p>The unique ID of this object.</p>
    */
    public String getId() {
        return this.id;
    }

    /**
    *  <p>The time at which the transaction took place.</p>
    */
    public String getTimestamp() {
        return this.timestamp;
    }

    public com.commercetools.history.models.common.TransactionType getType() {
        return this.type;
    }

    public com.commercetools.history.models.common.Money getAmount() {
        return this.amount;
    }

    /**
    *  <p>The identifier that is used by the interface that managed the transaction (usually the PSP). If a matching interaction was logged in the <code>interfaceInteractions</code> array, the corresponding interaction should be findable with this ID.</p>
    */
    public String getInteractionId() {
        return this.interactionId;
    }

    public com.commercetools.history.models.common.TransactionState getState() {
        return this.state;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setTimestamp(final String timestamp) {
        this.timestamp = timestamp;
    }

    public void setType(final com.commercetools.history.models.common.TransactionType type) {
        this.type = type;
    }

    public void setAmount(final com.commercetools.history.models.common.Money amount) {
        this.amount = amount;
    }

    public void setInteractionId(final String interactionId) {
        this.interactionId = interactionId;
    }

    public void setState(final com.commercetools.history.models.common.TransactionState state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TransactionImpl that = (TransactionImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(timestamp, that.timestamp)
                .append(type, that.type)
                .append(amount, that.amount)
                .append(interactionId, that.interactionId)
                .append(state, that.state)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(timestamp)
                .append(type)
                .append(amount)
                .append(interactionId)
                .append(state)
                .toHashCode();
    }

}
