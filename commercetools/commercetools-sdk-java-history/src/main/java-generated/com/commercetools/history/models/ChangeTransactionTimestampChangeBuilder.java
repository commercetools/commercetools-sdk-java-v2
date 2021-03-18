
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeTransactionTimestampChangeBuilder {

    private String change;

    private com.commercetools.history.models.TransactionChangeValue transaction;

    private String nextValue;

    private String previousValue;

    public ChangeTransactionTimestampChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeTransactionTimestampChangeBuilder transaction(
            final com.commercetools.history.models.TransactionChangeValue transaction) {
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

    public com.commercetools.history.models.TransactionChangeValue getTransaction() {
        return this.transaction;
    }

    public String getNextValue() {
        return this.nextValue;
    }

    public String getPreviousValue() {
        return this.previousValue;
    }

    public ChangeTransactionTimestampChange build() {
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
