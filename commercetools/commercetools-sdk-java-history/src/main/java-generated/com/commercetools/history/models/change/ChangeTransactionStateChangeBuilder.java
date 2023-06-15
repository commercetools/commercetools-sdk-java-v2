
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTransactionStateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTransactionStateChange changeTransactionStateChange = ChangeTransactionStateChange.builder()
 *             .change("{change}")
 *             .previousValue(TransactionState.INITIAL)
 *             .nextValue(TransactionState.INITIAL)
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeTransactionStateChangeBuilder implements Builder<ChangeTransactionStateChange> {

    private String change;

    private com.commercetools.history.models.common.TransactionState previousValue;

    private com.commercetools.history.models.common.TransactionState nextValue;

    private com.commercetools.history.models.change_value.TransactionChangeValue transaction;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeTransactionStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeTransactionStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.TransactionState previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeTransactionStateChangeBuilder nextValue(
            final com.commercetools.history.models.common.TransactionState nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Holds information about the updated Transaction.</p>
     * @param builder function to build the transaction value
     * @return Builder
     */

    public ChangeTransactionStateChangeBuilder transaction(
            Function<com.commercetools.history.models.change_value.TransactionChangeValueBuilder, com.commercetools.history.models.change_value.TransactionChangeValueBuilder> builder) {
        this.transaction = builder
                .apply(com.commercetools.history.models.change_value.TransactionChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Holds information about the updated Transaction.</p>
     * @param builder function to build the transaction value
     * @return Builder
     */

    public ChangeTransactionStateChangeBuilder withTransaction(
            Function<com.commercetools.history.models.change_value.TransactionChangeValueBuilder, com.commercetools.history.models.change_value.TransactionChangeValue> builder) {
        this.transaction = builder
                .apply(com.commercetools.history.models.change_value.TransactionChangeValueBuilder.of());
        return this;
    }

    /**
     *  <p>Holds information about the updated Transaction.</p>
     * @param transaction value to be set
     * @return Builder
     */

    public ChangeTransactionStateChangeBuilder transaction(
            final com.commercetools.history.models.change_value.TransactionChangeValue transaction) {
        this.transaction = transaction;
        return this;
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.TransactionState getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.TransactionState getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Holds information about the updated Transaction.</p>
     * @return transaction
     */

    public com.commercetools.history.models.change_value.TransactionChangeValue getTransaction() {
        return this.transaction;
    }

    /**
     * builds ChangeTransactionStateChange with checking for non-null required values
     * @return ChangeTransactionStateChange
     */
    public ChangeTransactionStateChange build() {
        Objects.requireNonNull(change, ChangeTransactionStateChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeTransactionStateChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeTransactionStateChange.class + ": nextValue is missing");
        Objects.requireNonNull(transaction, ChangeTransactionStateChange.class + ": transaction is missing");
        return new ChangeTransactionStateChangeImpl(change, previousValue, nextValue, transaction);
    }

    /**
     * builds ChangeTransactionStateChange without checking for non-null required values
     * @return ChangeTransactionStateChange
     */
    public ChangeTransactionStateChange buildUnchecked() {
        return new ChangeTransactionStateChangeImpl(change, previousValue, nextValue, transaction);
    }

    /**
     * factory method for an instance of ChangeTransactionStateChangeBuilder
     * @return builder
     */
    public static ChangeTransactionStateChangeBuilder of() {
        return new ChangeTransactionStateChangeBuilder();
    }

    /**
     * create builder for ChangeTransactionStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTransactionStateChangeBuilder of(final ChangeTransactionStateChange template) {
        ChangeTransactionStateChangeBuilder builder = new ChangeTransactionStateChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.transaction = template.getTransaction();
        return builder;
    }

}
