
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
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDefaultShippingAddressChangeBuilder implements Builder<SetDefaultShippingAddressChange> {

    private String change;

    private com.commercetools.history.models.common.Address nextValue;

    private com.commercetools.history.models.common.Address previousValue;

    /**
     *  <p>Update action for <code>setDefaultShippingAddress</code> action.</p>
     * @param change value to be set
     * @return Builder
     */

    public SetDefaultShippingAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetDefaultShippingAddressChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetDefaultShippingAddressChangeBuilder nextValue(
            final com.commercetools.history.models.common.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetDefaultShippingAddressChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetDefaultShippingAddressChangeBuilder previousValue(
            final com.commercetools.history.models.common.Address previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setDefaultShippingAddress</code> action.</p>
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
     * builds SetDefaultShippingAddressChange with checking for non-null required values
     * @return SetDefaultShippingAddressChange
     */
    public SetDefaultShippingAddressChange build() {
        Objects.requireNonNull(change, SetDefaultShippingAddressChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetDefaultShippingAddressChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetDefaultShippingAddressChange.class + ": previousValue is missing");
        return new SetDefaultShippingAddressChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetDefaultShippingAddressChange without checking for non-null required values
     * @return SetDefaultShippingAddressChange
     */
    public SetDefaultShippingAddressChange buildUnchecked() {
        return new SetDefaultShippingAddressChangeImpl(change, nextValue, previousValue);
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
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
