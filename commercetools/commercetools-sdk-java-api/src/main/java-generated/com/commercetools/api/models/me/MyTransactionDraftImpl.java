
package com.commercetools.api.models.me;

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
 * MyTransactionDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyTransactionDraftImpl implements MyTransactionDraft, ModelBase {

    private java.time.ZonedDateTime timestamp;

    private com.commercetools.api.models.payment.TransactionType type;

    private com.commercetools.api.models.common.Money amount;

    private String interactionId;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private String interfaceId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyTransactionDraftImpl(@JsonProperty("timestamp") final java.time.ZonedDateTime timestamp,
            @JsonProperty("type") final com.commercetools.api.models.payment.TransactionType type,
            @JsonProperty("amount") final com.commercetools.api.models.common.Money amount,
            @JsonProperty("interactionId") final String interactionId,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("interfaceId") final String interfaceId) {
        this.timestamp = timestamp;
        this.type = type;
        this.amount = amount;
        this.interactionId = interactionId;
        this.custom = custom;
        this.interfaceId = interfaceId;
    }

    /**
     * create empty instance
     */
    public MyTransactionDraftImpl() {
    }

    /**
     *  <p>Date and time (UTC) the Transaction took place.</p>
     */

    public java.time.ZonedDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     *  <p>Type of the Transaction. Only <code>Authorization</code> or <code>Charge</code> is allowed.</p>
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
     *  <p>Custom Fields for the Transaction.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) in the current transaction.</p>
     */

    public String getInterfaceId() {
        return this.interfaceId;
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

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
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

        MyTransactionDraftImpl that = (MyTransactionDraftImpl) o;

        return new EqualsBuilder().append(timestamp, that.timestamp)
                .append(type, that.type)
                .append(amount, that.amount)
                .append(interactionId, that.interactionId)
                .append(custom, that.custom)
                .append(interfaceId, that.interfaceId)
                .append(timestamp, that.timestamp)
                .append(type, that.type)
                .append(amount, that.amount)
                .append(interactionId, that.interactionId)
                .append(custom, that.custom)
                .append(interfaceId, that.interfaceId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(timestamp)
                .append(type)
                .append(amount)
                .append(interactionId)
                .append(custom)
                .append(interfaceId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("timestamp", timestamp)
                .append("type", type)
                .append("amount", amount)
                .append("interactionId", interactionId)
                .append("custom", custom)
                .append("interfaceId", interfaceId)
                .build();
    }

    @Override
    public MyTransactionDraft copyDeep() {
        return MyTransactionDraft.deepCopy(this);
    }
}
