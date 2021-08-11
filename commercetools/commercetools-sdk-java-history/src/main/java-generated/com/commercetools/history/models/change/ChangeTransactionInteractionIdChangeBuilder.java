
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeTransactionInteractionIdChangeBuilder
        implements Builder<ChangeTransactionInteractionIdChange> {

    private String change;

    private com.commercetools.history.models.change_value.TransactionChangeValue transaction;

    private String nextValue;

    private String previousValue;

    public ChangeTransactionInteractionIdChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeTransactionInteractionIdChangeBuilder transaction(
            Function<com.commercetools.history.models.change_value.TransactionChangeValueBuilder, com.commercetools.history.models.change_value.TransactionChangeValueBuilder> builder) {
        this.transaction = builder
                .apply(com.commercetools.history.models.change_value.TransactionChangeValueBuilder.of())
                .build();
        return this;
    }

    public ChangeTransactionInteractionIdChangeBuilder transaction(
            final com.commercetools.history.models.change_value.TransactionChangeValue transaction) {
        this.transaction = transaction;
        return this;
    }

    public ChangeTransactionInteractionIdChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangeTransactionInteractionIdChangeBuilder previousValue(final String previousValue) {
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

    public ChangeTransactionInteractionIdChange build() {
        Objects.requireNonNull(change, ChangeTransactionInteractionIdChange.class + ": change is missing");
        Objects.requireNonNull(transaction, ChangeTransactionInteractionIdChange.class + ": transaction is missing");
        Objects.requireNonNull(nextValue, ChangeTransactionInteractionIdChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue,
            ChangeTransactionInteractionIdChange.class + ": previousValue is missing");
        return new ChangeTransactionInteractionIdChangeImpl(change, transaction, nextValue, previousValue);
    }

    /**
     * builds ChangeTransactionInteractionIdChange without checking for non null required values
     */
    public ChangeTransactionInteractionIdChange buildUnchecked() {
        return new ChangeTransactionInteractionIdChangeImpl(change, transaction, nextValue, previousValue);
    }

    public static ChangeTransactionInteractionIdChangeBuilder of() {
        return new ChangeTransactionInteractionIdChangeBuilder();
    }

    public static ChangeTransactionInteractionIdChangeBuilder of(final ChangeTransactionInteractionIdChange template) {
        ChangeTransactionInteractionIdChangeBuilder builder = new ChangeTransactionInteractionIdChangeBuilder();
        builder.change = template.getChange();
        builder.transaction = template.getTransaction();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
