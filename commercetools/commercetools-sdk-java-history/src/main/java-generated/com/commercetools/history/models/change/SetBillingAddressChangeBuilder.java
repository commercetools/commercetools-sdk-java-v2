
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetBillingAddressChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetBillingAddressChange setBillingAddressChange = SetBillingAddressChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetBillingAddressChangeBuilder implements Builder<SetBillingAddressChange> {

    private String change;

    private com.commercetools.history.models.common.Address nextValue;

    private com.commercetools.history.models.common.Address previousValue;

    /**
     *  <p>Update action for <code>setBillingAddress</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetBillingAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetBillingAddressChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetBillingAddressChangeBuilder nextValue(final com.commercetools.history.models.common.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetBillingAddressChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetBillingAddressChangeBuilder previousValue(
            final com.commercetools.history.models.common.Address previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setBillingAddress</code></p>
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
     * builds SetBillingAddressChange with checking for non-null required values
     * @return SetBillingAddressChange
     */
    public SetBillingAddressChange build() {
        Objects.requireNonNull(change, SetBillingAddressChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetBillingAddressChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetBillingAddressChange.class + ": previousValue is missing");
        return new SetBillingAddressChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetBillingAddressChange without checking for non-null required values
     * @return SetBillingAddressChange
     */
    public SetBillingAddressChange buildUnchecked() {
        return new SetBillingAddressChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetBillingAddressChangeBuilder
     * @return builder
     */
    public static SetBillingAddressChangeBuilder of() {
        return new SetBillingAddressChangeBuilder();
    }

    /**
     * create builder for SetBillingAddressChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetBillingAddressChangeBuilder of(final SetBillingAddressChange template) {
        SetBillingAddressChangeBuilder builder = new SetBillingAddressChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
