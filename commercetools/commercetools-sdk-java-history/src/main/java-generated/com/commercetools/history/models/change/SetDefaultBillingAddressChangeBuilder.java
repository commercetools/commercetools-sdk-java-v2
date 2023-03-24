
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDefaultBillingAddressChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDefaultBillingAddressChange setDefaultBillingAddressChange = SetDefaultBillingAddressChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDefaultBillingAddressChangeBuilder implements Builder<SetDefaultBillingAddressChange> {

    private String change;

    private com.commercetools.history.models.common.Address nextValue;

    private com.commercetools.history.models.common.Address previousValue;

    /**
     *  <p>Update action for <code>setDefaultBillingAddress</code> action.</p>
     * @param change value to be set
     * @return Builder
     */

    public SetDefaultBillingAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetDefaultBillingAddressChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public SetDefaultBillingAddressChangeBuilder nextValue(
            final com.commercetools.history.models.common.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetDefaultBillingAddressChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public SetDefaultBillingAddressChangeBuilder previousValue(
            final com.commercetools.history.models.common.Address previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Address getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.Address getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetDefaultBillingAddressChange with checking for non-null required values
     * @return SetDefaultBillingAddressChange
     */
    public SetDefaultBillingAddressChange build() {
        Objects.requireNonNull(change, SetDefaultBillingAddressChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetDefaultBillingAddressChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetDefaultBillingAddressChange.class + ": previousValue is missing");
        return new SetDefaultBillingAddressChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetDefaultBillingAddressChange without checking for non-null required values
     * @return SetDefaultBillingAddressChange
     */
    public SetDefaultBillingAddressChange buildUnchecked() {
        return new SetDefaultBillingAddressChangeImpl(change, nextValue, previousValue);
    }

    public static SetDefaultBillingAddressChangeBuilder of() {
        return new SetDefaultBillingAddressChangeBuilder();
    }

    public static SetDefaultBillingAddressChangeBuilder of(final SetDefaultBillingAddressChange template) {
        SetDefaultBillingAddressChangeBuilder builder = new SetDefaultBillingAddressChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
