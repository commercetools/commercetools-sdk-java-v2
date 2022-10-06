
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
     */

    public BusinessUnitSetAddressCustomFieldActionBuilder addressId(final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public BusinessUnitSetAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public BusinessUnitSetAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getAddressId() {
        return this.addressId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public BusinessUnitSetAddressCustomFieldAction build() {
        Objects.requireNonNull(addressId, BusinessUnitSetAddressCustomFieldAction.class + ": addressId is missing");
        Objects.requireNonNull(name, BusinessUnitSetAddressCustomFieldAction.class + ": name is missing");
        return new BusinessUnitSetAddressCustomFieldActionImpl(addressId, name, value);
    }

    /**
     * builds BusinessUnitSetAddressCustomFieldAction without checking for non null required values
     */
    public BusinessUnitSetAddressCustomFieldAction buildUnchecked() {
        return new BusinessUnitSetAddressCustomFieldActionImpl(addressId, name, value);
    }

    public static BusinessUnitSetAddressCustomFieldActionBuilder of() {
        return new BusinessUnitSetAddressCustomFieldActionBuilder();
    }

    public static BusinessUnitSetAddressCustomFieldActionBuilder of(
            final BusinessUnitSetAddressCustomFieldAction template) {
        BusinessUnitSetAddressCustomFieldActionBuilder builder = new BusinessUnitSetAddressCustomFieldActionBuilder();
        builder.addressId = template.getAddressId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
