
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTransactionTimestampChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTransactionTimestampChange changeTransactionTimestampChange = ChangeTransactionTimestampChange.builder()
 *             .change("{change}")
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .nextValue("{nextValue}")
 *             .previousValue("{previousValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeTransactionTimestampChangeBuilder implements Builder<ChangeTransactionTimestampChange> {

    private String change;

    private com.commercetools.history.models.change_value.TransactionChangeValue transaction;

    private String nextValue;

    private String previousValue;

    /**
     *  <p>Update action for <code>changeTransactionTimestamp</code> on payments</p>
     * @param change value to be set
     * @return Builder
     */

    public ChangeTransactionTimestampChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the transaction using the builder function
     * @param builder function to build the transaction value
     * @return Builder
     */

    public ChangeTransactionTimestampChangeBuilder transaction(
            Function<com.commercetools.history.models.change_value.TransactionChangeValueBuilder, com.commercetools.history.models.change_value.TransactionChangeValueBuilder> builder) {
        this.transaction = builder
                .apply(com.commercetools.history.models.change_value.TransactionChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the transaction using the builder function
     * @param builder function to build the transaction value
     * @return Builder
     */

    public ChangeTransactionTimestampChangeBuilder withTransaction(
            Function<com.commercetools.history.models.change_value.TransactionChangeValueBuilder, com.commercetools.history.models.change_value.TransactionChangeValue> builder) {
        this.transaction = builder
                .apply(com.commercetools.history.models.change_value.TransactionChangeValueBuilder.of());
        return this;
    }

    /**
     * set the value to the transaction
     * @param transaction value to be set
     * @return Builder
     */

    public ChangeTransactionTimestampChangeBuilder transaction(
            final com.commercetools.history.models.change_value.TransactionChangeValue transaction) {
        this.transaction = transaction;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeTransactionTimestampChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeTransactionTimestampChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>changeTransactionTimestamp</code> on payments</p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of transaction}
     * @return transaction
     */

    public com.commercetools.history.models.change_value.TransactionChangeValue getTransaction() {
        return this.transaction;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public String getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public String getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds ChangeTransactionTimestampChange with checking for non-null required values
     * @return ChangeTransactionTimestampChange
     */
    public ChangeTransactionTimestampChange build() {
        Objects.requireNonNull(change, ChangeTransactionTimestampChange.class + ": change is missing");
        Objects.requireNonNull(transaction, ChangeTransactionTimestampChange.class + ": transaction is missing");
        Objects.requireNonNull(nextValue, ChangeTransactionTimestampChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeTransactionTimestampChange.class + ": previousValue is missing");
        return new ChangeTransactionTimestampChangeImpl(change, transaction, nextValue, previousValue);
    }

    /**
     * builds ChangeTransactionTimestampChange without checking for non-null required values
     * @return ChangeTransactionTimestampChange
     */
    public ChangeTransactionTimestampChange buildUnchecked() {
        return new ChangeTransactionTimestampChangeImpl(change, transaction, nextValue, previousValue);
    }

    /**
     * factory method for an instance of ChangeTransactionTimestampChangeBuilder
     * @return builder
     */
    public static ChangeTransactionTimestampChangeBuilder of() {
        return new ChangeTransactionTimestampChangeBuilder();
    }

    /**
     * create builder for ChangeTransactionTimestampChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTransactionTimestampChangeBuilder of(final ChangeTransactionTimestampChange template) {
        ChangeTransactionTimestampChangeBuilder builder = new ChangeTransactionTimestampChangeBuilder();
        builder.change = template.getChange();
        builder.transaction = template.getTransaction();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
