
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeTransactionStateChangeBuilder {

    private String change;

    private com.commercetools.history.models.change_value.TransactionChangeValue transaction;

    private com.commercetools.history.models.common.TransactionState nextValue;

    private com.commercetools.history.models.common.TransactionState previousValue;

    public ChangeTransactionStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeTransactionStateChangeBuilder transaction(
            final com.commercetools.history.models.change_value.TransactionChangeValue transaction) {
        this.transaction = transaction;
        return this;
    }

    public ChangeTransactionStateChangeBuilder nextValue(
            final com.commercetools.history.models.common.TransactionState nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangeTransactionStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.TransactionState previousValue) {
        this.previousValue = previousValue;
        return this;
    }

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

    public ChangeTransactionStateChange build() {
        return new ChangeTransactionStateChangeImpl(change, transaction, nextValue, previousValue);
    }

    public static ChangeTransactionStateChangeBuilder of() {
        return new ChangeTransactionStateChangeBuilder();
    }

    public static ChangeTransactionStateChangeBuilder of(final ChangeTransactionStateChange template) {
        ChangeTransactionStateChangeBuilder builder = new ChangeTransactionStateChangeBuilder();
        builder.change = template.getChange();
        builder.transaction = template.getTransaction();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
