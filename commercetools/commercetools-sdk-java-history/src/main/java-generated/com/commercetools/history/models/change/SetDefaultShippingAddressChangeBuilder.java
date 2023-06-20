
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDefaultShippingAddressChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDefaultShippingAddressChange setDefaultShippingAddressChange = SetDefaultShippingAddressChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDefaultShippingAddressChangeBuilder implements Builder<SetDefaultShippingAddressChange> {

    private String change;

    private com.commercetools.history.models.common.Address previousValue;

    private com.commercetools.history.models.common.Address nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetDefaultShippingAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetDefaultShippingAddressChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetDefaultShippingAddressChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.Address> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetDefaultShippingAddressChangeBuilder previousValue(
            final com.commercetools.history.models.common.Address previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetDefaultShippingAddressChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetDefaultShippingAddressChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.Address> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetDefaultShippingAddressChangeBuilder nextValue(
            final com.commercetools.history.models.common.Address nextValue) {
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

    public com.commercetools.history.models.common.Address getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Address getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetDefaultShippingAddressChange with checking for non-null required values
     * @return SetDefaultShippingAddressChange
     */
    public SetDefaultShippingAddressChange build() {
        Objects.requireNonNull(change, SetDefaultShippingAddressChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetDefaultShippingAddressChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetDefaultShippingAddressChange.class + ": nextValue is missing");
        return new SetDefaultShippingAddressChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetDefaultShippingAddressChange without checking for non-null required values
     * @return SetDefaultShippingAddressChange
     */
    public SetDefaultShippingAddressChange buildUnchecked() {
        return new SetDefaultShippingAddressChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetDefaultShippingAddressChangeBuilder
     * @return builder
     */
    public static SetDefaultShippingAddressChangeBuilder of() {
        return new SetDefaultShippingAddressChangeBuilder();
    }

    /**
     * create builder for SetDefaultShippingAddressChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDefaultShippingAddressChangeBuilder of(final SetDefaultShippingAddressChange template) {
        SetDefaultShippingAddressChangeBuilder builder = new SetDefaultShippingAddressChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
