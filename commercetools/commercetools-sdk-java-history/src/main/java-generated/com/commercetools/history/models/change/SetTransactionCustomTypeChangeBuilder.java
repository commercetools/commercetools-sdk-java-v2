
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetTransactionCustomTypeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTransactionCustomTypeChange setTransactionCustomTypeChange = SetTransactionCustomTypeChange.builder()
 *             .change("{change}")
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetTransactionCustomTypeChangeBuilder implements Builder<SetTransactionCustomTypeChange> {

    private String change;

    private com.commercetools.history.models.change_value.TransactionChangeValue transaction;

    private com.commercetools.history.models.common.CustomFields previousValue;

    private com.commercetools.history.models.common.CustomFields nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetTransactionCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Holds information about the updated Transaction.</p>
     * @param builder function to build the transaction value
     * @return Builder
     */

    public SetTransactionCustomTypeChangeBuilder transaction(
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

    public SetTransactionCustomTypeChangeBuilder withTransaction(
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

    public SetTransactionCustomTypeChangeBuilder transaction(
            final com.commercetools.history.models.change_value.TransactionChangeValue transaction) {
        this.transaction = transaction;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetTransactionCustomTypeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetTransactionCustomTypeChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetTransactionCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetTransactionCustomTypeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetTransactionCustomTypeChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetTransactionCustomTypeChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomFields nextValue) {
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

    public com.commercetools.history.models.common.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.CustomFields getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetTransactionCustomTypeChange with checking for non-null required values
     * @return SetTransactionCustomTypeChange
     */
    public SetTransactionCustomTypeChange build() {
        Objects.requireNonNull(change, SetTransactionCustomTypeChange.class + ": change is missing");
        Objects.requireNonNull(transaction, SetTransactionCustomTypeChange.class + ": transaction is missing");
        Objects.requireNonNull(previousValue, SetTransactionCustomTypeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetTransactionCustomTypeChange.class + ": nextValue is missing");
        return new SetTransactionCustomTypeChangeImpl(change, transaction, previousValue, nextValue);
    }

    /**
     * builds SetTransactionCustomTypeChange without checking for non-null required values
     * @return SetTransactionCustomTypeChange
     */
    public SetTransactionCustomTypeChange buildUnchecked() {
        return new SetTransactionCustomTypeChangeImpl(change, transaction, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetTransactionCustomTypeChangeBuilder
     * @return builder
     */
    public static SetTransactionCustomTypeChangeBuilder of() {
        return new SetTransactionCustomTypeChangeBuilder();
    }

    /**
     * create builder for SetTransactionCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTransactionCustomTypeChangeBuilder of(final SetTransactionCustomTypeChange template) {
        SetTransactionCustomTypeChangeBuilder builder = new SetTransactionCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.transaction = template.getTransaction();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
