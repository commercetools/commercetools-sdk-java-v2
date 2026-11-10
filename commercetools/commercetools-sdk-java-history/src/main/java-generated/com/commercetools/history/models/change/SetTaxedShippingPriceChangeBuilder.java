
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetTaxedShippingPriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTaxedShippingPriceChange setTaxedShippingPriceChange = SetTaxedShippingPriceChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetTaxedShippingPriceChangeBuilder implements Builder<SetTaxedShippingPriceChange> {

    private String change;

    private com.commercetools.history.models.common.TaxedPrice previousValue;

    private com.commercetools.history.models.common.TaxedPrice nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetTaxedShippingPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetTaxedShippingPriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.TaxedPriceBuilder, com.commercetools.history.models.common.TaxedPriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetTaxedShippingPriceChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.TaxedPriceBuilder, com.commercetools.history.models.common.TaxedPrice> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxedPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetTaxedShippingPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.TaxedPrice previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetTaxedShippingPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TaxedPriceBuilder, com.commercetools.history.models.common.TaxedPriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetTaxedShippingPriceChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.TaxedPriceBuilder, com.commercetools.history.models.common.TaxedPrice> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxedPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetTaxedShippingPriceChangeBuilder nextValue(
            final com.commercetools.history.models.common.TaxedPrice nextValue) {
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
     * builds SetTaxedShippingPriceChange with checking for non-null required values
     * @return SetTaxedShippingPriceChange
     */
    public SetTaxedShippingPriceChange build() {
        Objects.requireNonNull(change, SetTaxedShippingPriceChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetTaxedShippingPriceChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetTaxedShippingPriceChange.class + ": nextValue is missing");
        return new SetTaxedShippingPriceChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetTaxedShippingPriceChange without checking for non-null required values
     * @return SetTaxedShippingPriceChange
     */
    public SetTaxedShippingPriceChange buildUnchecked() {
        return new SetTaxedShippingPriceChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetTaxedShippingPriceChangeBuilder
     * @return builder
     */
    public static SetTaxedShippingPriceChangeBuilder of() {
        return new SetTaxedShippingPriceChangeBuilder();
    }

    /**
     * create builder for SetTaxedShippingPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTaxedShippingPriceChangeBuilder of(final SetTaxedShippingPriceChange template) {
        SetTaxedShippingPriceChangeBuilder builder = new SetTaxedShippingPriceChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
