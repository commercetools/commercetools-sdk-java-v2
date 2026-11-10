
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDiscountOnTotalPriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDiscountOnTotalPriceChange setDiscountOnTotalPriceChange = SetDiscountOnTotalPriceChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDiscountOnTotalPriceChangeBuilder implements Builder<SetDiscountOnTotalPriceChange> {

    private String change;

    private com.commercetools.history.models.common.DiscountOnTotalPrice previousValue;

    private com.commercetools.history.models.common.DiscountOnTotalPrice nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetDiscountOnTotalPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetDiscountOnTotalPriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.DiscountOnTotalPriceBuilder, com.commercetools.history.models.common.DiscountOnTotalPriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.DiscountOnTotalPriceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetDiscountOnTotalPriceChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.DiscountOnTotalPriceBuilder, com.commercetools.history.models.common.DiscountOnTotalPrice> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.DiscountOnTotalPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetDiscountOnTotalPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.DiscountOnTotalPrice previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetDiscountOnTotalPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.DiscountOnTotalPriceBuilder, com.commercetools.history.models.common.DiscountOnTotalPriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.DiscountOnTotalPriceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetDiscountOnTotalPriceChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.DiscountOnTotalPriceBuilder, com.commercetools.history.models.common.DiscountOnTotalPrice> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.DiscountOnTotalPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetDiscountOnTotalPriceChangeBuilder nextValue(
            final com.commercetools.history.models.common.DiscountOnTotalPrice nextValue) {
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

    public com.commercetools.history.models.common.DiscountOnTotalPrice getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.DiscountOnTotalPrice getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetDiscountOnTotalPriceChange with checking for non-null required values
     * @return SetDiscountOnTotalPriceChange
     */
    public SetDiscountOnTotalPriceChange build() {
        Objects.requireNonNull(change, SetDiscountOnTotalPriceChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetDiscountOnTotalPriceChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetDiscountOnTotalPriceChange.class + ": nextValue is missing");
        return new SetDiscountOnTotalPriceChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetDiscountOnTotalPriceChange without checking for non-null required values
     * @return SetDiscountOnTotalPriceChange
     */
    public SetDiscountOnTotalPriceChange buildUnchecked() {
        return new SetDiscountOnTotalPriceChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetDiscountOnTotalPriceChangeBuilder
     * @return builder
     */
    public static SetDiscountOnTotalPriceChangeBuilder of() {
        return new SetDiscountOnTotalPriceChangeBuilder();
    }

    /**
     * create builder for SetDiscountOnTotalPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDiscountOnTotalPriceChangeBuilder of(final SetDiscountOnTotalPriceChange template) {
        SetDiscountOnTotalPriceChangeBuilder builder = new SetDiscountOnTotalPriceChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
