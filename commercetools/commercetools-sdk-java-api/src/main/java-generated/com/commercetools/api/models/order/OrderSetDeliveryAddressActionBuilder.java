
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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetDeliveryAddressActionBuilder implements Builder<OrderSetDeliveryAddressAction> {

    @Nullable
    private String deliveryId;

    @Nullable
    private String deliveryKey;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public OrderSetDeliveryAddressActionBuilder deliveryId(@Nullable final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryKey value to be set
     * @return Builder
     */

    public OrderSetDeliveryAddressActionBuilder deliveryKey(@Nullable final String deliveryKey) {
        this.deliveryKey = deliveryKey;
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
     * @param builder function to build the address value
     * @return Builder
     */

    public OrderSetDeliveryAddressActionBuilder withAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
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

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryId
     */

    @Nullable
    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryKey
     */

    @Nullable
    public String getDeliveryKey() {
        return this.deliveryKey;
    }

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @return address
     */

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     * builds OrderSetDeliveryAddressAction with checking for non-null required values
     * @return OrderSetDeliveryAddressAction
     */
    public OrderSetDeliveryAddressAction build() {
        return new OrderSetDeliveryAddressActionImpl(deliveryId, deliveryKey, address);
    }

    /**
     * builds OrderSetDeliveryAddressAction without checking for non-null required values
     * @return OrderSetDeliveryAddressAction
     */
    public OrderSetDeliveryAddressAction buildUnchecked() {
        return new OrderSetDeliveryAddressActionImpl(deliveryId, deliveryKey, address);
    }

    /**
     * factory method for an instance of OrderSetDeliveryAddressActionBuilder
     * @return builder
     */
    public static OrderSetDeliveryAddressActionBuilder of() {
        return new OrderSetDeliveryAddressActionBuilder();
    }

    /**
     * create builder for OrderSetDeliveryAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetDeliveryAddressActionBuilder of(final OrderSetDeliveryAddressAction template) {
        OrderSetDeliveryAddressActionBuilder builder = new OrderSetDeliveryAddressActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.deliveryKey = template.getDeliveryKey();
        builder.address = template.getAddress();
        return builder;
    }

}
