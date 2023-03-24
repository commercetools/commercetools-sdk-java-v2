
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetShippingAddressCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetShippingAddressCustomFieldAction orderSetShippingAddressCustomFieldAction = OrderSetShippingAddressCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetShippingAddressCustomFieldActionBuilder
        implements Builder<OrderSetShippingAddressCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public OrderSetShippingAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public OrderSetShippingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds OrderSetShippingAddressCustomFieldAction with checking for non-null required values
     * @return OrderSetShippingAddressCustomFieldAction
     */
    public OrderSetShippingAddressCustomFieldAction build() {
        Objects.requireNonNull(name, OrderSetShippingAddressCustomFieldAction.class + ": name is missing");
        return new OrderSetShippingAddressCustomFieldActionImpl(name, value);
    }

    /**
     * builds OrderSetShippingAddressCustomFieldAction without checking for non-null required values
     * @return OrderSetShippingAddressCustomFieldAction
     */
    public OrderSetShippingAddressCustomFieldAction buildUnchecked() {
        return new OrderSetShippingAddressCustomFieldActionImpl(name, value);
    }

    public static OrderSetShippingAddressCustomFieldActionBuilder of() {
        return new OrderSetShippingAddressCustomFieldActionBuilder();
    }

    public static OrderSetShippingAddressCustomFieldActionBuilder of(
            final OrderSetShippingAddressCustomFieldAction template) {
        OrderSetShippingAddressCustomFieldActionBuilder builder = new OrderSetShippingAddressCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
