
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetDeliveryAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetDeliveryAddressAction orderSetDeliveryAddressAction = OrderSetDeliveryAddressAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetDeliveryAddressActionBuilder implements Builder<OrderSetDeliveryAddressAction> {

    private String deliveryId;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *
     * @param deliveryId value to be set
     * @return Builder
     */

    public OrderSetDeliveryAddressActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public OrderSetDeliveryAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param address value to be set
     * @return Builder
     */

    public OrderSetDeliveryAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     * builds OrderSetDeliveryAddressAction with checking for non-null required values
     * @return OrderSetDeliveryAddressAction
     */
    public OrderSetDeliveryAddressAction build() {
        Objects.requireNonNull(deliveryId, OrderSetDeliveryAddressAction.class + ": deliveryId is missing");
        return new OrderSetDeliveryAddressActionImpl(deliveryId, address);
    }

    /**
     * builds OrderSetDeliveryAddressAction without checking for non-null required values
     * @return OrderSetDeliveryAddressAction
     */
    public OrderSetDeliveryAddressAction buildUnchecked() {
        return new OrderSetDeliveryAddressActionImpl(deliveryId, address);
    }

    public static OrderSetDeliveryAddressActionBuilder of() {
        return new OrderSetDeliveryAddressActionBuilder();
    }

    public static OrderSetDeliveryAddressActionBuilder of(final OrderSetDeliveryAddressAction template) {
        OrderSetDeliveryAddressActionBuilder builder = new OrderSetDeliveryAddressActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.address = template.getAddress();
        return builder;
    }

}
