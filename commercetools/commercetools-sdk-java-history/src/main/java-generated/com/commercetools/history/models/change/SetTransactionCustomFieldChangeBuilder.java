
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetTransactionCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTransactionCustomFieldChange setTransactionCustomFieldChange = SetTransactionCustomFieldChange.builder()
 *             .change("{change}")
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetTransactionCustomFieldChangeBuilder implements Builder<SetTransactionCustomFieldChange> {

    private String change;

    private com.commercetools.history.models.change_value.TransactionChangeValue transaction;

    private String name;

    private String customTypeId;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetTransactionCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Holds information about the updated Transaction.</p>
     * @param builder function to build the transaction value
     * @return Builder
     */

    public SetTransactionCustomFieldChangeBuilder transaction(
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

    public SetTransactionCustomFieldChangeBuilder withTransaction(
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

    public SetTransactionCustomFieldChangeBuilder transaction(
            final com.commercetools.history.models.change_value.TransactionChangeValue transaction) {
        this.transaction = transaction;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public SetTransactionCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     * @return Builder
     */

    public SetTransactionCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetTransactionCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetTransactionCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
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
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @return customTypeId
     */

    public String getCustomTypeId() {
        return this.customTypeId;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetTransactionCustomFieldChange with checking for non-null required values
     * @return SetTransactionCustomFieldChange
     */
    public SetTransactionCustomFieldChange build() {
        Objects.requireNonNull(change, SetTransactionCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(transaction, SetTransactionCustomFieldChange.class + ": transaction is missing");
        Objects.requireNonNull(name, SetTransactionCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customTypeId, SetTransactionCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(previousValue, SetTransactionCustomFieldChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetTransactionCustomFieldChange.class + ": nextValue is missing");
        return new SetTransactionCustomFieldChangeImpl(change, transaction, name, customTypeId, previousValue,
            nextValue);
    }

    /**
     * builds SetTransactionCustomFieldChange without checking for non-null required values
     * @return SetTransactionCustomFieldChange
     */
    public SetTransactionCustomFieldChange buildUnchecked() {
        return new SetTransactionCustomFieldChangeImpl(change, transaction, name, customTypeId, previousValue,
            nextValue);
    }

    /**
     * factory method for an instance of SetTransactionCustomFieldChangeBuilder
     * @return builder
     */
    public static SetTransactionCustomFieldChangeBuilder of() {
        return new SetTransactionCustomFieldChangeBuilder();
    }

    /**
     * create builder for SetTransactionCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTransactionCustomFieldChangeBuilder of(final SetTransactionCustomFieldChange template) {
        SetTransactionCustomFieldChangeBuilder builder = new SetTransactionCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.transaction = template.getTransaction();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
