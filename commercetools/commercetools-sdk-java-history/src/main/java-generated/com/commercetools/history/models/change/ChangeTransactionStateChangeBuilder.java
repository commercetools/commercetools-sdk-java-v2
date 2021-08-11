
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeTransactionStateChangeBuilder implements Builder<ChangeTransactionStateChange> {

    private String change;

    private com.commercetools.history.models.change_value.TransactionChangeValue transaction;

    private com.commercetools.history.models.common.TransactionState nextValue;

    private com.commercetools.history.models.common.TransactionState previousValue;

    public ChangeTransactionStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeTransactionStateChangeBuilder transaction(
            Function<com.commercetools.history.models.change_value.TransactionChangeValueBuilder, com.commercetools.history.models.change_value.TransactionChangeValueBuilder> builder) {
        this.transaction = builder
                .apply(com.commercetools.history.models.change_value.TransactionChangeValueBuilder.of())
                .build();
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
        Objects.requireNonNull(change, ChangeTransactionStateChange.class + ": change is missing");
        Objects.requireNonNull(transaction, ChangeTransactionStateChange.class + ": transaction is missing");
        Objects.requireNonNull(nextValue, ChangeTransactionStateChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeTransactionStateChange.class + ": previousValue is missing");
        return new ChangeTransactionStateChangeImpl(change, transaction, nextValue, previousValue);
    }

    /**
     * builds ChangeTransactionStateChange without checking for non null required values
     */
    public ChangeTransactionStateChange buildUnchecked() {
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
