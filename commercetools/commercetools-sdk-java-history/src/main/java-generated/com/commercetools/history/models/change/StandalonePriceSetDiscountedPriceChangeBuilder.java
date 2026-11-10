
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceSetDiscountedPriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetDiscountedPriceChange standalonePriceSetDiscountedPriceChange = StandalonePriceSetDiscountedPriceChange.builder()
 *             .change("{change}")
 *             .staged(true)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceSetDiscountedPriceChangeBuilder
        implements Builder<StandalonePriceSetDiscountedPriceChange> {

    private String change;

    private Boolean staged;

    private com.commercetools.history.models.common.DiscountedPrice previousValue;

    private com.commercetools.history.models.common.DiscountedPrice nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public StandalonePriceSetDiscountedPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Indicates if the change was applied to the staged or current price.</p>
     * @param staged value to be set
     * @return Builder
     */

    public StandalonePriceSetDiscountedPriceChangeBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public StandalonePriceSetDiscountedPriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.DiscountedPriceBuilder, com.commercetools.history.models.common.DiscountedPriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public StandalonePriceSetDiscountedPriceChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.DiscountedPriceBuilder, com.commercetools.history.models.common.DiscountedPrice> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.DiscountedPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public StandalonePriceSetDiscountedPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.DiscountedPrice previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public StandalonePriceSetDiscountedPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.DiscountedPriceBuilder, com.commercetools.history.models.common.DiscountedPriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public StandalonePriceSetDiscountedPriceChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.DiscountedPriceBuilder, com.commercetools.history.models.common.DiscountedPrice> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.DiscountedPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public StandalonePriceSetDiscountedPriceChangeBuilder nextValue(
            final com.commercetools.history.models.common.DiscountedPrice nextValue) {
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
     *  <p>Indicates if the change was applied to the staged or current price.</p>
     * @return staged
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.DiscountedPrice getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.DiscountedPrice getNextValue() {
        return this.nextValue;
    }

    /**
     * builds StandalonePriceSetDiscountedPriceChange with checking for non-null required values
     * @return StandalonePriceSetDiscountedPriceChange
     */
    public StandalonePriceSetDiscountedPriceChange build() {
        Objects.requireNonNull(change, StandalonePriceSetDiscountedPriceChange.class + ": change is missing");
        Objects.requireNonNull(staged, StandalonePriceSetDiscountedPriceChange.class + ": staged is missing");
        Objects.requireNonNull(previousValue,
            StandalonePriceSetDiscountedPriceChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, StandalonePriceSetDiscountedPriceChange.class + ": nextValue is missing");
        return new StandalonePriceSetDiscountedPriceChangeImpl(change, staged, previousValue, nextValue);
    }

    /**
     * builds StandalonePriceSetDiscountedPriceChange without checking for non-null required values
     * @return StandalonePriceSetDiscountedPriceChange
     */
    public StandalonePriceSetDiscountedPriceChange buildUnchecked() {
        return new StandalonePriceSetDiscountedPriceChangeImpl(change, staged, previousValue, nextValue);
    }

    /**
     * factory method for an instance of StandalonePriceSetDiscountedPriceChangeBuilder
     * @return builder
     */
    public static StandalonePriceSetDiscountedPriceChangeBuilder of() {
        return new StandalonePriceSetDiscountedPriceChangeBuilder();
    }

    /**
     * create builder for StandalonePriceSetDiscountedPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetDiscountedPriceChangeBuilder of(
            final StandalonePriceSetDiscountedPriceChange template) {
        StandalonePriceSetDiscountedPriceChangeBuilder builder = new StandalonePriceSetDiscountedPriceChangeBuilder();
        builder.change = template.getChange();
        builder.staged = template.getStaged();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
