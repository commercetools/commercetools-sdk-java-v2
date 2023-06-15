
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddBillingAddressIdChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddBillingAddressIdChange addBillingAddressIdChange = AddBillingAddressIdChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddBillingAddressIdChangeBuilder implements Builder<AddBillingAddressIdChange> {

    private String change;

    private java.util.List<String> previousValue;

    private java.util.List<String> nextValue;

    private com.commercetools.history.models.common.Address address;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddBillingAddressIdChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public AddBillingAddressIdChangeBuilder previousValue(final String... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public AddBillingAddressIdChangeBuilder previousValue(final java.util.List<String> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public AddBillingAddressIdChangeBuilder plusPreviousValue(final String... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddBillingAddressIdChangeBuilder nextValue(final String... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddBillingAddressIdChangeBuilder nextValue(final java.util.List<String> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddBillingAddressIdChangeBuilder plusNextValue(final String... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Address added to <code>billingAddressIds</code>.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public AddBillingAddressIdChangeBuilder address(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Address added to <code>billingAddressIds</code>.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public AddBillingAddressIdChangeBuilder withAddress(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.history.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Address added to <code>billingAddressIds</code>.</p>
     * @param address value to be set
     * @return Builder
     */

    public AddBillingAddressIdChangeBuilder address(final com.commercetools.history.models.common.Address address) {
        this.address = address;
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

    public java.util.List<String> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<String> getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Address added to <code>billingAddressIds</code>.</p>
     * @return address
     */

    public com.commercetools.history.models.common.Address getAddress() {
        return this.address;
    }

    /**
     * builds AddBillingAddressIdChange with checking for non-null required values
     * @return AddBillingAddressIdChange
     */
    public AddBillingAddressIdChange build() {
        Objects.requireNonNull(change, AddBillingAddressIdChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, AddBillingAddressIdChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, AddBillingAddressIdChange.class + ": nextValue is missing");
        Objects.requireNonNull(address, AddBillingAddressIdChange.class + ": address is missing");
        return new AddBillingAddressIdChangeImpl(change, previousValue, nextValue, address);
    }

    /**
     * builds AddBillingAddressIdChange without checking for non-null required values
     * @return AddBillingAddressIdChange
     */
    public AddBillingAddressIdChange buildUnchecked() {
        return new AddBillingAddressIdChangeImpl(change, previousValue, nextValue, address);
    }

    /**
     * factory method for an instance of AddBillingAddressIdChangeBuilder
     * @return builder
     */
    public static AddBillingAddressIdChangeBuilder of() {
        return new AddBillingAddressIdChangeBuilder();
    }

    /**
     * create builder for AddBillingAddressIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddBillingAddressIdChangeBuilder of(final AddBillingAddressIdChange template) {
        AddBillingAddressIdChangeBuilder builder = new AddBillingAddressIdChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.address = template.getAddress();
        return builder;
    }

}
