
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeAmountAuthorizedChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeAmountAuthorizedChange changeAmountAuthorizedChange = ChangeAmountAuthorizedChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeAmountAuthorizedChangeBuilder implements Builder<ChangeAmountAuthorizedChange> {

    private String change;

    private com.commercetools.history.models.common.Money previousValue;

    private com.commercetools.history.models.common.Money nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeAmountAuthorizedChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeAmountAuthorizedChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeAmountAuthorizedChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeAmountAuthorizedChangeBuilder previousValue(
            final com.commercetools.history.models.common.Money previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeAmountAuthorizedChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeAmountAuthorizedChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeAmountAuthorizedChangeBuilder nextValue(
            final com.commercetools.history.models.common.Money nextValue) {
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
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.Money getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Money getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeAmountAuthorizedChange with checking for non-null required values
     * @return ChangeAmountAuthorizedChange
     */
    public ChangeAmountAuthorizedChange build() {
        Objects.requireNonNull(change, ChangeAmountAuthorizedChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeAmountAuthorizedChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeAmountAuthorizedChange.class + ": nextValue is missing");
        return new ChangeAmountAuthorizedChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeAmountAuthorizedChange without checking for non-null required values
     * @return ChangeAmountAuthorizedChange
     */
    public ChangeAmountAuthorizedChange buildUnchecked() {
        return new ChangeAmountAuthorizedChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeAmountAuthorizedChangeBuilder
     * @return builder
     */
    public static ChangeAmountAuthorizedChangeBuilder of() {
        return new ChangeAmountAuthorizedChangeBuilder();
    }

    /**
     * create builder for ChangeAmountAuthorizedChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeAmountAuthorizedChangeBuilder of(final ChangeAmountAuthorizedChange template) {
        ChangeAmountAuthorizedChangeBuilder builder = new ChangeAmountAuthorizedChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
