
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetShippingInfoTaxedPriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingInfoTaxedPriceChange setShippingInfoTaxedPriceChange = SetShippingInfoTaxedPriceChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetShippingInfoTaxedPriceChangeBuilder implements Builder<SetShippingInfoTaxedPriceChange> {

    private String change;

    private com.commercetools.history.models.common.TaxedItemPrice previousValue;

    private com.commercetools.history.models.common.TaxedItemPrice nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetShippingInfoTaxedPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetShippingInfoTaxedPriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetShippingInfoTaxedPriceChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPrice> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetShippingInfoTaxedPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.TaxedItemPrice previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetShippingInfoTaxedPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetShippingInfoTaxedPriceChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPrice> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetShippingInfoTaxedPriceChangeBuilder nextValue(
            final com.commercetools.history.models.common.TaxedItemPrice nextValue) {
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

    public com.commercetools.history.models.common.TaxedItemPrice getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.TaxedItemPrice getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetShippingInfoTaxedPriceChange with checking for non-null required values
     * @return SetShippingInfoTaxedPriceChange
     */
    public SetShippingInfoTaxedPriceChange build() {
        Objects.requireNonNull(change, SetShippingInfoTaxedPriceChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetShippingInfoTaxedPriceChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetShippingInfoTaxedPriceChange.class + ": nextValue is missing");
        return new SetShippingInfoTaxedPriceChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetShippingInfoTaxedPriceChange without checking for non-null required values
     * @return SetShippingInfoTaxedPriceChange
     */
    public SetShippingInfoTaxedPriceChange buildUnchecked() {
        return new SetShippingInfoTaxedPriceChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetShippingInfoTaxedPriceChangeBuilder
     * @return builder
     */
    public static SetShippingInfoTaxedPriceChangeBuilder of() {
        return new SetShippingInfoTaxedPriceChangeBuilder();
    }

    /**
     * create builder for SetShippingInfoTaxedPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingInfoTaxedPriceChangeBuilder of(final SetShippingInfoTaxedPriceChange template) {
        SetShippingInfoTaxedPriceChangeBuilder builder = new SetShippingInfoTaxedPriceChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
