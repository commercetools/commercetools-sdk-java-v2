
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAddressCustomTypeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAddressCustomTypeChange setAddressCustomTypeChange = SetAddressCustomTypeChange.builder()
 *             .change("{change}")
 *             .address(addressBuilder -> addressBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAddressCustomTypeChangeBuilder implements Builder<SetAddressCustomTypeChange> {

    private String change;

    private com.commercetools.history.models.common.Address address;

    private com.commercetools.history.models.common.CustomFields previousValue;

    private com.commercetools.history.models.common.CustomFields nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetAddressCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> which was extended.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public SetAddressCustomTypeChangeBuilder address(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> which was extended.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public SetAddressCustomTypeChangeBuilder withAddress(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.history.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> which was extended.</p>
     * @param address value to be set
     * @return Builder
     */

    public SetAddressCustomTypeChangeBuilder address(final com.commercetools.history.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetAddressCustomTypeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetAddressCustomTypeChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetAddressCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetAddressCustomTypeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetAddressCustomTypeChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetAddressCustomTypeChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomFields nextValue) {
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> which was extended.</p>
     * @return address
     */

    public com.commercetools.history.models.common.Address getAddress() {
        return this.address;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.CustomFields getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetAddressCustomTypeChange with checking for non-null required values
     * @return SetAddressCustomTypeChange
     */
    public SetAddressCustomTypeChange build() {
        Objects.requireNonNull(change, SetAddressCustomTypeChange.class + ": change is missing");
        Objects.requireNonNull(address, SetAddressCustomTypeChange.class + ": address is missing");
        Objects.requireNonNull(previousValue, SetAddressCustomTypeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetAddressCustomTypeChange.class + ": nextValue is missing");
        return new SetAddressCustomTypeChangeImpl(change, address, previousValue, nextValue);
    }

    /**
     * builds SetAddressCustomTypeChange without checking for non-null required values
     * @return SetAddressCustomTypeChange
     */
    public SetAddressCustomTypeChange buildUnchecked() {
        return new SetAddressCustomTypeChangeImpl(change, address, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetAddressCustomTypeChangeBuilder
     * @return builder
     */
    public static SetAddressCustomTypeChangeBuilder of() {
        return new SetAddressCustomTypeChangeBuilder();
    }

    /**
     * create builder for SetAddressCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAddressCustomTypeChangeBuilder of(final SetAddressCustomTypeChange template) {
        SetAddressCustomTypeChangeBuilder builder = new SetAddressCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.address = template.getAddress();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
