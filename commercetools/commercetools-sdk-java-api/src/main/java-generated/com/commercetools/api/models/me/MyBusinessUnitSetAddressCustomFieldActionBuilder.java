
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitSetAddressCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitSetAddressCustomFieldAction myBusinessUnitSetAddressCustomFieldAction = MyBusinessUnitSetAddressCustomFieldAction.builder()
 *             .addressId("{addressId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitSetAddressCustomFieldActionBuilder
        implements Builder<MyBusinessUnitSetAddressCustomFieldAction> {

    private String addressId;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>ID of the <code>address</code> to be extended.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public MyBusinessUnitSetAddressCustomFieldActionBuilder addressId(final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public MyBusinessUnitSetAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public MyBusinessUnitSetAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>ID of the <code>address</code> to be extended.</p>
     * @return addressId
     */

    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds MyBusinessUnitSetAddressCustomFieldAction with checking for non-null required values
     * @return MyBusinessUnitSetAddressCustomFieldAction
     */
    public MyBusinessUnitSetAddressCustomFieldAction build() {
        Objects.requireNonNull(addressId, MyBusinessUnitSetAddressCustomFieldAction.class + ": addressId is missing");
        Objects.requireNonNull(name, MyBusinessUnitSetAddressCustomFieldAction.class + ": name is missing");
        return new MyBusinessUnitSetAddressCustomFieldActionImpl(addressId, name, value);
    }

    /**
     * builds MyBusinessUnitSetAddressCustomFieldAction without checking for non-null required values
     * @return MyBusinessUnitSetAddressCustomFieldAction
     */
    public MyBusinessUnitSetAddressCustomFieldAction buildUnchecked() {
        return new MyBusinessUnitSetAddressCustomFieldActionImpl(addressId, name, value);
    }

    /**
     * factory method for an instance of MyBusinessUnitSetAddressCustomFieldActionBuilder
     * @return builder
     */
    public static MyBusinessUnitSetAddressCustomFieldActionBuilder of() {
        return new MyBusinessUnitSetAddressCustomFieldActionBuilder();
    }

    /**
     * create builder for MyBusinessUnitSetAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitSetAddressCustomFieldActionBuilder of(
            final MyBusinessUnitSetAddressCustomFieldAction template) {
        MyBusinessUnitSetAddressCustomFieldActionBuilder builder = new MyBusinessUnitSetAddressCustomFieldActionBuilder();
        builder.addressId = template.getAddressId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
