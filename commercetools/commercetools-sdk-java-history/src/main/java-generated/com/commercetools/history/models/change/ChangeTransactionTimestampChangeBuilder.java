
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeTransactionTimestampChangeBuilder implements Builder<ChangeTransactionTimestampChange> {

    private String change;

    private com.commercetools.history.models.change_value.TransactionChangeValue transaction;

    private String nextValue;

    private String previousValue;

    public ChangeTransactionTimestampChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeTransactionTimestampChangeBuilder transaction(
            Function<com.commercetools.history.models.change_value.TransactionChangeValueBuilder, com.commercetools.history.models.change_value.TransactionChangeValueBuilder> builder) {
        this.transaction = builder
                .apply(com.commercetools.history.models.change_value.TransactionChangeValueBuilder.of())
                .build();
        return this;
    }

    public ChangeTransactionTimestampChangeBuilder transaction(
            final com.commercetools.history.models.change_value.TransactionChangeValue transaction) {
        this.transaction = transaction;
        return this;
    }

    public ChangeTransactionTimestampChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangeTransactionTimestampChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.TransactionChangeValue getTransaction() {
        return this.transaction;
    }

    public String getNextValue() {
        return this.nextValue;
    }

    public String getPreviousValue() {
        return this.previousValue;
    }

    public ChangeTransactionTimestampChange build() {
        Objects.requireNonNull(change, ChangeTransactionTimestampChange.class + ": change is missing");
        Objects.requireNonNull(transaction, ChangeTransactionTimestampChange.class + ": transaction is missing");
        Objects.requireNonNull(nextValue, ChangeTransactionTimestampChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeTransactionTimestampChange.class + ": previousValue is missing");
        return new ChangeTransactionTimestampChangeImpl(change, transaction, nextValue, previousValue);
    }

    /**
     * builds ChangeTransactionTimestampChange without checking for non null required values
     */
    public ChangeTransactionTimestampChange buildUnchecked() {
        return new ChangeTransactionTimestampChangeImpl(change, transaction, nextValue, previousValue);
    }

    public static ChangeTransactionTimestampChangeBuilder of() {
        return new ChangeTransactionTimestampChangeBuilder();
    }

    public static ChangeTransactionTimestampChangeBuilder of(final ChangeTransactionTimestampChange template) {
        ChangeTransactionTimestampChangeBuilder builder = new ChangeTransactionTimestampChangeBuilder();
        builder.change = template.getChange();
        builder.transaction = template.getTransaction();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
