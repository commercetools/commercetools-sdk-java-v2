
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAddressCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAddressCustomFieldChange setAddressCustomFieldChange = SetAddressCustomFieldChange.builder()
 *             .change("{change}")
 *             .address(addressBuilder -> addressBuilder)
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAddressCustomFieldChangeBuilder implements Builder<SetAddressCustomFieldChange> {

    private String change;

    private com.commercetools.history.models.common.Address address;

    private String name;

    private String customTypeId;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetAddressCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Address which was extended.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public SetAddressCustomFieldChangeBuilder address(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Address which was extended.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public SetAddressCustomFieldChangeBuilder withAddress(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.history.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Address which was extended.</p>
     * @param address value to be set
     * @return Builder
     */

    public SetAddressCustomFieldChangeBuilder address(final com.commercetools.history.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public SetAddressCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><code>id</code> of the referenced Type.</p>
     * @param customTypeId value to be set
     * @return Builder
     */

    public SetAddressCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetAddressCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetAddressCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
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
     *  <p>Address which was extended.</p>
     * @return address
     */

    public com.commercetools.history.models.common.Address getAddress() {
        return this.address;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p><code>id</code> of the referenced Type.</p>
     * @return customTypeId
     */

    public String getCustomTypeId() {
        return this.customTypeId;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetAddressCustomFieldChange with checking for non-null required values
     * @return SetAddressCustomFieldChange
     */
    public SetAddressCustomFieldChange build() {
        Objects.requireNonNull(change, SetAddressCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(address, SetAddressCustomFieldChange.class + ": address is missing");
        Objects.requireNonNull(name, SetAddressCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customTypeId, SetAddressCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(previousValue, SetAddressCustomFieldChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetAddressCustomFieldChange.class + ": nextValue is missing");
        return new SetAddressCustomFieldChangeImpl(change, address, name, customTypeId, previousValue, nextValue);
    }

    /**
     * builds SetAddressCustomFieldChange without checking for non-null required values
     * @return SetAddressCustomFieldChange
     */
    public SetAddressCustomFieldChange buildUnchecked() {
        return new SetAddressCustomFieldChangeImpl(change, address, name, customTypeId, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetAddressCustomFieldChangeBuilder
     * @return builder
     */
    public static SetAddressCustomFieldChangeBuilder of() {
        return new SetAddressCustomFieldChangeBuilder();
    }

    /**
     * create builder for SetAddressCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAddressCustomFieldChangeBuilder of(final SetAddressCustomFieldChange template) {
        SetAddressCustomFieldChangeBuilder builder = new SetAddressCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.address = template.getAddress();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
