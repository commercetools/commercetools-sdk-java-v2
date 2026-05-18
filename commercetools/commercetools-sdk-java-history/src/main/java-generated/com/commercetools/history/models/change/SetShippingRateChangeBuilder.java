
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetShippingRateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingRateChange setShippingRateChange = SetShippingRateChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetShippingRateChangeBuilder implements Builder<SetShippingRateChange> {

    private String change;

    private com.commercetools.history.models.common.ShippingRate previousValue;

    private com.commercetools.history.models.common.ShippingRate nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetShippingRateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetShippingRateChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ShippingRateBuilder, com.commercetools.history.models.common.ShippingRateBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ShippingRateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetShippingRateChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ShippingRateBuilder, com.commercetools.history.models.common.ShippingRate> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ShippingRateBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetShippingRateChangeBuilder previousValue(
            final com.commercetools.history.models.common.ShippingRate previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetShippingRateChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ShippingRateBuilder, com.commercetools.history.models.common.ShippingRateBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ShippingRateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetShippingRateChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ShippingRateBuilder, com.commercetools.history.models.common.ShippingRate> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ShippingRateBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetShippingRateChangeBuilder nextValue(
            final com.commercetools.history.models.common.ShippingRate nextValue) {
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

    public com.commercetools.history.models.common.ShippingRate getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.ShippingRate getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetShippingRateChange with checking for non-null required values
     * @return SetShippingRateChange
     */
    public SetShippingRateChange build() {
        Objects.requireNonNull(change, SetShippingRateChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetShippingRateChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetShippingRateChange.class + ": nextValue is missing");
        return new SetShippingRateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetShippingRateChange without checking for non-null required values
     * @return SetShippingRateChange
     */
    public SetShippingRateChange buildUnchecked() {
        return new SetShippingRateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetShippingRateChangeBuilder
     * @return builder
     */
    public static SetShippingRateChangeBuilder of() {
        return new SetShippingRateChangeBuilder();
    }

    /**
     * create builder for SetShippingRateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingRateChangeBuilder of(final SetShippingRateChange template) {
        SetShippingRateChangeBuilder builder = new SetShippingRateChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
