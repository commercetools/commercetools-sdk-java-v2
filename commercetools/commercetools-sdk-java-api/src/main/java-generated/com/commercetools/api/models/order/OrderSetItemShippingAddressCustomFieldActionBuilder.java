
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetItemShippingAddressCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetItemShippingAddressCustomFieldAction orderSetItemShippingAddressCustomFieldAction = OrderSetItemShippingAddressCustomFieldAction.builder()
 *             .addressKey("{addressKey}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetItemShippingAddressCustomFieldActionBuilder
        implements Builder<OrderSetItemShippingAddressCustomFieldAction> {

    private String addressKey;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> in <code>itemShippingAddresses</code>.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public OrderSetItemShippingAddressCustomFieldActionBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public OrderSetItemShippingAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public OrderSetItemShippingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> in <code>itemShippingAddresses</code>.</p>
     * @return addressKey
     */

    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds OrderSetItemShippingAddressCustomFieldAction with checking for non-null required values
     * @return OrderSetItemShippingAddressCustomFieldAction
     */
    public OrderSetItemShippingAddressCustomFieldAction build() {
        Objects.requireNonNull(addressKey,
            OrderSetItemShippingAddressCustomFieldAction.class + ": addressKey is missing");
        Objects.requireNonNull(name, OrderSetItemShippingAddressCustomFieldAction.class + ": name is missing");
        return new OrderSetItemShippingAddressCustomFieldActionImpl(addressKey, name, value);
    }

    /**
     * builds OrderSetItemShippingAddressCustomFieldAction without checking for non-null required values
     * @return OrderSetItemShippingAddressCustomFieldAction
     */
    public OrderSetItemShippingAddressCustomFieldAction buildUnchecked() {
        return new OrderSetItemShippingAddressCustomFieldActionImpl(addressKey, name, value);
    }

    /**
     * factory method for an instance of OrderSetItemShippingAddressCustomFieldActionBuilder
     * @return builder
     */
    public static OrderSetItemShippingAddressCustomFieldActionBuilder of() {
        return new OrderSetItemShippingAddressCustomFieldActionBuilder();
    }

    /**
     * create builder for OrderSetItemShippingAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetItemShippingAddressCustomFieldActionBuilder of(
            final OrderSetItemShippingAddressCustomFieldAction template) {
        OrderSetItemShippingAddressCustomFieldActionBuilder builder = new OrderSetItemShippingAddressCustomFieldActionBuilder();
        builder.addressKey = template.getAddressKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
