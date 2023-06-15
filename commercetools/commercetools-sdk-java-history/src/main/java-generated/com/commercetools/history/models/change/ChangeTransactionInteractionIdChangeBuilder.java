
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTransactionInteractionIdChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTransactionInteractionIdChange changeTransactionInteractionIdChange = ChangeTransactionInteractionIdChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeTransactionInteractionIdChangeBuilder implements Builder<ChangeTransactionInteractionIdChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    private com.commercetools.history.models.change_value.TransactionChangeValue transaction;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeTransactionInteractionIdChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeTransactionInteractionIdChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeTransactionInteractionIdChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Holds information about the updated Transaction.</p>
     * @param builder function to build the transaction value
     * @return Builder
     */

    public ChangeTransactionInteractionIdChangeBuilder transaction(
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

    public ChangeTransactionInteractionIdChangeBuilder withTransaction(
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

    public ChangeTransactionInteractionIdChangeBuilder transaction(
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
     *  <p>Value after the change.</p>
     * @return previousValue
     */

    public String getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value before the change.</p>
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
     * builds ChangeTransactionInteractionIdChange with checking for non-null required values
     * @return ChangeTransactionInteractionIdChange
     */
    public ChangeTransactionInteractionIdChange build() {
        Objects.requireNonNull(change, ChangeTransactionInteractionIdChange.class + ": change is missing");
        Objects.requireNonNull(previousValue,
            ChangeTransactionInteractionIdChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeTransactionInteractionIdChange.class + ": nextValue is missing");
        Objects.requireNonNull(transaction, ChangeTransactionInteractionIdChange.class + ": transaction is missing");
        return new ChangeTransactionInteractionIdChangeImpl(change, previousValue, nextValue, transaction);
    }

    /**
     * builds ChangeTransactionInteractionIdChange without checking for non-null required values
     * @return ChangeTransactionInteractionIdChange
     */
    public ChangeTransactionInteractionIdChange buildUnchecked() {
        return new ChangeTransactionInteractionIdChangeImpl(change, previousValue, nextValue, transaction);
    }

    /**
     * factory method for an instance of ChangeTransactionInteractionIdChangeBuilder
     * @return builder
     */
    public static ChangeTransactionInteractionIdChangeBuilder of() {
        return new ChangeTransactionInteractionIdChangeBuilder();
    }

    /**
     * create builder for ChangeTransactionInteractionIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTransactionInteractionIdChangeBuilder of(final ChangeTransactionInteractionIdChange template) {
        ChangeTransactionInteractionIdChangeBuilder builder = new ChangeTransactionInteractionIdChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.transaction = template.getTransaction();
        return builder;
    }

}
