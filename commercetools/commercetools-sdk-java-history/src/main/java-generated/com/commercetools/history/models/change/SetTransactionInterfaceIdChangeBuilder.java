
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetTransactionInterfaceIdChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTransactionInterfaceIdChange setTransactionInterfaceIdChange = SetTransactionInterfaceIdChange.builder()
 *             .change("{change}")
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetTransactionInterfaceIdChangeBuilder implements Builder<SetTransactionInterfaceIdChange> {

    private String change;

    private com.commercetools.history.models.change_value.TransactionChangeValue transaction;

    private String previousValue;

    private String nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetTransactionInterfaceIdChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Holds information about the updated Transaction.</p>
     * @param builder function to build the transaction value
     * @return Builder
     */

    public SetTransactionInterfaceIdChangeBuilder transaction(
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

    public SetTransactionInterfaceIdChangeBuilder withTransaction(
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

    public SetTransactionInterfaceIdChangeBuilder transaction(
            final com.commercetools.history.models.change_value.TransactionChangeValue transaction) {
        this.transaction = transaction;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetTransactionInterfaceIdChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetTransactionInterfaceIdChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
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
     *  <p>Holds information about the updated Transaction.</p>
     * @return transaction
     */

    public com.commercetools.history.models.change_value.TransactionChangeValue getTransaction() {
        return this.transaction;
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
     * builds SetTransactionInterfaceIdChange with checking for non-null required values
     * @return SetTransactionInterfaceIdChange
     */
    public SetTransactionInterfaceIdChange build() {
        Objects.requireNonNull(change, SetTransactionInterfaceIdChange.class + ": change is missing");
        Objects.requireNonNull(transaction, SetTransactionInterfaceIdChange.class + ": transaction is missing");
        Objects.requireNonNull(previousValue, SetTransactionInterfaceIdChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetTransactionInterfaceIdChange.class + ": nextValue is missing");
        return new SetTransactionInterfaceIdChangeImpl(change, transaction, previousValue, nextValue);
    }

    /**
     * builds SetTransactionInterfaceIdChange without checking for non-null required values
     * @return SetTransactionInterfaceIdChange
     */
    public SetTransactionInterfaceIdChange buildUnchecked() {
        return new SetTransactionInterfaceIdChangeImpl(change, transaction, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetTransactionInterfaceIdChangeBuilder
     * @return builder
     */
    public static SetTransactionInterfaceIdChangeBuilder of() {
        return new SetTransactionInterfaceIdChangeBuilder();
    }

    /**
     * create builder for SetTransactionInterfaceIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTransactionInterfaceIdChangeBuilder of(final SetTransactionInterfaceIdChange template) {
        SetTransactionInterfaceIdChangeBuilder builder = new SetTransactionInterfaceIdChangeBuilder();
        builder.change = template.getChange();
        builder.transaction = template.getTransaction();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
