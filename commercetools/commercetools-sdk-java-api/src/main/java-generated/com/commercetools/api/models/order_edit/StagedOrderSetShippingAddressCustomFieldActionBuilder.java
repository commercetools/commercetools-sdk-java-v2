
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetShippingAddressCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingAddressCustomFieldAction stagedOrderSetShippingAddressCustomFieldAction = StagedOrderSetShippingAddressCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetShippingAddressCustomFieldActionBuilder
        implements Builder<StagedOrderSetShippingAddressCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public StagedOrderSetShippingAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public StagedOrderSetShippingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds StagedOrderSetShippingAddressCustomFieldAction with checking for non-null required values
     * @return StagedOrderSetShippingAddressCustomFieldAction
     */
    public StagedOrderSetShippingAddressCustomFieldAction build() {
        Objects.requireNonNull(name, StagedOrderSetShippingAddressCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetShippingAddressCustomFieldActionImpl(name, value);
    }

    /**
     * builds StagedOrderSetShippingAddressCustomFieldAction without checking for non-null required values
     * @return StagedOrderSetShippingAddressCustomFieldAction
     */
    public StagedOrderSetShippingAddressCustomFieldAction buildUnchecked() {
        return new StagedOrderSetShippingAddressCustomFieldActionImpl(name, value);
    }

    /**
     * factory method for an instance of StagedOrderSetShippingAddressCustomFieldActionBuilder
     * @return builder
     */
    public static StagedOrderSetShippingAddressCustomFieldActionBuilder of() {
        return new StagedOrderSetShippingAddressCustomFieldActionBuilder();
    }

    /**
     * create builder for StagedOrderSetShippingAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetShippingAddressCustomFieldActionBuilder of(
            final StagedOrderSetShippingAddressCustomFieldAction template) {
        StagedOrderSetShippingAddressCustomFieldActionBuilder builder = new StagedOrderSetShippingAddressCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
