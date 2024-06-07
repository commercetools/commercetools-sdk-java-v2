
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetShippingCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetShippingCustomFieldAction orderSetShippingCustomFieldAction = OrderSetShippingCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetShippingCustomFieldActionBuilder implements Builder<OrderSetShippingCustomFieldAction> {

    @Nullable
    private String shippingKey;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>The <code>shippingKey</code> of the Shipping to customize. Used to specify which Shipping Method to customize on a Order with <code>Multiple</code> ShippingMode. Leave this empty to customize the one and only ShippingMethod on a <code>Single</code> ShippingMode Order.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public OrderSetShippingCustomFieldActionBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public OrderSetShippingCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public OrderSetShippingCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>The <code>shippingKey</code> of the Shipping to customize. Used to specify which Shipping Method to customize on a Order with <code>Multiple</code> ShippingMode. Leave this empty to customize the one and only ShippingMethod on a <code>Single</code> ShippingMode Order.</p>
     * @return shippingKey
     */

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
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
     * builds OrderSetShippingCustomFieldAction with checking for non-null required values
     * @return OrderSetShippingCustomFieldAction
     */
    public OrderSetShippingCustomFieldAction build() {
        Objects.requireNonNull(name, OrderSetShippingCustomFieldAction.class + ": name is missing");
        return new OrderSetShippingCustomFieldActionImpl(shippingKey, name, value);
    }

    /**
     * builds OrderSetShippingCustomFieldAction without checking for non-null required values
     * @return OrderSetShippingCustomFieldAction
     */
    public OrderSetShippingCustomFieldAction buildUnchecked() {
        return new OrderSetShippingCustomFieldActionImpl(shippingKey, name, value);
    }

    /**
     * factory method for an instance of OrderSetShippingCustomFieldActionBuilder
     * @return builder
     */
    public static OrderSetShippingCustomFieldActionBuilder of() {
        return new OrderSetShippingCustomFieldActionBuilder();
    }

    /**
     * create builder for OrderSetShippingCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetShippingCustomFieldActionBuilder of(final OrderSetShippingCustomFieldAction template) {
        OrderSetShippingCustomFieldActionBuilder builder = new OrderSetShippingCustomFieldActionBuilder();
        builder.shippingKey = template.getShippingKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
