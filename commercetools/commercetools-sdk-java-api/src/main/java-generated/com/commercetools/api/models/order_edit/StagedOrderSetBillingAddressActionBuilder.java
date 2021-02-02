
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetBillingAddressActionBuilder {

    @Nullable
    private com.commercetools.api.models.common.Address address;

    public StagedOrderSetBillingAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public StagedOrderSetBillingAddressAction build() {
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
