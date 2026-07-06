
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetAddressCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetAddressCustomFieldAction customerSetAddressCustomFieldAction = CustomerSetAddressCustomFieldAction.builder()
 *             .addressId("{addressId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetAddressCustomFieldActionBuilder implements Builder<CustomerSetAddressCustomFieldAction> {

    private String addressId;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to be updated.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public CustomerSetAddressCustomFieldActionBuilder addressId(final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public CustomerSetAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. If <code>value</code> is provided, it is set for the field defined by <code>name</code>. Trying to remove a field that does not exist will fail with an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @param value value to be set
     * @return Builder
     */

    public CustomerSetAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to be updated.</p>
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
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. If <code>value</code> is provided, it is set for the field defined by <code>name</code>. Trying to remove a field that does not exist will fail with an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds CustomerSetAddressCustomFieldAction with checking for non-null required values
     * @return CustomerSetAddressCustomFieldAction
     */
    public CustomerSetAddressCustomFieldAction build() {
        Objects.requireNonNull(addressId, CustomerSetAddressCustomFieldAction.class + ": addressId is missing");
        Objects.requireNonNull(name, CustomerSetAddressCustomFieldAction.class + ": name is missing");
        return new CustomerSetAddressCustomFieldActionImpl(addressId, name, value);
    }

    /**
     * builds CustomerSetAddressCustomFieldAction without checking for non-null required values
     * @return CustomerSetAddressCustomFieldAction
     */
    public CustomerSetAddressCustomFieldAction buildUnchecked() {
        return new CustomerSetAddressCustomFieldActionImpl(addressId, name, value);
    }

    /**
     * factory method for an instance of CustomerSetAddressCustomFieldActionBuilder
     * @return builder
     */
    public static CustomerSetAddressCustomFieldActionBuilder of() {
        return new CustomerSetAddressCustomFieldActionBuilder();
    }

    /**
     * create builder for CustomerSetAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetAddressCustomFieldActionBuilder of(final CustomerSetAddressCustomFieldAction template) {
        CustomerSetAddressCustomFieldActionBuilder builder = new CustomerSetAddressCustomFieldActionBuilder();
        builder.addressId = template.getAddressId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
