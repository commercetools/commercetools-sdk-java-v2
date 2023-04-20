
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetShippingMethodChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingMethodChange setShippingMethodChange = SetShippingMethodChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetShippingMethodChangeBuilder implements Builder<SetShippingMethodChange> {

    private String change;

    private com.commercetools.history.models.change_value.ShippingMethodChangeValue nextValue;

    private com.commercetools.history.models.change_value.ShippingMethodChangeValue previousValue;

    /**
     *  <p>Update action for <code>setShippingMethod</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetShippingMethodChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetShippingMethodChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.ShippingMethodChangeValueBuilder, com.commercetools.history.models.change_value.ShippingMethodChangeValueBuilder> builder) {
        this.nextValue = builder
                .apply(com.commercetools.history.models.change_value.ShippingMethodChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetShippingMethodChangeBuilder withNextValue(
            Function<com.commercetools.history.models.change_value.ShippingMethodChangeValueBuilder, com.commercetools.history.models.change_value.ShippingMethodChangeValue> builder) {
        this.nextValue = builder
                .apply(com.commercetools.history.models.change_value.ShippingMethodChangeValueBuilder.of());
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetShippingMethodChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.ShippingMethodChangeValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetShippingMethodChangeBuilder previousValue(
            Function<com.commercetools.history.models.change_value.ShippingMethodChangeValueBuilder, com.commercetools.history.models.change_value.ShippingMethodChangeValueBuilder> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.ShippingMethodChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetShippingMethodChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.change_value.ShippingMethodChangeValueBuilder, com.commercetools.history.models.change_value.ShippingMethodChangeValue> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.ShippingMethodChangeValueBuilder.of());
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetShippingMethodChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.ShippingMethodChangeValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setShippingMethod</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.change_value.ShippingMethodChangeValue getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.change_value.ShippingMethodChangeValue getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetShippingMethodChange with checking for non-null required values
     * @return SetShippingMethodChange
     */
    public SetShippingMethodChange build() {
        Objects.requireNonNull(change, SetShippingMethodChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetShippingMethodChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetShippingMethodChange.class + ": previousValue is missing");
        return new SetShippingMethodChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetShippingMethodChange without checking for non-null required values
     * @return SetShippingMethodChange
     */
    public SetShippingMethodChange buildUnchecked() {
        return new SetShippingMethodChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetShippingMethodChangeBuilder
     * @return builder
     */
    public static SetShippingMethodChangeBuilder of() {
        return new SetShippingMethodChangeBuilder();
    }

    /**
     * create builder for SetShippingMethodChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingMethodChangeBuilder of(final SetShippingMethodChange template) {
        SetShippingMethodChangeBuilder builder = new SetShippingMethodChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
