
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomShippingMethodChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomShippingMethodChange setCustomShippingMethodChange = SetCustomShippingMethodChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomShippingMethodChangeBuilder implements Builder<SetCustomShippingMethodChange> {

    private String change;

    private com.commercetools.history.models.change_value.CustomShippingMethodChangeValue previousValue;

    private com.commercetools.history.models.change_value.CustomShippingMethodChangeValue nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetCustomShippingMethodChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetCustomShippingMethodChangeBuilder previousValue(
            Function<com.commercetools.history.models.change_value.CustomShippingMethodChangeValueBuilder, com.commercetools.history.models.change_value.CustomShippingMethodChangeValueBuilder> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.CustomShippingMethodChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetCustomShippingMethodChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.change_value.CustomShippingMethodChangeValueBuilder, com.commercetools.history.models.change_value.CustomShippingMethodChangeValue> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.CustomShippingMethodChangeValueBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCustomShippingMethodChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.CustomShippingMethodChangeValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCustomShippingMethodChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.CustomShippingMethodChangeValueBuilder, com.commercetools.history.models.change_value.CustomShippingMethodChangeValueBuilder> builder) {
        this.nextValue = builder
                .apply(com.commercetools.history.models.change_value.CustomShippingMethodChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCustomShippingMethodChangeBuilder withNextValue(
            Function<com.commercetools.history.models.change_value.CustomShippingMethodChangeValueBuilder, com.commercetools.history.models.change_value.CustomShippingMethodChangeValue> builder) {
        this.nextValue = builder
                .apply(com.commercetools.history.models.change_value.CustomShippingMethodChangeValueBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCustomShippingMethodChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.CustomShippingMethodChangeValue nextValue) {
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

    public com.commercetools.history.models.change_value.CustomShippingMethodChangeValue getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.change_value.CustomShippingMethodChangeValue getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetCustomShippingMethodChange with checking for non-null required values
     * @return SetCustomShippingMethodChange
     */
    public SetCustomShippingMethodChange build() {
        Objects.requireNonNull(change, SetCustomShippingMethodChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetCustomShippingMethodChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCustomShippingMethodChange.class + ": nextValue is missing");
        return new SetCustomShippingMethodChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetCustomShippingMethodChange without checking for non-null required values
     * @return SetCustomShippingMethodChange
     */
    public SetCustomShippingMethodChange buildUnchecked() {
        return new SetCustomShippingMethodChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetCustomShippingMethodChangeBuilder
     * @return builder
     */
    public static SetCustomShippingMethodChangeBuilder of() {
        return new SetCustomShippingMethodChangeBuilder();
    }

    /**
     * create builder for SetCustomShippingMethodChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomShippingMethodChangeBuilder of(final SetCustomShippingMethodChange template) {
        SetCustomShippingMethodChangeBuilder builder = new SetCustomShippingMethodChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
