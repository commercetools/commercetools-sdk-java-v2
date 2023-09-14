
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderRemoveItemShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderRemoveItemShippingAddressAction stagedOrderRemoveItemShippingAddressAction = StagedOrderRemoveItemShippingAddressAction.builder()
 *             .addressKey("{addressKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderRemoveItemShippingAddressActionBuilder
        implements Builder<StagedOrderRemoveItemShippingAddressAction> {

    private String addressKey;

    /**
     *  <p><code>key</code> of the Address to remove from <code>itemShippingAddresses</code>.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public StagedOrderRemoveItemShippingAddressActionBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p><code>key</code> of the Address to remove from <code>itemShippingAddresses</code>.</p>
     * @return addressKey
     */

    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     * builds StagedOrderRemoveItemShippingAddressAction with checking for non-null required values
     * @return StagedOrderRemoveItemShippingAddressAction
     */
    public StagedOrderRemoveItemShippingAddressAction build() {
        Objects.requireNonNull(addressKey,
            StagedOrderRemoveItemShippingAddressAction.class + ": addressKey is missing");
        return new StagedOrderRemoveItemShippingAddressActionImpl(addressKey);
    }

    /**
     * builds StagedOrderRemoveItemShippingAddressAction without checking for non-null required values
     * @return StagedOrderRemoveItemShippingAddressAction
     */
    public StagedOrderRemoveItemShippingAddressAction buildUnchecked() {
        return new StagedOrderRemoveItemShippingAddressActionImpl(addressKey);
    }

    /**
     * factory method for an instance of StagedOrderRemoveItemShippingAddressActionBuilder
     * @return builder
     */
    public static StagedOrderRemoveItemShippingAddressActionBuilder of() {
        return new StagedOrderRemoveItemShippingAddressActionBuilder();
    }

    /**
     * create builder for StagedOrderRemoveItemShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderRemoveItemShippingAddressActionBuilder of(
            final StagedOrderRemoveItemShippingAddressAction template) {
        StagedOrderRemoveItemShippingAddressActionBuilder builder = new StagedOrderRemoveItemShippingAddressActionBuilder();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
