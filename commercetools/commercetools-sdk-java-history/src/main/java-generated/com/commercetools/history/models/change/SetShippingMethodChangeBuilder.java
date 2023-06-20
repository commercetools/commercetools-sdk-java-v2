
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
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetShippingMethodChangeBuilder implements Builder<SetShippingMethodChange> {

    private String change;

    private com.commercetools.history.models.change_value.ShippingMethodChangeValue previousValue;

    private com.commercetools.history.models.change_value.ShippingMethodChangeValue nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetShippingMethodChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
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
     *  <p>Value before the change.</p>
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
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetShippingMethodChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.ShippingMethodChangeValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
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
     *  <p>Value after the change.</p>
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
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetShippingMethodChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.ShippingMethodChangeValue nextValue) {
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

    public com.commercetools.history.models.change_value.ShippingMethodChangeValue getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.change_value.ShippingMethodChangeValue getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetShippingMethodChange with checking for non-null required values
     * @return SetShippingMethodChange
     */
    public SetShippingMethodChange build() {
        Objects.requireNonNull(change, SetShippingMethodChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetShippingMethodChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetShippingMethodChange.class + ": nextValue is missing");
        return new SetShippingMethodChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetShippingMethodChange without checking for non-null required values
     * @return SetShippingMethodChange
     */
    public SetShippingMethodChange buildUnchecked() {
        return new SetShippingMethodChangeImpl(change, previousValue, nextValue);
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
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
