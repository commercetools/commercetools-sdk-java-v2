
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
 *  <p>Adding a Transaction to a Payment generates the PaymentTransactionAdded Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentAddTransactionActionImpl implements PaymentAddTransactionAction, ModelBase {

    private String action;

    private com.commercetools.api.models.payment.TransactionDraft transaction;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentAddTransactionActionImpl(
            @JsonProperty("transaction") final com.commercetools.api.models.payment.TransactionDraft transaction) {
        this.transaction = transaction;
        this.action = ADD_TRANSACTION;
    }

    /**
     * create empty instance
     */
    public PaymentAddTransactionActionImpl() {
        this.action = ADD_TRANSACTION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to append to the <code>transactions</code> array.</p>
     */

    public com.commercetools.api.models.payment.TransactionDraft getTransaction() {
        return this.transaction;
    }

    public void setTransaction(final com.commercetools.api.models.payment.TransactionDraft transaction) {
        this.transaction = transaction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentAddTransactionActionImpl that = (PaymentAddTransactionActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(transaction, that.transaction)
                .append(action, that.action)
                .append(transaction, that.transaction)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(transaction).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("transaction", transaction)
                .build();
    }

    @Override
    public PaymentAddTransactionAction copyDeep() {
        return PaymentAddTransactionAction.deepCopy(this);
    }
}
