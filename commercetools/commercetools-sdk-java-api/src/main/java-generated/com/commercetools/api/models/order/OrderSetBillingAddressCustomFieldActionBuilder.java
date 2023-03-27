
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetBillingAddressCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetBillingAddressCustomFieldAction orderSetBillingAddressCustomFieldAction = OrderSetBillingAddressCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetBillingAddressCustomFieldActionBuilder
        implements Builder<OrderSetBillingAddressCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public OrderSetBillingAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public OrderSetBillingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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
     * builds OrderSetBillingAddressCustomFieldAction with checking for non-null required values
     * @return OrderSetBillingAddressCustomFieldAction
     */
    public OrderSetBillingAddressCustomFieldAction build() {
        Objects.requireNonNull(name, OrderSetBillingAddressCustomFieldAction.class + ": name is missing");
        return new OrderSetBillingAddressCustomFieldActionImpl(name, value);
    }

    /**
     * builds OrderSetBillingAddressCustomFieldAction without checking for non-null required values
     * @return OrderSetBillingAddressCustomFieldAction
     */
    public OrderSetBillingAddressCustomFieldAction buildUnchecked() {
        return new OrderSetBillingAddressCustomFieldActionImpl(name, value);
    }

    /**
     * factory method for an instance of OrderSetBillingAddressCustomFieldActionBuilder
     * @return builder
     */
    public static OrderSetBillingAddressCustomFieldActionBuilder of() {
        return new OrderSetBillingAddressCustomFieldActionBuilder();
    }

    /**
     * create builder for OrderSetBillingAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetBillingAddressCustomFieldActionBuilder of(
            final OrderSetBillingAddressCustomFieldAction template) {
        OrderSetBillingAddressCustomFieldActionBuilder builder = new OrderSetBillingAddressCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
