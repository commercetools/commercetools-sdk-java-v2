
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetBillingAddressActionBuilder implements Builder<StagedOrderSetBillingAddressAction> {

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    public StagedOrderSetBillingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    public StagedOrderSetBillingAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public StagedOrderSetBillingAddressAction build() {
        return new StagedOrderSetBillingAddressActionImpl(address);
    }

    /**
     * builds StagedOrderSetBillingAddressAction without checking for non null required values
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
