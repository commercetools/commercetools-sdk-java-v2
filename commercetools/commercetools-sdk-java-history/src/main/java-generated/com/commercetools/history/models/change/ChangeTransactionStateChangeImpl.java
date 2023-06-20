
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

/**
 *  <p>Change triggered by the Change TransactionState update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeTransactionStateChangeImpl implements ChangeTransactionStateChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.TransactionState previousValue;

    private com.commercetools.history.models.common.TransactionState nextValue;

    private com.commercetools.history.models.change_value.TransactionChangeValue transaction;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeTransactionStateChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.TransactionState previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.TransactionState nextValue,
            @JsonProperty("transaction") final com.commercetools.history.models.change_value.TransactionChangeValue transaction) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.transaction = transaction;
        this.type = CHANGE_TRANSACTION_STATE_CHANGE;
    }

    /**
     * create empty instance
     */
    public ChangeTransactionStateChangeImpl() {
        this.type = CHANGE_TRANSACTION_STATE_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     */

    public com.commercetools.history.models.common.TransactionState getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.TransactionState getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Holds information about the updated Transaction.</p>
     */

    public com.commercetools.history.models.change_value.TransactionChangeValue getTransaction() {
        return this.transaction;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.TransactionState previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.TransactionState nextValue) {
        this.nextValue = nextValue;
    }

    public void setTransaction(final com.commercetools.history.models.change_value.TransactionChangeValue transaction) {
        this.transaction = transaction;
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
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(transaction, that.transaction)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(transaction)
                .toHashCode();
    }

}
