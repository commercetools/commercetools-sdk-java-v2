
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceSetValidFromAndUntilChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetValidFromAndUntilChange standalonePriceSetValidFromAndUntilChange = StandalonePriceSetValidFromAndUntilChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceSetValidFromAndUntilChangeBuilder
        implements Builder<StandalonePriceSetValidFromAndUntilChange> {

    private String change;

    private com.commercetools.history.models.change_value.ValidFromAndUntilValue previousValue;

    private com.commercetools.history.models.change_value.ValidFromAndUntilValue nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public StandalonePriceSetValidFromAndUntilChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public StandalonePriceSetValidFromAndUntilChangeBuilder previousValue(
            Function<com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder, com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public StandalonePriceSetValidFromAndUntilChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder, com.commercetools.history.models.change_value.ValidFromAndUntilValue> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public StandalonePriceSetValidFromAndUntilChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.ValidFromAndUntilValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public StandalonePriceSetValidFromAndUntilChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder, com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public StandalonePriceSetValidFromAndUntilChangeBuilder withNextValue(
            Function<com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder, com.commercetools.history.models.change_value.ValidFromAndUntilValue> builder) {
        this.nextValue = builder
                .apply(com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public StandalonePriceSetValidFromAndUntilChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.ValidFromAndUntilValue nextValue) {
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

    public com.commercetools.history.models.change_value.ValidFromAndUntilValue getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.change_value.ValidFromAndUntilValue getNextValue() {
        return this.nextValue;
    }

    /**
     * builds StandalonePriceSetValidFromAndUntilChange with checking for non-null required values
     * @return StandalonePriceSetValidFromAndUntilChange
     */
    public StandalonePriceSetValidFromAndUntilChange build() {
        Objects.requireNonNull(change, StandalonePriceSetValidFromAndUntilChange.class + ": change is missing");
        Objects.requireNonNull(previousValue,
            StandalonePriceSetValidFromAndUntilChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, StandalonePriceSetValidFromAndUntilChange.class + ": nextValue is missing");
        return new StandalonePriceSetValidFromAndUntilChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds StandalonePriceSetValidFromAndUntilChange without checking for non-null required values
     * @return StandalonePriceSetValidFromAndUntilChange
     */
    public StandalonePriceSetValidFromAndUntilChange buildUnchecked() {
        return new StandalonePriceSetValidFromAndUntilChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of StandalonePriceSetValidFromAndUntilChangeBuilder
     * @return builder
     */
    public static StandalonePriceSetValidFromAndUntilChangeBuilder of() {
        return new StandalonePriceSetValidFromAndUntilChangeBuilder();
    }

    /**
     * create builder for StandalonePriceSetValidFromAndUntilChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetValidFromAndUntilChangeBuilder of(
            final StandalonePriceSetValidFromAndUntilChange template) {
        StandalonePriceSetValidFromAndUntilChangeBuilder builder = new StandalonePriceSetValidFromAndUntilChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
