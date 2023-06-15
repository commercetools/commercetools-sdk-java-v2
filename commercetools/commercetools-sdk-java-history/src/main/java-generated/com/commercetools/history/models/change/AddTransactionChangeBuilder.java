
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddTransactionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddTransactionChange addTransactionChange = AddTransactionChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddTransactionChangeBuilder implements Builder<AddTransactionChange> {

    private String change;

    private com.commercetools.history.models.common.Transaction nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddTransactionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddTransactionChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TransactionBuilder, com.commercetools.history.models.common.TransactionBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TransactionBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddTransactionChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.TransactionBuilder, com.commercetools.history.models.common.Transaction> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TransactionBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddTransactionChangeBuilder nextValue(final com.commercetools.history.models.common.Transaction nextValue) {
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
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Transaction getNextValue() {
        return this.nextValue;
    }

    /**
     * builds AddTransactionChange with checking for non-null required values
     * @return AddTransactionChange
     */
    public AddTransactionChange build() {
        Objects.requireNonNull(change, AddTransactionChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddTransactionChange.class + ": nextValue is missing");
        return new AddTransactionChangeImpl(change, nextValue);
    }

    /**
     * builds AddTransactionChange without checking for non-null required values
     * @return AddTransactionChange
     */
    public AddTransactionChange buildUnchecked() {
        return new AddTransactionChangeImpl(change, nextValue);
    }

    /**
     * factory method for an instance of AddTransactionChangeBuilder
     * @return builder
     */
    public static AddTransactionChangeBuilder of() {
        return new AddTransactionChangeBuilder();
    }

    /**
     * create builder for AddTransactionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddTransactionChangeBuilder of(final AddTransactionChange template) {
        AddTransactionChangeBuilder builder = new AddTransactionChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
