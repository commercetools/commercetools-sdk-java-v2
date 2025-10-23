
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetOrderTaxedPriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetOrderTaxedPriceChange setOrderTaxedPriceChange = SetOrderTaxedPriceChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .taxMode(TaxMode.PLATFORM)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetOrderTaxedPriceChangeBuilder implements Builder<SetOrderTaxedPriceChange> {

    private String change;

    private com.commercetools.history.models.common.TaxedPrice previousValue;

    private com.commercetools.history.models.common.TaxedPrice nextValue;

    private com.commercetools.history.models.common.TaxMode taxMode;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetOrderTaxedPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetOrderTaxedPriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.TaxedPriceBuilder, com.commercetools.history.models.common.TaxedPriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetOrderTaxedPriceChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.TaxedPriceBuilder, com.commercetools.history.models.common.TaxedPrice> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxedPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetOrderTaxedPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.TaxedPrice previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetOrderTaxedPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TaxedPriceBuilder, com.commercetools.history.models.common.TaxedPriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetOrderTaxedPriceChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.TaxedPriceBuilder, com.commercetools.history.models.common.TaxedPrice> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxedPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetOrderTaxedPriceChangeBuilder nextValue(
            final com.commercetools.history.models.common.TaxedPrice nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Indicates how taxes are set on the Cart.</p>
     * @param taxMode value to be set
     * @return Builder
     */

    public SetOrderTaxedPriceChangeBuilder taxMode(final com.commercetools.history.models.common.TaxMode taxMode) {
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

    public com.commercetools.history.models.common.TaxedPrice getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.TaxedPrice getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Indicates how taxes are set on the Cart.</p>
     * @return taxMode
     */

    public com.commercetools.history.models.common.TaxMode getTaxMode() {
        return this.taxMode;
    }

    /**
     * builds SetOrderTaxedPriceChange with checking for non-null required values
     * @return SetOrderTaxedPriceChange
     */
    public SetOrderTaxedPriceChange build() {
        Objects.requireNonNull(change, SetOrderTaxedPriceChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetOrderTaxedPriceChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetOrderTaxedPriceChange.class + ": nextValue is missing");
        Objects.requireNonNull(taxMode, SetOrderTaxedPriceChange.class + ": taxMode is missing");
        return new SetOrderTaxedPriceChangeImpl(change, previousValue, nextValue, taxMode);
    }

    /**
     * builds SetOrderTaxedPriceChange without checking for non-null required values
     * @return SetOrderTaxedPriceChange
     */
    public SetOrderTaxedPriceChange buildUnchecked() {
        return new SetOrderTaxedPriceChangeImpl(change, previousValue, nextValue, taxMode);
    }

    /**
     * factory method for an instance of SetOrderTaxedPriceChangeBuilder
     * @return builder
     */
    public static SetOrderTaxedPriceChangeBuilder of() {
        return new SetOrderTaxedPriceChangeBuilder();
    }

    /**
     * create builder for SetOrderTaxedPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetOrderTaxedPriceChangeBuilder of(final SetOrderTaxedPriceChange template) {
        SetOrderTaxedPriceChangeBuilder builder = new SetOrderTaxedPriceChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.taxMode = template.getTaxMode();
        return builder;
    }

}
