
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetItemShippingAddressCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetItemShippingAddressCustomFieldChange setItemShippingAddressCustomFieldChange = SetItemShippingAddressCustomFieldChange.builder()
 *             .change("{change}")
 *             .addressId("{addressId}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetItemShippingAddressCustomFieldChangeBuilder
        implements Builder<SetItemShippingAddressCustomFieldChange> {

    private String change;

    private String addressId;

    private String name;

    private String customTypeId;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetItemShippingAddressCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a>.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public SetItemShippingAddressCustomFieldChangeBuilder addressId(final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public SetItemShippingAddressCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     * @return Builder
     */

    public SetItemShippingAddressCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetItemShippingAddressCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetItemShippingAddressCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
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
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a>.</p>
     * @return addressId
     */

    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
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
     * builds SetItemShippingAddressCustomFieldChange with checking for non-null required values
     * @return SetItemShippingAddressCustomFieldChange
     */
    public SetItemShippingAddressCustomFieldChange build() {
        Objects.requireNonNull(change, SetItemShippingAddressCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(addressId, SetItemShippingAddressCustomFieldChange.class + ": addressId is missing");
        Objects.requireNonNull(name, SetItemShippingAddressCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customTypeId,
            SetItemShippingAddressCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(previousValue,
            SetItemShippingAddressCustomFieldChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetItemShippingAddressCustomFieldChange.class + ": nextValue is missing");
        return new SetItemShippingAddressCustomFieldChangeImpl(change, addressId, name, customTypeId, previousValue,
            nextValue);
    }

    /**
     * builds SetItemShippingAddressCustomFieldChange without checking for non-null required values
     * @return SetItemShippingAddressCustomFieldChange
     */
    public SetItemShippingAddressCustomFieldChange buildUnchecked() {
        return new SetItemShippingAddressCustomFieldChangeImpl(change, addressId, name, customTypeId, previousValue,
            nextValue);
    }

    /**
     * factory method for an instance of SetItemShippingAddressCustomFieldChangeBuilder
     * @return builder
     */
    public static SetItemShippingAddressCustomFieldChangeBuilder of() {
        return new SetItemShippingAddressCustomFieldChangeBuilder();
    }

    /**
     * create builder for SetItemShippingAddressCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetItemShippingAddressCustomFieldChangeBuilder of(
            final SetItemShippingAddressCustomFieldChange template) {
        SetItemShippingAddressCustomFieldChangeBuilder builder = new SetItemShippingAddressCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.addressId = template.getAddressId();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
