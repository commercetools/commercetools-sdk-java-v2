
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
 *  <p>Generated after a successful Add Transaction update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentTransactionAddedMessagePayloadImpl implements PaymentTransactionAddedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.payment.Transaction transaction;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentTransactionAddedMessagePayloadImpl(
            @JsonProperty("transaction") final com.commercetools.api.models.payment.Transaction transaction) {
        this.transaction = transaction;
        this.type = PAYMENT_TRANSACTION_ADDED;
    }

    /**
     * create empty instance
     */
    public PaymentTransactionAddedMessagePayloadImpl() {
        this.type = PAYMENT_TRANSACTION_ADDED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Transaction that was added to the Payment.</p>
     */

    public com.commercetools.api.models.payment.Transaction getTransaction() {
        return this.transaction;
    }

    public void setTransaction(final com.commercetools.api.models.payment.Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentTransactionAddedMessagePayloadImpl that = (PaymentTransactionAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(transaction, that.transaction)
                .append(type, that.type)
                .append(transaction, that.transaction)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(transaction).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("transaction", transaction)
                .build();
    }

    @Override
    public PaymentTransactionAddedMessagePayload copyDeep() {
        return PaymentTransactionAddedMessagePayload.deepCopy(this);
    }
}
