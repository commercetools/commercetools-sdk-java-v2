
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingAddressAction stagedOrderSetShippingAddressAction = StagedOrderSetShippingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetShippingAddressActionBuilder implements Builder<StagedOrderSetShippingAddressAction> {

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public StagedOrderSetShippingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public StagedOrderSetShippingAddressActionBuilder withAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param address value to be set
     * @return Builder
     */

    public StagedOrderSetShippingAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return address
     */

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     * builds StagedOrderSetShippingAddressAction with checking for non-null required values
     * @return StagedOrderSetShippingAddressAction
     */
    public StagedOrderSetShippingAddressAction build() {
        return new StagedOrderSetShippingAddressActionImpl(address);
    }

    /**
     * builds StagedOrderSetShippingAddressAction without checking for non-null required values
     * @return StagedOrderSetShippingAddressAction
     */
    public StagedOrderSetShippingAddressAction buildUnchecked() {
        return new StagedOrderSetShippingAddressActionImpl(address);
    }

    /**
     * factory method for an instance of StagedOrderSetShippingAddressActionBuilder
     * @return builder
     */
    public static StagedOrderSetShippingAddressActionBuilder of() {
        return new StagedOrderSetShippingAddressActionBuilder();
    }

    /**
     * create builder for StagedOrderSetShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetShippingAddressActionBuilder of(final StagedOrderSetShippingAddressAction template) {
        StagedOrderSetShippingAddressActionBuilder builder = new StagedOrderSetShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
