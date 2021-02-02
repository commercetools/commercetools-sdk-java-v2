
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
public final class PaymentAddTransactionActionImpl implements PaymentAddTransactionAction {

    private String action;

    private com.commercetools.api.models.payment.TransactionDraft transaction;

    @JsonCreator
    PaymentAddTransactionActionImpl(
            @JsonProperty("transaction") final com.commercetools.api.models.payment.TransactionDraft transaction) {
        this.transaction = transaction;
        this.action = ADD_TRANSACTION;
    }

    public PaymentAddTransactionActionImpl() {
        this.action = ADD_TRANSACTION;
    }

    public String getAction() {
        return this.action;
    }

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

        return new EqualsBuilder().append(action, that.action).append(transaction, that.transaction).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(transaction).toHashCode();
    }

}
