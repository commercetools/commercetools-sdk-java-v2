
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetShippingAddressChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingAddressChange setShippingAddressChange = SetShippingAddressChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetShippingAddressChangeBuilder implements Builder<SetShippingAddressChange> {

    private String change;

    private com.commercetools.history.models.common.Address nextValue;

    private com.commercetools.history.models.common.Address previousValue;

    /**
     *  <p>Update action for <code>setShippingAddress</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetShippingAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetShippingAddressChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetShippingAddressChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.Address> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of());
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetShippingAddressChangeBuilder nextValue(final com.commercetools.history.models.common.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetShippingAddressChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetShippingAddressChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.Address> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of());
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetShippingAddressChangeBuilder previousValue(
            final com.commercetools.history.models.common.Address previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setShippingAddress</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.Address getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.Address getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetShippingAddressChange with checking for non-null required values
     * @return SetShippingAddressChange
     */
    public SetShippingAddressChange build() {
        Objects.requireNonNull(change, SetShippingAddressChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetShippingAddressChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetShippingAddressChange.class + ": previousValue is missing");
        return new SetShippingAddressChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetShippingAddressChange without checking for non-null required values
     * @return SetShippingAddressChange
     */
    public SetShippingAddressChange buildUnchecked() {
        return new SetShippingAddressChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetShippingAddressChangeBuilder
     * @return builder
     */
    public static SetShippingAddressChangeBuilder of() {
        return new SetShippingAddressChangeBuilder();
    }

    /**
     * create builder for SetShippingAddressChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingAddressChangeBuilder of(final SetShippingAddressChange template) {
        SetShippingAddressChangeBuilder builder = new SetShippingAddressChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
