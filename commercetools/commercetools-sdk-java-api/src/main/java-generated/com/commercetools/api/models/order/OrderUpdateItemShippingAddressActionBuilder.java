
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderUpdateItemShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderUpdateItemShippingAddressAction orderUpdateItemShippingAddressAction = OrderUpdateItemShippingAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderUpdateItemShippingAddressActionBuilder implements Builder<OrderUpdateItemShippingAddressAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *
     */

    public OrderUpdateItemShippingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public OrderUpdateItemShippingAddressActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public OrderUpdateItemShippingAddressAction build() {
        Objects.requireNonNull(address, OrderUpdateItemShippingAddressAction.class + ": address is missing");
        return new OrderUpdateItemShippingAddressActionImpl(address);
    }

    /**
     * builds OrderUpdateItemShippingAddressAction without checking for non null required values
     */
    public OrderUpdateItemShippingAddressAction buildUnchecked() {
        return new OrderUpdateItemShippingAddressActionImpl(address);
    }

    public static OrderUpdateItemShippingAddressActionBuilder of() {
        return new OrderUpdateItemShippingAddressActionBuilder();
    }

    public static OrderUpdateItemShippingAddressActionBuilder of(final OrderUpdateItemShippingAddressAction template) {
        OrderUpdateItemShippingAddressActionBuilder builder = new OrderUpdateItemShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
