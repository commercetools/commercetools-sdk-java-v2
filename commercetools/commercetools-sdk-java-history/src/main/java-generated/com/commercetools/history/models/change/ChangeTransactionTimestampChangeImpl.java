
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Change triggered by the Change TransactionTimestamp update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeTransactionTimestampChangeImpl implements ChangeTransactionTimestampChange, ModelBase {

    private String type;

    private String change;

    private String previousValue;

    private String nextValue;

    private com.commercetools.history.models.change_value.TransactionChangeValue transaction;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeTransactionTimestampChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final String previousValue,
            @JsonProperty("nextValue") final String nextValue,
            @JsonProperty("transaction") final com.commercetools.history.models.change_value.TransactionChangeValue transaction) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.transaction = transaction;
        this.type = CHANGE_TRANSACTION_TIMESTAMP_CHANGE;
    }

    /**
     * create empty instance
     */
    public ChangeTransactionTimestampChangeImpl() {
        this.type = CHANGE_TRANSACTION_TIMESTAMP_CHANGE;
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

    public String getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public String getNextValue() {
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

    public void setPreviousValue(final String previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final String nextValue) {
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

        ChangeTransactionTimestampChangeImpl that = (ChangeTransactionTimestampChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(transaction, that.transaction)
                .append(type, that.type)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .append("transaction", transaction)
                .build();
    }

}
