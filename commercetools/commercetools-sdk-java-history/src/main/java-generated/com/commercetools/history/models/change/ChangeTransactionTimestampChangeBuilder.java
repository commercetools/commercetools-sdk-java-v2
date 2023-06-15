
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
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeTransactionTimestampChangeBuilder implements Builder<ChangeTransactionTimestampChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    private com.commercetools.history.models.change_value.TransactionChangeValue transaction;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeTransactionTimestampChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeTransactionTimestampChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeTransactionTimestampChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Holds information about the updated Transaction.</p>
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
     *  <p>Holds information about the updated Transaction.</p>
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
     *  <p>Holds information about the updated Transaction.</p>
     * @param transaction value to be set
     * @return Builder
     */

    public ChangeTransactionTimestampChangeBuilder transaction(
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

    public String getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public String getNextValue() {
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
     * builds ChangeTransactionTimestampChange with checking for non-null required values
     * @return ChangeTransactionTimestampChange
     */
    public ChangeTransactionTimestampChange build() {
        Objects.requireNonNull(change, ChangeTransactionTimestampChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeTransactionTimestampChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeTransactionTimestampChange.class + ": nextValue is missing");
        Objects.requireNonNull(transaction, ChangeTransactionTimestampChange.class + ": transaction is missing");
        return new ChangeTransactionTimestampChangeImpl(change, previousValue, nextValue, transaction);
    }

    /**
     * builds ChangeTransactionTimestampChange without checking for non-null required values
     * @return ChangeTransactionTimestampChange
     */
    public ChangeTransactionTimestampChange buildUnchecked() {
        return new ChangeTransactionTimestampChangeImpl(change, previousValue, nextValue, transaction);
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
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.transaction = template.getTransaction();
        return builder;
    }

}
