
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Generated after a successful Change TransactionState update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentTransactionStateChangedMessagePayloadImpl
        implements PaymentTransactionStateChangedMessagePayload, ModelBase {

    private String type;

    private String transactionId;

    private com.commercetools.api.models.payment.TransactionState state;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentTransactionStateChangedMessagePayloadImpl(@JsonProperty("transactionId") final String transactionId,
            @JsonProperty("state") final com.commercetools.api.models.payment.TransactionState state) {
        this.transactionId = transactionId;
        this.state = state;
        this.type = PAYMENT_TRANSACTION_STATE_CHANGED;
    }

    /**
     * create empty instance
     */
    public PaymentTransactionStateChangedMessagePayloadImpl() {
        this.type = PAYMENT_TRANSACTION_STATE_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Unique identifier for the Transaction for which the Transaction State changed.</p>
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     *  <p>Transaction State after the Change Transaction State update action.</p>
     */

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
                .append(type, that.type)
                .append(transactionId, that.transactionId)
                .append(state, that.state)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(transactionId).append(state).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("transactionId", transactionId)
                .append("state", state)
                .build();
    }

}
