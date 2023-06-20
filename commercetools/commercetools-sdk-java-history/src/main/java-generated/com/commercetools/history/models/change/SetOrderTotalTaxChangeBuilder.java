
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
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .taxMode(TaxMode.PLATFORM)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetOrderTotalTaxChangeBuilder implements Builder<SetOrderTotalTaxChange> {

    private String change;

    private com.commercetools.history.models.common.Money previousValue;

    private com.commercetools.history.models.common.Money nextValue;

    private com.commercetools.history.models.common.TaxMode taxMode;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetOrderTotalTaxChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetOrderTotalTaxChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetOrderTotalTaxChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetOrderTotalTaxChangeBuilder previousValue(
            final com.commercetools.history.models.common.Money previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetOrderTotalTaxChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetOrderTotalTaxChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetOrderTotalTaxChangeBuilder nextValue(final com.commercetools.history.models.common.Money nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p><code>"ExternalAmount"</code></p>
     * @param taxMode value to be set
     * @return Builder
     */

    public SetOrderTotalTaxChangeBuilder taxMode(final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
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
     *  <p><code>"ExternalAmount"</code></p>
     * @return taxMode
     */

    public com.commercetools.history.models.common.TaxMode getTaxMode() {
        return this.taxMode;
    }

    /**
     * builds SetOrderTotalTaxChange with checking for non-null required values
     * @return SetOrderTotalTaxChange
     */
    public SetOrderTotalTaxChange build() {
        Objects.requireNonNull(change, SetOrderTotalTaxChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetOrderTotalTaxChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetOrderTotalTaxChange.class + ": nextValue is missing");
        Objects.requireNonNull(taxMode, SetOrderTotalTaxChange.class + ": taxMode is missing");
        return new SetOrderTotalTaxChangeImpl(change, previousValue, nextValue, taxMode);
    }

    /**
     * builds SetOrderTotalTaxChange without checking for non-null required values
     * @return SetOrderTotalTaxChange
     */
    public SetOrderTotalTaxChange buildUnchecked() {
        return new SetOrderTotalTaxChangeImpl(change, previousValue, nextValue, taxMode);
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
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.taxMode = template.getTaxMode();
        return builder;
    }

}
