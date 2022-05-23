
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderRemoveItemShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderRemoveItemShippingAddressAction orderRemoveItemShippingAddressAction = OrderRemoveItemShippingAddressAction.builder()
 *             .addressKey("{addressKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderRemoveItemShippingAddressActionBuilder implements Builder<OrderRemoveItemShippingAddressAction> {

    private String addressKey;

    /**
     <>
     */

    public OrderRemoveItemShippingAddressActionBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    public String getAddressKey() {
        return this.addressKey;
    }

    public OrderRemoveItemShippingAddressAction build() {
        Objects.requireNonNull(addressKey, OrderRemoveItemShippingAddressAction.class + ": addressKey is missing");
        return new OrderRemoveItemShippingAddressActionImpl(addressKey);
    }

    /**
     * builds OrderRemoveItemShippingAddressAction without checking for non null required values
     */
    public OrderRemoveItemShippingAddressAction buildUnchecked() {
        return new OrderRemoveItemShippingAddressActionImpl(addressKey);
    }

    public static OrderRemoveItemShippingAddressActionBuilder of() {
        return new OrderRemoveItemShippingAddressActionBuilder();
    }

    public static OrderRemoveItemShippingAddressActionBuilder of(final OrderRemoveItemShippingAddressAction template) {
        OrderRemoveItemShippingAddressActionBuilder builder = new OrderRemoveItemShippingAddressActionBuilder();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
