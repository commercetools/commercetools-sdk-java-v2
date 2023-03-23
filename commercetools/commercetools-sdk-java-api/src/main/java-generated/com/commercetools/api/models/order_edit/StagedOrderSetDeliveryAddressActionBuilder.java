
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetDeliveryAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetDeliveryAddressAction stagedOrderSetDeliveryAddressAction = StagedOrderSetDeliveryAddressAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetDeliveryAddressActionBuilder implements Builder<StagedOrderSetDeliveryAddressAction> {

    private String deliveryId;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *
     * @param deliveryId
     * @return Builder
     */

    public StagedOrderSetDeliveryAddressActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @return Builder
     */

    public StagedOrderSetDeliveryAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param address
     * @return Builder
     */

    public StagedOrderSetDeliveryAddressActionBuilder address(
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

    public StagedOrderSetDeliveryAddressAction build() {
        Objects.requireNonNull(deliveryId, StagedOrderSetDeliveryAddressAction.class + ": deliveryId is missing");
        return new StagedOrderSetDeliveryAddressActionImpl(deliveryId, address);
    }

    /**
     * builds StagedOrderSetDeliveryAddressAction without checking for non null required values
     */
    public StagedOrderSetDeliveryAddressAction buildUnchecked() {
        return new StagedOrderSetDeliveryAddressActionImpl(deliveryId, address);
    }

    public static StagedOrderSetDeliveryAddressActionBuilder of() {
        return new StagedOrderSetDeliveryAddressActionBuilder();
    }

    public static StagedOrderSetDeliveryAddressActionBuilder of(final StagedOrderSetDeliveryAddressAction template) {
        StagedOrderSetDeliveryAddressActionBuilder builder = new StagedOrderSetDeliveryAddressActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.address = template.getAddress();
        return builder;
    }

}
