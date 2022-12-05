
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * TransactionDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionDraftImpl implements TransactionDraft, ModelBase {

    private java.time.ZonedDateTime timestamp;

    private com.commercetools.api.models.payment.TransactionType type;

    private com.commercetools.api.models.common.Money amount;

    private String interactionId;

    private com.commercetools.api.models.payment.TransactionState state;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @JsonCreator
    TransactionDraftImpl(@JsonProperty("timestamp") final java.time.ZonedDateTime timestamp,
            @JsonProperty("type") final com.commercetools.api.models.payment.TransactionType type,
            @JsonProperty("amount") final com.commercetools.api.models.common.Money amount,
            @JsonProperty("interactionId") final String interactionId,
            @JsonProperty("state") final com.commercetools.api.models.payment.TransactionState state,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.timestamp = timestamp;
        this.type = type;
        this.amount = amount;
        this.interactionId = interactionId;
        this.state = state;
        this.custom = custom;
    }

    public TransactionDraftImpl() {
    }

    /**
     *  <p>Date and time (UTC) the Transaction took place.</p>
     */

    public java.time.ZonedDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     *  <p>Type of the Transaction.</p>
     */

    public com.commercetools.api.models.payment.TransactionType getType() {
        return this.type;
    }

    /**
     *  <p>Money value for the Transaction.</p>
     */

    public com.commercetools.api.models.common.Money getAmount() {
        return this.amount;
    }

    /**
     *  <p>Identifier used by the payment service that manages the Transaction. Can be used to correlate the Transaction to an interface interaction.</p>
     */

    public String getInteractionId() {
        return this.interactionId;
    }

    /**
     *  <p>State of the Transaction.</p>
     */

    public com.commercetools.api.models.payment.TransactionState getState() {
        return this.state;
    }

    /**
     *  <p>Custom Fields of the Transaction.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
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

    public void setState(final com.commercetools.api.models.payment.TransactionState state) {
        this.state = state;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TransactionDraftImpl that = (TransactionDraftImpl) o;

        return new EqualsBuilder().append(timestamp, that.timestamp)
                .append(type, that.type)
                .append(amount, that.amount)
                .append(interactionId, that.interactionId)
                .append(state, that.state)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(timestamp)
                .append(type)
                .append(amount)
                .append(interactionId)
                .append(state)
                .append(custom)
                .toHashCode();
    }

}
