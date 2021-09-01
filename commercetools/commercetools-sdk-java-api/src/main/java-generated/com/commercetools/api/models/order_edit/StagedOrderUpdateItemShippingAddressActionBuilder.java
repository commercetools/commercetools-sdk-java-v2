
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderUpdateItemShippingAddressActionBuilder
        implements Builder<StagedOrderUpdateItemShippingAddressAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    public StagedOrderUpdateItemShippingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    public StagedOrderUpdateItemShippingAddressActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public StagedOrderUpdateItemShippingAddressAction build() {
        Objects.requireNonNull(address, StagedOrderUpdateItemShippingAddressAction.class + ": address is missing");
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
