
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetShippingAddressAction orderSetShippingAddressAction = OrderSetShippingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetShippingAddressActionBuilder implements Builder<OrderSetShippingAddressAction> {

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    /**
     <>
     */

    public OrderSetShippingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     <>
     */

    public OrderSetShippingAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public OrderSetShippingAddressAction build() {
        return new OrderSetShippingAddressActionImpl(address);
    }

    /**
     * builds OrderSetShippingAddressAction without checking for non null required values
     */
    public OrderSetShippingAddressAction buildUnchecked() {
        return new OrderSetShippingAddressActionImpl(address);
    }

    public static OrderSetShippingAddressActionBuilder of() {
        return new OrderSetShippingAddressActionBuilder();
    }

    public static OrderSetShippingAddressActionBuilder of(final OrderSetShippingAddressAction template) {
        OrderSetShippingAddressActionBuilder builder = new OrderSetShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
