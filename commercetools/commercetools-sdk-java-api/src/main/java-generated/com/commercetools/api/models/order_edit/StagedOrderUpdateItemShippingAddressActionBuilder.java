
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderUpdateItemShippingAddressActionBuilder
        implements Builder<StagedOrderUpdateItemShippingAddressAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    public StagedOrderUpdateItemShippingAddressActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public StagedOrderUpdateItemShippingAddressAction build() {
        Objects.requireNonNull(address);
        return new StagedOrderUpdateItemShippingAddressActionImpl(address);
    }

    /**
     * builds StagedOrderUpdateItemShippingAddressAction without checking for non null required values
     */
    public StagedOrderUpdateItemShippingAddressAction buildUnchecked() {
        return new StagedOrderUpdateItemShippingAddressActionImpl(address);
    }

    public static StagedOrderUpdateItemShippingAddressActionBuilder of() {
        return new StagedOrderUpdateItemShippingAddressActionBuilder();
    }

    public static StagedOrderUpdateItemShippingAddressActionBuilder of(
            final StagedOrderUpdateItemShippingAddressAction template) {
        StagedOrderUpdateItemShippingAddressActionBuilder builder = new StagedOrderUpdateItemShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
