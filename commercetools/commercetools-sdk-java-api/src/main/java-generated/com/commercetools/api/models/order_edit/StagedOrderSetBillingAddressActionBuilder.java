
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetBillingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetBillingAddressAction stagedOrderSetBillingAddressAction = StagedOrderSetBillingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetBillingAddressActionBuilder implements Builder<StagedOrderSetBillingAddressAction> {

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public StagedOrderSetBillingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param address value to be set
     * @return Builder
     */

    public StagedOrderSetBillingAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     * builds StagedOrderSetBillingAddressAction with checking for non-null required values
     * @return StagedOrderSetBillingAddressAction
     */
    public StagedOrderSetBillingAddressAction build() {
        return new StagedOrderSetBillingAddressActionImpl(address);
    }

    /**
     * builds StagedOrderSetBillingAddressAction without checking for non-null required values
     * @return StagedOrderSetBillingAddressAction
     */
    public StagedOrderSetBillingAddressAction buildUnchecked() {
        return new StagedOrderSetBillingAddressActionImpl(address);
    }

    public static StagedOrderSetBillingAddressActionBuilder of() {
        return new StagedOrderSetBillingAddressActionBuilder();
    }

    public static StagedOrderSetBillingAddressActionBuilder of(final StagedOrderSetBillingAddressAction template) {
        StagedOrderSetBillingAddressActionBuilder builder = new StagedOrderSetBillingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
