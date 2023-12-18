
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddAddressChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddAddressChange addAddressChange = AddAddressChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddAddressChangeBuilder implements Builder<AddAddressChange> {

    private String change;

    private com.commercetools.history.models.common.Address nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddAddressChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddAddressChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.Address> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddAddressChangeBuilder nextValue(final com.commercetools.history.models.common.Address nextValue) {
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
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Address getNextValue() {
        return this.nextValue;
    }

    /**
     * builds AddAddressChange with checking for non-null required values
     * @return AddAddressChange
     */
    public AddAddressChange build() {
        Objects.requireNonNull(change, AddAddressChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddAddressChange.class + ": nextValue is missing");
        return new AddAddressChangeImpl(change, nextValue);
    }

    /**
     * builds AddAddressChange without checking for non-null required values
     * @return AddAddressChange
     */
    public AddAddressChange buildUnchecked() {
        return new AddAddressChangeImpl(change, nextValue);
    }

    /**
     * factory method for an instance of AddAddressChangeBuilder
     * @return builder
     */
    public static AddAddressChangeBuilder of() {
        return new AddAddressChangeBuilder();
    }

    /**
     * create builder for AddAddressChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddAddressChangeBuilder of(final AddAddressChange template) {
        AddAddressChangeBuilder builder = new AddAddressChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
