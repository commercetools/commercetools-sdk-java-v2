
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
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .nextValue("{nextValue}")
 *             .previousValue("{previousValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeTransactionInteractionIdChangeBuilder implements Builder<ChangeTransactionInteractionIdChange> {

    private String change;

    private com.commercetools.history.models.change_value.TransactionChangeValue transaction;

    private String nextValue;

    private String previousValue;

    /**
     *  <p>Update action for <code>changeTransactionInteractionId</code> on payments</p>
     * @param change value to be set
     * @return Builder
     */

    public ChangeTransactionInteractionIdChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the transaction using the builder function
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
     * set the value to the transaction
     * @param transaction value to be set
     * @return Builder
     */

    public ChangeTransactionInteractionIdChangeBuilder transaction(
            final com.commercetools.history.models.change_value.TransactionChangeValue transaction) {
        this.transaction = transaction;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeTransactionInteractionIdChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeTransactionInteractionIdChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>changeTransactionInteractionId</code> on payments</p>
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
     * builds ChangeTransactionInteractionIdChange with checking for non-null required values
     * @return ChangeTransactionInteractionIdChange
     */
    public ChangeTransactionInteractionIdChange build() {
        Objects.requireNonNull(change, ChangeTransactionInteractionIdChange.class + ": change is missing");
        Objects.requireNonNull(transaction, ChangeTransactionInteractionIdChange.class + ": transaction is missing");
        Objects.requireNonNull(nextValue, ChangeTransactionInteractionIdChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue,
            ChangeTransactionInteractionIdChange.class + ": previousValue is missing");
        return new ChangeTransactionInteractionIdChangeImpl(change, transaction, nextValue, previousValue);
    }

    /**
     * builds ChangeTransactionInteractionIdChange without checking for non-null required values
     * @return ChangeTransactionInteractionIdChange
     */
    public ChangeTransactionInteractionIdChange buildUnchecked() {
        return new ChangeTransactionInteractionIdChangeImpl(change, transaction, nextValue, previousValue);
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
        builder.transaction = template.getTransaction();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
