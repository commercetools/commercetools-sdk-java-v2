
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderAddItemShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderAddItemShippingAddressAction stagedOrderAddItemShippingAddressAction = StagedOrderAddItemShippingAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderAddItemShippingAddressActionBuilder
        implements Builder<StagedOrderAddItemShippingAddressAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *  <p>Address to append to <code>itemShippingAddresses</code>. The new Address must have a <code>key</code> that is unique across this Order.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public StagedOrderAddItemShippingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Address to append to <code>itemShippingAddresses</code>. The new Address must have a <code>key</code> that is unique across this Order.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public StagedOrderAddItemShippingAddressActionBuilder withAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }

    /**
     *  <p>Address to append to <code>itemShippingAddresses</code>. The new Address must have a <code>key</code> that is unique across this Order.</p>
     * @param address value to be set
     * @return Builder
     */

    public StagedOrderAddItemShippingAddressActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Address to append to <code>itemShippingAddresses</code>. The new Address must have a <code>key</code> that is unique across this Order.</p>
     * @return address
     */

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     * builds StagedOrderAddItemShippingAddressAction with checking for non-null required values
     * @return StagedOrderAddItemShippingAddressAction
     */
    public StagedOrderAddItemShippingAddressAction build() {
        Objects.requireNonNull(address, StagedOrderAddItemShippingAddressAction.class + ": address is missing");
        return new StagedOrderAddItemShippingAddressActionImpl(address);
    }

    /**
     * builds StagedOrderAddItemShippingAddressAction without checking for non-null required values
     * @return StagedOrderAddItemShippingAddressAction
     */
    public StagedOrderAddItemShippingAddressAction buildUnchecked() {
        return new StagedOrderAddItemShippingAddressActionImpl(address);
    }

    /**
     * factory method for an instance of StagedOrderAddItemShippingAddressActionBuilder
     * @return builder
     */
    public static StagedOrderAddItemShippingAddressActionBuilder of() {
        return new StagedOrderAddItemShippingAddressActionBuilder();
    }

    /**
     * create builder for StagedOrderAddItemShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderAddItemShippingAddressActionBuilder of(
            final StagedOrderAddItemShippingAddressAction template) {
        StagedOrderAddItemShippingAddressActionBuilder builder = new StagedOrderAddItemShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
