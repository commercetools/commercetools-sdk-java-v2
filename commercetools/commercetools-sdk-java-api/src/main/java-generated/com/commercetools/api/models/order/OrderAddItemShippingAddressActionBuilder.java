
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderAddItemShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderAddItemShippingAddressAction orderAddItemShippingAddressAction = OrderAddItemShippingAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderAddItemShippingAddressActionBuilder implements Builder<OrderAddItemShippingAddressAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public OrderAddItemShippingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param address value to be set
     * @return Builder
     */

    public OrderAddItemShippingAddressActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @return address
     */

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     * builds OrderAddItemShippingAddressAction with checking for non-null required values
     * @return OrderAddItemShippingAddressAction
     */
    public OrderAddItemShippingAddressAction build() {
        Objects.requireNonNull(address, OrderAddItemShippingAddressAction.class + ": address is missing");
        return new OrderAddItemShippingAddressActionImpl(address);
    }

    /**
     * builds OrderAddItemShippingAddressAction without checking for non-null required values
     * @return OrderAddItemShippingAddressAction
     */
    public OrderAddItemShippingAddressAction buildUnchecked() {
        return new OrderAddItemShippingAddressActionImpl(address);
    }

    /**
     * factory method for an instance of OrderAddItemShippingAddressActionBuilder
     * @return builder
     */
    public static OrderAddItemShippingAddressActionBuilder of() {
        return new OrderAddItemShippingAddressActionBuilder();
    }

    /**
     * create builder for OrderAddItemShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderAddItemShippingAddressActionBuilder of(final OrderAddItemShippingAddressAction template) {
        OrderAddItemShippingAddressActionBuilder builder = new OrderAddItemShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
