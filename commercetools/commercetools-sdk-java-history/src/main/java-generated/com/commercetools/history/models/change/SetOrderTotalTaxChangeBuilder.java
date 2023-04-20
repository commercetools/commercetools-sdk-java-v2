
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetOrderTotalTaxChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetOrderTotalTaxChange setOrderTotalTaxChange = SetOrderTotalTaxChange.builder()
 *             .change("{change}")
 *             .taxMode(TaxMode.PLATFORM)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetOrderTotalTaxChangeBuilder implements Builder<SetOrderTotalTaxChange> {

    private String change;

    private com.commercetools.history.models.common.TaxMode taxMode;

    private com.commercetools.history.models.common.Money nextValue;

    private com.commercetools.history.models.common.Money previousValue;

    /**
     *  <p>Update action for <code>setOrderTotalTax</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetOrderTotalTaxChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the taxMode
     * @param taxMode value to be set
     * @return Builder
     */

    public SetOrderTotalTaxChangeBuilder taxMode(final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetOrderTotalTaxChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetOrderTotalTaxChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetOrderTotalTaxChangeBuilder nextValue(final com.commercetools.history.models.common.Money nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetOrderTotalTaxChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetOrderTotalTaxChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetOrderTotalTaxChangeBuilder previousValue(
            final com.commercetools.history.models.common.Money previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setOrderTotalTax</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of taxMode}
     * @return taxMode
     */

    public com.commercetools.history.models.common.TaxMode getTaxMode() {
        return this.taxMode;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.Money getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.Money getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetOrderTotalTaxChange with checking for non-null required values
     * @return SetOrderTotalTaxChange
     */
    public SetOrderTotalTaxChange build() {
        Objects.requireNonNull(change, SetOrderTotalTaxChange.class + ": change is missing");
        Objects.requireNonNull(taxMode, SetOrderTotalTaxChange.class + ": taxMode is missing");
        Objects.requireNonNull(nextValue, SetOrderTotalTaxChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetOrderTotalTaxChange.class + ": previousValue is missing");
        return new SetOrderTotalTaxChangeImpl(change, taxMode, nextValue, previousValue);
    }

    /**
     * builds SetOrderTotalTaxChange without checking for non-null required values
     * @return SetOrderTotalTaxChange
     */
    public SetOrderTotalTaxChange buildUnchecked() {
        return new SetOrderTotalTaxChangeImpl(change, taxMode, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetOrderTotalTaxChangeBuilder
     * @return builder
     */
    public static SetOrderTotalTaxChangeBuilder of() {
        return new SetOrderTotalTaxChangeBuilder();
    }

    /**
     * create builder for SetOrderTotalTaxChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetOrderTotalTaxChangeBuilder of(final SetOrderTotalTaxChange template) {
        SetOrderTotalTaxChangeBuilder builder = new SetOrderTotalTaxChangeBuilder();
        builder.change = template.getChange();
        builder.taxMode = template.getTaxMode();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
