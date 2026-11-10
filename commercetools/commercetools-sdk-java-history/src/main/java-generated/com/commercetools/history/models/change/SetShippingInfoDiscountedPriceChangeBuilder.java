
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetShippingInfoDiscountedPriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingInfoDiscountedPriceChange setShippingInfoDiscountedPriceChange = SetShippingInfoDiscountedPriceChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetShippingInfoDiscountedPriceChangeBuilder implements Builder<SetShippingInfoDiscountedPriceChange> {

    private String change;

    private com.commercetools.history.models.common.DiscountedLineItemPrice previousValue;

    private com.commercetools.history.models.common.DiscountedLineItemPrice nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetShippingInfoDiscountedPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetShippingInfoDiscountedPriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetShippingInfoDiscountedPriceChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceBuilder, com.commercetools.history.models.common.DiscountedLineItemPrice> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetShippingInfoDiscountedPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.DiscountedLineItemPrice previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetShippingInfoDiscountedPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetShippingInfoDiscountedPriceChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceBuilder, com.commercetools.history.models.common.DiscountedLineItemPrice> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetShippingInfoDiscountedPriceChangeBuilder nextValue(
            final com.commercetools.history.models.common.DiscountedLineItemPrice nextValue) {
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

    public com.commercetools.history.models.common.DiscountedLineItemPrice getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.DiscountedLineItemPrice getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetShippingInfoDiscountedPriceChange with checking for non-null required values
     * @return SetShippingInfoDiscountedPriceChange
     */
    public SetShippingInfoDiscountedPriceChange build() {
        Objects.requireNonNull(change, SetShippingInfoDiscountedPriceChange.class + ": change is missing");
        Objects.requireNonNull(previousValue,
            SetShippingInfoDiscountedPriceChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetShippingInfoDiscountedPriceChange.class + ": nextValue is missing");
        return new SetShippingInfoDiscountedPriceChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetShippingInfoDiscountedPriceChange without checking for non-null required values
     * @return SetShippingInfoDiscountedPriceChange
     */
    public SetShippingInfoDiscountedPriceChange buildUnchecked() {
        return new SetShippingInfoDiscountedPriceChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetShippingInfoDiscountedPriceChangeBuilder
     * @return builder
     */
    public static SetShippingInfoDiscountedPriceChangeBuilder of() {
        return new SetShippingInfoDiscountedPriceChangeBuilder();
    }

    /**
     * create builder for SetShippingInfoDiscountedPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingInfoDiscountedPriceChangeBuilder of(final SetShippingInfoDiscountedPriceChange template) {
        SetShippingInfoDiscountedPriceChangeBuilder builder = new SetShippingInfoDiscountedPriceChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
