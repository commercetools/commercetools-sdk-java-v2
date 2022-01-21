
package com.commercetools.history.models.change;

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
public class ChangeTransactionStateChangeImpl implements ChangeTransactionStateChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.change_value.TransactionChangeValue transaction;

    private com.commercetools.history.models.common.TransactionState nextValue;

    private com.commercetools.history.models.common.TransactionState previousValue;

    @JsonCreator
    ChangeTransactionStateChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("transaction") final com.commercetools.history.models.change_value.TransactionChangeValue transaction,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.TransactionState nextValue,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.TransactionState previousValue) {
        this.change = change;
        this.transaction = transaction;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = CHANGE_TRANSACTION_STATE_CHANGE;
    }

    public ChangeTransactionStateChangeImpl() {
        this.type = CHANGE_TRANSACTION_STATE_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>changeTransactionState</code> on payments</p>
    */
    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.TransactionChangeValue getTransaction() {
        return this.transaction;
    }

    public com.commercetools.history.models.common.TransactionState getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.TransactionState getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setTransaction(final com.commercetools.history.models.change_value.TransactionChangeValue transaction) {
        this.transaction = transaction;
    }

    public void setNextValue(final com.commercetools.history.models.common.TransactionState nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.TransactionState previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeTransactionStateChangeImpl that = (ChangeTransactionStateChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(transaction, that.transaction)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(transaction)
                .append(nextValue)
                .append(previousValue)
                .toHashCode();
    }

}
