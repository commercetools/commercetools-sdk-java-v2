
package com.commercetools.api.models.business_unit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitSetAddressCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetAddressCustomFieldAction businessUnitSetAddressCustomFieldAction = BusinessUnitSetAddressCustomFieldAction.builder()
 *             .addressId("{addressId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitSetAddressCustomFieldActionBuilder
        implements Builder<BusinessUnitSetAddressCustomFieldAction> {

    private String addressId;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>ID of the address to be extended.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public BusinessUnitSetAddressCustomFieldActionBuilder addressId(final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public BusinessUnitSetAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public BusinessUnitSetAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>ID of the address to be extended.</p>
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
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds BusinessUnitSetAddressCustomFieldAction with checking for non-null required values
     * @return BusinessUnitSetAddressCustomFieldAction
     */
    public BusinessUnitSetAddressCustomFieldAction build() {
        Objects.requireNonNull(addressId, BusinessUnitSetAddressCustomFieldAction.class + ": addressId is missing");
        Objects.requireNonNull(name, BusinessUnitSetAddressCustomFieldAction.class + ": name is missing");
        return new BusinessUnitSetAddressCustomFieldActionImpl(addressId, name, value);
    }

    /**
     * builds BusinessUnitSetAddressCustomFieldAction without checking for non-null required values
     * @return BusinessUnitSetAddressCustomFieldAction
     */
    public BusinessUnitSetAddressCustomFieldAction buildUnchecked() {
        return new BusinessUnitSetAddressCustomFieldActionImpl(addressId, name, value);
    }

    /**
     * factory method for an instance of BusinessUnitSetAddressCustomFieldActionBuilder
     * @return builder
     */
    public static BusinessUnitSetAddressCustomFieldActionBuilder of() {
        return new BusinessUnitSetAddressCustomFieldActionBuilder();
    }

    /**
     * create builder for BusinessUnitSetAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSetAddressCustomFieldActionBuilder of(
            final BusinessUnitSetAddressCustomFieldAction template) {
        BusinessUnitSetAddressCustomFieldActionBuilder builder = new BusinessUnitSetAddressCustomFieldActionBuilder();
        builder.addressId = template.getAddressId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
