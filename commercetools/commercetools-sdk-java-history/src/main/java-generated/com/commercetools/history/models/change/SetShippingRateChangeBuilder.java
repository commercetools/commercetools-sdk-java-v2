
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
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetShippingRateChangeBuilder implements Builder<SetShippingRateChange> {

    private String change;

    private com.commercetools.history.models.common.Money nextValue;

    private com.commercetools.history.models.common.Money previousValue;

    /**
     *  <p>Update action for <code>setShippingRate</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetShippingRateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetShippingRateChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetShippingRateChangeBuilder nextValue(final com.commercetools.history.models.common.Money nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetShippingRateChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetShippingRateChangeBuilder previousValue(
            final com.commercetools.history.models.common.Money previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setShippingRate</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.Money getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.Money getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetShippingRateChange with checking for non-null required values
     * @return SetShippingRateChange
     */
    public SetShippingRateChange build() {
        Objects.requireNonNull(change, SetShippingRateChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetShippingRateChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetShippingRateChange.class + ": previousValue is missing");
        return new SetShippingRateChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetShippingRateChange without checking for non-null required values
     * @return SetShippingRateChange
     */
    public SetShippingRateChange buildUnchecked() {
        return new SetShippingRateChangeImpl(change, nextValue, previousValue);
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
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
