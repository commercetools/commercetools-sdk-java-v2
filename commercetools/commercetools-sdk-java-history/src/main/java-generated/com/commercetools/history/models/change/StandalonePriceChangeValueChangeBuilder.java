
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceChangeValueChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceChangeValueChange standalonePriceChangeValueChange = StandalonePriceChangeValueChange.builder()
 *             .change("{change}")
 *             .staged(true)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceChangeValueChangeBuilder implements Builder<StandalonePriceChangeValueChange> {

    private String change;

    private Boolean staged;

    private com.commercetools.history.models.common.Money previousValue;

    private com.commercetools.history.models.common.Money nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public StandalonePriceChangeValueChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Indicates if the change was applied to the staged or current price.</p>
     * @param staged value to be set
     * @return Builder
     */

    public StandalonePriceChangeValueChangeBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public StandalonePriceChangeValueChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public StandalonePriceChangeValueChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public StandalonePriceChangeValueChangeBuilder previousValue(
            final com.commercetools.history.models.common.Money previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public StandalonePriceChangeValueChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public StandalonePriceChangeValueChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public StandalonePriceChangeValueChangeBuilder nextValue(
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
     * builds StandalonePriceChangeValueChange with checking for non-null required values
     * @return StandalonePriceChangeValueChange
     */
    public StandalonePriceChangeValueChange build() {
        Objects.requireNonNull(change, StandalonePriceChangeValueChange.class + ": change is missing");
        Objects.requireNonNull(staged, StandalonePriceChangeValueChange.class + ": staged is missing");
        Objects.requireNonNull(previousValue, StandalonePriceChangeValueChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, StandalonePriceChangeValueChange.class + ": nextValue is missing");
        return new StandalonePriceChangeValueChangeImpl(change, staged, previousValue, nextValue);
    }

    /**
     * builds StandalonePriceChangeValueChange without checking for non-null required values
     * @return StandalonePriceChangeValueChange
     */
    public StandalonePriceChangeValueChange buildUnchecked() {
        return new StandalonePriceChangeValueChangeImpl(change, staged, previousValue, nextValue);
    }

    /**
     * factory method for an instance of StandalonePriceChangeValueChangeBuilder
     * @return builder
     */
    public static StandalonePriceChangeValueChangeBuilder of() {
        return new StandalonePriceChangeValueChangeBuilder();
    }

    /**
     * create builder for StandalonePriceChangeValueChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceChangeValueChangeBuilder of(final StandalonePriceChangeValueChange template) {
        StandalonePriceChangeValueChangeBuilder builder = new StandalonePriceChangeValueChangeBuilder();
        builder.change = template.getChange();
        builder.staged = template.getStaged();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
