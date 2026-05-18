
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Represents a financial transaction typically created as a result of a notification from the payment service.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionImpl implements Transaction, ModelBase {

    private String id;

    private java.time.ZonedDateTime timestamp;

    private com.commercetools.api.models.payment.TransactionType type;

    private com.commercetools.api.models.common.CentPrecisionMoney amount;

    private String interactionId;

    private com.commercetools.api.models.payment.TransactionState state;

    private com.commercetools.api.models.type.CustomFields custom;

    private String interfaceId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TransactionImpl(@JsonProperty("id") final String id,
            @JsonProperty("timestamp") final java.time.ZonedDateTime timestamp,
            @JsonProperty("type") final com.commercetools.api.models.payment.TransactionType type,
            @JsonProperty("amount") final com.commercetools.api.models.common.CentPrecisionMoney amount,
            @JsonProperty("interactionId") final String interactionId,
            @JsonProperty("state") final com.commercetools.api.models.payment.TransactionState state,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("interfaceId") final String interfaceId) {
        this.id = id;
        this.timestamp = timestamp;
        this.type = type;
        this.amount = amount;
        this.interactionId = interactionId;
        this.state = state;
        this.custom = custom;
        this.interfaceId = interfaceId;
    }

    /**
     * create empty instance
     */
    public TransactionImpl() {
    }

    /**
     *  <p>Unique identifier of the Transaction.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Date and time (UTC) the Transaction took place.</p>
     */

    public java.time.ZonedDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     *  <p>Type of the Transaction. For example, <code>Authorization</code>.</p>
     */

    public com.commercetools.api.models.payment.TransactionType getType() {
        return this.type;
    }

    /**
     *  <p>Money value of the Transaction.</p>
     */

    public com.commercetools.api.models.common.CentPrecisionMoney getAmount() {
        return this.amount;
    }

    /**
     *  <p>Identifier used by the interface that manages the Transaction (usually the PSP). If a matching interaction was logged in the <code>interfaceInteractions</code> array, the corresponding interaction can be found with this ID.</p>
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
     *  <p>Custom Fields defined for the Transaction.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) in the current transaction.</p>
     */

    public String getInterfaceId() {
        return this.interfaceId;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setTimestamp(final java.time.ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setType(final com.commercetools.api.models.payment.TransactionType type) {
        this.type = type;
    }

    public void setAmount(final com.commercetools.api.models.common.CentPrecisionMoney amount) {
        this.amount = amount;
    }

    public void setInteractionId(final String interactionId) {
        this.interactionId = interactionId;
    }

    public void setState(final com.commercetools.api.models.payment.TransactionState state) {
        this.state = state;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    public void setInterfaceId(final String interfaceId) {
        this.interfaceId = interfaceId;
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
                .append(custom, that.custom)
                .append(interfaceId, that.interfaceId)
                .append(id, that.id)
                .append(timestamp, that.timestamp)
                .append(type, that.type)
                .append(amount, that.amount)
                .append(interactionId, that.interactionId)
                .append(state, that.state)
                .append(custom, that.custom)
                .append(interfaceId, that.interfaceId)
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
                .append(custom)
                .append(interfaceId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("timestamp", timestamp)
                .append("type", type)
                .append("amount", amount)
                .append("interactionId", interactionId)
                .append("state", state)
                .append("custom", custom)
                .append("interfaceId", interfaceId)
                .build();
    }

    @Override
    public Transaction copyDeep() {
        return Transaction.deepCopy(this);
    }
}
