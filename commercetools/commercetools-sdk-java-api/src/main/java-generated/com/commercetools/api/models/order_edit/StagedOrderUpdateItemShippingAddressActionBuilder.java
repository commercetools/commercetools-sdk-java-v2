
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderUpdateItemShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderUpdateItemShippingAddressAction stagedOrderUpdateItemShippingAddressAction = StagedOrderUpdateItemShippingAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderUpdateItemShippingAddressActionBuilder
        implements Builder<StagedOrderUpdateItemShippingAddressAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *  <p>The new Address with the same <code>key</code> as the Address it will replace.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public StagedOrderUpdateItemShippingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The new Address with the same <code>key</code> as the Address it will replace.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public StagedOrderUpdateItemShippingAddressActionBuilder withAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }

    /**
     *  <p>The new Address with the same <code>key</code> as the Address it will replace.</p>
     * @param address value to be set
     * @return Builder
     */

    public StagedOrderUpdateItemShippingAddressActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>The new Address with the same <code>key</code> as the Address it will replace.</p>
     * @return address
     */

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     * builds StagedOrderUpdateItemShippingAddressAction with checking for non-null required values
     * @return StagedOrderUpdateItemShippingAddressAction
     */
    public StagedOrderUpdateItemShippingAddressAction build() {
        Objects.requireNonNull(address, StagedOrderUpdateItemShippingAddressAction.class + ": address is missing");
        return new StagedOrderUpdateItemShippingAddressActionImpl(address);
    }

    /**
     * builds StagedOrderUpdateItemShippingAddressAction without checking for non-null required values
     * @return StagedOrderUpdateItemShippingAddressAction
     */
    public StagedOrderUpdateItemShippingAddressAction buildUnchecked() {
        return new StagedOrderUpdateItemShippingAddressActionImpl(address);
    }

    /**
     * factory method for an instance of StagedOrderUpdateItemShippingAddressActionBuilder
     * @return builder
     */
    public static StagedOrderUpdateItemShippingAddressActionBuilder of() {
        return new StagedOrderUpdateItemShippingAddressActionBuilder();
    }

    /**
     * create builder for StagedOrderUpdateItemShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderUpdateItemShippingAddressActionBuilder of(
            final StagedOrderUpdateItemShippingAddressAction template) {
        StagedOrderUpdateItemShippingAddressActionBuilder builder = new StagedOrderUpdateItemShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
